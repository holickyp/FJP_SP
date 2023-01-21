package constructions;

import constructions.error.Error;

public class ErrorHandler
{
    private static final ErrorHandler instance = new ErrorHandler();

    private ErrorHandler(){};

    public static ErrorHandler getInstance()
    {
        return instance;
    }

    /**
     * Vypise errovou hlasku a ukonci program
     * @param error
     */
    public void throwError(Error error)
    {
        System.out.println(error);
        System.exit(error.getErrorCode());
    }

}
