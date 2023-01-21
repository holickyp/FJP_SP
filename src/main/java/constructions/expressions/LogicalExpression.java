package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.Operator;

public class LogicalExpression extends Expression {
    private final Expression leftExpression;
    private final Operator operator;
    private final Expression rightExpression;

    public LogicalExpression(int line, Expression leftExpression, Operator operator, Expression rightExpression) {
        super(ExpressionType.LOGICAL, line);
        this.leftExpression = leftExpression;
        this.operator = operator;
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Operator getOperator() {
        return operator;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
