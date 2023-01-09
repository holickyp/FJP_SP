package constructions.visitors;


import constructions.Expression;
import constructions.enums.VariableTypes;
import constructions.statements.ForStatement;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class ForStatementVisitor extends GentleJavaBaseVisitor<ForStatement>
{
    /**
     * Visitor for ForControl()
     * @param ctx forControl context
     * @return
     */
    @Override
    public ForStatement visitForControl(GentleJavaParser.ForControlContext ctx)
    {
        String identifier = ctx.identifier().getText();

        Expression from = new ExpressionVisitor().visit(ctx.expressionBody(0));
        from.setReturnType(VariableTypes.INT);

        Expression to = new ExpressionVisitor().visit(ctx.expressionBody(1));
        to.setReturnType(VariableTypes.INT);

        return new ForStatement(identifier, from, to, null);
    }
}
