package constructions;

import constructions.enums.VariableType;
import constructions.expressions.Expression;

import java.util.List;

public class Variable {
    private boolean isConstant;

    private boolean isNegative = false;
    private VariableType type;
    private String name;
    private List<String> parallelArray;
    private Expression expression;

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
