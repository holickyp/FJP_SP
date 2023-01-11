package constructions.expressions;

import constructions.enums.ExpressionType;

public class Expression {
    private ExpressionType type;
    private int line;

    public Expression(ExpressionType type, int line) {
        this.type = type;
        this.line = line;
    }

    public ExpressionType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }
}
