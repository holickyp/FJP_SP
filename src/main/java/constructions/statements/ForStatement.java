package constructions.statements;

import constructions.Block;
import constructions.Expression;
import constructions.Statement;

public class ForStatement extends Statement {
    private final String controlVariable;
    private final Expression condition;
    private final Expression action;

    private  Block body;

    public ForStatement(String controlVariable, Expression condition, Expression action, Block body) {
        this.controlVariable = controlVariable;
        this.condition = condition;
        this.action = action;
        this.body = body;
    }

    public Block getBody() {
        return body;
    }

    public void setBody(Block body) {
        this.body = body;
    }
}
