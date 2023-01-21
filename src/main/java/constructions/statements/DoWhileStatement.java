package constructions.statements;

import constructions.Block;
import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class DoWhileStatement extends Statement {
    private Block body;
    private Expression expression;

    public DoWhileStatement(int line, Block statement, Expression expression) {
        super(StatementType.DO_WHILE, line);
        this.body = statement;
        this.expression = expression;
    }

    public Block getBody() {
        return body;
    }

    public Expression getExpression() {
        return expression;
    }
}
