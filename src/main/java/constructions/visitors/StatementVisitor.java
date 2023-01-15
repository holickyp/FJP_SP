package constructions.visitors;

import constructions.BlockStatement;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import constructions.forControl.ControlFor;
import constructions.statements.*;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.HashMap;
import java.util.List;

public class StatementVisitor extends GentleJavaBaseVisitor<Statement> {

    /**
     * Visitor for StatementIf()
     * @param ctx StatementIf context
     * @return
     */
    @Override
    public IfStatement visitIfStatement(GentleJavaParser.IfStatementContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        // Exception exception = new E

        expression.setReturnType(VariableType.BOOLEAN);

        Statement statementIf = ctx.braceStatement(0).statement() != null ? new StatementVisitor().visit(ctx.braceStatement(0).statement()) : null;

        Statement statementElse = null;

        // else part
        if (ctx.braceStatement(1) != null)
        {
            statementElse =ctx.braceStatement(1).statement() != null ? new StatementVisitor().visit(ctx.braceStatement(1).statement()) : null;
        }

        return new IfStatement(expression, statementIf, statementElse, ctx.start.getLine());
    }

    /**
     * visitor for StatementFor()
     * @param ctx StatementFor context
     * @return
     */
    @Override
    public ForStatement visitForStatement(GentleJavaParser.ForStatementContext ctx)
    {
        ControlFor controlFor = new ForControlVisitor().visit(ctx.forControl());

        Statement body;

        if (ctx.braceStatement().statement() == null)
        {
            body = null;
        }
        else
        {
            body = new StatementVisitor().visit(ctx.braceStatement().statement());
        }

        return new ForStatement( ctx.start.getLine(), controlFor, body);
    }

    /**
     * Visitor for StatementWhile()
     * @param ctx StatementWhile context
     * @return
     */
    @Override
    public WhileStatement visitWhileStatement(GentleJavaParser.WhileStatementContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        Statement body = ctx.braceStatement().statement() != null ? new StatementVisitor().visit(ctx.braceStatement().statement()) : null;

        return new WhileStatement(ctx.start.getLine(), expression, body);
    }

    @Override
    public DoWhileStatement visitDoWhileStatement(GentleJavaParser.DoWhileStatementContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        Statement body = ctx.braceStatement().statement() != null ? new StatementVisitor().visit(ctx.braceStatement().statement()) : null;

        return new DoWhileStatement(ctx.start.getLine(), body, expression);
    }


    @Override
    public SwitchStatement visitSwitchStatement(GentleJavaParser.SwitchStatementContext ctx)
    {
        List<GentleJavaParser.SwitchBlockStatementGroupContext> switchBlocks = ctx.switchBlockStatementGroup();
        HashMap<Integer, SwitchBlock> switchBlockHashMap = new HashMap<>();
        SwitchBlock defaultBlock = null;
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        for (GentleJavaParser.SwitchBlockStatementGroupContext switchBlockStatement : switchBlocks)
        {
            for(int i = 0; i<switchBlockStatement.switchLabel().size(); i++) {
                // case block
                if(switchBlockStatement.switchLabel(i).CASE() != null) {
                    int identifier = Integer.parseInt(switchBlockStatement.switchLabel(i).getText());
                    BlockStatement body = switchBlockStatement.blockStatement(i) != null ? new BlockStatementVisitor().visit(switchBlockStatement.blockStatement(i)) : null;
                    BlockLabelStatement blockLabelStatement= new BlockLabelStatement(ctx.start.getLine(), body);
                    SwitchBlock switchBlock = new SwitchBlock(identifier, blockLabelStatement);
                    switchBlockHashMap.put(identifier, switchBlock);
                }
                // default block
                else {

                    if (defaultBlock != null)
                    {
                        //TODO: throw error
                        //ErrorHandler.getInstance().throwError(new ErrorSwitchMultipleDefaultBlock(switchBlockStatement.start.getLine()));
                    }
                    BlockStatement body = switchBlockStatement.blockStatement(i) != null ? new BlockStatementVisitor().visit(switchBlockStatement.blockStatement(i)) : null;
                    BlockLabelStatement blockLabelStatement= new BlockLabelStatement(ctx.start.getLine(), body);
                    defaultBlock = new SwitchBlock(blockLabelStatement, switchBlockStatement.blockStatement(i).statement().start.getLine());

                }

            }
        }
        return new SwitchStatement(ctx.start.getLine(), expression, switchBlockHashMap, defaultBlock);
    }

    /**
     * Visitor for StatementRepeat()
     * @param ctx StatementRepeat context
     * @return
     */
    @Override
    public RepeatStatement visitRepeatStatement(GentleJavaParser.RepeatStatementContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());
        Statement body = ctx.braceStatement().statement() != null ? new StatementVisitor().visit(ctx.braceStatement().statement()) : null;

        return new RepeatStatement(ctx.start.getLine(), body, expression);
    }

    @Override
    public BlockLabelStatement visitBlockLabelStatement(GentleJavaParser.BlockLabelStatementContext ctx) {
        BlockStatement body = new BlockStatementVisitor().visit(ctx.block());

        return new BlockLabelStatement(ctx.start.getLine(), body);
    }

    @Override
    public ExpressionStatement visitExpressionStatement(GentleJavaParser.ExpressionStatementContext ctx) {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());

        return new ExpressionStatement(ctx.start.getLine(), expression);
    }
}