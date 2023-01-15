package constructions.compiler;

import constructions.Block;
import constructions.BlockStatement;
import constructions.method.Method;

import java.util.List;

public class BlockCompiler extends BaseCompiler {
    private Block block;

    public BlockCompiler(Block block) {
        this.block = block;
    }

    public void run() {
        for(BlockStatement blockStatement : block.getBlockStatements()) {
            generateMethodReturns(blockStatement);
            new BlockStatementCompiler(blockStatement, 0).run();
        }
    }

    private void generateMethodReturns(BlockStatement blockStatement) {
        Method method = blockStatement.getMethod();
        if(getMethodReturnTypes().containsKey(method.getName())) {
            //TODO error
        }
        getMethodReturnTypes().put(method.getName(), method.getReturnType());
    }
}
