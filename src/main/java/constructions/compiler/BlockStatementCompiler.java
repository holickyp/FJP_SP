package constructions.compiler;

import constructions.BlockStatement;
import constructions.PL0.Instruction;
import constructions.Variable;
import constructions.enums.Operator;
import constructions.enums.PL0Instructions;
import constructions.enums.StatementType;
import constructions.enums.VariableType;
import constructions.error.*;
import constructions.method.Method;
import constructions.method.MethodCall;
import constructions.statements.*;
import constructions.symbolTable.SymbolTableItem;

import java.util.ArrayList;
import java.util.Map;

public class BlockStatementCompiler extends BaseCompiler {
    private BlockStatement blockStatement;
    private int level;
    private boolean generateMethods = true;
    private boolean increaseStack = true;
    private boolean generateReturn = false;
    private boolean deleteVariables = false;
    private boolean createSpaceForVariables = false;

    public BlockStatementCompiler(BlockStatement blockStatement, int level) {
        this.blockStatement = blockStatement;
        this.level = level;
    }

    public void run() {
        if(blockStatement == null) {
            return;
        }
        incrementStackForVariables();
        if(blockStatement.getStatement() != null) {
            statementInstructions();
        }
        if(blockStatement.getVariable() != null) {
            variableInstructions();
        }
        if(generateReturn) {
            addInstruction(PL0Instructions.RET, 0, 0);
        }
        if(generateMethods) {
            if(blockStatement.getMethod() != null) {
                methodInstructions();
                initializeMethods();
            }
        }
        if(deleteVariables) {
            deleteVariables();
        }
    }

    private void incrementStackForVariables() {
        int add_variable = blockStatement.getVariable() == null ? 0 : 1;
        int add_for = blockStatement.getStatement() == null ? 0 : (blockStatement.getStatement().getType() == StatementType.FOR ? 1 : 0);

        if(createSpaceForVariables && add_variable != 0) {
            addInstruction(PL0Instructions.INT, 0, add_variable + add_for);
        }
    }

    private void methodInstructions() {
       Method method = blockStatement.getMethod();
       new MethodCompiler(method).run();
    }

    private void variableInstructions() {
        Variable variable = blockStatement.getVariable();
        if (this.isInSymbolTable(variable.getName())) {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(variable.getName(), variable.getExpression().getLine()));
        }


        new ExpressionCompiler(variable.getExpression(), variable.getType(), 0).run();
        SymbolTableItem symbolTableItem = this.addVariable(variable.getName(), variable);
        //TODO parallel
        /*if (variable.existsParallel())
        {
            for(String variableName : variable.getParallelArray())
            {
                this.addInstruction(PL0Instructions.LOD, this.level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
                this.addVariable(variableName, variable);
            }
        }*/
    }

    private SymbolTableItem addVariable(String name, Variable variable)
    {
        SymbolTableItem symbolTableItem = new SymbolTableItem(name, this.level, this.getStackPointer(), 0);
        increaseStackPointer();
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setConstant(variable.isConstant());
        symbolTableItem.setVariableType(variable.getType());

        this.getSymbolTable().addItem(symbolTableItem);

        // TODO negation
        /*if (variable.i())
        {
            this.addInstruction(EInstruction.LIT, 0, -1);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.MULTIPLY.getCode());
        }*/

        this.addInstruction(PL0Instructions.STO, 0, symbolTableItem.getAddress());

        return symbolTableItem;
    }

    private void statementInstructions() {
        Statement statement = blockStatement.getStatement();
        switch (statement.getType()) {
            case BLOCK: blockInstructions((BlockLabelStatement) statement);break;
            case IF: ifInstructions((IfStatement) statement);break;
            case FOR: forInstructions((ForStatement) statement);break;
            case WHILE: whileInstructions((WhileStatement) statement);break;
            case DO_WHILE: doWhileInstructions((DoWhileStatement) statement);break;
            case SWITCH: switchInstructions((SwitchStatement) statement);break;
            case REPEAT: repeatInstructions((RepeatStatement) statement);break;
            case EXPRESSION: expressionInstructions((ExpressionStatement) statement);break;
        }
    }

    private void blockInstructions(BlockLabelStatement blockLabelStatement) {
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(blockLabelStatement.getBlock(), level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();
    }

    private void ifInstructions(IfStatement ifStatement) {
        new ExpressionCompiler(ifStatement.getExpression(), VariableType.BOOLEAN, level).run();
        int jmcElse = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);
        if(ifStatement.getIfStatement().getType() != StatementType.BLOCK) {
            getErrorHandler().throwError(new ErrorMismatchTypesStatement(StatementType.BLOCK.toString(), ifStatement.getIfStatement().getType().toString(), ifStatement.getLine()));
        }
        blockInstructions((BlockLabelStatement) ifStatement.getIfStatement());
        int jmpToEndIf = getInstructionCounter();
        if(ifStatement.getElseStatement() != null) {
            addInstruction(PL0Instructions.JMP, 0, -1);
        }
        getInstructions().get(jmcElse).setAddress(getInstructionCounter());
        if(ifStatement.getElseStatement() != null) {
            if(ifStatement.getElseStatement().getType() != StatementType.BLOCK) {
                getErrorHandler().throwError(new ErrorMismatchTypesStatement(StatementType.BLOCK.toString(), ifStatement.getIfStatement().getType().toString(), ifStatement.getLine()));
            }
            blockInstructions((BlockLabelStatement) ifStatement.getElseStatement());
            getInstructions().get(jmpToEndIf).setAddress(getInstructionCounter());
        }
    }

    private void forInstructions(ForStatement forStatement) {
        if(isInSymbolTable(forStatement.getControlFor().getInitFor().getVariable().getName())) {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(forStatement.getControlFor().getInitFor().getVariable().getName(), forStatement.getLine()));
        }
        new ExpressionCompiler(forStatement.getControlFor().getExpression(), VariableType.INT, level).run();
        SymbolTableItem symbolTableItem = new SymbolTableItem(forStatement.getControlFor().getInitFor().getVariable().getName(), level, getStackPointer(), 0);
        increaseStackPointer();
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setVariableType(VariableType.INT);
        getSymbolTable().addItem(symbolTableItem);

        addInstruction(PL0Instructions.STO, 0, symbolTableItem.getAddress());
        int startIndex = getInstructionCounter();
        addInstruction(PL0Instructions.LOD, 0, symbolTableItem.getAddress());
        new ExpressionCompiler(forStatement.getControlFor().getExpression(), VariableType.INT, level).run();
        //TODO jenom <= ???
        addInstruction(PL0Instructions.OPR, 0, Operator.LOWER_EQUAL_THAN.getCode());
        int jmcEnd = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);
        blockInstructions((BlockLabelStatement) forStatement.getStatement());

        this.addInstruction(PL0Instructions.LOD, 0, symbolTableItem.getAddress());
        this.addInstruction(PL0Instructions.LIT, 0, 1);
        this.addInstruction(PL0Instructions.OPR, 0, Operator.PLUS.getCode());
        this.addInstruction(PL0Instructions.STO, 0, symbolTableItem.getAddress());
        this.addInstruction(PL0Instructions.JMP, 0, startIndex);

        getInstructions().get(jmcEnd).setAddress(getInstructionCounter());
    }

    private void whileInstructions(WhileStatement whileStatement) {
        int startIndex = getInstructionCounter();
        new ExpressionCompiler(whileStatement.getExpression(), VariableType.BOOLEAN, level).run();
        int jmcIndex = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);

        blockInstructions((BlockLabelStatement) whileStatement.getStatement());

        addInstruction(PL0Instructions.JMP, 0, startIndex);
        getInstructions().get(jmcIndex).setAddress(getInstructionCounter());
    }

    private void doWhileInstructions(DoWhileStatement doWhileStatement) {
        int startIndex = getInstructionCounter();
        blockInstructions((BlockLabelStatement) doWhileStatement.getStatement());

        new ExpressionCompiler(doWhileStatement.getExpression(), VariableType.BOOLEAN, level).run();

        int jmcIndex = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);
        addInstruction(PL0Instructions.JMP, 0, startIndex);
        getInstructions().get(jmcIndex).setAddress(getInstructionCounter());
    }

    private void switchInstructions(SwitchStatement switchStatement) {
        ArrayList<Integer> jmpIndexes = new ArrayList<>();

        for(Map.Entry<Integer, SwitchBlock> block : switchStatement.getCases().entrySet()) {
            int key = block.getKey();
            SwitchBlock body = block.getValue();
            new ExpressionCompiler(switchStatement.getExpression(), VariableType.INT, level).run();
            addInstruction(PL0Instructions.LIT, 0, key);
            addInstruction(PL0Instructions.OPR, 0, Operator.EQUALS.getCode());
            int jmcIndex = getInstructionCounter();
            addInstruction(PL0Instructions.JMC, 0, -1);

            blockInstructions(body.getSwitchBlockStatement());
            int jmpEnd = getInstructionCounter();
            jmpIndexes.add(jmpEnd);
            this.addInstruction(PL0Instructions.JMP, 0, -1);
            this.getInstructions().get(jmcIndex).setAddress(getInstructionCounter());
        }

        if(switchStatement.getDefaultCase() != null) {
            blockInstructions(switchStatement.getDefaultCase().getSwitchBlockStatement());
        }
        int currCounter = getInstructionCounter();
        for(int index : jmpIndexes) {
            getInstructions().get(index).setAddress(currCounter);
        }
    }

    private void repeatInstructions(RepeatStatement repeatStatement) {
        int startAddress = getInstructionCounter();

        blockInstructions((BlockLabelStatement) repeatStatement.getStatement());

        new ExpressionCompiler(repeatStatement.getExpression(), VariableType.BOOLEAN, level).run();
        addInstruction(PL0Instructions.JMC, 0, startAddress);
    }

    private void expressionInstructions(ExpressionStatement expressionStatement) {
        new ExpressionCompiler(expressionStatement.getExpression(), VariableType.INT, level).run();

    }

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

    public void deleteVariables() {
        if(blockStatement != null) {
            getSymbolTable().getTable().remove(blockStatement.getVariable().getName());
            if(createSpaceForVariables && blockStatement.getVariable() != null) {
                addInstruction(PL0Instructions.INT, 0, -1);
            }
        }
    }

    public void setUpInnerBodySettings() {
        this.setGenerateMethods(false);
        this.setIncreaseStack(false);
        this.setGenerateReturn(false);
        this.setDeleteVariables(true);
        this.setCreateLocalSpaceForLocalVariables(true);
    }

    public void setGenerateMethods(boolean generateMethods) {
        this.generateMethods = generateMethods;
    }


    public void setIncreaseStack(boolean increaseStack) {
        this.increaseStack = increaseStack;
    }

    public void setGenerateReturn(boolean generateReturn) {
        this.generateReturn = generateReturn;
    }

    public void setDeleteVariables(boolean deleteVariables) {
        this.deleteVariables = deleteVariables;
    }

    public void setCreateLocalSpaceForLocalVariables(boolean createSpaceForVariables) {
        this.createSpaceForVariables = createSpaceForVariables;
    }
}
