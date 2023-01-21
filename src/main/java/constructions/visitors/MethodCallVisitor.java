package constructions.visitors;


import constructions.expressions.Expression;
import constructions.method.MethodCall;
import constructions.method.MethodCallParameter;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVisitor extends GentleJavaBaseVisitor<MethodCall>
{

    @Override
    public MethodCall visitMethodCall(GentleJavaParser.MethodCallContext ctx) {
        /**
         * Indication of method
         */
        String METHOD_SYMBOL = "()";
        String identifier = ctx.identifier().getText() + METHOD_SYMBOL;
        List<MethodCallParameter> methodCallParameters = this.parseMethodCallParameters(ctx.expressionList().expression());

        return new MethodCall(identifier, methodCallParameters, ctx.start.getLine());
    }

    private List<MethodCallParameter> parseMethodCallParameters(List<GentleJavaParser.ExpressionContext> methodCallParameterContextsList) {
        List<MethodCallParameter> methodCallParameters = new ArrayList<>();
        MethodCallParameter methodCallParameter;

        for (GentleJavaParser.ExpressionContext parameterContext : methodCallParameterContextsList)
        {
                Expression ex = new ExpressionVisitor().visit(parameterContext);
                methodCallParameter = new MethodCallParameter(ex);

                methodCallParameters.add(methodCallParameter);


        }

        return methodCallParameters;
    }
}
