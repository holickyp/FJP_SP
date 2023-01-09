package constructions.statements;

import constructions.Block;
import constructions.Expression;
import constructions.Statement;

public class IfStatement extends Statement {
    private final Expression expression;
    private final Block bodyIf;
    private final Block bodyElse;

    public IfStatement(Expression expression, Block bodyIf, Block bodyElse) {
        this.expression = expression;
        this.bodyIf = bodyIf;
        this.bodyElse = bodyElse;
    }
}
