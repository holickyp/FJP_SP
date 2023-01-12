package constructions.visitors;


import constructions.Block;
import constructions.BlockStatement;
import constructions.enums.ReturnType;
import constructions.enums.VariableType;
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
     * Visitor for MethodDeclaration()
     * @param ctx MethodDeclarationContext()
     * @return
     */
    @Override
    public Method visitMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx) {

        ReturnType returnType = ReturnType.valueOf(ctx.typeTypeOrVoid().getText().toUpperCase());

        /**
         * Indication of method
         */
        String METHOD_SYMBOL = "()";
        String identifier = ctx.identifier().getText() + METHOD_SYMBOL;

        List<MethodParameters> parameters = this.parseMethodParameters(ctx.formalParameters().formalParameterList().formalParameter());

        Block body = ctx.methodBody().block() != null ? new BlockVisitor().visit(ctx.methodBody().block()) : null;

        Expression returnValue =  null;

        //TODO we dont need to know return value?
       /* if (ctx.methodBody().expressionBody() != null)
        {
            returnValue = new ExpressionBodyVisitor().visit(ctx.methodBody().expressionBody());
            returnValue.setExpectedReturnType(returnType == EMethodReturnType.INT ? EVariableType.INT : EVariableType.BOOLEAN);
        }*/

        return new Method(returnType, identifier, parameters, body, ctx.start.getLine());
    }

    /**
     * Processes method parameters
     * @param methodParameterContext list of parameters context
     * @return
     */
    private List<MethodParameters> parseMethodParameters(List<GentleJavaParser.FormalParameterContext> methodParameterContext) {
        List<MethodParameters> methodDeclarationParameters = new ArrayList<>();
        MethodParameters methodDeclarationParameter;

        for (GentleJavaParser.FormalParameterContext method : methodParameterContext)
        {
            VariableType type = VariableType.valueOf(method.typeType().getText().toUpperCase());

            String identifier = method.variableDeclaratorId().identifier().getText();

            methodDeclarationParameter = new MethodParameters(type,identifier);

            methodDeclarationParameters.add(methodDeclarationParameter);
        }

        return methodDeclarationParameters;
    }

}
