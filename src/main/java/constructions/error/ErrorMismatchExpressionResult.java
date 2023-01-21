package constructions.error;

public class  ErrorMismatchExpressionResult extends Error {
    public ErrorMismatchExpressionResult(String expected, String type, int line) {
        super("Mismatch expression result type. Expected " + expected + " got " + type, line, ErrorTypes.ERROR_MISMATCH_EXPRESSION_RESULT);
    }
}
