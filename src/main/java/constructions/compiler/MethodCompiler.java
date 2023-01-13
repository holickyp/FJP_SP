package constructions.compiler;


import constructions.compiler.BaseCompiler;
import constructions.enums.PL0Instructions;
import constructions.error.ErrorMethodAlreadyExists;
import constructions.error.ErrorVariableAlreadyExists;
import constructions.method.Method;
import constructions.method.MethodParameters;
import constructions.symbolTable.SymbolTableItem;

import java.util.List;

public class MethodCompiler extends BaseCompiler
{
    private Method method;

    public MethodCompiler(Method method)
    {
        this.method = method;
    }

    public void run()
    {
        this.processMethod();
    }

    /**
     * Processes method into instructions
     */
    private void processMethod()
    {
        // check if method exists
        if (this.isInSymbolTable(this.method.getName()))
        {
            getErrorHandler().throwError(new ErrorMethodAlreadyExists(this.method.getName(), this.method.getLine()));
        }

        // new scope, new stack pointer
        this.setStackPointer(this.DEFAULT_STACK_POINTER);

        // variables + parameters + default method size
        int methodCustomSize = 0;

       /* TODO
          if (this.method.getBlock() != null)
        {
            methodCustomSize = this.method.getBlock().getStatementData().getVariableDeclarationCount() + this.method.getBlock().getStatementData().getForStatementCount();
        } */

        // space for variables is declared in blockStatement
        int baseMethodSize = this.method.getMethodParameters().size() + this.METHOD_SIZE;

        // add method to symbol of table, have to be added first, for get address of row to address method call
        // method address pointing at INT instruction of method
        this.addMethodToSymbolTable(methodCustomSize, baseMethodSize);

        // load parameters from stack
        this.loadParametersFromStack();

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(this.method.getBlock().getBlockStatements(), 1);
        blockStatementCompiler.setUpInnerBodySettings();
        // cant be deleted before compile return value
        blockStatementCompiler.setDeleteLocalVariables(false);
        blockStatementCompiler.run();

        if (this.method.getReturnValue() != null)
        {
            new ExpressionCompiler(this.method.getReturnValue(), this.method.getReturnType(), 1).run();
            // store value to return address
            this.addInstruction(PL0Instructions.STO, 0, -(this.method.getMethodParameters().size() + 1));
        }

        // now we can delete variables
        blockStatementCompiler.deleteLocalVariables();
        this.deleteParametersFromSymbolOfTable();

        this.addInstruction(PL0Instructions.RET, 0,0);
    }

    /**
     * Adds method to symbol table and increase stack
     * @param methodSize size for symbol table item (full size)
     * @param baseMethodSize base size (default size + parameters count)
     */
    private void addMethodToSymbolTable(int methodSize, int baseMethodSize)
    {
        SymbolTableItem symbolTableItem = new SymbolTableItem(this.method.getName(), 0, this.getInstructionCounter(), methodSize);
        symbolTableItem.setMethod(true);
        symbolTableItem.setMethodReturnType(method.getReturnType());
        symbolTableItem.setMethodDeclarationParameters(method.getMethodParameters());

        this.getSymbolTable().addItem(symbolTableItem);

        this.addInstruction(PL0Instructions.INT, 0, baseMethodSize);
    }

    /**
     * Method load parameters from top of stack and stores them
     */
    private void loadParametersFromStack()
    {
        List<MethodParameters> parameters = this.method.getMethodParameters();
        SymbolTableItem item;

        for (int i = 0 ; i < parameters.size() ; i++)
        {
            if (this.isInSymbolTable(parameters.get(i).getName()))
            {
                getErrorHandler().throwError(new ErrorVariableAlreadyExists(parameters.get(i).getName(), this.method.getLine()));
            }

            this.addInstruction(PL0Instructions.LOD, 0, i - parameters.size());

            item = new SymbolTableItem(parameters.get(i).getName(), 1, this.getAndIncreaseStackPointer(), 0);
            item.setVariableType(parameters.get(i).getType());
            this.getSymbolTable().addItem(item);

            this.addInstruction(PL0Instructions.STO, 0, item.getAddress());

        }
    }

    /**
     * Removes parameters from Symbol table
     */
    private void deleteParametersFromSymbolOfTable()
    {
        for (MethodParameters parameter: this.method.getMethodParameters())
        {
            this.getSymbolTable().getTable().remove(parameter.getName());
        }
    }
}
