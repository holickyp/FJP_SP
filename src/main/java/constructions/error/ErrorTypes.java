package constructions.error;

public enum ErrorTypes {
    ERROR_CONSTANT_ASSIGNMENT(2,  "Assigned variable not exists."),
    ERROR_INVALID_PARAMETERS_COUNT(3,  "Assigned variable not exists."),
    ERROR_MISMATCH_EXPRESSION_RESULT(4,  "Assigned variable not exists."),
    ERROR_MISMATCH_TYPES_EXPRESSION(5,  "Assigned variable not exists."),
    ERROR_VARIABLE_ALREADY_EXISTS(7, "Assigned variable not exists."),
    ERROR_VARIABLE_NOT_EXISTS(8, "Assigned variable not exists."),
    ERROR_ARITHMETIC(13, "Assigned variable not exists."),
    ERROR_METHOD_ALREADY_EXISTS(14, "AA"),
    ERROR_METHOD_NOT_EXISTS(15, "AA"),
    ERROR_MISMATCH_METHOD_AND_CALL_PARAMETER_RETURN_TYPE(16, "AA"),
    ERROR_MISMATCH_METHOD_CALL_RETURN(17, "AA"),
    ERROR_SWITCH_MULTIPLE_DEFAULT_BLOCK(18, "AA"),
    ERROR_VOID_METHOD_EXPRESSION(19, "AA");

    private final int code;
    private final String description;

    ErrorTypes(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return this.code;
    }

    static ErrorTypes getByCode(int code) {
        for (ErrorTypes value : ErrorTypes.values()) {
            if(value.code == code) {
                return value;
            }
        }
        return null;
    }
}