package constructions.visitors;

import constructions.enums.*;
import constructions.expressions.*;
import constructions.method.MethodCall;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaListener;
import generated.GentleJavaParser;



public class ExpressionVisitor extends GentleJavaBaseVisitor<Expression> {

    @Override
    public Expression visitCompareExpression(GentleJavaParser.CompareExpressionContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));
        Operator operator = Operator.getOp(ctx.bop.getText());

        return new CompareExpression(ctx.start.getLine(), left, operator, right);
    }

    @Override
    public Expression visitPlusMinusExpression(GentleJavaParser.PlusMinusExpressionContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));
        Operator operator = Operator.getOp(ctx.bop.getText());

        return new PlusMinusExpression(ctx.start.getLine(),left, operator, right);
    }

    @Override
    public Expression visitParenthesesExpression(GentleJavaParser.ParenthesesExpressionContext ctx) {
        return new ParenthesesExpression(ctx.start.getLine(), this.visit(ctx.expression()));
    }

    @Override
    public Expression visitParExpression(GentleJavaParser.ParExpressionContext ctx) {
        return new ParenthesesExpression(ctx.start.getLine(), this.visit(ctx.expression()));
    }

    @Override
    public Expression visitRelationalExpression(GentleJavaParser.RelationalExpressionContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));
        Operator operator = Operator.getOp(ctx.bop.getText());

        return new RelationalExpression(ctx.start.getLine(), left, operator, right);
    }

    @Override
    public Expression visitIdentifierExpression(GentleJavaParser.IdentifierExpressionContext ctx) {
        Object o = ctx.identifier().getText();
        return new IdentifierExpression(ctx.start.getLine(), o);
    }

    @Override
    public Expression visitPossibleValueExpression(GentleJavaParser.PossibleValueExpressionContext ctx) {
        VariableType type = null;
        Object value = null;

        if (ctx.possibleValues().NUMBER() != null) {
            int dimension = 1;
            // TODO not sure if this gonna work
            if (ctx.possibleValues().NUMBER() != null && ctx.possibleValues().MINUS() != null && ctx.possibleValues().MINUS().getText().equals("-")) {
                dimension = -1;
            }
            int val = Integer.parseInt(ctx.possibleValues().NUMBER().getText());
            value = val * dimension;
            type = VariableType.INT;
        }
        else if (ctx.possibleValues().booleanValue() != null) {
            value = ctx.possibleValues().booleanValue().getText();
            type = VariableType.BOOLEAN;
        }

        return new ValueExpression(ctx.start.getLine(), value, type);
    }

    @Override
    public Expression visitLogicalExpression(GentleJavaParser.LogicalExpressionContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));
        Operator operator = Operator.getOp(ctx.bop.getText());

        return new LogicalExpression( ctx.start.getLine(),left, operator,right);
    }

    @Override
    public Expression visitMulDivModExpression(GentleJavaParser.MulDivModExpressionContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));
        Operator operator = Operator.getOp(ctx.bop.getText());

        return new MulDivModExpression(ctx.start.getLine(), left,  operator, right);
    }

    @Override
    public Expression visitMethodCallExpression(GentleJavaParser.MethodCallExpressionContext ctx) {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());

        return new MethodCallExpression( ctx.start.getLine(), methodCall);
    }

    @Override
    public Expression visitPostfixExpression(GentleJavaParser.PostfixExpressionContext ctx) {
        Expression ex = this.visit(ctx.expression());
        PostfixType type = PostfixType.getType(ctx.postfix.getText());
        return new PostfixExpression(ctx.start.getLine(), ex, type);
    }

    @Override
    public Expression visitPrefixExpression(GentleJavaParser.PrefixExpressionContext ctx) {
       Expression ex = this.visit(ctx.expression());
       PrefixType type = PrefixType.getType(ctx.prefix.getText());
       return new PrefixExpression(ctx.start.getLine(), type, ex);
    }

    @Override
    public Expression visitAssignExpression(GentleJavaParser.AssignExpressionContext ctx) {
        Expression left = visit(ctx.expression(0));
        Expression right = visit(ctx.expression(1));

        return new AssignExpression(ctx.start.getLine(), left, right);
    }

    @Override
    public Expression visitTernaryExpression(GentleJavaParser.TernaryExpressionContext ctx) {
        Expression question = visit(ctx.expression(0));
        Expression trueExpression = visit(ctx.expression(1));
        Expression falseExpression = visit(ctx.expression(2));

        return new TernaryExpression(ctx.start.getLine(), question, trueExpression, falseExpression);
    }
}
