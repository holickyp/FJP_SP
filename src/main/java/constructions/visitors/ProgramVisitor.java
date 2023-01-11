package constructions.visitors;

import constructions.Program;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class ProgramVisitor extends GentleJavaBaseVisitor<Program> {
    @Override
    public Program visitProgram(GentleJavaParser.ProgramContext ctx) {
        return new Program(new BlockVisitor().visit(ctx.block()));
    }
}
