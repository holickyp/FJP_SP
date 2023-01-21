package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.VariableType;

public class ValueExpression extends Expression {
    private final Object value;
    private final VariableType type;

    public ValueExpression(int line, Object value, VariableType type) {
        super(ExpressionType.VALUE, line);
        this.value = value;
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public VariableType getVariableType() {
        return type;
    }
}
