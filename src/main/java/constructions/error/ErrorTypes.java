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
    ERROR_ARITHMETIC(13, "Assigned variable not exists.");

    private int code;
    private String description;


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