package constructions.statements;

import constructions.Block;
import constructions.Expression;
import constructions.Statement;

public class WhileStatement extends Statement {
    private final Expression expression;
    private final Block body;

    public WhileStatement(Expression expression, Block body) {
        this.expression = expression;
        this.body = body;
    }
}
