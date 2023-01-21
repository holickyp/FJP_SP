package constructions.statements;

import constructions.Block;
import constructions.enums.StatementType;
import constructions.forControl.ControlFor;

public class ForStatement extends Statement {
    private ControlFor controlFor;
    private Block body;

    public ForStatement(int line, ControlFor controlFor, Block body) {
        super(StatementType.FOR, line);
        this.controlFor = controlFor;
        this.body = body;
    }

    public ControlFor getControlFor() {
        return controlFor;
    }

    public Block getBody() {
        return body;
    }
}
