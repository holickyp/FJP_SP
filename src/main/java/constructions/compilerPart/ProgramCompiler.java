package constructions.compilerPart;


import constructions.Program;
import constructions.enums.InstructionType;

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
        this.addInstruction(InstructionType.JMP, 0, 1);

        new BlockCompiler(program.getBlock()).run();
    }
}
