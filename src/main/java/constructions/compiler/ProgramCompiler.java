package constructions.compiler;

import constructions.PL0.Instruction;
import constructions.Program;
import constructions.compiler.BaseCompiler;
import constructions.enums.PL0Instructions;

public class ProgramCompiler extends BaseCompiler
{

    private Program program;

    public ProgramCompiler(Program program)
    {
        this.program = program;
    }


    public void run()
    {
        // first jump on first address -> our first instruction
        this.addInstruction(PL0Instructions.JMP, 0, 1);

        new BlockCompiler(program.getBlock()).run();
    }
}
