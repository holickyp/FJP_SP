import constructions.PL0.Instruction;
import constructions.Program;
import constructions.compiler.ProgramCompiler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class InstructionGenerator {
    private Program program;

    public InstructionGenerator(Program program) {
        this.program = program;
    }

    public void generate(String output) {
        ProgramCompiler programCompiler = new ProgramCompiler(program);
        programCompiler.run();

        List<Instruction> instructionList = programCompiler.getInstructions();
        writeInstructions(output, instructionList);
    }

    private void writeInstructions(String output, List<Instruction> instructionList) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(output, "UTF-8");

            for(Instruction instruction : instructionList) {
                printWriter.write(instruction.toString());
            }

            printWriter.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
