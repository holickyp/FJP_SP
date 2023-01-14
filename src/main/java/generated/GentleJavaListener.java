package generated;
// Generated from GentleJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GentleJavaParser}.
 */
public interface GentleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GentleJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GentleJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(GentleJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(GentleJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(GentleJavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(GentleJavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(GentleJavaParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(GentleJavaParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void enterPossibleValues(GentleJavaParser.PossibleValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void exitPossibleValues(GentleJavaParser.PossibleValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(GentleJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(GentleJavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GentleJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GentleJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GentleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GentleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#methodBlock}.
	 * @param ctx the parse tree
	 */
	void enterMethodBlock(GentleJavaParser.MethodBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#methodBlock}.
	 * @param ctx the parse tree
	 */
	void exitMethodBlock(GentleJavaParser.MethodBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GentleJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GentleJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(GentleJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(GentleJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(GentleJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(GentleJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(GentleJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(GentleJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(GentleJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(GentleJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(GentleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(GentleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(GentleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(GentleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(GentleJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(GentleJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(GentleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(GentleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockLabelStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockLabelStatement(GentleJavaParser.BlockLabelStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockLabelStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockLabelStatement(GentleJavaParser.BlockLabelStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GentleJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GentleJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GentleJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GentleJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GentleJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GentleJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(GentleJavaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(GentleJavaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(GentleJavaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(GentleJavaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(GentleJavaParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(GentleJavaParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#braceStatement}.
	 * @param ctx the parse tree
	 */
	void enterBraceStatement(GentleJavaParser.BraceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#braceStatement}.
	 * @param ctx the parse tree
	 */
	void exitBraceStatement(GentleJavaParser.BraceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(GentleJavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(GentleJavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GentleJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GentleJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(GentleJavaParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(GentleJavaParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivModExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpression(GentleJavaParser.MulDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivModExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpression(GentleJavaParser.MulDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(GentleJavaParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(GentleJavaParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(GentleJavaParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(GentleJavaParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpression(GentleJavaParser.PlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpression(GentleJavaParser.PlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(GentleJavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(GentleJavaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(GentleJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(GentleJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(GentleJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(GentleJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(GentleJavaParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(GentleJavaParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(GentleJavaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(GentleJavaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code possibleValueExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPossibleValueExpression(GentleJavaParser.PossibleValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code possibleValueExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPossibleValueExpression(GentleJavaParser.PossibleValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(GentleJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(GentleJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GentleJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GentleJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(GentleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(GentleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(GentleJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(GentleJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GentleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(GentleJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GentleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(GentleJavaParser.MethodCallContext ctx);
}