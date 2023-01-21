package constructions.compiler;

import constructions.Block;
import constructions.BlockStatement;
import constructions.PL0.Instruction;
import constructions.enums.PL0Instructions;
import constructions.enums.VariableType;
import constructions.error.*;
import constructions.method.Method;
import constructions.method.MethodCall;
import constructions.symbolTable.SymbolTableItem;

import java.util.ArrayList;
import java.util.List;

/**
 * comliper na zpracovani bloku
 */
public class BlockCompiler extends BaseCompiler {
    /** block */
    private final Block block;
    /** urci zda ma vygenerovat RET instrukci */
    private final boolean generateReturn;
    /** pro vnorene bloky, zvedne stack jen o nove promene */
    private boolean createLocalVariables = false;
    /** pro vnorene bloky, odstraneni lokalne deklarovanych promennych */
    private boolean deleteVariables = false;

    public BlockCompiler(Block block, boolean generateReturn) {
        this.block = block;
        this.generateReturn = generateReturn;
    }

    public void run() {
        // initial stack set
        incrementStackForVariables();
        //najde a namapuje metody (kvuli moznosti volani metody pred jejim vytvoreni)
        for(BlockStatement blockStatement : block.getBlockStatements()) {
            if(blockStatement.getMethod() != null) {
                generateMethodReturns(blockStatement);
            }
        }
        List<BlockStatement> methodStatements = new ArrayList<>();
        //nejdrive variables a statements
        for(BlockStatement blockStatement : block.getBlockStatements()) {
            if(blockStatement.getMethod() != null) {
                methodStatements.add(blockStatement);
            } else {
                new BlockStatementCompiler(blockStatement, 0).run();
            }
        }
        //metody pridany az na konci
        for(BlockStatement blockStatement : methodStatements) {
            new BlockStatementCompiler(blockStatement, 0).run();
        }
        initializeMethods();
        if(deleteVariables) {
            deleteVariables();
        }
        if(generateReturn) {
            addInstruction(PL0Instructions.RET, 0, 0);
        }
    }

    /**
     * zvedne stack podle poctu deklarovanych promennych
     * pokud vychozi deklarace -> DEFAULT_STACK_POINTER + pocet deklarovanych promennych
     * jinak -> pocet deklarovanych promennych
     */
    private void incrementStackForVariables() {
        if (block.getVariableDeclarationCount() != 0) {
            if(createLocalVariables) {
                addInstruction(PL0Instructions.INT, 0, block.getVariableDeclarationCount());
            } else {
                addInstruction(PL0Instructions.INT, 0, DEFAULT_STACK_POINTER + block.getVariableDeclarationCount());
            }
        }
    }

    /**
     * snizi stack podle poctu deklarovanych promennych
     * pro vnorene bloky
     */
    public void deleteVariables() {
        if(block != null) {
            if(block.getVariableDeclarationCount() != 0) {
                addInstruction(PL0Instructions.INT, 0, -block.getVariableDeclarationCount());
            }
        }
    }

    /**
     * vytvori predbezne metody
     * @param blockStatement blockStatement obsahujici metodu
     */
    private void generateMethodReturns(BlockStatement blockStatement) {
        Method method = blockStatement.getMethod();
        if(getMethodReturnTypes().containsKey(method.getName())) {
            getErrorHandler().throwError(new ErrorMethodAlreadyExists(method.getName(), method.getLine()));
        }
        addMethodReturnType(method.getName(), method.getReturnType());
    }

    /**
     * nastavy adresy pro volani metod
     */
    private void initializeMethods() {
        for(Instruction instruction : getInstructions()) {
            if(instruction.isLaterInitialization()) {
                MethodCall methodCall = instruction.getMethodCall();
                if(isInSymbolTable(methodCall.getIdentifier())) {
                    SymbolTableItem symbolTableItem = getSymbolTable().getItem(methodCall.getIdentifier());
                    if(methodCall.getReturnType() != symbolTableItem.getMethodReturnType()) {
                        getErrorHandler().throwError(new ErrorMismatchMethodCallReturnType(methodCall.getIdentifier(), methodCall.getReturnType(), symbolTableItem.getMethodReturnType(), methodCall.getLine()));
                    }
                    if(methodCall.getParameters().size() != symbolTableItem.getMethodDeclarationParameters().size()) {
                        getErrorHandler().throwError(new ErrorInvalidParametersCount(symbolTableItem.getName(), symbolTableItem.getMethodDeclarationParameters().size(), methodCall.getLine()));
                    }
                    for(int i = 0; i<methodCall.getParameters().size(); i++) {
                        VariableType callType = methodCall.getParameters().get(i).getVariableType();
                        VariableType methodType = symbolTableItem.getMethodDeclarationParameters().get(i).getType();
                        if(callType != methodType) {
                            getErrorHandler().throwError(new ErrorMismatchMethodAndCallParameterTypes(methodCall.getIdentifier(), methodType, callType, i + 1, methodCall.getLine()));
                        }
                    }
                    instruction.setAddress(symbolTableItem.getAddress());
                }
                else {
                    getErrorHandler().throwError(new ErrorMethodNotExists(methodCall.getIdentifier(), methodCall.getLine()));
                }
            }
        }
    }

    /**
     * nastavi beh pro vnoreny blok
     */
    public void setInnerBodySettings() {
        setCreateLocalVariables(true);
        setDeleteVariables(true);
    }

    public void setCreateLocalVariables(boolean createLocalVariables) {
        this.createLocalVariables = createLocalVariables;
    }

    public void setDeleteVariables(boolean deleteVariables) {
        this.deleteVariables = deleteVariables;
    }
}
