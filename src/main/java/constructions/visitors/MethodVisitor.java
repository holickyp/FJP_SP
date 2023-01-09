package constructions.visitors;

import constructions.Block;
import constructions.Expression;
import constructions.enums.MethodReturnTypes;
import constructions.enums.VariableTypes;
import constructions.method.Method;
import constructions.method.MethodParameters;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MethodVisitor extends GentleJavaBaseVisitor<Method> {

    /**
     * Indication of method
     */
    private final String METHOD_SYMBOL = "()";

    @Override
    public Method visitMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx) {
        // urceni nazvu metody
       String  methodName = (ctx.identifier().getText() + this.METHOD_SYMBOL);

        MethodReturnTypes returnType = MethodReturnTypes.valueOf(ctx.methodReturnType().getText().toUpperCase());
        List<MethodParameters> parameters = getParameters(ctx.methodParameter());

        Block body = ctx.methodBody().blockBody() != null ? new BlockVisitor().visit(ctx.methodBody().blockBody()) : null;

        Expression returnValue =  null;

        if (ctx.methodBody().expressionBody() != null)
        {
            returnValue = new ExpressionVisitor().visit(ctx.methodBody().expressionBody());
            returnValue.setReturnType(returnType == MethodReturnTypes.INT ? VariableTypes.INT : VariableTypes.BOOLEAN);
        }

        //navic line
        return new Method(methodName,returnType, parameters, body, returnValue);
    }


    private List<MethodParameters> getParameters(List<GentleJavaParser.MethodParameterContext> methodParameterContext) {
        List<MethodParameters> methodParameters = new ArrayList<>();
        MethodParameters methodParameter;

        for (GentleJavaParser.MethodParameterContext method : methodParameterContext)
        {
            VariableTypes type = VariableTypes.valueOf(method.possibleTypes().getText().toUpperCase());

            String identifier = method.identifier().getText();

            methodParameter = new MethodParameters(type,identifier);

            methodParameters.add(methodParameter);
        }

        return methodParameters;
    }

}
