package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.PrefixType;

public class PrefixExpression extends Expression {
    private PrefixType type;
    private Expression expression;

    public PrefixExpression(int line, PrefixType type1, Expression expression) {
        super(ExpressionType.PREFIX, line);
        this.type = type1;
        this.expression = expression;
    }

    public PrefixType getPrefixType() {
        return type;
    }

    public Expression getExpression() {
        return expression;
    }
}
