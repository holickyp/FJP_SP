package constructions.method;

import constructions.Expression;
import constructions.Variable;
import constructions.enums.VariableTypes;

public class MethodCallParameters {
    /**
     * Parameter value
     */
    private Expression expression;

    /**
     * Type of parameter
     */
    private VariableTypes variableType;

    public MethodCallParameters(Expression expression)
    {
        this.expression = expression;
    }

    public Expression getExpression()
    {
        return expression;
    }

    public VariableTypes getVariableType()
    {
        return variableType;
    }

    public void setExpression(Expression expression)
    {
        this.expression = expression;
    }

    public void setVariableType(VariableTypes variableType)
    {
        this.variableType = variableType;
    }
}
