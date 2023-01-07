package constructions.enums;

public enum Operators {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    AND("&&"),
    OR("||"),
    NEGATION("!"),
    MODULO("%");

    private final String symbol;

    Operators(String symbol) {
        this.symbol = symbol;
    }

    public static Operators getSymbol(String value) {
        for(Operators operator: Operators.values()) {
            if(operator.symbol.equals(value))
            {
                return operator;
            }
        }
        return null;
    }
}
