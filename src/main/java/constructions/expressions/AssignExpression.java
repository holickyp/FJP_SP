package constructions.expressions;

import constructions.enums.ExpressionType;

public class AssignExpression extends Expression {
    private Expression right;
    private Expression left;

    public AssignExpression(int line, Expression left, Expression right) {
        super(ExpressionType.ASSIGN, line);
        this.left = left;
        this.right = right;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }
}
