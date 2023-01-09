package constructions.visitors;

import constructions.Block;
import constructions.Program;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class ProgramVisitor extends GentleJavaBaseVisitor<Program> {

    @Override
    public Program visitProgram(GentleJavaParser.ProgramContext ctx) {
        BlockVisitor blockVisitor = new BlockVisitor();
        Block block = blockVisitor.visitBlock(ctx.block()); // protoze je jen 1 block v 'program', tak se zjiskava takto

        Program program = new Program(block);
        return program;
    }
}
