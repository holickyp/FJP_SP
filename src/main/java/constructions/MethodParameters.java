package constructions;

import constructions.enums.VariableTypes;

public class MethodParameters {
    private final VariableTypes type;
    private final String name;

    public MethodParameters(VariableTypes type, String name) {
        this.type = type;
        this.name = name;
    }
}
