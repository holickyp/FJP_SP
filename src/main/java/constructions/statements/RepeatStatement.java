package constructions.statements;

import constructions.Block;
import constructions.Statement;

public class RepeatStatement  extends Statement {
    private final Block body;

    public RepeatStatement(Block body) {
        this.body = body;
    }
}
