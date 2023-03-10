package constructions.expressions;

import constructions.enums.ExpressionType;

public class AssignExpression extends Expression {
    private final Expression left;
    private final Expression right;

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
