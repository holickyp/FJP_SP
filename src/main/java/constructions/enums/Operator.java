package constructions.enums;

public enum Operator {
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULO("%"),
    PLUS("+"),
    MINUS("-"),
    LOWER_EQUAL_THAN("<="),
    GRATER_EQUAL_THAN(">="),
    LOWER_THAN("<"),
    GRATER_THAN(">"),
    EQUALS("=="),
    NOT_EQUALS("!="),
    AND("&&"),
    OR("||")

    private String op;

    Operator(String op)
    {
        this.op = op;
    }

    public static Operator getOp(String op) {
        for(Operator e: Operator.values()) {
            if(e.op.equals(op))
            {
                return e;
            }
        }
        return null;
    }
}
