package constructions.visitors;

import constructions.expressions.Expression;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class ExpressionVisitor extends GentleJavaBaseVisitor<Expression> {

    /**
     * Visitor for Expression()
     * @param ctx Expression context
     * @return
     */
    @Override
    public Expression visitExpression(GentleJavaParser.ExpressionContext ctx)
    {
        Expression expression = new ExpressionBodyVisitor().visit(ctx);

        return expression;
    }
}
