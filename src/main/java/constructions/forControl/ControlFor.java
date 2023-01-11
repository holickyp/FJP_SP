package constructions.forControl;

import constructions.Variable;
import constructions.expressions.Expression;

import java.util.List;

public class ControlFor {
    private InitFor initFor;
    private Expression expression;
    private List<Expression> updateFor;

    public ControlFor(InitFor initFor, Expression expression, List<Expression> updateFor) {
        this.initFor = initFor;
        this.expression = expression;
        this.updateFor = updateFor;
    }
}
