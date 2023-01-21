import constructions.Program;
import constructions.visitors.ProgramVisitor;
import generated.GentleJavaLexer;
import generated.GentleJavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Invalid arguments.\nRun with: java -jar GentleJava.jar <input file> <output file>");
            return;
        }

        String input = args[0];
        String output = args[1];

        CharStream inputStream;
        try {
            inputStream = CharStreams.fromFileName(input);
            GentleJavaLexer lexer = new GentleJavaLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            GentleJavaParser parser = new GentleJavaParser(tokenStream);
            parser.setBuildParseTree(true);

            ParseTree parseTree = parser.program();

            Program program = null;
            try {
                program = new ProgramVisitor().visit(parseTree);
            }
            catch (Exception e) {
                System.err.println("Something goes wrong while parsing tree. " + e);
            }

            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            instructionGenerator.generate(output);

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}