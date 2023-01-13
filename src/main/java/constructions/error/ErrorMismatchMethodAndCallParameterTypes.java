package constructions.error;


import constructions.enums.VariableType;

public class ErrorMismatchMethodAndCallParameterTypes extends Error
{
    public ErrorMismatchMethodAndCallParameterTypes(String name, VariableType need, VariableType got, int index, int line)
    {
        super("Invalid call of method \"" + name + "\". " + index + ". parameter should be " + need + ", got " + got + ".", line, ErrorTypes.ERROR_MISMATCH_METHOD_AND_CALL_PARAMETER_RETURN_TYPE);
    }
}
