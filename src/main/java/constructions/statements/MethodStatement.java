package constructions.statements;

import constructions.Statement;
import constructions.enums.Statements;
import constructions.method.Method;

public class MethodStatement extends Statement {

    private Method method;

    public MethodStatement(Method method) {
        super(Statements.METHOD_CALL);
        this.method = method;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
