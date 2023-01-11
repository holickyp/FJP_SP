package constructions.method;

import constructions.Block;
import constructions.enums.ReturnType;

public class Method {
    private ReturnType returnType;
    private String name;
    private MethodParameters methodParameters;
    private Block block;

    /** line of method head */
    private int line;

    public Method(ReturnType returnType, String name, MethodParameters methodParameters, Block block, int line) {
        this.returnType = returnType;
        this.name = name;
        this.methodParameters = methodParameters;
        this.block = block;
        this.line = line;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public MethodParameters getMethodParameters() {
        return methodParameters;
    }

    public Block getBlock() {
        return block;
    }

    public int getLine() {
        return line;
    }
}
