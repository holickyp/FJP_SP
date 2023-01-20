package constructions.error;

public enum ErrorTypes {
    ERROR_ASSIGMENT_VARIABLE_NOT_EXISTS(1, "Assigned variable not exists."),
    ERROR_CONSTANT_ASSIGMENT(2,  "Assigned variable not exists."),
    ERROR_INVALID_PARAMETERS_COUNT(3,  "Assigned variable not exists."),
    ERROR_MISMATCH_EXPRESSION_RESULT(4,  "Assigned variable not exists."),
    ERROR_MISMATCH_TYPES_EXPRESSION(5,  "Assigned variable not exists."),
    ERROR_MISMATCH_TYPES_VARIABLE(6, "Assigned variable not exists."),
    ERROR_VARIABLE_ALREADY_EXISTS(7, "Assigned variable not exists."),
    ERROR_VARIABLE_NOT_EXISTS(8, "Assigned variable not exists."),
    ERROR_LOADING_INPUT_FILE(8, "Assigned variable not exists."),
    ERROR_ANTLR_PROCESS(9, "Assigned variable not exists."),
    ERROR_UNKNOWN(10, "Assigned variable not exists."),
    ERROR_INVALID_USE(11, "Assigned variable not exists."),
    ERROR_INVALID_OUTPUT_FILE(12, "Assigned variable not exists."),
    ERROR_ARITHMETIC(13, "Assigned variable not exists."),
    ERROR_METHOD_ALREADY_EXISTS(14, "AA"),
    ERROR_METHOD_NOT_EXISTS(15, "AA"),
    ERROR_MISMATCH_METHOD_AND_CALL_PARAMETER_RETURN_TYPE(16, "AA"),
    ERROR_MISMATCH_METHOD_CALL_RETURN(17, "AA"),
    ERROR_SWITCH_MULTIPLE_DEFAULT_BLOCK(18, "AA"),
    ERROR_VOID_METHOD_EXPRESSION(19, "AA"),
    ERROR_MISMATCH_TYPES_STATEMENT(20, "AA");




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