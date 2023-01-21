package constructions.error;

public class ErrorVariableNotExists extends Error {
    public ErrorVariableNotExists(String value, int line) {
        super("Variable " + value + " not exists", line, ErrorTypes.ERROR_VARIABLE_NOT_EXISTS);
    }
}
