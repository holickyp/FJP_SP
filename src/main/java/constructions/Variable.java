package constructions;

import constructions.enums.VariableTypes;

public class Variable {
    private final boolean constant;
    private final VariableTypes type;
    private final String name;
    private final boolean initialized;

    private final int value;
    private final boolean negative;

    public Variable(boolean constant, VariableTypes type, String name, boolean initialized, int value, boolean negative) {
        this.constant = constant;
        this.type = type;
        this.name = name;
        this.initialized = initialized;
        this.value = value;
        this.negative = negative;
    }

    @Override
    public String toString() {
        return (constant ? "final ":"") + type.getType() + " " + name + (initialized ? " = " +value : "") ;
    }
}
