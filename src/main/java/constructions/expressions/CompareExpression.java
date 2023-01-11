package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.Operator;

public class CompareExpression extends Expression {
    private Expression leftExpression;
    private Operator operator;
    private Expression rightExpression;

    public CompareExpression(int line, Expression leftExpression, Operator operator, Expression rightExpression) {
        super(ExpressionType.COMPARE, line);
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
