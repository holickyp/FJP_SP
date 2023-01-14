package constructions.statements;

import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class ExpressionStatement extends Statement {
    private Expression expression;

    public ExpressionStatement(int line, Expression expression) {
        super(StatementType.EXPRESSION, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
