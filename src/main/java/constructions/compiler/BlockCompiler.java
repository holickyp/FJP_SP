package constructions.compiler;


import constructions.Block;
import constructions.BlockStatement;
import constructions.compiler.BaseCompiler;
import constructions.error.ErrorMethodAlreadyExists;
import constructions.method.Method;
import constructions.method.MethodPrototype;

import java.util.List;

public class BlockCompiler extends BaseCompiler
{
    private Block block;

    public BlockCompiler(Block block)
    {
        this.block = block;
    }

    public void run()
    {
        this.generateMethodsPrototype();

        // TODO nevim co s tim
        new BlockStatementCompiler(this.block.getBlockStatements(), 0).run();
    }

    /**
     * Generates method prototypes
     */
    private void generateMethodsPrototype()
    {
        List<BlockStatement> methods = this.block.getBlockStatements();
        for(BlockStatement blockStatement : methods)
        {
            if (this.getMethodPrototypes().containsKey(blockStatement.getMethods().getName()))
            {
                getErrorHandler().throwError(new ErrorMethodAlreadyExists(blockStatement.getMethods().getName(), blockStatement.getMethods().getLine()));
            }

            MethodPrototype prototype = new MethodPrototype(blockStatement.getMethods().getName(), blockStatement.getMethods().getReturnType());
            this.getMethodPrototypes().put(prototype.getName(), prototype);
        }
    }
}
