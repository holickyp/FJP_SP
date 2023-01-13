package constructions.error;



public class ErrorVariableAlreadyExists extends Error
{
    public ErrorVariableAlreadyExists(String identifier, int line)
    {
        super("Variable \"" + identifier + "\" already exists", line, ErrorTypes.ERROR_VARIABLE_ALREADY_EXISTS);
    }
}
