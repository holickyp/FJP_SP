package generated;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GentleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GentleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GentleJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(GentleJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(GentleJavaParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(GentleJavaParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleValues(GentleJavaParser.PossibleValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(GentleJavaParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GentleJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GentleJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GentleJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(GentleJavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(GentleJavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(GentleJavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(GentleJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(GentleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(GentleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(GentleJavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(GentleJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockLabelStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLabelStatement(GentleJavaParser.BlockLabelStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GentleJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GentleJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GentleJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(GentleJavaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(GentleJavaParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatStatement}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(GentleJavaParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#braceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceStatement(GentleJavaParser.BraceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(GentleJavaParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GentleJavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(GentleJavaParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivModExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpression(GentleJavaParser.MulDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(GentleJavaParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(GentleJavaParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpression(GentleJavaParser.PlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(GentleJavaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(GentleJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(GentleJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(GentleJavaParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(GentleJavaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code possibleValueExpression}
	 * labeled alternative in {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleValueExpression(GentleJavaParser.PossibleValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(GentleJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GentleJavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(GentleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(GentleJavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(GentleJavaParser.MethodCallContext ctx);
}