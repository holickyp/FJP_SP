package constructions.visitors;

import constructions.Block;
import constructions.BlockStatement;
import constructions.statements.Statement;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class BlockVisitor extends GentleJavaBaseVisitor<Block> {

    /**
     * Visitor pro Block
     * @param ctx Block context
     * @return interni Block strukturu
     */
    @Override
    public Block visitBlock(GentleJavaParser.BlockContext ctx) {
        List<BlockStatement> blockStatements = this.getBlockStatements(ctx.blockStatement());

        return new Block(blockStatements);
    }

    @Override
    public Block visitMethodBlock(GentleJavaParser.MethodBlockContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<BlockStatement> blockStatements = new ArrayList<>();
        for (GentleJavaParser.StatementContext statementContext : ctx.statement()) {
            Statement statement = new StatementVisitor().visit(statementContext);
            blockStatements.add(new BlockStatement(statement, null, null));
        }

        return new Block(blockStatements);

    }

    private List<BlockStatement> getBlockStatements(List<GentleJavaParser.BlockStatementContext> blockStatementContextList) {
        List<BlockStatement> blockStatements = new ArrayList<>();
        BlockStatement blockStatement;

        for (GentleJavaParser.BlockStatementContext blockStatementContext : blockStatementContextList) {
            blockStatement = new BlockStatementVisitor().visit(blockStatementContext);
            blockStatements.add(blockStatement);
        }

        return blockStatements;
    }
}
