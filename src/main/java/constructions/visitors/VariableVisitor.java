package constructions.visitors;

import constructions.Variable;
import constructions.enums.VariableType;
import constructions.expressions.Expression;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class VariableVisitor extends GentleJavaBaseVisitor<Variable> {

    //TODO parallel array suppose other mehods are needed VariableModifierContext VariableDeclaratorsContext
    @Override
    public Variable visitLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx) {
        return new Variable(ctx.typeType().getText().toUpperCase().equals("CONST"),
                VariableType.valueOf(ctx.typeType().getText().toUpperCase()),
                ctx.identifier(0).getText(),
               // ctx.identifier(),
                null,
                new ExpressionVisitor().visit(ctx.expression()));
    }



}
