package constructions.method;

import constructions.enums.VariableType;

import java.util.List;

public class MethodParameters {
    private List<VariableType> type;
    private List<String> name;

    public MethodParameters(List<VariableType> type, List<String> name) {
        this.type = type;
        this.name = name;
    }

    public List<VariableType> getType() {
        return type;
    }

    public List<String> getName() {
        return name;
    }
}
