package constructions.enums;

public enum Operator {
    MULTIPLICATION("*", 1),
    DIVISION("/", 2),
    MODULO("%", 3),
    PLUS("+", 4),
    MINUS("-", 5 ),
    LOWER_EQUAL_THAN("<=", 6),
    GRATER_EQUAL_THAN(">=", 7),
    LOWER_THAN("<", 8),
    GRATER_THAN(">", 9),
    EQUALS("==", 10),
    NOT_EQUALS("!=", 11),
    AND("&&", 12),
    OR("||", 13);

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
