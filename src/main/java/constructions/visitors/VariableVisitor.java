package constructions.visitors;

import constructions.Variable;
import constructions.enums.VariableType;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class VariableVisitor extends GentleJavaBaseVisitor<Variable> {

    //TODO parallel array suppose other mehods are needed VariableModifierContext VariableDeclaratorsContext
    @Override
    public Variable visitLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx) {

        if (ctx.variableModifier() != null) {


            return new Variable(true,
                    VariableType.valueOf(ctx.typeType().getText().toUpperCase()),
                    ctx.identifier(0).getText(),
                    // ctx.identifier(),
                    getParallel(ctx.identifier()),
                    new ExpressionVisitor().visit(ctx.expression()));
        }
        return new Variable(false,
                VariableType.valueOf(ctx.typeType().getText().toUpperCase()),
                ctx.identifier(0).getText(),
                // ctx.identifier(),
                getParallel(ctx.identifier()),
                new ExpressionVisitor().visit(ctx.expression()));

    }

    public String getIdentifier(GentleJavaParser.VariableDeclaratorIdContext ctx) {
        return ctx.identifier().getText();
    }


    /**
     * Processes parallel declaration
     * @param ctx ParalelDeclaration context
     * @return
     */
    private List<String> getParallel(List<GentleJavaParser.IdentifierContext> ctx)
    {
        List<String> parallel = new ArrayList<>();

        for (GentleJavaParser.IdentifierContext identifierContext : ctx) {
            String identifier = identifierContext.getText();
            parallel.add(identifier);
        }

        return parallel;
    }

}
