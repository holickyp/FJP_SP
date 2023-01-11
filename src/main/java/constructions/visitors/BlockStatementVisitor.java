package constructions.visitors;

import constructions.BlockStatement;
import constructions.Variable;
import constructions.method.Method;
import constructions.statements.Statement;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class BlockStatementVisitor extends GentleJavaBaseVisitor<BlockStatement> {

    @Override
    public BlockStatement visitBlockStatement(GentleJavaParser.BlockStatementContext ctx) {
        Statement statement = new StatementVisitor().visit(ctx.statement());
        Variable variable = new VariableVisitor().visit(ctx.localVariableDeclaration());
        Method method = new MethodVisitor().visit(ctx.methodDeclaration());

        return new BlockStatement(statement, variable, method);
    }

}
