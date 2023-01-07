package constructions;

import constructions.enums.ExpressionTypes;
import constructions.enums.Operators;
import constructions.enums.VariableTypes;
import constructions.enums.VariableValues;

import java.util.List;

public class Expression {
    private ExpressionTypes type;
    private VariableValues values;
    private List<Operators> operators;
    private VariableTypes returnType;

    public Expression(ExpressionTypes type, VariableValues values, List<Operators> operators, VariableTypes returnType) {
        this.type = type;
        this.values = values;
        this.operators = operators;
        this.returnType = returnType;
    }
}
