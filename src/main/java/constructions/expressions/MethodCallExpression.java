package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.method.MethodCall;

public class MethodCallExpression extends Expression {
    private final MethodCall methodCall;

    public MethodCallExpression(int line, MethodCall methodCall) {
        super(ExpressionType.METHOD_CALL, line);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }
}
