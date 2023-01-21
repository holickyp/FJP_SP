package constructions.statements;

import constructions.Block;
import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class IfStatement extends Statement {
    private Expression expression;
    private Block ifBody;
    private Block elseBody;

    public IfStatement(Expression expression, Block ifBody, Block elseBody, int line) {
        super(StatementType.IF, line);
        this.expression = expression;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public Expression getExpression() {
        return expression;
    }

    public Block getIfBody() {
        return ifBody;
    }

    public Block getElseBody() {
        return elseBody;
    }
}
