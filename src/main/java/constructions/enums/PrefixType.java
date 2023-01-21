package constructions.enums;

public enum PrefixType {
    NEGATION("!"),
    PLUS("+"),
    MINUS("-"),
    INCREMENT("++"),
    DECREMENT("--");

    private final String prefix;

    PrefixType(String value)
    {
        this.prefix = value;
    }

    public static PrefixType getType(String prefix) {
        for(PrefixType p: PrefixType.values()) {
            if(p.prefix.equals(prefix)) {
                return p;
            }
        }
        return null;
    }

    public String toString() {
        return this.prefix;
    }
}
