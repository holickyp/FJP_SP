package constructions.error;


import constructions.enums.ReturnType;

public class ErrorMismatchMethodCallReturnType extends Error
{
    public ErrorMismatchMethodCallReturnType(String name, ReturnType expectedType, ReturnType type, int line)
    {
        super("Invalid call of method " + name + ". You are trying assign " + type.toString() + " to " + expectedType.toString() + ".", line, ErrorTypes.ERROR_MISMATCH_METHOD_CALL_RETURN);
    }
}
