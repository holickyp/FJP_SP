package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.Operator;

public class MulDivModExpression extends Expression {
    private final Expression leftExpression;
    private final Operator operator;
    private final Expression rightExpression;

    public MulDivModExpression(int line, Expression leftExpression, Operator operator, Expression rightExpression) {
        super(ExpressionType.MUL_DIV_MOD, line);
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
            case MULTIPLICATION:
                return Operator.MULTIPLICATION.getCode();
            case DIVISION:
                return Operator.DIVISION.getCode();
            case MODULO:
                return Operator.MODULO.getCode();
        }

        return -1;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
