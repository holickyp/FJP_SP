package constructions.statements;

import constructions.Block;
import constructions.BlockStatement;
import constructions.enums.StatementType;

public class BlockLabelStatement extends Statement {
    private Block blockStatement;

    public BlockLabelStatement(int line, Block blockStatement) {
        super(StatementType.BLOCK, line);
        this.blockStatement = blockStatement;
    }

    public Block getBlock() {
        return blockStatement;
    }
}
