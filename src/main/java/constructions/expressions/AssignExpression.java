package constructions.expressions;

import constructions.enums.ExpressionType;

public class AssignExpression extends Expression {
    private Expression right;
    private Expression left;

    public AssignExpression(int line, Expression right, Expression left) {
        super(ExpressionType.ASSIGN, line);
        this.right = right;
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }
}
