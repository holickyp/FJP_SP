package constructions.statements;

import constructions.Expression;

public class AssignmentStatement {
    private final String identifier;
    private final Expression expression;

    public AssignmentStatement(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }
}
