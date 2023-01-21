package constructions.visitors;


import constructions.Variable;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import constructions.forControl.ControlFor;
import constructions.forControl.InitFor;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class ForControlVisitor extends GentleJavaBaseVisitor<ControlFor> {
    @Override
    public ControlFor visitForControl(GentleJavaParser.ForControlContext ctx) {
        Variable variable = null;
        List<Expression> initEx = new ArrayList<>();
        if(ctx.forInit().localVariableDeclaration() != null) {
            variable = new VariableVisitor().visit(ctx.forInit().localVariableDeclaration());
        }
        else if(ctx.forInit().expressionList() != null) {
            initEx = parseExpressions(ctx.forInit().expressionList().expression());
        }
        InitFor initFor = new InitFor(variable, initEx);

        Expression expression = null;
        if(ctx.expression() != null) {
            expression = new ExpressionVisitor().visit(ctx.expression());
            expression.setReturnType(VariableType.INT);
        }

        List<Expression> updateFor = new ArrayList<>();
        if(ctx.expressionList() != null) {
            updateFor = parseExpressions(ctx.expressionList().expression());
        }

        return new ControlFor(initFor, expression, updateFor);
    }

    private List<Expression> parseExpressions(List<GentleJavaParser.ExpressionContext> expressionContextList) {
        List<Expression> expressions = new ArrayList<>();

        for (GentleJavaParser.ExpressionContext expressionContext : expressionContextList) {
            Expression ex = new ExpressionVisitor().visit(expressionContext);
            expressions.add(ex);
        }

        return expressions;
    }
}
