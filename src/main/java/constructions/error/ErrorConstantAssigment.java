package constructions.error;



public class ErrorConstantAssigment extends Error
{
    public ErrorConstantAssigment(String variable, int line)
    {
        super("Variable \""+ variable +"\" is constant. Value can not be changed.", line, ErrorTypes.ERROR_CONSTANT_ASSIGMENT);
    }
}
