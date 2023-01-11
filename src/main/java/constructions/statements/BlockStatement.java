package constructions.statements;

import constructions.Block;
import constructions.enums.StatementType;

public class BlockStatement extends Statement {
    private Block block;

    public BlockStatement(int line, Block block) {
        super(StatementType.BLOCK, line);
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }
}
