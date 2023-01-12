package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.ReturnType;
import constructions.method.MethodCall;
import constructions.method.MethodParameters;

import java.util.List;

public class MethodCallExpression extends Expression {
    private MethodCall methodCall;

    public MethodCallExpression(int line, MethodCall methodCall) {
        super(ExpressionType.METHOD_CALL, line);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }
}
