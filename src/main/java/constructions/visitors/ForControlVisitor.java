package constructions.visitors;


import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import constructions.forControl.ControlFor;
import constructions.forControl.InitFor;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

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
        // TODO for what is initFor coudlnt be identifier enough?

       // InitFor initFor = new InitFor(ctx.forInit().localVariableDeclaration());
        InitFor initFor = new InitFor();

        List<Expression> updateFor = (List<Expression>) ctx.expressionList();


        Expression expression = new ExpressionBodyVisitor().visit(ctx.expression());
        expression.setReturnType(VariableType.INT);

        return new ControlFor(initFor, expression, updateFor);
    }
}
