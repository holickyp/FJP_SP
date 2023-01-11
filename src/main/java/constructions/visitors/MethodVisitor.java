package constructions.visitors;


import constructions.BlockStatement;
import constructions.enums.ReturnType;
import constructions.expressions.Expression;
import constructions.method.Method;
import constructions.method.MethodParameters;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodVisitor extends GentleJavaBaseVisitor<Method>
{
    /**
     * Indication of method
     */
    private final String METHOD_SYMBOL = "()";

    /**
     * Visitor for MethodDeclaration()
     * @param ctx MethodDeclarationContext()
     * @return
     */
    @Override
    public Method visitMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx)
    {
        //TODO
        ReturnType returnType = ctx.typeTypeOrVoid();

        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;

        List<MethodParameters> parameters = this.parseMethodParameters(ctx.formalParameters().formalParameterList());

        BlockStatement body = ctx.methodBody().blockBody() != null ? new BlockBodyVisitor().visit(ctx.methodBody().blockBody()) : null;

        Expression returnValue =  null;

        if (ctx.methodBody().expressionBody() != null)
        {
            returnValue = new ExpressionBodyVisitor().visit(ctx.methodBody().expressionBody());
            returnValue.setExpectedReturnType(returnType == EMethodReturnType.INT ? EVariableType.INT : EVariableType.BOOLEAN);
        }

        return new Method(returnType, identifier, parameters, body, returnValue, ctx.start.getLine());
    }

    /**
     * Processes method parameters
     * @param methodParameterContext list of parameters context
     * @return
     */
    private List<MethodParameters> parseMethodParameters(List<GentleJavaParser.Meth> methodParameterContext)
    {
        List<MethodDeclarationParameter> methodDeclarationParameters = new ArrayList<>();
        MethodDeclarationParameter methodDeclarationParameter;

        for (SimpleJavaParser.MethodParameterContext method : methodParameterContext)
        {
            EVariableType type = EVariableType.valueOf(method.possibleTypes().getText().toUpperCase());

            String identifier = method.identifier().getText();

            methodDeclarationParameter = new MethodDeclarationParameter(type,identifier);

            methodDeclarationParameters.add(methodDeclarationParameter);
        }

        return methodDeclarationParameters;
    }

}
