package constructions.compiler;

import constructions.ErrorHandler;
import constructions.PL0.Instruction;
import constructions.enums.PL0Instructions;
import constructions.enums.ReturnType;
import constructions.method.MethodCall;
import constructions.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * hlavni compiler, zaklad pro ostani compilery
 */
public class BaseCompiler {
    /** list instrukci */
    protected static ArrayList<Instruction> instructions = new ArrayList<>();
    /** symbol table */
    protected static SymbolTable symbolTable = new SymbolTable();
    /** pocitadlo instrukci */
    private static int instructionCounter = 0;
    /** kostanta pro vychozi velikost metod */
    protected final int DEFAULT_METHOD_SIZE = 3;
    /** stack pointer */
    private static int stackPointer = 3;
    /** kostanta pro vychozi velikost zasobniku */
    public final int DEFAULT_STACK_POINTER = 3;
    /** mapa metod ktere jsou obsazeny v programu */
    private static final HashMap<String, ReturnType> methodReturnTypes = new HashMap<>();;
    /** error handler */
    protected static ErrorHandler errorHandler = ErrorHandler.getInstance();

    /**
     * prida instrukci a zvedne instructionCounter
     * @param instruction instrukce
     * @param level level
     * @param address adresa
     */
    public void addInstruction(PL0Instructions instruction, int level, int address) {
        instructions.add(new Instruction(instruction, instructionCounter, level, address));
        instructionCounter++;
    }

    /**
     * prida instrukci a zvedne instructionCounter, pro method call
     * @param instruction instrukce
     * @param level level
     * @param methodCall methodCall
     */
    public void addMethodCallInstruction(PL0Instructions instruction, int level, MethodCall methodCall) {
        instructions.add(new Instruction(instruction, instructionCounter, level, methodCall));
        instructionCounter++;
    }

    /**
     * test zda je polozka v Symbol Table
     * @param identifier hledana polozka
     * @return true/false
     */
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

    /**
     * zvedne stack poiner o 1
     */
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
