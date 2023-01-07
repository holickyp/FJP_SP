package generated;

// Generated from GentleJava.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link GentleJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReturnType(GentleJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(GentleJavaParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#possibleTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleTypes(GentleJavaParser.PossibleTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalSymbol(GentleJavaParser.DecimalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GentleJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleValues(GentleJavaParser.PossibleValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVariable(GentleJavaParser.DecimalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(GentleJavaParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(GentleJavaParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(GentleJavaParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GentleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVariableDeclaration(GentleJavaParser.ConstVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GentleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalelDeclaration(GentleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#variableAssigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssigment(GentleJavaParser.VariableAssigmentContext ctx);
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
	 * Visit a parse tree produced by {@link GentleJavaParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GentleJavaParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GentleJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(GentleJavaParser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(GentleJavaParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(GentleJavaParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(GentleJavaParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(GentleJavaParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(GentleJavaParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRepeat(GentleJavaParser.StatementRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethodCall(GentleJavaParser.StatementMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssigment(GentleJavaParser.StatementAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link GentleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVariableDeclaration(GentleJavaParser.StatementVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GentleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(GentleJavaParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(GentleJavaParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdditive(GentleJavaParser.ExprAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(GentleJavaParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(GentleJavaParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(GentleJavaParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(GentleJavaParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPossibleValue(GentleJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMethodCall(GentleJavaParser.ExprMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(GentleJavaParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link GentleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultipli(GentleJavaParser.ExprMultipliContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(GentleJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatement(GentleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GentleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(GentleJavaParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(GentleJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(GentleJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GentleJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParameter(GentleJavaParser.MethodCallParameterContext ctx);
}