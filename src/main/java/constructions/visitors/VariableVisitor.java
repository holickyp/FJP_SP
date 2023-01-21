package constructions.visitors;

import constructions.Variable;
import constructions.enums.VariableType;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class VariableVisitor extends GentleJavaBaseVisitor<Variable> {

    /**
     * Visitor pro variable
     * @param ctx context
     * @return Variable
     */
    @Override
    public Variable visitLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx) {
        Variable variable = new Variable(ctx.variableModifier() != null,
                VariableType.valueOf(ctx.typeType().getText().toUpperCase()),
                ctx.identifier(0).getText(),
                getParallel(ctx.identifier()),
                new ExpressionVisitor().visit(ctx.expression()));

        return variable;
    }

    /**
     * Processes parallel declaration
     * @param ctx ParalelDeclaration context
     * @return List<String> parallel variables identifiers
     */
    private List<String> getParallel(List<GentleJavaParser.IdentifierContext> ctx) {
        List<String> parallel = new ArrayList<>();

        for (int i = 1 ; i < ctx.size() ; i++) {
            String identifier = ctx.get(i).getText();
            parallel.add(identifier);
        }

        return parallel;
    }

}
