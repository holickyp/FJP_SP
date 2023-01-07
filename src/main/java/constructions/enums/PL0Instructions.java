package constructions.enums;

public enum PL0Instructions {
    LIT("LIT"),
    OPR("OPR"),
    LOD("LOD"),
    STO("STO"),
    CAL("CAL"),
    INT("INT"),
    JMP("JMP"),
    JMC("JMC"),
    RET("RET");

    private String instruction;

    PL0Instructions(String value)
    {
        this.instruction = value;
    }

    public String toString() {
        return this.instruction;
    }
}
