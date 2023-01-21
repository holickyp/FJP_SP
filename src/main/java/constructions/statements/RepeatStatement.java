package constructions.statements;

import constructions.Block;
import constructions.enums.StatementType;
import constructions.expressions.Expression;

public class RepeatStatement extends Statement {
    private Block body;
    private Expression expression;

    public RepeatStatement(int line, Block body, Expression expression) {
        super(StatementType.REPEAT, line);
        this.body = body;
        this.expression = expression;
    }

    public Block getBody() {
        return body;
    }

    public Expression getExpression() {
        return expression;
    }
}
