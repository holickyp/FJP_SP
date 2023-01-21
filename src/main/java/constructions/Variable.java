package constructions;

import constructions.enums.VariableType;
import constructions.expressions.Expression;

import java.util.List;

public class Variable {
    private final boolean isConstant;

    private final boolean isNegative = false;
    private final VariableType type;
    private final String name;
    private final List<String> parallelArray;
    private final Expression expression;

    public Variable(boolean isConstant, VariableType type, String name, List<String> parallelArray, Expression expression) {
        this.isConstant = isConstant;
        this.type = type;
        this.name = name;
        this.parallelArray = parallelArray;
        this.expression = expression;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public VariableType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public List<String> getParallelArray() {
        return parallelArray;
    }
    public Expression getExpression() {
        return expression;
    }
}
