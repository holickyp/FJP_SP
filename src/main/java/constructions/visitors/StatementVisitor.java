package constructions.visitors;


import constructions.enums.VariableType;
import constructions.expressions.Expression;
import constructions.forControl.ControlFor;
import constructions.statements.BlockStatement;
import constructions.statements.ForStatement;
import constructions.statements.IfStatement;
import constructions.statements.Statement;
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

        BlockStatement statementIf = ctx.braceStatement(0).statement() != null ? new BlockStatementVisitor().visit(ctx.braceStatement(0).statement()) : null;

        BlockStatement statementElse = null;

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

        BlockStatement body;

        if (ctx.body().blockBody() == null)
        {
            body = null;
        }
        else
        {
            body = new BlockBodyVisitor().visit(ctx.body().blockBody());
        }

        return new StatementFor(controlFor, body, ctx.start.getLine());
    }

    /**
     * Visitor for StatementWhile()
     * @param ctx StatementWhile context
     * @return
     */
    @Override
    public StatementWhile visitStatementWhile(SimpleJavaParser.StatementWhileContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementWhile(expression, body, ctx.start.getLine());
    }

    @Override
    public StatementDo visitStatementDo(SimpleJavaParser.StatementDoContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementDo(expression, body, ctx.start.getLine());
    }

    @Override
    public StatementSwitch visitStatementSwitch(SimpleJavaParser.StatementSwitchContext ctx)
    {
        List<SimpleJavaParser.SwitchBlockStatementContext> switchBlocks = ctx.switchBlockStatement();

        HashMap<Integer, StatementSwitchBlock> switchBlockHashMap = new HashMap<>();

        StatementSwitchBlock defaultBlock = null;

        Expression expression = new ExpressionVisitor().visit(ctx.expression());

        for (SimpleJavaParser.SwitchBlockStatementContext switchBlockStatement : switchBlocks)
        {
            // case block
            if (switchBlockStatement.CASE() != null)
            {
                int identifier = Integer.parseInt(switchBlockStatement.DECIMAL().getText());
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
    public StatementRepeat visitStatementRepeat(SimpleJavaParser.StatementRepeatContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementRepeat(expression, body, ctx.start.getLine());
    }

    /**
     * Visitor for StatementMethodCall()
     * @param ctx StatementMethodCall context
     * @return
     */
    @Override
    public Statement visitStatementMethodCall(SimpleJavaParser.StatementMethodCallContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());
        methodCall.setExpectedReturnType(EMethodReturnType.VOID);


        return new StatementMethodCall(methodCall, ctx.start.getLine());
    }

    /**
     * Visitor for StatementAssigment()
     * @param ctx StatementAssigment
     * @return
     */
    @Override
    public Statement visitStatementAssigment(SimpleJavaParser.StatementAssigmentContext ctx)
    {
        String identifier = ctx.variableAssigment().identifier().getText();
        Expression expression = new ExpressionBodyVisitor().visit(ctx.variableAssigment().expressionBody());

        return new StatementAssigment(identifier, expression, ctx.start.getLine());
    }

    /**
     * Visitor for StatementVariableDeclaration
     * @param ctx StatementVariableDeclaration context
     * @return
     */
    @Override
    public Statement visitStatementVariableDeclaration(SimpleJavaParser.StatementVariableDeclarationContext ctx)
    {
        Variable variable = new VariableVisitor().visit(ctx.variableDeclaration());
        variable.setLine(ctx.start.getLine());

        return new StatementDeclaration(variable, ctx.start.getLine());
    }

}
