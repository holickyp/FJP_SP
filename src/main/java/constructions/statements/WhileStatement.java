package constructions.statements;

import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class WhileStatement extends Statement{
    private Expression expression;
    private Statement statement;

    public WhileStatement(int line, Expression expression, Statement statement) {
        super(StatementType.WHILE, line);
        this.expression = expression;
        this.statement = statement;
    }

    public Expression getExpression() {
        return expression;
    }

    public Statement getStatement() {
        return statement;
    }
}
