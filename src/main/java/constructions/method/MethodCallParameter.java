package constructions.method;


import constructions.Variable;
import constructions.enums.VariableType;
import constructions.expressions.Expression;

public class MethodCallParameter
{
    /**
     * Parameter value
     */
    private Expression expression;

    /**
     * Type of parameter
     */
    private VariableType variableType;

    public MethodCallParameter(Expression expression)
    {
        this.expression = expression;
    }

    public Expression getExpression()
    {
        return expression;
    }

    public VariableType getVariableType()
    {
        return variableType;
    }

    public void setExpression(Expression expression)
    {
        this.expression = expression;
    }

    public void setVariableType(VariableType variableType)
    {
        this.variableType = variableType;
    }
}
