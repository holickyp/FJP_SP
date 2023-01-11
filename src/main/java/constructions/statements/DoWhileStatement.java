package constructions.statements;

import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class DoWhileStatement extends Statement {
    private Statement statement;
    private Expression expression;

    public DoWhileStatement(int line, Statement statement, Expression expression) {
        super(StatementType.DO_WHILE, line);
        this.statement = statement;
        this.expression = expression;
    }

    public Statement getStatement() {
        return statement;
    }

    public Expression getExpression() {
        return expression;
    }
}
