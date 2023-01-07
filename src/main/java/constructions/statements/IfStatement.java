package constructions.statements;

import constructions.Block;
import constructions.Expression;

public class IfStatement {
    private final Expression expression;
    private final Block bodyIf;
    private final Block bodyElse;

    public IfStatement(Expression expression, Block bodyIf, Block bodyElse) {
        this.expression = expression;
        this.bodyIf = bodyIf;
        this.bodyElse = bodyElse;
    }
}
