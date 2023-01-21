package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.PostfixType;

public class PostfixExpression extends Expression{
    private final Expression expression;
    private final PostfixType type;

    public PostfixExpression(int line, Expression expression, PostfixType type1) {
        super(ExpressionType.POSTFIX, line);
        this.expression = expression;
        this.type = type1;
    }

    public Expression getExpression() {
        return expression;
    }

    public PostfixType getPostfixType() {
        return type;
    }
}
