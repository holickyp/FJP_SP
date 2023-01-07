package constructions.enums;

public enum Conditionals {
    EQUAL("=="),
    NOT_EQUAL("!="),
    LOWER_THAN("<"),
    LOWER_EQUAL_THAN("<="),
    GRATER_THAN(">"),
    GRATER_EQUAL_THAN(">=");

    private final String symbol;

    Conditionals(String symbol) {
        this.symbol = symbol;
    }

    public static Conditionals getSymbol(String value) {
        for(Conditionals conditional: Conditionals.values()) {
            if(conditional.symbol.equals(value))
            {
                return conditional;
            }
        }
        return null;
    }
}
