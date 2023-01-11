package constructions.visitors;

import constructions.Block;
import constructions.BlockStatement;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class BlockVisitor extends GentleJavaBaseVisitor<Block> {
    @Override
    public Block visitBlock(GentleJavaParser.BlockContext ctx) {
        List<BlockStatement> blockStatements = this.getBlockStatements(ctx.blockStatement());

        return new Block(blockStatements);
    }

    private List<BlockStatement> getBlockStatements(List<GentleJavaParser.BlockStatementContext> blockStatementContextList) {
        List<BlockStatement> blockStatements = new ArrayList<>();
        BlockStatement blockStatement;

        for (GentleJavaParser.BlockStatementContext blockStatementContext : blockStatementContextList)
        {
            blockStatement = new BlockStatementVisitor().visit(blockStatementContext);
            blockStatements.add(blockStatement);
        }

        return blockStatements;
    }
}
