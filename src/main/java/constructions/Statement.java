package constructions;

import constructions.enums.Statements;

public class Statement {
    private Statements type;

    public Statement(Statements type) {
        this.type = type;
    }

    public Statements getType() {
        return type;
    }

    public void setType(Statements type) {
        this.type = type;
    }
}
