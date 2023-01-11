package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.InstructionType;
import constructions.enums.Operator;

public class RelationalExpression extends Expression {
    private Expression leftExpression;
    private Operator operator;
    private Expression rightExpression;

    public RelationalExpression(int line, Expression leftExpression, Operator operator, Expression rightExpression) {
        super(ExpressionType.RELATIONAL, line);
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

    public int getOperatorCode()
    {
        switch (this.getOperator())
        {
            case EQUALS:
                return Operator.EQUALS.getCode();
            case NOT_EQUALS:
                return Operator.NOT_EQUALS.getCode();
            case LOWER_THAN:
                return Operator.LOWER_THAN.getCode();
            case LOWER_EQUAL_THAN:
                return Operator.LOWER_EQUAL_THAN.getCode();
            case GRATER_EQUAL_THAN:
                return Operator.GRATER_EQUAL_THAN.getCode();
            case GRATER_THAN:
                return Operator.GRATER_THAN.getCode();
        }

        return -1;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
