package constructions.statements;

import constructions.BlockStatement;

public class SwitchBlock {

    private int identifier;
    private BlockStatement blockStatement;
    private int line;

    public SwitchBlock(BlockStatement blockStatement, int line) {
        this.blockStatement = blockStatement;
        this.line = line;
    }

    public SwitchBlock(int identifier, BlockStatement blockStatement) {
        this.identifier = identifier;
        this.blockStatement = blockStatement;
    }

    public int getIdentifier() {
        return identifier;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public int getLine() {
        return line;
    }
}
