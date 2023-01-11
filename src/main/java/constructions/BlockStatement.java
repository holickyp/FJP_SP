package constructions;

import constructions.method.Method;
import constructions.statements.Statement;

import java.util.List;

public class BlockStatement {
    private Statement statement;
    private Variable variable;
    private Method methods;

    public BlockStatement(Statement statement, Variable variable, Method methods) {
        this.statement = statement;
        this.variable = variable;
        this.methods = methods;
    }

    public Statement getStatement() {
        return statement;
    }

    public Variable getVariable() {
        return variable;
    }

    public Method getMethods() {
        return methods;
    }
}
