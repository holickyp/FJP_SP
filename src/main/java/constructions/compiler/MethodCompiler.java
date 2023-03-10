package constructions.compiler;

import constructions.BlockStatement;
import constructions.enums.PL0Instructions;
import constructions.error.ErrorMethodAlreadyExists;
import constructions.error.ErrorVariableAlreadyExists;
import constructions.method.Method;
import constructions.method.MethodCallParameter;
import constructions.method.MethodParameters;
import constructions.symbolTable.SymbolTable;
import constructions.symbolTable.SymbolTableItem;

import java.util.List;

public class MethodCompiler extends BaseCompiler {
    private Method method;

    public MethodCompiler(Method method)
    {
        this.method = method;
    }

    public void run() {
        this.processMethod();
    }

    private void processMethod() {
        if(isInSymbolTable(method.getName())) {
            getErrorHandler().throwError(new ErrorMethodAlreadyExists(method.getName(), method.getLine()));
        }
        setStackPointer(DEFAULT_STACK_POINTER);
        int methodSize = 0;
        if(method.getBody() != null) {
            methodSize = method.getBody().getBlockStatements().size();
        }
        int baseMethodSize = method.getMethodParameters().size() + DEFAULT_METHOD_SIZE;
        addMethodToSymbolTable(methodSize, baseMethodSize);
        loadParametersFromStack();

        BlockStatementCompiler blockStatementCompiler = null;
        if(method.getBody() != null) {
            for(BlockStatement blockStatement : method.getBody().getBlockStatements()) {
                blockStatementCompiler = new BlockStatementCompiler(blockStatement, 1);
                blockStatementCompiler.run();
            }
        }

        if(method.getReturnValue() != null) {
            new ExpressionCompiler(method.getReturnValue(), method.getReturnType(), 1).run();
            addInstruction(PL0Instructions.STO, 0, -(method.getMethodParameters().size() +1));
        }

        deleteParametersFromSymbolTable();

        //addInstruction(PL0Instructions.RET, 0, 0);
    }

    private void addMethodToSymbolTable(int methodSize, int baseMethodSize) {
        SymbolTableItem symbolTableItem = new SymbolTableItem(method.getName(), 0, getInstructionCounter(), methodSize);
        symbolTableItem.setMethod(true);
        symbolTableItem.setMethodReturnType(method.getReturnType());
        symbolTableItem.setMethodDeclarationParameters(method.getMethodParameters());

        getSymbolTable().addItem(symbolTableItem);
        addInstruction(PL0Instructions.INT, 0, baseMethodSize);
    }

    private void deleteParametersFromSymbolTable() {
        for(MethodParameters parameter : method.getMethodParameters()) {
            getSymbolTable().getTable().remove(parameter.getName());
        }
    }

    private void loadParametersFromStack() {
        List<MethodParameters> parameters = method.getMethodParameters();
        SymbolTableItem symbolTableItem;
        for(int i = 0; i<parameters.size(); i++) {
            if(isInSymbolTable(parameters.get(i).getName())) {
                getErrorHandler().throwError(new ErrorVariableAlreadyExists(parameters.get(i).getName(), method.getLine()));
            }
            addInstruction(PL0Instructions.LOD, 0, i-parameters.size());
            symbolTableItem = new SymbolTableItem(parameters.get(i).getName(), 1, getStackPointer(), 0);
            increaseStackPointer();
            symbolTableItem.setVariableType(parameters.get(i).getType());
            getSymbolTable().addItem(symbolTableItem);

            addInstruction(PL0Instructions.STO, 0, symbolTableItem.getAddress());
        }
    }
}
