package constructions.expressions;

import constructions.enums.ExpressionType;

public class TernaryExpression extends Expression {
    private final Expression question;
    private final Expression trueExpression;
    private final Expression falseExpression;

    public TernaryExpression(int line, Expression question, Expression trueExpression, Expression falseExpression) {
        super(ExpressionType.TERNARY, line);
        this.question = question;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    public Expression getQuestion() {
        return question;
    }

    public Expression getTrueExpression() {
        return trueExpression;
    }

    public Expression getFalseExpression() {
        return falseExpression;
    }
}
