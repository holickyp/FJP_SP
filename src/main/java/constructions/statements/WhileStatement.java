package constructions.statements;

import constructions.Block;
import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class WhileStatement extends Statement {
    private final Expression expression;
    private final Block body;

    public WhileStatement(int line, Expression expression, Block body) {
        super(StatementType.WHILE, line);
        this.expression = expression;
        this.body = body;
    }

    public Expression getExpression() {
        return expression;
    }

    public Block getBody() {
        return body;
    }
}
