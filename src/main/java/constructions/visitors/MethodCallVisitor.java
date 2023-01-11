package constructions.visitors;

import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVisitor extends SimpleJavaBaseVisitor<MethodCall>
{
    /**
     * Indication of method
     */
    private final String METHOD_SYMBOL = "()";

    /**
     * Visitor for MethodCall()
     * @param ctx MethodCall context
     * @return
     */
    @Override
    public MethodCall visitMethodCall(SimpleJavaParser.MethodCallContext ctx)
    {
        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;
        List<MethodCallParameter> methodCallParameters = this.parseMethodCallParameters(ctx.methodCallParameter());

        return new MethodCall(identifier, methodCallParameters, ctx.start.getLine());
    }

    /**
     * Processes method call parameters into internal structure
     * @param methodCallParameterContextsList methodCallParameterContext
     * @return
     */
    private List<MethodCallParameter> parseMethodCallParameters(List<SimpleJavaParser.MethodCallParameterContext> methodCallParameterContextsList)
    {
        List<MethodCallParameter> methodCallParameters = new ArrayList<>();
        MethodCallParameter methodCallParameter;

        for (SimpleJavaParser.MethodCallParameterContext parameterContext : methodCallParameterContextsList)
        {
            Expression expression = new ExpressionBodyVisitor().visit(parameterContext.expressionBody());

            methodCallParameter = new MethodCallParameter(expression);

            methodCallParameters.add(methodCallParameter);
        }

        return methodCallParameters;
    }


}
