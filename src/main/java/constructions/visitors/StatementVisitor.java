package constructions.visitors;


import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import constructions.forControl.ControlFor;
import constructions.method.MethodCall;
import constructions.method.MethodCallStatement;
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
        // TODO exception
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

    //TODO
    @Override
    public SwitchStatement visitSwitchStatement(GentleJavaParser.SwitchStatementContext ctx)
    {
        List<GentleJavaParser.SwitchBlockStatementGroupContext> switchBlocks = ctx.switchBlockStatementGroup();

        HashMap<Integer, SwitchBlock> switchBlockHashMap = new HashMap<>();

        SwitchBlock defaultBlock = null;

        Expression expression = new ExpressionVisitor().visit(ctx.parExpression());

        for (GentleJavaParser.SwitchBlockStatementGroupContext switchBlockStatement : switchBlocks)
        {
            // case block
            if (switchBlockStatement.blockStatement() != null)
            {
                int identifier = Integer.parseInt(switchBlockStatement.switchLabel());
                BlockStatement body = switchBlockStatement.body().blockBody() != null ? new BlockBodyVisitor().visit(switchBlockStatement.body().blockBody()) : null;
                StatementSwitchBlock stmtSwitchBlock = new StatementSwitchBlock(identifier, body);
                switchBlockHashMap.put(identifier, stmtSwitchBlock);
            }
            // default block
            else
            {
                if (defaultBlock != null)
                {
                    ErrorHandler.getInstance().throwError(new ErrorSwitchMultipleDefaultBlock(switchBlockStatement.start.getLine()));
                }

                BlockStatement body = switchBlockStatement.body().blockBody() != null ? new BlockBodyVisitor().visit(switchBlockStatement.body().blockBody()) : null;
                defaultBlock = new StatementSwitchBlock(body, switchBlockStatement.body().blockBody().start.getLine());
            }
        }

        return new StatementSwitch(expression, switchBlockHashMap, defaultBlock, ctx.start.getLine());
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

    /**
     * Visitor for StatementMethodCall()
     * @param ctx StatementMethodCall context
     * @return
     */
    @Override
    public Statement visitMethodCallExpression(GentleJavaParser.MethodCallExpressionContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());
        methodCall.setReturnType(ReturnType.VOID);


        return new MethodCallStatement(methodCall, ctx.start.getLine());
    }

    /**
     * Visitor for StatementAssigment()
     * @param ctx StatementAssigment
     * @return

    @Override
    public Statement visitStatementAssigment(SimpleJavaParser.StatementAssigmentContext ctx)
    {
        String identifier = ctx.variableAssigment().identifier().getText();
        Expression expression = new ExpressionBodyVisitor().visit(ctx.variableAssigment().expressionBody());

        return new StatementAssigment(identifier, expression, ctx.start.getLine());
    }
    */

    /**
     * Visitor for StatementVariableDeclaration
     * @param ctx StatementVariableDeclaration context
     * @return
     *
    @Override
    public Statement visitStatementVariableDeclaration(SimpleJavaParser.StatementVariableDeclarationContext ctx)
    {
        Variable variable = new VariableVisitor().visit(ctx.variableDeclaration());
        variable.setLine(ctx.start.getLine());

        return new StatementDeclaration(variable, ctx.start.getLine());
    }
    */

}
