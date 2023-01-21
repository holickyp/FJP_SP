package constructions.method;

import constructions.enums.VariableType;

public class MethodParameters {
    private final VariableType type;
    private final String name;

    public MethodParameters(VariableType type, String name) {
        this.type = type;
        this.name = name;
    }

    public VariableType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
