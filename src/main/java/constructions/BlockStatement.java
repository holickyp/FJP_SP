package constructions;

import constructions.method.Method;
import constructions.statements.Statement;

public class BlockStatement {
    private final Statement statement;
    private final Variable variable;
    private final Method method;

    public BlockStatement(Statement statement, Variable variable, Method methods) {
        this.statement = statement;
        this.variable = variable;
        this.method = methods;
    }

    public Statement getStatement() {
        return statement;
    }

    public Variable getVariable() {
        return variable;
    }

    public Method getMethod() {
        return method;
    }
}
