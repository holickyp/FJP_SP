package generated;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GentleJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INT=2, IF=3, ELSE=4, SWITCH=5, CASE=6, DEFAULT=7, FOR=8, WHILE=9, 
		DO=10, REPEAT=11, UNTIL=12, VOID=13, RETURN=14, CONST=15, VARIABLE_KEYWORD=16, 
		FUNCTION_KEYWORD=17, TRUE=18, FALSE=19, MULTIPLICATION=20, DIVISION=21, 
		MODULO=22, PLUS=23, INCREMENT=24, MINUS=25, DECREMENT=26, GRATER_THAN=27, 
		GRATER_EQUAL_THAN=28, LOWER_THAN=29, LOWER_EQUAL_THAN=30, EQUALS=31, ASSIGN=32, 
		AND=33, OR=34, QUESTION=35, COLON=36, NOT_EQUALS=37, NEGATION=38, LEFT_PARENTHESES=39, 
		RIGHT_PARENTHESES=40, LEFT_BRACE=41, RIGHT_BRACE=42, LEFT_BRACKET=43, 
		RIGHT_BRACKET=44, SEMICOLON=45, COMMA=46, NUMBER=47, IDENTIFIER=48, WHITESPACE=49, 
		LINE_COMMENT=50;
	public static final int
		RULE_identifier = 0, RULE_typeTypeOrVoid = 1, RULE_typeType = 2, RULE_booleanValue = 3, 
		RULE_possibleValues = 4, RULE_variableModifier = 5, RULE_program = 6, 
		RULE_block = 7, RULE_blockStatement = 8, RULE_localVariableDeclaration = 9, 
		RULE_methodDeclaration = 10, RULE_formalParameters = 11, RULE_formalParameterList = 12, 
		RULE_formalParameter = 13, RULE_variableDeclarators = 14, RULE_variableDeclarator = 15, 
		RULE_variableDeclaratorId = 16, RULE_variableInitializer = 17, RULE_methodBody = 18, 
		RULE_statement = 19, RULE_braceStatement = 20, RULE_parExpression = 21, 
		RULE_expressionList = 22, RULE_expression = 23, RULE_forControl = 24, 
		RULE_forInit = 25, RULE_switchBlockStatementGroup = 26, RULE_switchLabel = 27, 
		RULE_methodCall = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "typeTypeOrVoid", "typeType", "booleanValue", "possibleValues", 
			"variableModifier", "program", "block", "blockStatement", "localVariableDeclaration", 
			"methodDeclaration", "formalParameters", "formalParameterList", "formalParameter", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "methodBody", "statement", "braceStatement", "parExpression", 
			"expressionList", "expression", "forControl", "forInit", "switchBlockStatementGroup", 
			"switchLabel", "methodCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'int'", "'consider'", "'nevertheless'", "'switch'", 
			"'case'", "'default'", "'discuss'", "'whilst'", "'perform'", "'reiterate'", 
			"'till'", "'void'", "'thanks'", "'final'", "'introduce'", "'please'", 
			"'correct'", "'incorrect'", "'*'", "'/'", "'%'", "'+'", "'++'", "'-'", 
			"'--'", "'>'", "'>='", "'<'", "'<='", "'=='", "'='", "'&&'", "'||'", 
			"'?'", "':'", "'!='", "'!'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "FOR", 
			"WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "VARIABLE_KEYWORD", 
			"FUNCTION_KEYWORD", "TRUE", "FALSE", "MULTIPLICATION", "DIVISION", "MODULO", 
			"PLUS", "INCREMENT", "MINUS", "DECREMENT", "GRATER_THAN", "GRATER_EQUAL_THAN", 
			"LOWER_THAN", "LOWER_EQUAL_THAN", "EQUALS", "ASSIGN", "AND", "OR", "QUESTION", 
			"COLON", "NOT_EQUALS", "NEGATION", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "SEMICOLON", 
			"COMMA", "NUMBER", "IDENTIFIER", "WHITESPACE", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GentleJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GentleJavaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GentleJavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeTypeOrVoid);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GentleJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(GentleJavaParser.BOOLEAN, 0); }
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GentleJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GentleJavaParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PossibleValuesContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GentleJavaParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(GentleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GentleJavaParser.MINUS, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public PossibleValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterPossibleValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitPossibleValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitPossibleValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleValuesContext possibleValues() throws RecognitionException {
		PossibleValuesContext _localctx = new PossibleValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_possibleValues);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(68);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(71);
				match(NUMBER);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				booleanValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GentleJavaParser.CONST, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GentleJavaParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GentleJavaParser.RIGHT_BRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LEFT_BRACE);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023300398L) != 0) {
				{
				{
				setState(80);
				blockStatement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				localVariableDeclaration();
				setState(89);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(GentleJavaParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(GentleJavaParser.ASSIGN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(95);
				variableModifier();
				}
			}

			setState(98);
			typeType();
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(99);
				identifier();
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						match(ASSIGN);
						setState(101);
						identifier();
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(107);
				match(ASSIGN);
				setState(108);
				expression(0);
				}
				break;
			case 2:
				{
				setState(110);
				variableDeclarators();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			typeTypeOrVoid();
			setState(114);
			identifier();
			setState(115);
			formalParameters();
			setState(116);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LEFT_PARENTHESES);
			setState(119);
			formalParameterList();
			setState(120);
			match(RIGHT_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GentleJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GentleJavaParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			formalParameter();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				formalParameter();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			typeType();
			setState(131);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			variableDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GentleJavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			variableDeclaratorId();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(136);
				match(ASSIGN);
				setState(137);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodBody);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockLabelStatementContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockLabelStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterBlockLabelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitBlockLabelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitBlockLabelStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(GentleJavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public BraceStatementContext braceStatement() {
			return getRuleContext(BraceStatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends StatementContext {
		public TerminalNode REPEAT() { return getToken(GentleJavaParser.REPEAT, 0); }
		public BraceStatementContext braceStatement() {
			return getRuleContext(BraceStatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(GentleJavaParser.UNTIL, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public RepeatStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(GentleJavaParser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public BraceStatementContext braceStatement() {
			return getRuleContext(BraceStatementContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends StatementContext {
		public TerminalNode DO() { return getToken(GentleJavaParser.DO, 0); }
		public BraceStatementContext braceStatement() {
			return getRuleContext(BraceStatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GentleJavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(GentleJavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<BraceStatementContext> braceStatement() {
			return getRuleContexts(BraceStatementContext.class);
		}
		public BraceStatementContext braceStatement(int i) {
			return getRuleContext(BraceStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GentleJavaParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(GentleJavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GentleJavaParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GentleJavaParser.RIGHT_BRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				_localctx = new BlockLabelStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((BlockLabelStatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(IF);
				setState(150);
				parExpression();
				setState(151);
				braceStatement();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(152);
					match(ELSE);
					setState(153);
					braceStatement();
					}
				}

				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(FOR);
				setState(157);
				match(LEFT_PARENTHESES);
				setState(158);
				forControl();
				setState(159);
				match(RIGHT_PARENTHESES);
				setState(160);
				braceStatement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(WHILE);
				setState(163);
				parExpression();
				setState(164);
				braceStatement();
				}
				break;
			case DO:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(DO);
				setState(167);
				braceStatement();
				setState(168);
				match(WHILE);
				setState(169);
				parExpression();
				setState(170);
				match(SEMICOLON);
				}
				break;
			case SWITCH:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(SWITCH);
				setState(173);
				parExpression();
				setState(174);
				match(LEFT_BRACE);
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(181);
					switchLabel();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(RIGHT_BRACE);
				}
				break;
			case REPEAT:
				_localctx = new RepeatStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(REPEAT);
				setState(190);
				braceStatement();
				setState(191);
				match(UNTIL);
				setState(192);
				parExpression();
				setState(193);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BraceStatementContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GentleJavaParser.LEFT_BRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(GentleJavaParser.RIGHT_BRACE, 0); }
		public BraceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterBraceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitBraceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitBraceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceStatementContext braceStatement() throws RecognitionException {
		BraceStatementContext _localctx = new BraceStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_braceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LEFT_BRACE);
			setState(198);
			statement();
			setState(199);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LEFT_PARENTHESES);
			setState(202);
			expression(0);
			setState(203);
			match(RIGHT_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GentleJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GentleJavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expression(0);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				expression(0);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(GentleJavaParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(GentleJavaParser.NOT_EQUALS, 0); }
		public CompareExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(GentleJavaParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(GentleJavaParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(GentleJavaParser.MODULO, 0); }
		public MulDivModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterMulDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitMulDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitMulDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public ParenthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExpressionContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(GentleJavaParser.NEGATION, 0); }
		public TerminalNode PLUS() { return getToken(GentleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GentleJavaParser.MINUS, 0); }
		public TerminalNode INCREMENT() { return getToken(GentleJavaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(GentleJavaParser.DECREMENT, 0); }
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GentleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GentleJavaParser.MINUS, 0); }
		public PlusMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOWER_EQUAL_THAN() { return getToken(GentleJavaParser.LOWER_EQUAL_THAN, 0); }
		public TerminalNode GRATER_EQUAL_THAN() { return getToken(GentleJavaParser.GRATER_EQUAL_THAN, 0); }
		public TerminalNode LOWER_THAN() { return getToken(GentleJavaParser.LOWER_THAN, 0); }
		public TerminalNode GRATER_THAN() { return getToken(GentleJavaParser.GRATER_THAN, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExpressionContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(GentleJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(GentleJavaParser.OR, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(GentleJavaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(GentleJavaParser.DECREMENT, 0); }
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PossibleValueExpressionContext extends ExpressionContext {
		public PossibleValuesContext possibleValues() {
			return getRuleContext(PossibleValuesContext.class,0);
		}
		public PossibleValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterPossibleValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitPossibleValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitPossibleValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new PossibleValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214);
				possibleValues();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				methodCall();
				}
				break;
			case 4:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				((PrefixExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 275003736064L) != 0) ) {
					((PrefixExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				expression(7);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LEFT_PARENTHESES);
				setState(220);
				expression(0);
				setState(221);
				match(RIGHT_PARENTHESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						((MulDivModExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0) ) {
							((MulDivModExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(229);
						((PlusMinusExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(232);
						((RelationalExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0) ) {
							((RelationalExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						((CompareExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
							((CompareExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(238);
						((LogicalExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicalExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(241);
						((PostfixExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
							((PostfixExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public List<TerminalNode> SEMICOLON() { return getTokens(GentleJavaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GentleJavaParser.SEMICOLON, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 423037225435142L) != 0) {
				{
				setState(247);
				forInit();
				}
			}

			setState(250);
			match(SEMICOLON);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 423037225402368L) != 0) {
				{
				setState(251);
				expression(0);
				}
			}

			setState(254);
			match(SEMICOLON);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 423037225402368L) != 0) {
				{
				setState(255);
				((ForControlContext)_localctx).forUpdate = expressionList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forInit);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				localVariableDeclaration();
				}
				break;
			case TRUE:
			case FALSE:
			case PLUS:
			case INCREMENT:
			case MINUS:
			case DECREMENT:
			case NEGATION:
			case LEFT_PARENTHESES:
			case NUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				switchLabel();
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				blockStatement();
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023300398L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GentleJavaParser.CASE, 0); }
		public TerminalNode NUMBER() { return getToken(GentleJavaParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(GentleJavaParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(GentleJavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchLabel);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(CASE);
				setState(273);
				match(NUMBER);
				setState(274);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(DEFAULT);
				setState(276);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener) ((GentleJavaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			identifier();
			setState(280);
			match(LEFT_PARENTHESES);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 423037225402368L) != 0) {
				{
				setState(281);
				expressionList();
				}
			}

			setState(284);
			match(RIGHT_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u011f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0003\u0004F\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"J\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007R\b\u0007\n\u0007\f\u0007U\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b^\b\b\u0001"+
		"\t\u0003\ta\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tg\b\t\n\t\f\tj"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tp\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f~\b\f\n\f\f\f\u0081\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u008b\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0093\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u009b\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00b1\b\u0013\n\u0013\f\u0013\u00b4\t\u0013\u0001"+
		"\u0013\u0005\u0013\u00b7\b\u0013\n\u0013\f\u0013\u00ba\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00c4\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u00d1\b\u0016\n\u0016\f\u0016\u00d4"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00e0"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00f3\b\u0017\n\u0017\f\u0017\u00f6\t\u0017\u0001\u0018\u0003\u0018"+
		"\u00f9\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00fd\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0101\b\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0105\b\u0019\u0001\u001a\u0004\u001a\u0108\b\u001a\u000b\u001a"+
		"\f\u001a\u0109\u0001\u001a\u0004\u001a\u010d\b\u001a\u000b\u001a\f\u001a"+
		"\u010e\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0116\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u011b"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0001.\u001d\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468\u0000\t\u0001\u0000\u0001\u0002\u0001\u0000\u0012"+
		"\u0013\u0002\u0000\u0017\u0017\u0019\u0019\u0002\u0000\u0017\u001a&&\u0001"+
		"\u0000\u0014\u0016\u0001\u0000\u001b\u001e\u0002\u0000\u001f\u001f%%\u0001"+
		"\u0000!\"\u0002\u0000\u0018\u0018\u001a\u001a\u0129\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000"+
		"\u0006B\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nK\u0001\u0000"+
		"\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000"+
		"\u0010]\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014q"+
		"\u0001\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018z\u0001\u0000"+
		"\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0085\u0001\u0000"+
		"\u0000\u0000\u001e\u0087\u0001\u0000\u0000\u0000 \u008c\u0001\u0000\u0000"+
		"\u0000\"\u008e\u0001\u0000\u0000\u0000$\u0092\u0001\u0000\u0000\u0000"+
		"&\u00c3\u0001\u0000\u0000\u0000(\u00c5\u0001\u0000\u0000\u0000*\u00c9"+
		"\u0001\u0000\u0000\u0000,\u00cd\u0001\u0000\u0000\u0000.\u00df\u0001\u0000"+
		"\u0000\u00000\u00f8\u0001\u0000\u0000\u00002\u0104\u0001\u0000\u0000\u0000"+
		"4\u0107\u0001\u0000\u0000\u00006\u0115\u0001\u0000\u0000\u00008\u0117"+
		"\u0001\u0000\u0000\u0000:;\u00050\u0000\u0000;\u0001\u0001\u0000\u0000"+
		"\u0000<?\u0003\u0004\u0002\u0000=?\u0005\r\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0007"+
		"\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0007\u0001\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DF\u0007\u0002\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GJ\u0005/\u0000\u0000HJ\u0003\u0006\u0003\u0000IE\u0001\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0005\u000f\u0000"+
		"\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0003\u000e\u0007\u0000N\r\u0001"+
		"\u0000\u0000\u0000OS\u0005)\u0000\u0000PR\u0003\u0010\b\u0000QP\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VW\u0005*\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0003\u0012"+
		"\t\u0000YZ\u0005-\u0000\u0000Z^\u0001\u0000\u0000\u0000[^\u0003\u0014"+
		"\n\u0000\\^\u0003&\u0013\u0000]X\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0011\u0001\u0000\u0000\u0000"+
		"_a\u0003\n\u0005\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bo\u0003\u0004\u0002\u0000ch\u0003\u0000\u0000"+
		"\u0000de\u0005 \u0000\u0000eg\u0003\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005"+
		" \u0000\u0000lm\u0003.\u0017\u0000mp\u0001\u0000\u0000\u0000np\u0003\u001c"+
		"\u000e\u0000oc\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u0013"+
		"\u0001\u0000\u0000\u0000qr\u0003\u0002\u0001\u0000rs\u0003\u0000\u0000"+
		"\u0000st\u0003\u0016\u000b\u0000tu\u0003$\u0012\u0000u\u0015\u0001\u0000"+
		"\u0000\u0000vw\u0005\'\u0000\u0000wx\u0003\u0018\f\u0000xy\u0005(\u0000"+
		"\u0000y\u0017\u0001\u0000\u0000\u0000z\u007f\u0003\u001a\r\u0000{|\u0005"+
		".\u0000\u0000|~\u0003\u001a\r\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0019\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0003\u0004\u0002\u0000\u0083\u0084\u0003 \u0010"+
		"\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u001e\u000f"+
		"\u0000\u0086\u001d\u0001\u0000\u0000\u0000\u0087\u008a\u0003 \u0010\u0000"+
		"\u0088\u0089\u0005 \u0000\u0000\u0089\u008b\u0003\"\u0011\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u001f\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0000\u0000\u0000\u008d"+
		"!\u0001\u0000\u0000\u0000\u008e\u008f\u0003.\u0017\u0000\u008f#\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0003\u000e\u0007\u0000\u0091\u0093\u0005"+
		"-\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093%\u0001\u0000\u0000\u0000\u0094\u00c4\u0003\u000e\u0007"+
		"\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0003*\u0015\u0000"+
		"\u0097\u009a\u0003(\u0014\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099"+
		"\u009b\u0003(\u0014\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u00c4\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\b\u0000\u0000\u009d\u009e\u0005\'\u0000\u0000\u009e\u009f\u0003"+
		"0\u0018\u0000\u009f\u00a0\u0005(\u0000\u0000\u00a0\u00a1\u0003(\u0014"+
		"\u0000\u00a1\u00c4\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\t\u0000\u0000"+
		"\u00a3\u00a4\u0003*\u0015\u0000\u00a4\u00a5\u0003(\u0014\u0000\u00a5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u00a8\u0003"+
		"(\u0014\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa\u0003*\u0015"+
		"\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00ab\u00c4\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0005\u0000\u0000\u00ad\u00ae\u0003*\u0015\u0000\u00ae"+
		"\u00b2\u0005)\u0000\u0000\u00af\u00b1\u00034\u001a\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003"+
		"6\u001b\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005*\u0000\u0000\u00bc\u00c4\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005\u000b\u0000\u0000\u00be\u00bf\u0003(\u0014\u0000"+
		"\u00bf\u00c0\u0005\f\u0000\u0000\u00c0\u00c1\u0003*\u0015\u0000\u00c1"+
		"\u00c2\u0005-\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u0094"+
		"\u0001\u0000\u0000\u0000\u00c3\u0095\u0001\u0000\u0000\u0000\u00c3\u009c"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a2\u0001\u0000\u0000\u0000\u00c3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00c3\u00ac\u0001\u0000\u0000\u0000\u00c3\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c4\'\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		")\u0000\u0000\u00c6\u00c7\u0003&\u0013\u0000\u00c7\u00c8\u0005*\u0000"+
		"\u0000\u00c8)\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\'\u0000\u0000"+
		"\u00ca\u00cb\u0003.\u0017\u0000\u00cb\u00cc\u0005(\u0000\u0000\u00cc+"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003.\u0017\u0000\u00ce\u00cf\u0005"+
		".\u0000\u0000\u00cf\u00d1\u0003.\u0017\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3-\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\u0017\uffff\uffff"+
		"\u0000\u00d6\u00e0\u0003\b\u0004\u0000\u00d7\u00e0\u0003\u0000\u0000\u0000"+
		"\u00d8\u00e0\u00038\u001c\u0000\u00d9\u00da\u0007\u0003\u0000\u0000\u00da"+
		"\u00e0\u0003.\u0017\u0007\u00db\u00dc\u0005\'\u0000\u0000\u00dc\u00dd"+
		"\u0003.\u0017\u0000\u00dd\u00de\u0005(\u0000\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00d5\u0001\u0000\u0000\u0000\u00df\u00d7\u0001\u0000"+
		"\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000"+
		"\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00e0\u00f4\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\n\u0006\u0000\u0000\u00e2\u00e3\u0007\u0004\u0000"+
		"\u0000\u00e3\u00f3\u0003.\u0017\u0007\u00e4\u00e5\n\u0005\u0000\u0000"+
		"\u00e5\u00e6\u0007\u0002\u0000\u0000\u00e6\u00f3\u0003.\u0017\u0006\u00e7"+
		"\u00e8\n\u0004\u0000\u0000\u00e8\u00e9\u0007\u0005\u0000\u0000\u00e9\u00f3"+
		"\u0003.\u0017\u0005\u00ea\u00eb\n\u0003\u0000\u0000\u00eb\u00ec\u0007"+
		"\u0006\u0000\u0000\u00ec\u00f3\u0003.\u0017\u0004\u00ed\u00ee\n\u0002"+
		"\u0000\u0000\u00ee\u00ef\u0007\u0007\u0000\u0000\u00ef\u00f3\u0003.\u0017"+
		"\u0003\u00f0\u00f1\n\b\u0000\u0000\u00f1\u00f3\u0007\b\u0000\u0000\u00f2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00f2\u00e4\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e7\u0001\u0000\u0000\u0000\u00f2\u00ea\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5/\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u00032\u0019\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0005-\u0000\u0000\u00fb\u00fd\u0003.\u0017"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0005-\u0000\u0000"+
		"\u00ff\u0101\u0003,\u0016\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u01011\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0003\u0012\t\u0000\u0103\u0105\u0003,\u0016\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u01053\u0001\u0000"+
		"\u0000\u0000\u0106\u0108\u00036\u001b\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000"+
		"\u0000\u010b\u010d\u0003\u0010\b\u0000\u010c\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f5\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u0006\u0000\u0000\u0111\u0112\u0005/\u0000\u0000\u0112\u0116"+
		"\u0005$\u0000\u0000\u0113\u0114\u0005\u0007\u0000\u0000\u0114\u0116\u0005"+
		"$\u0000\u0000\u0115\u0110\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u01167\u0001\u0000\u0000\u0000\u0117\u0118\u0003\u0000\u0000"+
		"\u0000\u0118\u011a\u0005\'\u0000\u0000\u0119\u011b\u0003,\u0016\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005(\u0000\u0000\u011d"+
		"9\u0001\u0000\u0000\u0000\u001b>EIS]`ho\u007f\u008a\u0092\u009a\u00b2"+
		"\u00b8\u00c3\u00d2\u00df\u00f2\u00f4\u00f8\u00fc\u0100\u0104\u0109\u010e"+
		"\u0115\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}