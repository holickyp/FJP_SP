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
        String input = args[0];
        String output = args[1];

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(input);
            GentleJavaLexer lexer = new GentleJavaLexer(inputStream);
            //lexer.removeErrorListeners();
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            GentleJavaParser parser = new GentleJavaParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            //parser.removeErrorListeners();

            Program program = new ProgramVisitor().visit(parser.program());

            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            instructionGenerator.generate(output);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}