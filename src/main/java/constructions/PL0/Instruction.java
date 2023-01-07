package constructions.PL0;

import constructions.enums.PL0Instructions;

public class Instruction {
    private PL0Instructions instruction;
    private int row;
    private int lvl;
    private int address;

    public Instruction(PL0Instructions instruction, int row, int lvl, int address) {
        this.instruction = instruction;
        this.row = row;
        this.lvl = lvl;
        this.address = address;
    }
}
