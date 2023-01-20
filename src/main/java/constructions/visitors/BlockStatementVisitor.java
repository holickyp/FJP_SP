package constructions.visitors;

import constructions.BlockStatement;
import constructions.Variable;
import constructions.method.Method;
import constructions.statements.Statement;
import generated.GentleJavaBaseVisitor;
import generated.GentleJavaParser;

public class BlockStatementVisitor extends GentleJavaBaseVisitor<BlockStatement> {

    @Override
    public BlockStatement visitBlockStatement(GentleJavaParser.BlockStatementContext ctx) {
        Statement statement = null;
        if(ctx.statement() != null) {
            statement = new StatementVisitor().visit(ctx.statement());
        }
        Variable variable = null;
        if(ctx.localVariableDeclaration() != null) {
            variable = new VariableVisitor().visit(ctx.localVariableDeclaration());
        }
        Method method = null;
        if(ctx.methodDeclaration() != null) {
            method = new MethodVisitor().visit(ctx.methodDeclaration());
        }

        return new BlockStatement(statement, variable, method);
    }

}
