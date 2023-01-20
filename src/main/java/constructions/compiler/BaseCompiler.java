package constructions.compiler;

import constructions.ErrorHandler;
import constructions.PL0.Instruction;
import constructions.enums.PL0Instructions;
import constructions.enums.ReturnType;
import constructions.method.MethodCall;
import constructions.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseCompiler {
    protected static ArrayList<Instruction> instructions = new ArrayList<>();
    protected static SymbolTable symbolTable = new SymbolTable();
    private static int instructionCounter = 0;
    protected final int DEFAULT_METHOD_SIZE = 3;
    private static int stackPointer = 3;
    public final int DEFAULT_STACK_POINTER = 3;
    //method prototype?
    private static HashMap<String, ReturnType> methodReturnTypes = new HashMap<>();;
    //errors
    protected static ErrorHandler errorHandler = ErrorHandler.getInstance();

    public void addInstruction(PL0Instructions instruction, int level, int address) {
        instructions.add(new Instruction(instruction, instructionCounter, level, address));
        instructionCounter++;
    }

    public void addMethodCallInstruction(PL0Instructions instruction, int level, MethodCall methodCall) {
        instructions.add(new Instruction(instruction, instructionCounter, level, methodCall));
        instructionCounter++;
    }

    protected boolean isInSymbolTable(String identifier)  {
        return symbolTable.getTable().containsKey(identifier);
    }

    public ArrayList<Instruction> getInstructions() {
        return instructions;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public int getInstructionCounter() {
        return instructionCounter;
    }

    public int getStackPointer() {
        return stackPointer;
    }

    public void setStackPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }

    public void increaseStackPointer() {
        this.stackPointer++;
    }

    public void addMethodReturnType(String name, ReturnType type) {
        methodReturnTypes.put(name, type);
    }

    public HashMap<String, ReturnType> getMethodReturnTypes() {
        return methodReturnTypes;
    }

    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }
}
