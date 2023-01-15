package constructions.compiler;

import constructions.Program;
import constructions.enums.PL0Instructions;

public class ProgramCompiler extends BaseCompiler {
    private Program program;

    public ProgramCompiler(Program program) {
        this.program = program;
    }

    public void run() {
        addInstruction(PL0Instructions.JMP, 0, 1);
        new BlockCompiler(program.getBlock()).run();
    }
}
