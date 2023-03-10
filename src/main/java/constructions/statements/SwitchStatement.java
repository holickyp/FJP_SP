package constructions.statements;

import constructions.enums.StatementType;
import constructions.expressions.Expression;

import java.util.HashMap;

public class SwitchStatement extends Statement {
    private final Expression expression;
    private final HashMap<Integer, SwitchBlock> cases;
    private final SwitchBlock defaultCase;

    public SwitchStatement(int line, Expression expression, HashMap<Integer, SwitchBlock> cases, SwitchBlock defaultCase) {
        super(StatementType.SWITCH, line);
        this.expression = expression;
        this.cases = cases;
        this.defaultCase = defaultCase;
    }

    public Expression getExpression() {
        return expression;
    }

    public HashMap<Integer, SwitchBlock> getCases() {
        return cases;
    }

    public SwitchBlock getDefaultCase() {
        return defaultCase;
    }
}
