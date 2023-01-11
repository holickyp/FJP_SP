package constructions.compilerPart;


import constructions.ErrorHandler;
import constructions.enums.InstructionType;
import constructions.instruction.Instruction;
import constructions.method.MethodCall;
import constructions.method.MethodPrototype;
import constructions.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseCompiler
{
    /**
     * Instruction list
     */
    protected static ArrayList<Instruction> instructionsList = new ArrayList<>();

    /**
     * Instance of symbol table
     */
    protected static SymbolTable symbolTable = new SymbolTable();

    /**
     * Instruction counter
     */
    private static int instructionsCounter = 0;

    /**
     * Constant for method default size
     */
    protected final int BASE_METHOD_SIZE = 3;

    /**
     * Stack pointer
     */
    private static int stackPointer = 3;

    /**
     * Default value of stack pointer
     */
    public final int STACK_POINTER_DEFAULT_VALUE = 3;

    /**
     * List of method prototypes
     */
    private static HashMap<String, MethodPrototype> methodPrototype = new HashMap<>();

    /**
     * Instance of error handler
     */
    protected static ErrorHandler errorHandler = ErrorHandler.getInstance();

    /**
     * Adds normal instruction to instruction list
     * @param instruction
     * @param level
     * @param address
     */
    protected void addInstruction(InstructionType instruction, int level, int address)
    {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, address));
        instructionsCounter++;
    }

    /**
     * Adds method call instruction to instruction list
     * @param instruction
     * @param level
     * @param methodCall
     */
    protected void addMethodCallInstruction(InstructionType instruction, int level, MethodCall methodCall)
    {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, methodCall));
        instructionsCounter++;
    }

    public ArrayList<Instruction> getInstructionsList()
    {
        return instructionsList;
    }

    protected int getStackPointer()
    {
        return stackPointer;
    }
    protected void setStackPointer(int address)
    {
        stackPointer = address;
    }

    protected void increaseStackPointer()
    {
        stackPointer++;
    }

    protected int getAndIncreaseStackPointer()
    {
        int val = stackPointer;

        this.increaseStackPointer();

        return val;
    }

    protected int getInstructionsCounter()
    {
        return instructionsCounter;
    }

    protected SymbolTable getSymbolTable()
    {
        return symbolTable;
    }

    protected boolean isInSymbolTable(String identifier)
    {
        return this.getSymbolTable().getTable().containsKey(identifier);
    }

    protected ErrorHandler getErrorHandler()
    {
        return errorHandler;
    }

    public HashMap<String, MethodPrototype> getMethodPrototype()
    {
        return methodPrototype;
    }

    public HashMap<String, MethodPrototype> getMethodPrototypes()
    {
        return methodPrototype;
    }
}
