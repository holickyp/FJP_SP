package constructions.statements;

import constructions.enums.StatementType;

public class IfStatement extends Statement{
    private Exception exception;
    private Statement ifStatement;
    private Statement elseStatement;

    public IfStatement(Exception exception, Statement ifStatement, Statement elseStatement, int line) {
        super(StatementType.IF, line);
        this.exception = exception;
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
    }

    public Exception getException() {
        return exception;
    }

    public Statement getIfStatement() {
        return ifStatement;
    }

    public Statement getElseStatement() {
        return elseStatement;
    }
}
