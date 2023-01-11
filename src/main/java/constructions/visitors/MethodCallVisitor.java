package constructions.visitors;

import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;
import constructions.method.MethodCall;
import constructions.method.MethodCallParameter;
import constructions.method.MethodParameters;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVisitor extends GentleJavaBaseVisitor<MethodCall>
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
    public MethodCall visitMethodCall(GentleJavaParser.MethodCallContext ctx)
    {
        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;
        List<MethodParameters> methodCallParameters = this.parseMethodCallParameters(ctx.);

        return new MethodCall(identifier, methodCallParameters, ctx.start.getLine());
    }

    /**
     * Processes method call parameters into internal structure
     * @param methodCallParameterContextsList methodCallParameterContext
     * @return
     */
    //TODO je v gentlejavaparser nejaky parametercontext nebo je misot nej expressionlist?
    private List<MethodCallParameter> parseMethodCallParameters(List<GentleJavaParser.CALL> methodCallParameterContextsList)
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
