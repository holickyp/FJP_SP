package constructions.visitors;


import constructions.forControl.ControlFor;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class ForControlVisitor extends GentleJavaBaseVisitor<ControlFor>
{
    /**
     * Visitor for ForControl()
     * @param ctx forControl context
     * @return
     */
    @Override
    public ControlFor visitForControl(GentleJavaParser.ForControlContext ctx)
    {
        String identifier = ctx.identifier().getText();

        Expression from = new ExpressionBodyVisitor().visit(ctx.expressionBody(0));
        from.setExpectedReturnType(EVariableType.INT);

        Expression to = new ExpressionBodyVisitor().visit(ctx.expressionBody(1));
        to.setExpectedReturnType(EVariableType.INT);

        return new ControlFor(identifier, from, to);
    }
}
