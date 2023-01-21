package constructions.statements;

import constructions.enums.StatementType;

public class Statement {
    private final StatementType type;
    private final int line;

    public Statement(StatementType type, int line) {
        this.type = type;
        this.line = line;
    }

    public StatementType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }
}
