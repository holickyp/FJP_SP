package constructions.compilerPart;

import compilator.enums.EInstruction;
import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;
import constructions.enums.InstructionType;
import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.method.MethodCall;
import constructions.method.MethodCallParameter;

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
            this.addInstruction(InstructionType.INT, 0, 1);
        }

        // add parameters to stack top
        for (int i = 0 ; i < this.methodCall.getParameters().size() ; i++)
        {
            MethodCallParameter parameter = this.methodCall.getParameters().get(i);
            VariableType returnType = new ExpressionCompiler(parameter.getExpression(), this.level).runReturnType();
            this.methodCall.getParameters().get(i).setVariableType(returnType);

        }

        // add call
        this.addMethodCallInstruction(InstructionType.CAL, this.level, methodCall);

        // remove parameters from stack top
        for (int i = 0 ; i < this.methodCall.getParameters().size() ; i++)
        {
            this.addInstruction(InstructionType.STO, 0, -1);
        }
    }
}
