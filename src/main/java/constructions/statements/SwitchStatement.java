package constructions.statements;

import constructions.Block;
import constructions.Expression;

public class SwitchStatement {
    private final Expression expression;

    private final int identifier;
    private final Block body;

    public SwitchStatement(Expression expression, int identifier, Block body) {
        this.expression = expression;
        this.identifier = identifier;
        this.body = body;
    }
}
