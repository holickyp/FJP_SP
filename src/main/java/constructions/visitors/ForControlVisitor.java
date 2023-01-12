package constructions.visitors;


import constructions.Variable;
import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import constructions.forControl.ControlFor;
import constructions.forControl.InitFor;
import constructions.method.MethodCallParameter;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class ForControlVisitor extends GentleJavaBaseVisitor<ControlFor>
{
    /**
     * Visitor for ForControl()
     * @param ctx forControl context
     * @return
     */
    //TODO check forControl
    @Override
    public ControlFor visitForControl(GentleJavaParser.ForControlContext ctx)
    {

        Variable variable = new VariableVisitor().visit(ctx.forInit().localVariableDeclaration());
        List<Expression> initEx = parseExpressions(ctx.forInit().expressionList().expression());
        InitFor initFor = new InitFor(variable, initEx);


        Expression expression = new ExpressionBodyVisitor().visit(ctx.expression());
        expression.setReturnType(VariableType.INT);

        List<Expression> updateFor = parseExpressions(ctx.expressionList().expression());

        return new ControlFor(initFor, expression, updateFor);
    }

    private List<Expression> parseExpressions(List<GentleJavaParser.ExpressionContext> expressionContextList) {
        List<Expression> expressions = new ArrayList<>();


        for (GentleJavaParser.ExpressionContext expressionContext : expressionContextList)
        {
            Expression ex = new ExpressionVisitor().visit(expressionContext);
            expressions.add(ex);

        }

        return expressions;
    }
}
