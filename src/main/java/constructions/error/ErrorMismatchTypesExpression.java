package constructions.error;



public class ErrorMismatchTypesExpression extends Error
{
    public ErrorMismatchTypesExpression(String expectedType, String type1, String type2, int line)
    {
        super("Mismatch expression result type. Got " + type1 + " and " + type2 + ". Both results should be type " + expectedType, line, ErrorTypes.ERROR_MISMATCH_TYPES_EXPRESSION);
    }

    public ErrorMismatchTypesExpression(String expectedType, String type, int line)
    {
        super("Mismatch expression result type. Got " + type + ". Result should be type " + expectedType, line, ErrorTypes.ERROR_MISMATCH_TYPES_EXPRESSION);
    }
}
