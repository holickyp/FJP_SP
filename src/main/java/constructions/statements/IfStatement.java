package constructions.statements;

import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class IfStatement extends Statement{
    private Expression expression;
    private Statement ifStatement;
    private Statement elseStatement;

    public IfStatement(Expression expression, Statement ifStatement, Statement elseStatement, int line) {
        super(StatementType.IF, line);
        this.expression = expression;
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
    }

    public Expression getExpression() {
        return expression;
    }

    public Statement getIfStatement() {
        return ifStatement;
    }

    public Statement getElseStatement() {
        return elseStatement;
    }
}
