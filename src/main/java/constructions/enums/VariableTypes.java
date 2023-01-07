package constructions.enums;

public enum VariableTypes {
    INT("int"),
    BOOLEAN("boolean");

    private final String type;

    VariableTypes(String type){
        this.type = type;
    }

    public static VariableTypes getSymbol(String type) {
        for(VariableTypes variableType: VariableTypes.values()) {
            if(variableType.type.equals(type))
            {
                return variableType;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }
}
