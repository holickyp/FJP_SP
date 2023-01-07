import constructions.Program;
import constructions.visitors.ProgramVisitor;
import generated.GentleJavaLexer;
import generated.GentleJavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
        String output = args[1];

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(input);
            GentleJavaLexer lexer = new GentleJavaLexer(inputStream);
            GentleJavaParser parser = new GentleJavaParser(new CommonTokenStream(lexer));

            ProgramVisitor programVisitor = new ProgramVisitor();
            Program program = programVisitor.visitProgram(parser.program());

            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            instructionGenerator.generate();

        } catch (Exception e) {
            System.out.println("File not found " + input);

        }
    }
}