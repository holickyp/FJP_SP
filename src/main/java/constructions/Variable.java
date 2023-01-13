package constructions;

import constructions.enums.VariableType;
import constructions.expressions.Expression;

import java.util.List;

public class Variable {
    private boolean isConstant;
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

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public VariableType getType() {
        return type;
    }

    public void setType(VariableType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParallelArray() {
        return parallelArray;
    }

    public void setParallelArray(List<String> parallelArray) {
        this.parallelArray = parallelArray;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
