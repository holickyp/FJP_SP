package constructions.compiler;

import constructions.PL0.Instruction;
import constructions.enums.PL0Instructions;
import constructions.symbolTable.SymbolTable;

import java.util.ArrayList;

public class BaseCompiler {
    ArrayList<Instruction> instructions = new ArrayList<>();
    SymbolTable symbolTable = new SymbolTable();
    int instructionCounter = 0;
    final int METHOD_SIZE = 3;
    int stackPointer = 3;
    final int DEFAULT_STACK_POINTER = 3;
    //method prototyp?
    //errors

    public void addInstruction(PL0Instructions instruction, int level, int address) {
        instructions.add(new Instruction(instruction, instructionCounter, level, address));
        instructionCounter++;
    }
}
