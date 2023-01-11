package constructions.method;

import constructions.enums.VariableType;

import java.util.List;

public class MethodParameters {
    private VariableType type;
    private String name;

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
