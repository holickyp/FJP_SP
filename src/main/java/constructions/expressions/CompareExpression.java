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

    public int getOperatorCode()  {
        switch (this.getOperator()) {
            case EQUALS: return Operator.EQUALS.getCode();
            case NOT_EQUALS: return Operator.NOT_EQUALS.getCode();
        }

        return -1;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
