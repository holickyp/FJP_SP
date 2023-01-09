package constructions.visitors;

import constructions.Block;
import constructions.Statement;
import constructions.Variable;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BlockVisitor extends GentleJavaBaseVisitor<Block> {

    @Override
    public Block visitBlock(GentleJavaParser.BlockContext ctx) {
        Block block = new Block();
        //change to statement visitor
        final VariableVisitor variableVisitor = new VariableVisitor();
        List<Variable> statements = new ArrayList<>();
        for (GentleJavaParser.StatementContext statement : ctx.blockStatement().statement()) {
            Variable accept = statement.accept(variableVisitor);
            statements.add(accept);
        }

        return block;
    }

}
