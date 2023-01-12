package constructions.statements;

import constructions.Block;
import constructions.BlockStatement;
import constructions.enums.StatementType;

public class BlockLabelStatement extends Statement {
    private BlockStatement blockStatement;

    public BlockLabelStatement(int line, BlockStatement blockStatement) {
        super(StatementType.BLOCK, line);
        this.blockStatement = blockStatement;
    }

    public BlockStatement getBlock() {
        return blockStatement;
    }
}
