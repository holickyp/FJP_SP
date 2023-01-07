package constructions.statements;

import constructions.Block;
import constructions.Expression;

public class WhileStatement {
    private final Expression expression;
    private final Block body;

    public WhileStatement(Expression expression, Block body) {
        this.expression = expression;
        this.body = body;
    }
}
