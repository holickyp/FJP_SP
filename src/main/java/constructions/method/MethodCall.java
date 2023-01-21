package constructions.method;

import constructions.enums.ReturnType;

import java.util.List;

public class MethodCall {
    private final String identifier;
    private final List<MethodCallParameter> parameters;
    private ReturnType returnType;
    private final int line;

    public MethodCall(String identifier, List<MethodCallParameter> parameters, int line) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.line = line;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<MethodCallParameter> getParameters() {
        return parameters;
    }

    public int getLine() {
        return line;
    }
}
