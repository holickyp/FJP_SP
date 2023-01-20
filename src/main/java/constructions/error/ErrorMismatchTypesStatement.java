package constructions.error;

public class ErrorMismatchTypesStatement extends Error {

    public ErrorMismatchTypesStatement(String expectedType, String type, int line) {
        super("Mismatch expression result type. Got " + type +". Expected type " + expectedType, line, ErrorTypes.ERROR_MISMATCH_TYPES_STATEMENT);
    }
}
