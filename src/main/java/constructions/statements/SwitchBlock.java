package constructions.statements;

import constructions.BlockStatement;

import java.util.List;

public class SwitchBlock{

    private int identifier;
    private List<BlockStatement> blockStatements;
    private int line;

    public SwitchBlock(List<BlockStatement> blockStatements, int line) {
        this.blockStatements = blockStatements;
        this.line = line;
    }

    public SwitchBlock(int identifier, List<BlockStatement> blockStatements) {
        this.identifier = identifier;
        this.blockStatements = blockStatements;
    }

    public int getIdentifier() {
        return identifier;
    }

    public List<BlockStatement> getSwitchBlockStatements() {
        return blockStatements;
    }

    public int getLine() {
        return line;
    }
}
