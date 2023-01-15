package constructions.forControl;

import constructions.Variable;
import constructions.expressions.Expression;

import java.util.List;

public class InitFor {
    private Variable variable;
    private List<Expression> expressions;

    public InitFor(Variable variable, List<Expression> expressions) {
        this.variable = variable;
        this.expressions = expressions;
    }

    public Variable getVariable() {
        return variable;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
}
