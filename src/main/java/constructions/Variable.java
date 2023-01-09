package constructions;

import constructions.enums.VariableTypes;
import constructions.enums.VariableValues;

public class Variable {
    private  boolean constant;
    private  VariableTypes type;
    private  String name;
    private  boolean initialized;
    private  VariableValues declareValue;

    private  int value;
    private  boolean negative;

    public Variable(boolean constant, VariableTypes type, String name, boolean initialized, int value, boolean negative) {
        this.constant = constant;
        this.type = type;
        this.name = name;
        this.initialized = initialized;
        this.value = value;
        this.negative = negative;
        this.declareValue = VariableValues.NUMBER;
    }

    @Override
    public String toString() {
        return (constant ? "final ":"") + type.getType() + " " + name + (initialized ? " = " +value : "") ;
    }

    public boolean isConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    public VariableTypes getType() {
        return type;
    }

    public void setType(VariableTypes type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public VariableValues getDeclareValue() {
        return declareValue;
    }

    public void setDeclareValue(VariableValues declareValue) {
        this.declareValue = declareValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isNegative() {
        return negative;
    }

    public void setNegative(boolean negative) {
        this.negative = negative;
    }
}
