package constructions.compiler;

import constructions.enums.*;
import constructions.error.*;
import constructions.expressions.*;
import constructions.symbolTable.SymbolTableItem;

public class ExpressionCompiler extends BaseCompiler {
    private Expression expression;
    private int level;
    private ReturnType returnType;
    private VariableType variableType;

    public ExpressionCompiler(Expression expression, int level) {
        this.expression = expression;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, ReturnType returnType, int level) {
        this.expression = expression;
        this.returnType = returnType;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, VariableType variableType, int level) {
        this.expression = expression;
        this.variableType = variableType;
        this.level = level;
    }

    public VariableType run() {
        VariableType type = processExpression(expression);
        if(variableType != null && type != null) {
            if(type != variableType) {
                getErrorHandler().throwError(new ErrorMismatchExpressionResult(variableType.toString(), type.toString(), this.expression.getLine()));
            }
        }
        return type;
    }

    private VariableType processExpression(Expression expression) {
        VariableType type = null;

        switch (expression.getType()) {
            case VALUE: type = valueInstructions((ValueExpression) expression);break;
            case IDENTIFIER: type = identifierInstructions((IdentifierExpression) expression);break;
            case METHOD_CALL: type = methodCallInstructions((MethodCallExpression) expression);break;
            case POSTFIX:break;//TODO
            case PREFIX:break;//TODO
            case MUL_DIV_MOD: type = mulDivModInstructions((MulDivModExpression) expression);break;
            case PLUS_MINUS: type = plusMinusInstructions((PlusMinusExpression) expression);break;
            case RELATIONAL: type = relationalInstructions((RelationalExpression) expression);break;
            case COMPARE: type = compareInstructions((CompareExpression) expression);break;
            case LOGICAL: type = logicalInstructions((LogicalExpression) expression);break;
            case PARENTHESES: type = parenthesesInstructions((ParenthesesExpression) expression);break;
            case ASSIGN: type = assignInstructions((AssignExpression) expression);break;
        }
        return type;
    }

    private VariableType valueInstructions(ValueExpression valueExpression) {
        Object value = valueExpression.getValue();

        if(valueExpression.getVariableType() == VariableType.INT) {
            addInstruction(PL0Instructions.LIT, 0, Integer.parseInt(value.toString()));
            return VariableType.INT;
        }
        else if(valueExpression.getVariableType() == VariableType.BOOLEAN) {
            addInstruction(PL0Instructions.LIT, 0, Boolean.parseBoolean(value.toString()) ? 1 : 0);
            return VariableType.BOOLEAN;
        }
        return null;
    }

    private VariableType identifierInstructions(IdentifierExpression identifierExpression) {
        String identifier = identifierExpression.getValue().toString();
        if(isInSymbolTable(identifier)) {
            SymbolTableItem symbolTableItem = getSymbolTable().getItem(identifier);
            addInstruction(PL0Instructions.LOD, level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
            return symbolTableItem.getVariableType();
        }
        else {
            getErrorHandler().throwError(new ErrorVariableNotExists(identifier, identifierExpression.getLine()));
        }
        return null;
    }

    private VariableType methodCallInstructions(MethodCallExpression methodCallExpression) {
        if(methodCallExpression.getMethodCall().getReturnType() == ReturnType.VOID) {
            getErrorHandler().throwError(new ErrorVoidMethodExpression(methodCallExpression.getMethodCall().getIdentifier(), methodCallExpression.getLine()));
        }
        //TODO method prototype???

        methodCallExpression.getMethodCall().setReturnType(getMethodReturnTypes().get(methodCallExpression.getMethodCall().getIdentifier()));
        new MethodCallCompiler(methodCallExpression.getMethodCall(), level).run();
        switch (getMethodReturnTypes().get(methodCallExpression.getMethodCall().getIdentifier())) {
            case INT: return VariableType.INT;
            case BOOLEAN: return VariableType.BOOLEAN;
            default: return null;
        }
    }

    //TODO postfix

    //TODO prefix - includes negation

    private VariableType mulDivModInstructions(MulDivModExpression mulDivModExpression) {
        VariableType left = processExpression(mulDivModExpression.getLeftExpression());
        VariableType right = processExpression(mulDivModExpression.getRightExpression());

        if(left != VariableType.INT || right != VariableType.INT) {
            getErrorHandler().throwError(new ErrorMismatchTypesExpression(VariableType.INT.toString(), left.toString(), right.toString(), mulDivModExpression.getLine()));
        }

        addInstruction(PL0Instructions.OPR, 0, mulDivModExpression.getOperatorCode());

        return VariableType.INT;
    }

    private VariableType plusMinusInstructions(PlusMinusExpression plusMinusExpression) {
        VariableType left = processExpression(plusMinusExpression.getLeftExpression());
        VariableType right = processExpression(plusMinusExpression.getRightExpression());

        if(left != VariableType.INT || right != VariableType.INT) {
            getErrorHandler().throwError(new ErrorMismatchTypesExpression(VariableType.INT.toString(), left.toString(), right.toString(), plusMinusExpression.getLine()));
        }

        addInstruction(PL0Instructions.OPR, 0, plusMinusExpression.getOperatorCode());

        return VariableType.INT;
    }

    private VariableType relationalInstructions(RelationalExpression relationalExpression) {
        VariableType left = processExpression(relationalExpression.getLeftExpression());
        VariableType right = processExpression(relationalExpression.getRightExpression());

        if(left != VariableType.INT || right != VariableType.INT) {
            getErrorHandler().throwError(new ErrorMismatchTypesExpression(VariableType.INT.toString(), left.toString(), right.toString(), relationalExpression.getLine()));
        }

        addInstruction(PL0Instructions.OPR, 0, relationalExpression.getOperatorCode());

        return VariableType.BOOLEAN;
    }

    private VariableType compareInstructions(CompareExpression compareExpression) {
        VariableType left = processExpression(compareExpression.getLeftExpression());
        VariableType right = processExpression(compareExpression.getRightExpression());

        if(left != VariableType.INT || right != VariableType.INT) {
            getErrorHandler().throwError(new ErrorMismatchTypesExpression(VariableType.INT.toString(), left.toString(), right.toString(), compareExpression.getLine()));
        }

        addInstruction(PL0Instructions.OPR, 0, compareExpression.getOperatorCode());

        return VariableType.BOOLEAN;
    }

    private VariableType logicalInstructions(LogicalExpression logicalExpression)  {
        VariableType left = processExpression(logicalExpression.getLeftExpression());
        VariableType right = processExpression(logicalExpression.getRightExpression());

        if(left != VariableType.BOOLEAN || right != VariableType.BOOLEAN) {
            getErrorHandler().throwError(new ErrorMismatchTypesExpression(VariableType.BOOLEAN.toString(), left.toString(), right.toString(), logicalExpression.getLine()));
        }

        if (logicalExpression.getOperator() == Operator.AND) {
            this.addInstruction(PL0Instructions.OPR, 0, Operator.MULTIPLICATION.getCode());
            this.addInstruction(PL0Instructions.LIT, 0, 1);
            this.addInstruction(PL0Instructions.OPR, 0, Operator.EQUALS.getCode());
        }
        else {
            this.addInstruction(PL0Instructions.OPR, 0, Operator.PLUS.getCode());
            this.addInstruction(PL0Instructions.LIT, 0, 0);
            this.addInstruction(PL0Instructions.OPR, 0, Operator.GRATER_THAN.getCode());
        }

        return  VariableType.BOOLEAN;
    }

    private VariableType parenthesesInstructions(ParenthesesExpression parenthesesExpression) {
        return processExpression(parenthesesExpression.getExpression());
    }

    private VariableType assignInstructions(AssignExpression assignExpression) {
        Expression left = assignExpression.getLeft();
        if(left.getType() == ExpressionType.IDENTIFIER) {
            IdentifierExpression identifierExpression = (IdentifierExpression) left;
            String identifier = identifierExpression.getValue().toString();
            if(isInSymbolTable(identifier)) {
                SymbolTableItem symbolTableItem = getSymbolTable().getItem(identifier);
                if(symbolTableItem.isConstant()) {
                    getErrorHandler().throwError(new ErrorConstantAssigment(symbolTableItem.getName(), assignExpression.getLine()));
                }
                //addInstruction(PL0Instructions.LOD, level - symbolTableItem.getLevel(), symbolTableItem.getAddress());

                Expression right = assignExpression.getRight();
                if(right.getType() == ExpressionType.METHOD_CALL) {
                    MethodCallExpression methodCallExpression = (MethodCallExpression) right;
                    ReturnType type = symbolTableItem.getVariableType() == VariableType.INT ? ReturnType.INT : ReturnType.BOOLEAN;
                    methodCallExpression.getMethodCall().setReturnType(type);
                    new ExpressionCompiler(methodCallExpression, symbolTableItem.getVariableType(), level).run();
                }
                else {
                    right.setReturnType(symbolTableItem.getVariableType());
                    new ExpressionCompiler(right, symbolTableItem.getVariableType(), level).run();

                }
                addInstruction(PL0Instructions.STO, level - symbolTableItem.getLevel(), symbolTableItem.getAddress());
                return symbolTableItem.getVariableType();
            }
            else {
                getErrorHandler().throwError(new ErrorVariableNotExists(identifier, assignExpression.getLine()));
            }
        }
        return null;
    }
}
