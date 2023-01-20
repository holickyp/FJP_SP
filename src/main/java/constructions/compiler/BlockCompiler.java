package constructions.compiler;

import constructions.Block;
import constructions.BlockStatement;
import constructions.enums.PL0Instructions;
import constructions.error.ErrorMethodAlreadyExists;
import constructions.method.Method;

import java.util.List;

public class BlockCompiler extends BaseCompiler {
    private Block block;

    public BlockCompiler(Block block) {
        this.block = block;
    }

    public void run() {
        incrementStackForVariables();
        for(BlockStatement blockStatement : block.getBlockStatements()) {
            if(blockStatement.getMethod() != null) {
                generateMethodReturns(blockStatement);
            }
            new BlockStatementCompiler(blockStatement, 0).run();
        }
        addInstruction(PL0Instructions.RET, 0, 0);
    }

    private void incrementStackForVariables() {
        if (block.getVariableDeclarationCount() != 0) {
            addInstruction(PL0Instructions.INT, 0, DEFAULT_METHOD_SIZE + block.getVariableDeclarationCount());
        }
    }

    private void generateMethodReturns(BlockStatement blockStatement) {
        Method method = blockStatement.getMethod();
        if(getMethodReturnTypes().containsKey(method.getName())) {
            getErrorHandler().throwError(new ErrorMethodAlreadyExists(method.getName(), method.getLine()));
        }
        getMethodReturnTypes().put(method.getName(), method.getReturnType());
    }
}
