package constructions.method;

import constructions.expressions.Expression;
import constructions.statements.Statement;

import java.util.List;

public class MethodCall {
    private String identifier;
    private List<Expression> parameters;

    private int line;

    public MethodCall(String identifier, List<Expression> parameters, int line) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public int getLine() {
        return line;
    }
}
