package constructions.visitors;


import constructions.Block;
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

        Block body = ctx.methodBody().methodBlock() != null ? new BlockVisitor().visit(ctx.methodBody().methodBlock()) : null;

        Expression returnValue =  null;


       if (ctx.methodBody().expression() != null)
        {
            returnValue = new ExpressionVisitor().visit(ctx.methodBody().expression());
            returnValue.setReturnType(returnType == ReturnType.INT ? VariableType.INT : VariableType.BOOLEAN);
        }

        return new Method(returnType, identifier, parameters, body, returnValue, ctx.start.getLine());
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
