package constructions.compiler;

import constructions.Block;
import constructions.BlockStatement;
import constructions.Variable;
import constructions.enums.*;
import constructions.error.*;
import constructions.expressions.AssignExpression;
import constructions.expressions.IdentifierExpression;
import constructions.method.Method;
import constructions.statements.*;
import constructions.symbolTable.SymbolTableItem;

import java.util.ArrayList;
import java.util.Map;

/**
 * compiler pro BlockStatement
 */
public class BlockStatementCompiler extends BaseCompiler {
    /** BlockStatement */
    private final BlockStatement blockStatement;
    /** level */
    private final int level;

    public BlockStatementCompiler(BlockStatement blockStatement, int level) {
        this.blockStatement = blockStatement;
        this.level = level;
    }

    public void run() {
        if(blockStatement == null) {
            return;
        }
        if(blockStatement.getStatement() != null) {
            statementInstructions();
        }
        if(blockStatement.getVariable() != null) {
            variableInstructions();
        }
        if(blockStatement.getMethod() != null) {
            addInstruction(PL0Instructions.RET, 0,0);
            methodInstructions();
        }
    }

    /**
     * vytvori instrukce pro metody
     */
    private void methodInstructions() {
       Method method = blockStatement.getMethod();
       new MethodCompiler(method).run();
    }

    /**
     * vytvori instrukce pro promenne
     */
    private void variableInstructions() {
        Variable variable = blockStatement.getVariable();
        if (this.isInSymbolTable(variable.getName())) {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(variable.getName(), variable.getExpression().getLine()));
        }

        new ExpressionCompiler(variable.getExpression(), variable.getType(), 0).run();
        SymbolTableItem symbolTableItem = this.addVariable(variable.getName(), variable);
        //paraleni prirazeni
        if (variable.getParallelArray().size() > 0) {
            for(String variableName : variable.getParallelArray()) {
                addInstruction(PL0Instructions.LOD, this.level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
                addVariable(variableName, variable);
            }
        }
    }

    /**
     * prida promennou do Symbol Table
     */
    private SymbolTableItem addVariable(String name, Variable variable) {
        SymbolTableItem symbolTableItem = new SymbolTableItem(name, this.level, this.getStackPointer(), 0);
        increaseStackPointer();
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setConstant(variable.isConstant());
        symbolTableItem.setVariableType(variable.getType());

        this.getSymbolTable().addItem(symbolTableItem);

        addInstruction(PL0Instructions.STO, 0, symbolTableItem.getAddress());

        return symbolTableItem;
    }

    /**
     * vytvori instrukce pro statement
     */
    private void statementInstructions() {
        Statement statement = blockStatement.getStatement();
        switch (statement.getType()) {
            case BLOCK: blockLabelInstructions((BlockLabelStatement) statement);break;
            case IF: ifInstructions((IfStatement) statement);break;
            case WHILE: whileInstructions((WhileStatement) statement);break;
            case DO_WHILE: doWhileInstructions((DoWhileStatement) statement);break;
            case SWITCH: switchInstructions((SwitchStatement) statement);break;
            case REPEAT: repeatInstructions((RepeatStatement) statement);break;
            case EXPRESSION: expressionInstructions((ExpressionStatement) statement);break;
        }
    }

    /**
     * vytvori instrukce pro block statement
     * @param block block
     */
    private void blockInstructions(Block block) {
        BlockCompiler blockCompiler = new BlockCompiler(block, false);
        blockCompiler.setInnerBodySettings();
        blockCompiler.run();
    }

    /**
     * vytvori instrukce pro block label statement
     * @param blockLabelStatement blockLabelStatement
     */
    private void blockLabelInstructions(BlockLabelStatement blockLabelStatement) {
        blockInstructions(blockLabelStatement.getBlock());
    }

    /**
     * vytvori instrukce pro if statement
     * @param ifStatement ifStatement
     */

    private void ifInstructions(IfStatement ifStatement) {
        //podminka
        new ExpressionCompiler(ifStatement.getExpression(), VariableType.BOOLEAN, level).run();
        int jmcElse = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);

        //if telo
        blockInstructions(ifStatement.getIfBody());
        int jmpToEndIf = getInstructionCounter();
        if(ifStatement.getElseBody() != null) {
            addInstruction(PL0Instructions.JMP, 0, -1);
        }

        //else telo
        getInstructions().get(jmcElse).setAddress(getInstructionCounter());
        if(ifStatement.getElseBody() != null) {
            blockInstructions(ifStatement.getElseBody());
            getInstructions().get(jmpToEndIf).setAddress(getInstructionCounter());
        }
    }

    /**
     * vytvori instrukce pro while statement
     * @param whileStatement whileStatement
     */
    private void whileInstructions(WhileStatement whileStatement) {
        int startIndex = getInstructionCounter();
        //podminka
        new ExpressionCompiler(whileStatement.getExpression(), VariableType.BOOLEAN, level).run();
        int jmcIndex = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);

        //telo
        blockInstructions(whileStatement.getBody());

        //smycka
        addInstruction(PL0Instructions.JMP, 0, startIndex);
        getInstructions().get(jmcIndex).setAddress(getInstructionCounter());
    }

    /**
     * vytvori instrukce pro do while statement
     * @param doWhileStatement doWhileStatement
     */
    private void doWhileInstructions(DoWhileStatement doWhileStatement) {
        int startIndex = getInstructionCounter();
        //telo
        blockInstructions(doWhileStatement.getBody());

        //podminka
        new ExpressionCompiler(doWhileStatement.getExpression(), VariableType.BOOLEAN, level).run();

        //smycka
        int jmcIndex = getInstructionCounter();
        addInstruction(PL0Instructions.JMC, 0, -1);
        addInstruction(PL0Instructions.JMP, 0, startIndex);
        getInstructions().get(jmcIndex).setAddress(getInstructionCounter());
    }

    /**
     * vytvori instrukce pro switch statement
     * @param switchStatement switchStatement
     */
    private void switchInstructions(SwitchStatement switchStatement) {
        ArrayList<Integer> jmpIndexes = new ArrayList<>();

        //cases
        for(Map.Entry<Integer, SwitchBlock> block : switchStatement.getCases().entrySet()) {
            int key = block.getKey();
            SwitchBlock body = block.getValue();
            //"podminka" pro case
            new ExpressionCompiler(switchStatement.getExpression(), VariableType.INT, level).run();
            addInstruction(PL0Instructions.LIT, 0, key);
            addInstruction(PL0Instructions.OPR, 0, Operator.EQUALS.getCode());
            int jmcIndex = getInstructionCounter();
            addInstruction(PL0Instructions.JMC, 0, -1);

            //telo case
            for(BlockStatement blockStatement1 : body.getSwitchBlockStatements()) {
                BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(blockStatement1,  level);
                blockStatementCompiler.run();
            }

            //skok na konec
            int jmpEnd = getInstructionCounter();
            jmpIndexes.add(jmpEnd);
            this.addInstruction(PL0Instructions.JMP, 0, -1);
            this.getInstructions().get(jmcIndex).setAddress(getInstructionCounter());
        }

        //default case
        if(switchStatement.getDefaultCase() != null) {
            for(BlockStatement blockStatement1 : switchStatement.getDefaultCase().getSwitchBlockStatements()) {
                BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(blockStatement1,  level);
                blockStatementCompiler.run();
            }
        }
        //nastaveni adres skoku
        int currCounter = getInstructionCounter();
        for(int index : jmpIndexes) {
            getInstructions().get(index).setAddress(currCounter);
        }
    }

    /**
     * vytvori instrukce pro repeat statement
     * @param repeatStatement repeatStatement
     */
    private void repeatInstructions(RepeatStatement repeatStatement) {
        int startAddress = getInstructionCounter();
        //telo
        blockInstructions(repeatStatement.getBody());
        //podminka
        new ExpressionCompiler(repeatStatement.getExpression(), VariableType.BOOLEAN, level).run();
        //smycka
        addInstruction(PL0Instructions.JMC, 0, startAddress);
    }

    /**
     * vytvori instrukce pro expression statement
     * @param expressionStatement expressionStatement
     */
    private void expressionInstructions(ExpressionStatement expressionStatement) {
        //je to assign?
        if(expressionStatement.getExpression().getType().equals(ExpressionType.ASSIGN)) {
            AssignExpression expression = (AssignExpression) expressionStatement.getExpression();
            //nastaveni VariableType podle toho do jake promenne prirazujeme
            if(expression.getLeft().getType().equals(ExpressionType.IDENTIFIER)) {
                IdentifierExpression identifierExpression = (IdentifierExpression) expression.getLeft();
                SymbolTableItem symbolTableItem = getSymbolTable().getItem(identifierExpression.getValue().toString());
                new ExpressionCompiler(expressionStatement.getExpression(), symbolTableItem.getVariableType(), level).run();
            } else {
                new ExpressionCompiler(expressionStatement.getExpression(), VariableType.INT, level).run();
            }
        //neni -> neresim boolean VariableType
        } else {
            new ExpressionCompiler(expressionStatement.getExpression(), VariableType.INT, level).run();
        }
    }
}
