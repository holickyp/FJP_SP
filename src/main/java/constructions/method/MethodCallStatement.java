package constructions.method;


import constructions.enums.StatementType;
import constructions.statements.Statement;

public class MethodCallStatement extends Statement
{
    /**
     * Method call object
     */
    private MethodCall methodCall;

    public MethodCallStatement(MethodCall methodCall, int line)
    {
        super(StatementType.METHOD_CALL, line);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall()
    {
        return methodCall;
    }

    public void setMethodCall(MethodCall methodCall)
    {
        this.methodCall = methodCall;
    }
}
