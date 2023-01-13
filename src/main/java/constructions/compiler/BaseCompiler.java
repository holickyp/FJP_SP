package constructions.compiler;

import constructions.ErrorHandler;
import constructions.PL0.Instruction;
import constructions.enums.PL0Instructions;
import constructions.method.MethodCall;
import constructions.method.MethodPrototype;
import constructions.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseCompiler {
    ArrayList<Instruction> instructions = new ArrayList<>();
    SymbolTable symbolTable = new SymbolTable();
    int instructionCounter = 0;
    final int METHOD_SIZE = 3;
    int stackPointer = 3;
    final int DEFAULT_STACK_POINTER = 3;
    //method prototyp?
    private static HashMap<String, MethodPrototype> methodPrototype = new HashMap<>();
    //errors
    protected static ErrorHandler errorHandler = ErrorHandler.getInstance();


    public void addInstruction(PL0Instructions instruction, int level, int address) {
        instructions.add(new Instruction(instruction, instructionCounter, level, address));
        instructionCounter++;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    public ArrayList<Instruction> getInstructionsList()
    {
        return instructions;
    }

    protected void addMethodCallInstruction(PL0Instructions instruction, int level, MethodCall methodCall)
    {
        instructions.add(new Instruction(instruction, this.getInstructionCounter(), level, methodCall));
        instructionCounter++;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public int getInstructionCounter() {
        return instructionCounter;
    }

    public void setInstructionCounter(int instructionCounter) {
        this.instructionCounter = instructionCounter;
    }

    public static HashMap<String, MethodPrototype> getMethodPrototype() {
        return methodPrototype;
    }

    public static void setMethodPrototype(HashMap<String, MethodPrototype> methodPrototype) {
        BaseCompiler.methodPrototype = methodPrototype;
    }


    public HashMap<String, MethodPrototype> getMethodPrototypes()
    {
        return methodPrototype;
    }

    public static ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public static void setErrorHandler(ErrorHandler errorHandler) {
        BaseCompiler.errorHandler = errorHandler;
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

    protected boolean isInSymbolTable(String identifier)
    {
        return this.getSymbolTable().getTable().containsKey(identifier);
    }


}
