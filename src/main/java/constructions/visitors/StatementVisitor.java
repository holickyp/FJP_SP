package constructions.visitors;



import constructions.Block;
import constructions.Expression;
import constructions.Statement;
import constructions.Variable;
import constructions.enums.MethodReturnTypes;
import constructions.enums.VariableTypes;
import constructions.method.Method;
import constructions.statements.*;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.HashMap;
import java.util.List;


public class StatementVisitor extends GentleJavaBaseVisitor<Statement>
{

    /**
     * Visitor for StatementIf()
     * @param ctx StatementIf context
     * @return
     */
    @Override
    public IfStatement visitStatementIf(GentleJavaParser.StatementIfContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        expression.setReturnType(VariableTypes.BOOLEAN);

        Block bodyIf = ctx.body(0).blockBody() != null ? new BlockVisitor().visit(ctx.body(0).blockBody()) : null;

        Block bodyElse = null;

        // else part
        if (ctx.body(1) != null)
        {
            bodyElse = ctx.body(1).blockBody() != null ? new BlockVisitor().visit(ctx.body(1).blockBody()) : null;
        }

        return new IfStatement(expression, bodyIf, bodyElse);
    }

    /**
     * visitor for StatementFor()
     * @param ctx StatementFor context
     * @return
     */
    @Override
    public ForStatement visitStatementFor(GentleJavaParser.StatementForContext ctx)
    {
        ForStatement forStatement = new ForStatementVisitor().visit(ctx.forControl());

        Block body;

        if (ctx.body().blockBody() == null)
        {
            body = null;
        }
        else
        {
            body = new BlockVisitor().visit(ctx.body().blockBody());
        }
        //line rm
        forStatement.setBody(body);
        return forStatement;
    }

    /**
     * Visitor for StatementWhile()
     * @param ctx StatementWhile context
     * @return
     */
    @Override
    public WhileStatement visitStatementWhile(GentleJavaParser.StatementWhileContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        Block body = ctx.body().blockBody() != null ? new BlockVisitor().visit(ctx.body().blockBody()) : null;


        //rm line
        return new WhileStatement(expression, body);
    }

    /** TODO
    @Override
    public StatementDo visitStatementDo(SimpleJavaParser.StatementDoContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        BlockStatement body = ctx.body().blockBody() != null ? new BlockBodyVisitor().visit(ctx.body().blockBody()) : null;

        return new StatementDo(expression, body, ctx.start.getLine());
    } */

    /** TODO nevim zda t odelat pres mapu nebo dle FJP1 ,
     * @Override
    public SwitchStatement visitStatementSwitch(GentleJavaParser.StatementSwitchContext ctx)
    {
        List<GentleJavaParser.SwitchBlockStatementContext> switchBlocks = ctx.switchBlockStatement();

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
    }*/

    /**
     * Visitor for StatementRepeat()
     * @param ctx StatementRepeat context
     * @return
     */
    @Override
    public RepeatStatement visitStatementRepeat(GentleJavaParser.StatementRepeatContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        Block body = ctx.body().blockBody() != null ? new BlockVisitor().visit(ctx.body().blockBody()) : null;

        // rm expression and line
        return new RepeatStatement( body);
    }

    /**
     * Visitor for StatementMethodCall()
     * @param ctx StatementMethodCall context
     * @return
     */
    @Override
    public Statement visitStatementMethodCall(GentleJavaParser.StatementMethodCallContext ctx)
    {
        Method methodCall = new MethodVisitor().visit(ctx.methodCall());
        methodCall.setReturnType(MethodReturnTypes.VOID);


        return new MethodStatement(methodCall);
    }

    /**
     * Visitor for StatementAssigment()
     * @param ctx StatementAssigment
     * @return
     */
    @Override
    public Statement visitStatementAssigment(GentleJavaParser.StatementAssigmentContext ctx)
    {
        String identifier = ctx.variableAssigment().identifier().getText();
        Expression expression = new ExpressionVisitor().visit(ctx.variableAssigment().expressionBody());


        return new AssignmentStatement(identifier, expression);
    }

    /**
     * Visitor for StatementVariableDeclaration
     * @param ctx StatementVariableDeclaration context
     * @return
     */
    @Override
    public Statement visitStatementVariableDeclaration(GentleJavaParser.StatementVariableDeclarationContext ctx)
    {
        Variable variable = new VariableVisitor().visit(ctx.variableDeclaration());
       // variable.setLine(ctx.start.getLine());

        return new VariableStatement(variable);
    }
}
