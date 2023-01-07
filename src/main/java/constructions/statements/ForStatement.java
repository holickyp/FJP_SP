package constructions.statements;

import constructions.Block;
import constructions.Expression;

public class ForStatement {
    private final String controlVariable;
    private final Expression condition;
    private final Expression action;

    private final Block body;

    public ForStatement(String controlVariable, Expression condition, Expression action, Block body) {
        this.controlVariable = controlVariable;
        this.condition = condition;
        this.action = action;
        this.body = body;
    }
}
