package constructions.statements;

import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class RepeatStatement extends Statement {
    private Statement statement;
    private Expression expression;

    public RepeatStatement(int line, Statement statement, Expression expression) {
        super(StatementType.REPEAT, line);
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
