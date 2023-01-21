package constructions.expressions;

import constructions.enums.ExpressionType;

public class ParenthesesExpression extends Expression {
    private final Expression expression;

    public ParenthesesExpression(int line, Expression expression) {
        super(ExpressionType.PARENTHESES, line);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
