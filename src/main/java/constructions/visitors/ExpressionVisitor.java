package constructions.visitors;

import constructions.Expression;
import constructions.method.MethodCall;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class ExpressionVisitor extends GentleJavaBaseVisitor<Expression> {

    /**
     * Visitor for ExprNeg()
     * @param ctx ExprNeg context
     * @return Expression
     */
    @Override
    public Expression visitExprNeg(GentleJavaParser.ExprNegContext ctx)
    {
        return new ExpressionNegation(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprMinus()
     * @param ctx ExprMinus context
     * @return Expression
     */
    @Override
    public Expression visitExprMinus(SimpleJavaParser.ExprMinusContext ctx)
    {
        return new ExpressionMinus(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprPlus()
     * useless, but we want to allow write for example method(+(1+1))
     * @param ctx ExprMinus context
     * @return Expression
     */
    @Override
    public Expression visitExprPlus(SimpleJavaParser.ExprPlusContext ctx)
    {
        return new ExpressionPlus(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprAdditive()
     * @param ctx ExprAdditive context
     * @return Expression
     */
    @Override
    public Expression visitExprAdditive(SimpleJavaParser.ExprAdditiveContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorAdditive operator = EOperatorAdditive.getSymbol(ctx.op.getText());

        return new ExpressionAdditive(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprPar()
     * @param ctx ExprPar context
     * @return Expression
     */
    @Override
    public Expression visitExprPar(SimpleJavaParser.ExprParContext ctx)
    {
        return new ExpressionPar(this.visit(ctx.expressionBody()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprRelational()
     * @param ctx ExprRelational context
     * @return Expression
     */
    @Override
    public Expression visitExprRelational(SimpleJavaParser.ExprRelationalContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorRelational operator = EOperatorRelational.getSymbol(ctx.op.getText());

        return new ExpressionRelational(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprIdentifier()
     * @param ctx ExprIdentifier context
     * @return Expression
     */
    @Override
    public Expression visitExprIdentifier(SimpleJavaParser.ExprIdentifierContext ctx)
    {
        return new ExpressionIdentifier(new Value(ctx.identifier().getText()), ctx.start.getLine());
    }

    /**
     * Visitor for ExprPossibleValue()
     * @param ctx ExprPossibleValue context
     * @return Expression
     */
    @Override
    public Expression visitExprPossibleValue(SimpleJavaParser.ExprPossibleValueContext ctx)
    {
        EVariableType type = null;
        Value value = null;

        if (ctx.possibleValues().DECIMAL() != null)
        {
            int dimension = 1;
            if (ctx.possibleValues().decimalSymbol() != null && ctx.possibleValues().decimalSymbol().getText().equals("-"))
            {
                dimension = -1;
            }
            int val = Integer.parseInt(ctx.possibleValues().DECIMAL().getText());
            value = new Value(val * dimension);
            type = EVariableType.INT;
        }
        else if (ctx.possibleValues().booleanValue() != null)
        {
            value = new Value(ctx.possibleValues().booleanValue().getText());
            type = EVariableType.BOOLEAN;
        }

        return new ExpressionValue(value, type, ctx.start.getLine());
    }

    /**
     * visitor for ExprLogical()
     * @param ctx ExprLogical context
     * @return Expression
     */
    @Override
    public Expression visitExprLogical(SimpleJavaParser.ExprLogicalContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorLogical operator = EOperatorLogical.getSymbol(ctx.op.getText());

        return new ExpressionLogical(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprMultipli()
     * @param ctx ExprMultipli context
     * @return Expression
     */
    @Override
    public Expression visitExprMultipli(SimpleJavaParser.ExprMultipliContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorMultiplication operator = EOperatorMultiplication.getSymbol(ctx.op.getText());

        return new ExpressionMultiplication(left, right, operator, ctx.start.getLine());
    }

    /**
     * Visitor for ExprMethodCall()
     * @param ctx ExprMethodCall context
     * @return Expression
     */
    @Override
    public Expression visitExprMethodCall(GentleJavaParser.ExprMethodCallContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());

        return new ExpressionMethodCall(methodCall, ctx.start.getLine());
    }
}
