package constructions.compiler;

import constructions.enums.PL0Instructions;
import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.method.MethodCall;
import constructions.method.MethodCallParameter;

public class MethodCallCompiler extends BaseCompiler {
    private MethodCall methodCall;
    private int level;

    public MethodCallCompiler(MethodCall methodCall, int level) {
        this.methodCall = methodCall;
        this.level = level;
    }

    public void run() {
        if(methodCall.getReturnType() != ReturnType.VOID) {
            addInstruction(PL0Instructions.INT, 0, 1);
        }
        for(int i = 0; i<methodCall.getParameters().size(); i++) {
            MethodCallParameter parameter = methodCall.getParameters().get(i);
            VariableType returnType = new ExpressionCompiler(parameter.getExpression(), level).run();
            methodCall.getParameters().get(i).setVariableType(returnType);
        }
        addMethodCallInstruction(PL0Instructions.CAL, level, methodCall);
        for(int i = 0; i<methodCall.getParameters().size(); i++) {
            addInstruction(PL0Instructions.STO, 0, -1);
        }
    }
}
