package constructions.expressions;

import constructions.enums.ExpressionType;
import constructions.enums.ReturnType;
import constructions.method.MethodParameters;

import java.util.List;

public class MethodCallExpression extends Expression {
    private String identifier;
    private List<Expression> expressions;

    public MethodCallExpression(int line, String identifier, List<Expression> expressions) {
        super(ExpressionType.METHOD_CALL, line);
        this.identifier = identifier;
        this.expressions = expressions;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }
}
