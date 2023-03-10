package constructions;

import java.util.List;

/**
 * Reprezentuje blok  v interni strukture
 */
public class Block {
    private final List<BlockStatement> blockStatements;

    public Block(List<BlockStatement> blockStatements) {
        this.blockStatements = blockStatements;
    }

    public List<BlockStatement> getBlockStatements() {
        return blockStatements;
    }

    /**
     * Deklrace variable
     * @return
     */
    public int getVariableDeclarationCount() {
        int i = 0;
        for(BlockStatement blockStatement : blockStatements) {
            if(blockStatement.getVariable() != null) {
                i++;
                if(blockStatement.getVariable().getParallelArray().size() > 0) {
                    i += blockStatement.getVariable().getParallelArray().size();
                }
            }
        }
        return i;
    }
}
