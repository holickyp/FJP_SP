package constructions.statements;

import constructions.enums.StatementType;
import constructions.forControl.ControlFor;

public class ForStatement extends Statement {
    private ControlFor controlFor;
    private Statement statement;

    public ForStatement(int line, ControlFor controlFor, Statement statement) {
        super(StatementType.FOR, line);
        this.controlFor = controlFor;
        this.statement = statement;
    }

    public ControlFor getControlFor() {
        return controlFor;
    }

    public Statement getStatement() {
        return statement;
    }
}
