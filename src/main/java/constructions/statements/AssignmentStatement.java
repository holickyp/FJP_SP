package constructions.statements;

import constructions.Expression;
import constructions.Statement;
import constructions.enums.Statements;

public class AssignmentStatement extends Statement {
    private final String identifier;
    private final Expression expression;

    public AssignmentStatement(String identifier, Expression expression) {
        super(Statements.ASSIGNMENT);
        this.identifier = identifier;
        this.expression = expression;
    }
}
