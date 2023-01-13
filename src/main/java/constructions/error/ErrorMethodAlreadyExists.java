package constructions.error;



public class ErrorMethodAlreadyExists extends Error
{
    public ErrorMethodAlreadyExists(String name, int line)
    {
        super("Method with name " + name + " already exists.", line, ErrorTypes.ERROR_METHOD_ALREADY_EXISTS);
    }
}
