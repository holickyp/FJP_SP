package constructions.instruction;


import constructions.enums.InstructionType;
import constructions.method.MethodCall;

public class Instruction
{
    private InstructionType instruction;
    private int rowId;
    private int level;
    private int address;

    private boolean laterInitialization = false;
    private MethodCall methodCall = null;
    private boolean updatedCall = false;

    public Instruction(InstructionType instruction, int rowId, int level, int address)
    {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.address = address;
    }

    public Instruction(InstructionType instruction, int rowId, int level, MethodCall methodCall)
    {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.methodCall = methodCall;
        this.address = -1;
        this.laterInitialization = true;
    }

    @Override
    public String toString()
    {
        return this.rowId + "\t" + this.instruction + "\t" + this.level + "\t" + this.address + "\n";
    }

    public InstructionType getInstruction()
    {
        return instruction;
    }

    public void setInstruction(InstructionType instruction)
    {
        this.instruction = instruction;
    }

    public int getRowId()
    {
        return rowId;
    }

    public void setRowId(int rowId)
    {
        this.rowId = rowId;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getAddress()
    {
        return address;
    }

    public void setAddress(int address)
    {
        this.address = address;
    }

    /**
     * Address is initialized later
     * used in call instruction
     * @return
     */
    public boolean isLaterInitialization()
    {
        return laterInitialization;
    }

    public void setLaterInitialization(boolean laterInitialization)
    {
        this.laterInitialization = laterInitialization;
    }

    public MethodCall getMethodCall()
    {
        return methodCall;
    }

    public boolean isUpdatedCall()
    {
        return updatedCall;
    }

    public void setUpdatedCall(boolean updatedCall)
    {
        this.updatedCall = updatedCall;
    }
}
