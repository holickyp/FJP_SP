package constructions.visitors;


import com.sun.tools.javac.jvm.Gen;
import constructions.enums.Operator;
import constructions.enums.PostfixType;
import constructions.enums.VariableType;
import constructions.expressions.*;
import constructions.method.MethodCall;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;


public class ExpressionBodyVisitor extends GentleJavaBaseVisitor<Expression>
{


    /**
     * Visitor for ExprAdditive()
     * @param ctx ExprAdditive context
     * @return Expression
     */
    @Override
    public Expression visitPlusMinusExpression(GentleJavaParser.PlusMinusExpressionContext ctx)
    {
        Expression left = this.visit(ctx.expression(0));
        Expression right = this.visit(ctx.expression(1));
        //TODO get plus or minus operator
        Operator operator = Operator.valueOf(ctx..getText());

        return new PlusMinusExpression(ctx.start.getLine(),left, operator, right);
    }

    /**
     * Visitor for ExprPar()
     * @param ctx ExprPar context
     * @return Expression
     */
    @Override
    public Expression visitParExpression(GentleJavaParser.ParExpressionContext ctx)
    {
        return new ParenthesesExpression(ctx.start.getLine(), this.visit(ctx.expression()));
    }

    /**
     * Visitor for ExprRelational()
     * @param ctx ExprRelational context
     * @return Expression
     */
    @Override
    public Expression visitRelationalExpression(GentleJavaParser.RelationalExpressionContext ctx)
    {
        Expression left = this.visit(ctx.expression(0));
        Expression right = this.visit(ctx.expression(1));
        //TODO find operator
        Operator operator = Operator.valueOf(ctx.op.getText());

        return new RelationalExpression(ctx.start.getLine(), left, operator, right);
    }

    /**
     * Visitor for ExprIdentifier()
     * @param ctx ExprIdentifier context
     * @return Expression
     */
    @Override
    public Expression visitIdentifierExpression(GentleJavaParser.IdentifierExpressionContext ctx)
    {
        Object o = ctx.identifier().getText();
        return new IdentifierExpression(ctx.start.getLine(), o);
    }

    /**
     * Visitor for ExprPossibleValue()
     * @param ctx ExprPossibleValue context
     * @return Expression
     */
    @Override
    public Expression visitPossibleValueExpression(GentleJavaParser.PossibleValueExpressionContext ctx)
    {
        VariableType type = null;
        Object value = null;

        if (ctx.possibleValues().NUMBER() != null)
        {
            int dimension = 1;
            if (ctx.possibleValues(). != null && ctx.possibleValues().decimalSymbol().getText().equals("-"))
            {
                dimension = -1;
            }
            int val = Integer.parseInt(ctx.possibleValues().NUMBER().getText());
            value = val * dimension;
            type = VariableType.INT;
        }
        else if (ctx.possibleValues().booleanValue() != null)
        {
            value = ctx.possibleValues().booleanValue().getText();
            type = VariableType.BOOLEAN;
        }

        return new ValueExpression(ctx.start.getLine(), value, type);
    }

    /**
     * visitor for ExprLogical()
     * @param ctx ExprLogical context
     * @return Expression
     */
    @Override
    public Expression visitLogicalExpression(GentleJavaParser.LogicalExpressionContext ctx)
    {
        Expression left = this.visit(ctx.expression(0));
        Expression right = this.visit(ctx.expression(1));
        //TODO
        Operator operator = Operator.getSymbol(ctx.op.getText());

        return new LogicalExpression( ctx.start.getLine(),left, operator,right);
    }

    /**
     * Visitor for ExprMultipli()
     * @param ctx ExprMultipli context
     * @return Expression
     */
    @Override
    public Expression visitMulDivModExpression(GentleJavaParser.MulDivModExpressionContext ctx)
    {
        Expression left = this.visit(ctx.expression(0));
        Expression right = this.visit(ctx.expression(1));
        //TODO
        Operator operator = Operator.valueOf(ctx.op.getText());

        return new MulDivModExpression(ctx.start.getLine(), left,  operator, right);
    }

    /**
     * Visitor for ExprMethodCall()
     * @param ctx ExprMethodCall context
     * @return Expression
     */
    @Override
    public Expression visitMethodCallExpression(GentleJavaParser.MethodCallExpressionContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());

        return new MethodCallExpression( ctx.start.getLine(), methodCall);
    }

    @Override
    public Expression visitPostfixExpression(GentleJavaParser.PostfixExpressionContext ctx) {

        Expression ex = ctx.expression();
        PostfixType type = ctx.postfix.getType();
        return new PostfixExpression(ctx.start.getLine(), );
    }

    public Expression visitPrefixExpression(GentleJavaParser.PrefixExpressionContext ctx) {

        return new PrefixExpression(ctx.start.getLine(),);
    }


}
