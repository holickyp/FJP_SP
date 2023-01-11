package constructions.compilerPart;


import constructions.enums.InstructionType;
import constructions.enums.Operator;
import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.expressions.*;
import constructions.symbolTable.SymbolTableItem;

public class ExpressionCompiler extends BaseCompiler
{
    /**
     * Expression to process
     */
    private final Expression expression;

    /**
     * Level of expression
     */
    private int level;

    /**
     * Method return type
     */
    private ReturnType methodReturnType;

    /**
     * Exprexted return type
     */
    private VariableType resultType;

    public ExpressionCompiler(Expression expression, int level)
    {
        this.expression = expression;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, VariableType resultType, int level)
    {
        this.expression = expression;
        this.resultType = resultType;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, ReturnType methodReturnType, int level)
    {

        this.expression = expression;
        this.methodReturnType = methodReturnType;
        this.level = level;
    }

    public VariableType runReturnType()
    {
        return this.processExpression(this.expression);
    }

    /**
     * Processes expression into instruction
     */
    public void run()
    {
        VariableType type = this.processExpression(this.expression);

        if (this.resultType != null && type != null)
        {
            // if expected return type not match with result type
            if (type != this.resultType)
            {
                this.getErrorHandler().throwError(new ErrorMismatchExpressionResult(this.resultType.toString(), type.toString(), this.expression.getLine()));
            }
        }
    }

    /**
     * Expression processing, called recursively
     * @param expression
     * @return
     */
    private VariableType processExpression(Expression expression)
    {
        VariableType type = null;

        switch (expression.getType())
        {
            case IDENTIFIER:
                type = this.generateIdentifierInstructions((IdentifierExpression) expression);
                break;
            case VALUE:
                type = this.generateValueInstructions((ValueExpression) expression);
                break;
            case MUL_DIV_MOD:
                type = this.generateMultiplicationInstructions((MulDivModExpression) expression);
                break;
            case RELATIONAL:
                type = this.generateRelationalInstructions((RelationalExpression) expression);
                break;
            case LOGICAL:
                type = this.generateLogicalInstructions((LogicalExpression) expression);
                break;
            /*case NEGATION:
                type = this.generateNegationInstructions((ExpressionNegation) expression);
                break;*/
            case PARENTHESES:
                type = this.generateParInstructions((ParenthesesExpression) expression);
                break;
            case METHOD_CALL:
                type = this.generateMethodCallInstructions((MethodCallExpression) expression);
                break;
            case PLUS_MINUS:
                type = this.generateAdditiveInstructions((PlusMinusExpression) expression);
               
        }
        //POSTFIX, PREFIX,COMPARE,
               
            

        return type;
    }

    /**
     * Identifier expression
     * @param expression
     * @return
     */
    private VariableType generateIdentifierInstructions(IdentifierExpression expression)
    {
        String identifier = expression.getValue().toString();

        if (this.isInSymbolTable(identifier))
        {
            SymbolTableItem item = this.getSymbolTable().getItem(identifier);
            this.addInstruction(InstructionType.LOD, this.level - item.getLevel(), item.getAddress());

            return item.getVariableType();
        }
        else
        {
            this.getErrorHandler().throwError(new ErrorVariableNotExists(identifier, expression.getLine()));
        }

        return null;
    }

    /**
     * Specific value expression
     * @param expression
     * @return
     */
    private VariableType generateValueInstructions(ValueExpression expression)
    {
        Object value = expression.getValue();

        if (expression.getVariableType() == VariableType.INT)
        {
            this.addInstruction(InstructionType.LIT, 0, (Integer)value);
            return VariableType.INT;
        }
        else if (expression.getVariableType() == VariableType.BOOLEAN)
        {
            this.addInstruction(InstructionType.LIT, 0, Boolean.parseBoolean(value.toString()) ? 1 : 0);
            return VariableType.BOOLEAN;
        }

        return null;
    }

    /**
     * Multiplication expression
     * @param expression
     * @return
     */
    private VariableType generateMultiplicationInstructions(MulDivModExpression expression)
    {
        VariableType leftExpression = this.processExpression(expression.getLeftExpression());
        VariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, VariableType.INT);

        this.addInstruction(InstructionType.OPR, 0, expression.getOperatorCode());

        return  VariableType.INT;
    }

    /**
     * Additive expression
     * @param expression
     * @return
     */
    private VariableType generateAdditiveInstructions(PlusMinusExpression expression)
    {
        VariableType leftExpression = this.processExpression(expression.getLeftExpression());
        VariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, VariableType.INT);

        this.addInstruction(InstructionType.OPR, 0, expression.getOperatorCode());

        return  VariableType.INT;
    }

    /**
     * Relational Expression
     * @param expression
     * @return
     */
    private VariableType generateRelationalInstructions(RelationalExpression expression)
    {
        VariableType leftExpression = this.processExpression(expression.getLeftExpression());
        VariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, VariableType.INT);

        this.addInstruction(InstructionType.OPR, 0, expression.getOperatorCode());

        return  VariableType.BOOLEAN;
    }

    /**
     * Logical expression
     * @param expression
     * @return
     */
    private VariableType generateLogicalInstructions(LogicalExpression expression)
    {
        VariableType leftExpression = this.processExpression(expression.getLeftExpression());
        VariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, VariableType.BOOLEAN);
        if (expression.getOperator() == Operator.AND)
        {
            this.addInstruction(InstructionType.OPR, 0, Operator.MULTIPLICATION.getCode());
            this.addInstruction(InstructionType.LIT, 0, 1);
            this.addInstruction(InstructionType.OPR, 0, Operator.EQUALS.getCode());
        }
        else
        {
            this.addInstruction(InstructionType.OPR, 0, Operator.PLUS.getCode());
            this.addInstruction(InstructionType.LIT, 0, 0);
            this.addInstruction(InstructionType.OPR, 0, Operator.GRATER_THAN.getCode());
        }

        return  VariableType.BOOLEAN;
    }

    /**
     * Negation expression
     * @param expression
     * @return
     *
    private VariableType generateNegationInstructions(ExpressionNegation expression)
    {
        // multiple logical negation
        if (expression.getType() == expression.getExpression().getType())
        {
            this.getErrorHandler().throwError(new ErrorArithmetic(EOperatorLogical.NEGATION.toString(), expression.getExpression().getLine()));
        }

        VariableType expressionType = this.processExpression(expression.getExpression());

        this.checkVariableType(expressionType, VariableType.BOOLEAN);

        this.addInstruction(EInstruction.LIT, 0,0);
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());

        return VariableType.BOOLEAN;
    }*/



    /**
     * Par expression
     * @param expression
     * @return
     */
    private VariableType generateParInstructions(ParenthesesExpression expression)
    {
        return this.processExpression(expression.getExpression());
    }

    /**
     * Method call expression
     * @param expression
     * @return
     */
    private VariableType generateMethodCallInstructions(MethodCallExpression expression)
    {
        if (expression.getMethodCall().getExpectedReturnType() == ReturnType.VOID)
        {
            this.getErrorHandler().throwError(new ErrorVoidMethodExpression(expression.getMethodCall().getIdentifier(), expression.getLine()));
        }

        // check if method exists in prototypes
        if (!this.getMethodPrototypes().containsKey(expression.getMethodCall().getIdentifier()))
        {
            this.getErrorHandler().throwError(new ErrorMethodNotExists(expression.getMethodCall().getIdentifier(), expression.getMethodCall().getLine()));
        }

        // set up return type of method call from method prototypes
        expression.getMethodCall().setExpectedReturnType(this.getMethodPrototypes().get(expression.getMethodCall().getIdentifier()).getMethodReturnType());

        // compile method call
        new MethodCallCompiler(expression.getMethodCall(), this.level).run();

        return this.getMethodPrototype().get(expression.getMethodCall().getIdentifier()).convertReturnTypeToVariableType();
    }

    /**
     * Checks if return types are same
     * @param type1
     * @param type2
     * @param expected
     */
    private void checkVariableTypes(VariableType type1, VariableType type2, VariableType expected)
    {
        if (type1 != expected || type2 != expected)
        {
            this.getErrorHandler().throwError(new ErrorMismatchTypesExpression(expected.toString(), type1.toString(), type2.toString(), this.expression.getLine()));
        }
    }

    /**
     * Check if type is equal to expected
     * @param type
     * @param expected
     */
    private void checkVariableType(VariableType type, VariableType expected)
    {
        if (type != expected)
        {
            this.getErrorHandler().throwError(new ErrorMismatchExpressionResult(expected.toString(), type.toString(), this.expression.getLine()));
        }
    }

    public ReturnType getMethodReturnType()
    {
        return methodReturnType;
    }

    public void setMethodReturnType(ReturnType methodReturnType)
    {
        this.methodReturnType = methodReturnType;
    }
}
