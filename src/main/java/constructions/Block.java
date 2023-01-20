package constructions;

import java.util.List;

public class Block {
    private List<BlockStatement> blockStatements;

    public Block(List<BlockStatement> blockStatements) {
        this.blockStatements = blockStatements;
    }

    public List<BlockStatement> getBlockStatements() {
        return blockStatements;
    }

    public int getVariableDeclarationCount() {
        int i = 0;
        for(BlockStatement blockStatement : blockStatements) {
            if(blockStatement.getVariable() != null) {
                i++;
            }
        }
        return i;
    }
}
