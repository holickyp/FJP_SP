package constructions.PL0;

import constructions.enums.PL0Instructions;
import constructions.method.MethodCall;

public class Instruction {
    private PL0Instructions instruction;
    private int row;
    private int level;
    private int address;
    private MethodCall methodCall = null;
    private boolean laterInitialization = false;

    public Instruction(PL0Instructions instruction, int row, int level, int address) {
        this.instruction = instruction;
        this.row = row;
        this.level = level;
        this.address = address;
    }

    public Instruction(PL0Instructions instruction, int row, int level, MethodCall methodCall) {
        this.instruction = instruction;
        this.row = row;
        this.level = level;
        this.methodCall = methodCall;
        this.address = -1;
        this.laterInitialization = true;
    }

    public PL0Instructions getInstruction() {
        return instruction;
    }

    public int getRow() {
        return row;
    }

    public int getLevel() {
        return level;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getAddress() {
        return address;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    public boolean isLaterInitialization() {
        return laterInitialization;
    }
}
