package constructions.expressions;

import constructions.enums.ExpressionType;

public class IdentifierExpression extends Expression {
    private Object value;

    public IdentifierExpression(int line, Object value) {
        super(ExpressionType.IDENTIFIER, line);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
