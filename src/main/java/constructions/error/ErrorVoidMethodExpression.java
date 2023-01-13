package constructions.error;



public class ErrorVoidMethodExpression extends Error
{
    public ErrorVoidMethodExpression(String name, int line)
    {
        super("Void method \"" + name + "\" can not be used in expression.", line, ErrorTypes.ERROR_VOID_METHOD_EXPRESSION);
    }
}
