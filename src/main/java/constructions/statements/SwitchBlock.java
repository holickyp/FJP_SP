package constructions.statements;

public class SwitchBlock{

    private int identifier;
    private BlockLabelStatement blockStatement;
    private int line;

    public SwitchBlock(BlockLabelStatement blockStatement, int line) {
        this.blockStatement = blockStatement;
        this.line = line;
    }

    public SwitchBlock(int identifier, BlockLabelStatement blockStatement) {
        this.identifier = identifier;
        this.blockStatement = blockStatement;
    }

    public int getIdentifier() {
        return identifier;
    }

    public BlockLabelStatement getSwitchBlockStatement() {
        return blockStatement;
    }

    public int getLine() {
        return line;
    }
}
