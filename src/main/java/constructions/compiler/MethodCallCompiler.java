package constructions.compiler;


import constructions.enums.PL0Instructions;
import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.method.MethodCall;
import constructions.method.MethodCallParameter;
import constructions.method.MethodParameters;

public class MethodCallCompiler extends BaseCompiler
{
    /**
     * Method call object
     */
    private MethodCall methodCall;

    /**
     * level of call
     */
    private int level;

    public MethodCallCompiler(MethodCall methodCall, int level)
    {
        this.methodCall = methodCall;
        this.level = level;
    }

    /**
     * Processes method call to instructions
     */
    public void run()
    {
        if (methodCall.getReturnType() != ReturnType.VOID)
        {
            // add space for return value
            this.addInstruction(PL0Instructions.INT, 0, 1);
        }

        // add parameters to stack top
        for (int i = 0 ; i < this.methodCall.getParameters().size() ; i++)
        {
            MethodCallParameter parameter = this.methodCall.getParameters().get(i);
            VariableType returnType = new ExpressionCompiler(parameter.getExpression(), this.level).runReturnType();
            this.methodCall.getParameters().get(i).setVariableType(returnType);

        }

        // add call
        this.addMethodCallInstruction(PL0Instructions.CAL, this.level, methodCall);

        // remove parameters from stack top
        for (int i = 0 ; i < this.methodCall.getParameters().size() ; i++)
        {
            this.addInstruction(PL0Instructions.STO, 0, -1);
        }
    }
}
