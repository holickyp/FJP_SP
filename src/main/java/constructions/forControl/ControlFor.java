package constructions.forControl;

import constructions.Variable;
import constructions.expressions.Expression;

import java.util.List;

public class ControlFor {
    private final InitFor initFor;
    private final Expression expression;
    private final List<Expression> updateFor;

    public ControlFor(InitFor initFor, Expression expression, List<Expression> updateFor) {
        this.initFor = initFor;
        this.expression = expression;
        this.updateFor = updateFor;
    }

    public InitFor getInitFor() {
        return initFor;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Expression> getUpdateFor() {
        return updateFor;
    }
}
