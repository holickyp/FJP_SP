package constructions.enums;

public enum InstructionType {

    LIT("LIT"),
    OPR("OPR"),
    LOD("LOD"),
    STO("STO"),
    CAL("CAL"),
    INT("INT"),
    JMP("JMP"),
    JMC("JMC"),
    RET("RET");

    private String value;

    InstructionType(String value)
    {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }
}
