package constructions.compilerPart;

import compilator.enums.*;
import compilator.error.*;
import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.Variable;
import compilator.object.expression.ExpressionMethodCall;
import compilator.object.instruction.Instruction;
import compilator.object.method.Method;
import compilator.object.method.MethodCall;
import compilator.object.statement.*;
import compilator.object.symbolTable.SymbolTableItem;
import constructions.enums.InstructionType;
import constructions.method.Method;
import constructions.statements.BlockStatement;
import constructions.statements.Statement;

import java.util.ArrayList;
import java.util.Map;

public class BlockStatementCompiler extends BaseCompiler
{
    /**
     * Block statement instance
     */
    private BlockStatement blockStatement;
    

    /**
     * level of instructions
     */
    private int level;

    /**
     * Should be methods generated
     */
    private boolean generateMethods = true;

    /**
     * Should be stack increased
     */
    private boolean increaseStack = true;

    /**
     * Should be return generated
     */
    private boolean generateReturn = true;

    /**
     * Should be local variables deleted
     */
    private boolean deleteLocalVariables = false;

    /**
     * Should be allocated space for variables
     */
    private boolean createLocalSpaceForLocalVariables = false;

    public BlockStatementCompiler(BlockStatement blockStatement, int level)
    {
        this.blockStatement = blockStatement;
        this.level = level;
    }

    /**
     * Processes block to instructions
     */
    public void run()
    {
        if (this.blockStatement == null)
        {
            return;
        }

        // check method for more information
        this.incrementStackForVariables();

        this.generatInstructionTypeForStatements();

        // methods generate own return
        if (this.generateReturn)
        {
            this.addInstruction(InstructionType.RET, 0,0);
        }

        // methods are generated only in main body
        if (this.generateMethods)
        {
            // generate methods
            this.generatInstructionTypeForMethods();

            // method calls assignment
            this.initializeMethodsInInstructions();
        }

        // delete local variables
        if (this.deleteLocalVariables)
        {
            this.deleteLocalVariables();
        }
    }

    /**
     * Increase stack for variables
     * depends on settings
     */
    private void incrementStackForVariables()
    {
        // used in main block
        if (this.increaseStack)
        {
            this.addInstruction(InstructionType.INT, 0, this.BASE_METHOD_SIZE + this.statementData.getVariableDeclarationCount() + this.statementData.getForStatementCount());
        }

        // used for loops, other blocks, methods
        if (this.createLocalSpaceForLocalVariables && this.statementData.getVariableDeclarationCount() != 0)
        {
            this.addInstruction(InstructionType.INT, 0, this.statementData.getVariableDeclarationCount());
        }
    }

    /**
     * Compile methods to instructions, called after statements
     */
    private void generatInstructionTypeForMethods()
    {
        for (Method method: this.blockStatement.getMethods())
        {
            new MethodCompiler(method).run();
        }
    }

    /**
     * Statements processing
     */
    private void generatInstructionTypeForStatements()
    {
        for (Statement statement: this.statementData.getStatements())
        {
            switch (statement.getType())
            {
                case DECLARATION:
                    this.generateDeclarationInstruction((StatementDeclaration) statement);
                    break;
                case ASSIGMENT:
                    this.generateAssigmentInstruction((StatementAssigment) statement);
                    break;
                case IF:
                    this.generateIfInstructions((StatementIf) statement);
                    break;
                case FOR:
                    this.generateForInstructions((StatementFor) statement);
                    break;
                case WHILE:
                    this.generateWhilInstructionTypes((StatementWhile) statement);
                    break;
                case DO_WHILE:
                    this.generateDoWhilInstructionTypes((StatementDo) statement);
                    break;
                case METHOD_CALL:
                    this.generateMethodCallInstructions((StatementMethodCall) statement);
                    break;
                case REPEAT_UNTIL:
                    this.generateRepeatUntilInstructions((StatementRepeat) statement);
                    break;
                case SWITCH:
                    this.generateSwitchInstructions((StatementSwitch) statement);
                    break;
            }
        }
    }

    /**
     * Generate instructions for variable declaration
     * @param statementDeclaration
     */
    private void generateDeclarationInstruction(StatementDeclaration statementDeclaration)
    {
        Variable variable = statementDeclaration.getVariable();

        if (this.isInSymbolTable(variable.getName()))
        {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(variable.getName(), variable.getLine()));
        }

        switch (variable.getType())
        {
            case INT:
                this.variableIntInstruction(variable);
                break;
            case BOOLEAN:
                this.variableBooleanInstruction(variable);
                break;
        }

        SymbolTableItem symbolTableItem = this.addVariable(variable.getName(), variable);

        if (variable.existsParallel())
        {
            for(String variableName : variable.getParallelArray())
            {
                this.addInstruction(InstructionType.LOD, this.level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
                this.addVariable(variableName, variable);
            }
        }
    }

    /**
     * Adds variable to symbol table
     * @param name
     * @param variable
     * @return
     */
    private SymbolTableItem addVariable(String name, Variable variable)
    {
        SymbolTableItem symbolTableItem = new SymbolTableItem(name, this.level, this.getAndIncreaseStackPointer(), 0);
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setConstant(variable.isConstant());
        symbolTableItem.setVariableType(variable.getType());

        this.getSymbolTable().addItem(symbolTableItem);

        // add negation
        if (variable.isDeclaredWithMinus())
        {
            this.addInstruction(InstructionType.LIT, 0, -1);
            this.addInstruction(InstructionType.OPR, 0, InstructionTypeOperation.MULTIPLY.getCode());
        }

        this.addInstruction(InstructionType.STO, 0, symbolTableItem.getAddress());

        return symbolTableItem;
    }

    /**
     * Generate instructions for int variable depends on variable type
     * @param variable
     */
    private void variableIntInstruction(Variable variable)
    {
        switch (variable.getVariableDeclaration())
        {
            case DECIMAL:
                this.addInstruction(InstructionType.LIT, 0, variable.getValue().toInt());
                break;
            case METHOD_CALL:
                new MethodCallCompiler(variable.getMethodCall(), this.level).run();
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                new ExpressionCompiler(variable.getExpression(), EVariableType.INT, this.level).run();
                break;
        }
    }

    /**
     * Generate instructions for boolean variable depends on variable type
     * @param variable
     */
    private void variableBooleanInstruction(Variable variable)
    {
        switch (variable.getVariableDeclaration())
        {
            case BOOLEAN:
                this.addInstruction(InstructionType.LIT, 0, variable.getValue().toBooleanAsInt());
                break;
            case METHOD_CALL:
                new MethodCallCompiler(variable.getMethodCall(), this.level).run();
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                new ExpressionCompiler(variable.getExpression(), EVariableType.BOOLEAN, this.level).run();
                break;
        }
    }

    /**
     * Generate instructions for declaration via assigment
     * @param variable
     */
    private void variableAssigmentIdentifier(Variable variable)
    {
        // check if exists
        if (!this.isInSymbolTable(variable.getValue().toString()))
        {
            this.getErrorHandler().throwError(new ErrorAssignedVariableNotExists(variable.getValue().toString(),variable.getLine()));
        }

        SymbolTableItem assignedValue = this.getSymbolTable().getItem(variable.getValue().toString());

        // check if assigned value match witch variable type
        if (variable.getType() != assignedValue.getVariableType())
        {
            this.getErrorHandler().throwError(new ErrorMismatchTypesVariable(variable.getName(), variable.getType().toString(), assignedValue.getVariableType().toString(), variable.getLine()));
        }

        // load value on top
        this.addInstruction(InstructionType.LOD, this.level, assignedValue.getAddress());
    }

    /**
     * Generate assigment instructions
     * @param statementAssigment
     */
    private void generateAssigmentInstruction(StatementAssigment statementAssigment)
    {
        if (this.isInSymbolTable(statementAssigment.getIdentifier()))
        {
            SymbolTableItem symbolTableItem = this.getSymbolTable().getItem(statementAssigment.getIdentifier());

            // check constant
            if (symbolTableItem.isConstant())
            {
                this.getErrorHandler().throwError(new ErrorConstantAssigment(symbolTableItem.getName(), statementAssigment.getLine()));
            }

            // need to set methodCall expected return value here. In assigment visitor we dont know variable type
            if (statementAssigment.getExpression().getType() == EExpressionType.METHOD_CALL)
            {
                ExpressionMethodCall expressionMethodCall = (ExpressionMethodCall) statementAssigment.getExpression();
                EMethodReturnType methodReturnType = symbolTableItem.getVariableType() == EVariableType.INT ? EMethodReturnType.INT : EMethodReturnType.BOOLEAN;
                expressionMethodCall.getMethodCall().setExpectedReturnType(methodReturnType);

                new ExpressionCompiler(expressionMethodCall, symbolTableItem.getVariableType(), this.level).run();
            }
            else
            {
                statementAssigment.getExpression().setExpectedReturnType(symbolTableItem.getVariableType());
                new ExpressionCompiler(statementAssigment.getExpression(), symbolTableItem.getVariableType(), this.level).run();
            }

            // loads value on top of stack
            this.addInstruction(InstructionType.STO, this.level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
        }
        else
        {
            this.getErrorHandler().throwError(new ErrorVariableNotExists(statementAssigment.getIdentifier(), statementAssigment.getLine()));
        }
    }

    /**
     * Generate instructions for if statement
     * @param statementIf
     */
    private void generateIfInstructions(StatementIf statementIf)
    {
        new ExpressionCompiler(statementIf.getExpression(), EVariableType.BOOLEAN, this.level).run();

        int jmcElseRow = this.getInstructionsCounter();

        // jmp to else/end if
        this.addInstruction(InstructionType.JMC, 0, -1); // address is set later

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementIf.getBodyIf(),  this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        int jmpEndIfStatement = this.getInstructionsCounter();

        // jump over else block if exists
        if (statementIf.hasElse())
        {
            this.addInstruction(InstructionType.JMP, 0, -1); // address is set later
        }

        // set address to else/end if address
        this.getInstructionsList().get(jmcElseRow).setAddress(this.getInstructionsCounter());

        if (statementIf.hasElse())
        {
            BlockStatementCompiler blockStatementCompilerElse = new BlockStatementCompiler(statementIf.getBodyElse(),  this.level);
            blockStatementCompilerElse.setUpInnerBodySettings();
            blockStatementCompilerElse.run();

            // set address to else end
            this.getInstructionsList().get(jmpEndIfStatement).setAddress(this.getInstructionsCounter());
        }
    }

    /**
     * Generate instructions for for statement
     * @param statementFor
     */
    private void generateForInstructions(StatementFor statementFor)
    {
        // check if for iterator not exists in symbol table
        if (this.isInSymbolTable(statementFor.getControlFor().getIdentifier()))
        {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(statementFor.getControlFor().getIdentifier(), statementFor.getLine()));
        }

        new ExpressionCompiler(statementFor.getControlFor().getFrom(), EVariableType.INT, this.level).run();

        // load for iterator from stack
        SymbolTableItem symbolTableItem = new SymbolTableItem(statementFor.getControlFor().getIdentifier(), this.level, this.getAndIncreaseStackPointer(), 0);
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setVariableType(EVariableType.INT);

        this.getSymbolTable().addItem(symbolTableItem);

        // store from value
        this.addInstruction(InstructionType.STO, 0, symbolTableItem.getAddress());

        int startIndex = this.getInstructionsCounter();

        // load from value
        this.addInstruction(InstructionType.LOD, 0, symbolTableItem.getAddress());

        // process to value
        new ExpressionCompiler(statementFor.getControlFor().getTo(), EVariableType.INT, this.level).run();

        // compare them
        this.addInstruction(InstructionType.OPR, 0, InstructionTypeOperation.LESS_EQ.getCode());

        int jmcEndIndex = this.getInstructionsCounter();
        // jmc to over block
        this.addInstruction(InstructionType.JMC, 0, -1); // address set later

        // process body
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementFor.getBody(),  this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // increase iterator
        this.addInstruction(InstructionType.LOD, 0, symbolTableItem.getAddress());
        this.addInstruction(InstructionType.LIT, 0, 1);
        this.addInstruction(InstructionType.OPR, 0, InstructionTypeOperation.PLUS.getCode());
        this.addInstruction(InstructionType.STO, 0, symbolTableItem.getAddress());
        this.addInstruction(InstructionType.JMP, 0, startIndex);

        // set over jump address
        this.getInstructionsList().get(jmcEndIndex).setAddress(this.getInstructionsCounter());
    }

    /**
     * Generate instruction for while
     * @param statementWhile
     */
    private void generateWhilInstructionTypes(StatementWhile statementWhile)
    {
        int startIndex = this.getInstructionsCounter();
        // process expression
        new ExpressionCompiler(statementWhile.getExpression(), EVariableType.BOOLEAN, this.level).run();

        int jmcIndex = this.getInstructionsCounter();
        this.addInstruction(InstructionType.JMC, 0, -1);

        // process body
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementWhile.getBody(), this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // jump to start
        this.addInstruction(InstructionType.JMP, 0, startIndex);

        // update jmc address
        this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());
    }

    /**
     * Generate do while instructions
     * @param statementDoWhile
     */
    private void generateDoWhilInstructionTypes(StatementDo statementDoWhile)
    {
        int startIndex = this.getInstructionsCounter();

        //process body
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementDoWhile.getBody(),  this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // process expression
        new ExpressionCompiler(statementDoWhile.getExpression(), EVariableType.BOOLEAN, this.level).run();

        int jmcIndex = this.getInstructionsCounter();
        this.addInstruction(InstructionType.JMC, 0, -1);

        // jmp to start
        this.addInstruction(InstructionType.JMP, 0, startIndex);

        // update jmc address
        this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());

    }

    /**
     * Generate instructions for method call
     * @param statementMethodCall
     */
    private void generateMethodCallInstructions(StatementMethodCall statementMethodCall)
    {
        // call method call compiler
        new MethodCallCompiler(statementMethodCall.getMethodCall(), this.level).run();
    }

    /**
     * Generate instructions for repeat until
     * @param statementRepeatUntil
     */
    private void generateRepeatUntilInstructions(StatementRepeat statementRepeatUntil)
    {
        int startAddress = this.getInstructionsCounter();

        // process body
        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementRepeatUntil.getBody(),  this.level);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // process expression
        new ExpressionCompiler(statementRepeatUntil.getExpression(), EVariableType.BOOLEAN,this.level).run();

        // jump back if false
        this.addInstruction(InstructionType.JMC, 0, startAddress);
    }

    /**
     * Generate instructions for switch
     * @param statementSwitch
     */
    private void generateSwitchInstructions(StatementSwitch statementSwitch)
    {
        ArrayList<Integer> jmpIndexes = new ArrayList<>();

        // create switch blocks
        for(Map.Entry<Integer, StatementSwitchBlock> block : statementSwitch.getBlocks().entrySet()) {
            int key = block.getKey();
            StatementSwitchBlock body = block.getValue();

            // process expression - switch value
            new ExpressionCompiler(statementSwitch.getExpression(), EVariableType.INT, this.level).run();

            this.addInstruction(InstructionType.LIT, 0, key);

            // compare block key witch switch value
            this.addInstruction(InstructionType.OPR, 0, InstructionTypeOperation.EQ.getCode());

            int jmcIndex = this.getInstructionsCounter();
            // jump to next block if key and switch value not equals
            this.addInstruction(InstructionType.JMC, 0, -1);

            // process body
            BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(body.getBody(),  this.level);
            blockStatementCompiler.setUpInnerBodySettings();
            blockStatementCompiler.run();

            int jmpEndIndex = this.getInstructionsCounter();
            // list of end jumps
            jmpIndexes.add(jmpEndIndex);
            // jump to switch end
            this.addInstruction(InstructionType.JMP, 0, -1);

            this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());
        }

        // default block
        if (statementSwitch.getDefaultBlock() != null)
        {
            BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementSwitch.getDefaultBlock().getBody(),  this.level);
            blockStatementCompiler.setUpInnerBodySettings();
            blockStatementCompiler.run();
        }

        int currentInstructionCounter = this.getInstructionsCounter();

        // initialize jumps out of switch
        for (int index : jmpIndexes)
        {
            this.getInstructionsList().get(index).setAddress(currentInstructionCounter);
        }
    }

    public void setGenerateMethods(boolean generateMethods)
    {
        this.generateMethods = generateMethods;
    }

    /**
     * Update method call address
     */
    private void initializeMethodsInInstructions()
    {
        for (Instruction instruction : this.getInstructionsList())
        {
            if (instruction.isLaterInitialization())
            {
                MethodCall methodCall = instruction.getMethodCall();

                // check if method exists
                if (this.isInSymbolTable(methodCall.getIdentifier()))
                {
                    SymbolTableItem symbolTableItem = this.getSymbolTable().getItem(methodCall.getIdentifier());

                    // check expected return call and method return type
                    if (methodCall.getExpectedReturnType() != symbolTableItem.getMethodReturnType())
                    {
                        this.getErrorHandler().throwError(new ErrorMismatchMethodCallReturnType(methodCall.getIdentifier(),
                                                                                                methodCall.getExpectedReturnType(),
                                                                                                symbolTableItem.getMethodReturnType(),
                                                                                                methodCall.getLine())
                                                                                                );
                    }

                    // check parameters count
                    if (methodCall.getParameters().size() != symbolTableItem.getMethodDeclarationParameters().size())
                    {
                        this.getErrorHandler().throwError(new ErrorInvalidParametersCount(symbolTableItem.getName(), symbolTableItem.getMethodDeclarationParameters().size(), methodCall.getLine()));
                    }

                    // check parameter types
                    for (int i = 0 ; i < methodCall.getParameters().size() ; i++)
                    {
                        EVariableType callType = methodCall.getParameters().get(i).getVariableType();
                        EVariableType methodType = symbolTableItem.getMethodDeclarationParameters().get(i).getType();
                        if (callType != methodType)
                        {
                            this.getErrorHandler().throwError(new ErrorMismatchMethodAndCallParameterTypes(methodCall.getIdentifier(), methodType, callType, i + 1, methodCall.getLine()));
                        }
                    }

                    instruction.setAddress(symbolTableItem.getAddress());
                }
                else
                {
                    this.getErrorHandler().throwError(new ErrorMethodNotExists(methodCall.getIdentifier(), methodCall.getLine()));
                }
            }
        }
    }

    /**
     * Delete local variables and decrease stack space
     */
    public void deleteLocalVariables()
    {
        // check if variables exists
        if (this.statementData != null)
        {
            for (String name : this.statementData.getVariableNames())
            {
                this.getSymbolTable().getTable().remove(name);
            }

            if (this.createLocalSpaceForLocalVariables && this.statementData.getVariableDeclarationCount() != 0)
            {
                this.addInstruction(InstructionType.INT, 0, -this.statementData.getVariableDeclarationCount());
            }
        }
    }


    public void setIncreaseStack(boolean increaseStack)
    {
        this.increaseStack = increaseStack;
    }

    public void setGenerateReturn(boolean generateReturn)
    {
        this.generateReturn = generateReturn;
    }

    public void setDeleteLocalVariables(boolean deleteLocalVariables)
    {
        this.deleteLocalVariables = deleteLocalVariables;
    }

    /**
     * Set up settings for all blocks except main block
     */
    public void setUpInnerBodySettings()
    {
        this.setGenerateMethods(false);
        this.setIncreaseStack(false);
        this.setGenerateReturn(false);
        this.setDeleteLocalVariables(true);
        this.setCreateLocalSpaceForLocalVariables(true);
    }

    public void setCreateLocalSpaceForLocalVariables(boolean createLocalSpaceForLocalVariables)
    {
        this.createLocalSpaceForLocalVariables = createLocalSpaceForLocalVariables;
    }
}
