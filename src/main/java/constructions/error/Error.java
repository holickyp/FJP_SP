package constructions.error;


public class Error
{
    private String message;
    private int line;
    private ErrorTypes errorCode;

    public Error(String message, int line, ErrorTypes errorCode)
    {
        this.message = message;
        this.line = line;
        this.errorCode = errorCode;

    }

    public int getErrorCode()
    {
        return this.errorCode.getCode();
    }

    @Override
    public String toString()
    {
        return "Line: " + line + " : " + message;
    }
}
