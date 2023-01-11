package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.VariableType;

public class Expression {
    private ExpressionType type;
    private int line;

    private VariableType returnType;

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

    public VariableType getReturnType() {
        return returnType;
    }

    public void setReturnType(VariableType returnType) {
        this.returnType = returnType;
    }
}
