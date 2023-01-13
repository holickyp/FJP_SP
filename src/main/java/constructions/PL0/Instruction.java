package constructions.PL0;

import constructions.enums.PL0Instructions;
import constructions.method.MethodCall;

public class Instruction {
    private PL0Instructions instruction;
    private int row;
    private int lvl;
    private int address;

    private MethodCall methodCall = null;
    private boolean laterInitialization = false;



    public Instruction(PL0Instructions instruction, int row, int lvl, int address) {
        this.instruction = instruction;
        this.row = row;
        this.lvl = lvl;
        this.address = address;
    }
    public Instruction(PL0Instructions instruction, int rowId, int level, MethodCall methodCall)
    {
        this.instruction = instruction;
        this.row = rowId;
        this.lvl = lvl;
        this.methodCall = methodCall;
        this.address = -1;
        this.laterInitialization = true;
    }
}
