package constructions.visitors;

import constructions.Block;
import constructions.BlockStatement;
import constructions.ErrorHandler;
import constructions.enums.VariableType;
import constructions.error.ErrorSwitchMultipleDefaultBlock;
import constructions.expressions.Expression;
import constructions.statements.*;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StatementVisitor extends GentleJavaBaseVisitor<Statement> {

    /**
     * Visitor pro statement if
     * @param ctx context
     * @return IfStatement
     */
    @Override
    public IfStatement visitIfStatement(GentleJavaParser.IfStatementContext ctx) {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        expression.setReturnType(VariableType.BOOLEAN);

        Block statementIf = ctx.block().size() > 0 ? new BlockVisitor().visit(ctx.block(0)) : null;

        Block statementElse = ctx.block().size() > 1 ? new BlockVisitor().visit(ctx.block(1)) : null;

        return new IfStatement(expression, statementIf, statementElse, ctx.start.getLine());
    }

    /**
     * Visitor pro statement while
     * @param ctx context
     * @return WhileStatement
     */
    @Override
    public WhileStatement visitWhileStatement(GentleJavaParser.WhileStatementContext ctx) {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        Block body = ctx.block() != null ? new BlockVisitor().visit(ctx.block()) : null;

        return new WhileStatement(ctx.start.getLine(), expression, body);
    }

    /**
     * visitor pro statement do while
     * @param ctx context
     * @return DoWhileStatement
     */
    @Override
    public DoWhileStatement visitDoWhileStatement(GentleJavaParser.DoWhileStatementContext ctx) {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        Block body = ctx.block() != null ? new BlockVisitor().visit(ctx.block()) : null;

        return new DoWhileStatement(ctx.start.getLine(), body, expression);
    }


    /**
     * Visitor pro statement switch
     * @param ctx context
     * @return SwitchStatement
     */
    @Override
    public SwitchStatement visitSwitchStatement(GentleJavaParser.SwitchStatementContext ctx) {
        List<GentleJavaParser.SwitchBlockStatementGroupContext> switchBlocks = ctx.switchBlockStatementGroup();
        HashMap<Integer, SwitchBlock> switchBlockHashMap = new HashMap<>();
        SwitchBlock defaultBlock = null;
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        for (GentleJavaParser.SwitchBlockStatementGroupContext switchBlockStatement : switchBlocks) {
            // case block
            if(switchBlockStatement.switchLabel().CASE() != null) {
                int identifier = Integer.parseInt(switchBlockStatement.switchLabel().NUMBER().getText());
                List<BlockStatement> caseBody = new ArrayList<>();
                for(GentleJavaParser.BlockStatementContext blockStatementContext : switchBlockStatement.blockStatement()) {
                    caseBody.add(new BlockStatementVisitor().visit(blockStatementContext));
                }
                SwitchBlock switchBlock = new SwitchBlock(identifier, caseBody);
                switchBlockHashMap.put(identifier, switchBlock);
            }
            // default block
            else {
                if (defaultBlock != null) {
                    ErrorHandler.getInstance().throwError(new ErrorSwitchMultipleDefaultBlock(switchBlockStatement.start.getLine()));
                }
                List<BlockStatement> defaultCaseBody = new ArrayList<>();
                int line = -1;
                for(GentleJavaParser.BlockStatementContext blockStatementContext : switchBlockStatement.blockStatement()) {
                    defaultCaseBody.add(new BlockStatementVisitor().visit(blockStatementContext));
                    line = blockStatementContext.statement().start.getLine();
                }
                defaultBlock = new SwitchBlock(defaultCaseBody, line);

            }
        }
        return new SwitchStatement(ctx.start.getLine(), expression, switchBlockHashMap, defaultBlock);
    }

    /**
     * Visitor pro statement repeat
     * @param ctx context
     * @return RepeatStatement
     */
    @Override
    public RepeatStatement visitRepeatStatement(GentleJavaParser.RepeatStatementContext ctx) {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        Block body = ctx.block() != null ? new BlockVisitor().visit(ctx.block()) : null;

        return new RepeatStatement(ctx.start.getLine(), body, expression);
    }

    /**
     * Visitor pro statement block label
     * @param ctx context
     * @return BlockLabelStatement
     */
    @Override
    public BlockLabelStatement visitBlockLabelStatement(GentleJavaParser.BlockLabelStatementContext ctx) {
        Block body = new BlockVisitor().visit(ctx.block());

        return new BlockLabelStatement(ctx.start.getLine(), body);
    }

    /**
     * Visitor pro statement Expression
     * @param ctx context
     * @return ExpressionStatement
     */
    @Override
    public ExpressionStatement visitExpressionStatement(GentleJavaParser.ExpressionStatementContext ctx) {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());

        return new ExpressionStatement(ctx.start.getLine(), expression);
    }
}