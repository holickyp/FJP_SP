package constructions.visitors;

import constructions.Variable;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class VariableVisitor extends GentleJavaBaseVisitor<Variable> {

    @Override
    public Variable visitVariable(GentleJavaParser.LocalVariableDeclarationContext ctx) {
        return new Variable(ctx.typeType().getText().toUpperCase().equals("CONST"),
                VariableType.valueOf(ctx.typeType().getText().toUpperCase()),
                ctx.identifier(0).getText(),
                ctx.identifier(),
                new ExpressionVisitor().visit())
    }
}
