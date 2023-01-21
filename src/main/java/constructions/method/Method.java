package constructions.method;

import constructions.Block;
import constructions.enums.ReturnType;
import constructions.expressions.Expression;

import java.util.List;

public class Method {
    private ReturnType returnType;
    private String name;
    private List<MethodParameters> methodParameters;
    private Block body;

    private final Expression returnValue;

    /** line of method head */
    private int line;

    public Method(ReturnType returnType, String name, List<MethodParameters> methodParameters, Block body, Expression returnValue, int line) {
        this.returnType = returnType;
        this.name = name;
        this.methodParameters = methodParameters;
        this.body = body;
        this.returnValue = returnValue;
        this.line = line;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public List<MethodParameters> getMethodParameters() {
        return methodParameters;
    }

    public Block getBody() {
        return body;
    }

    public Expression getReturnValue() {
        return returnValue;
    }

    public int getLine() {
        return line;
    }
}
