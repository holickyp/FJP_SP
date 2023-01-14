package constructions.enums;

public enum Operator {
    PLUS("+", 2),
    MINUS("-", 3 ),
    MULTIPLICATION("*", 4),
    DIVISION("/", 5),
    MODULO("%", 6),
    EQUALS("==", 8),
    NOT_EQUALS("!=", 9),
    LOWER_THAN("<", 10),
    GRATER_EQUAL_THAN(">=", 11),
    GRATER_THAN(">", 12),
    LOWER_EQUAL_THAN("<=", 13),
    AND("&&", 2),
    OR("||", 4);

    private String op;
    private int code;

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

    Operator(String op, int code) {
        this.op = op;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
