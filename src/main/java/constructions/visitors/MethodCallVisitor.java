package constructions.visitors;

import com.sun.org.apache.bcel.internal.classfile.MethodParameter;
import constructions.Block;
import constructions.Expression;
import constructions.enums.MethodReturnTypes;
import constructions.enums.VariableTypes;
import constructions.method.Method;
import constructions.method.MethodCall;
import constructions.method.MethodCallParameters;
import constructions.method.MethodParameters;
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
        List<MethodCallParameters> methodCallParameters = this.parseMethodCallParameters(ctx.methodCallParameter());

        return new MethodCall(identifier, methodCallParameters);
    }

    /**
     * Processes method call parameters into internal structure
     * @param methodCallParameterContextsList methodCallParameterContext
     * @return
     */
    private List<MethodCallParameters> parseMethodCallParameters(List<GentleJavaParser.MethodCallParameterContext> methodCallParameterContextsList)
    {
        List<MethodCallParameters> methodCallParameters = new ArrayList<>();
        MethodCallParameters methodCallParameter;

        for (GentleJavaParser.MethodCallParameterContext parameterContext : methodCallParameterContextsList)
        {
            Expression expression = new ExpressionVisitor().visit(parameterContext.expressionBody());

            methodCallParameter = new MethodCallParameters(expression);

            methodCallParameters.add(methodCallParameter);
        }

        return methodCallParameters;
    }


}
