package constructions.statements;

import constructions.Statement;
import constructions.Variable;
import constructions.enums.Statements;

public class VariableStatement extends Statement {

    private final Variable variable;

    public VariableStatement(Variable variable) {
        super(Statements.DECLARATION);
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
