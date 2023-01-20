package generated;
// Generated from GentleJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GentleJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		RULE_block = 7, RULE_methodBlock = 8, RULE_blockStatement = 9, RULE_localVariableDeclaration = 10, 
		RULE_methodDeclaration = 11, RULE_formalParameters = 12, RULE_formalParameterList = 13, 
		RULE_formalParameter = 14, RULE_variableDeclaratorId = 15, RULE_methodBody = 16, 
		RULE_statement = 17, RULE_braceStatement = 18, RULE_parExpression = 19, 
		RULE_expressionList = 20, RULE_expression = 21, RULE_forControl = 22, 
		RULE_forInit = 23, RULE_switchBlockStatementGroup = 24, RULE_switchLabel = 25, 
		RULE_methodCall = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"identifier", "typeTypeOrVoid", "typeType", "booleanValue", "possibleValues", 
			"variableModifier", "program", "block", "methodBlock", "blockStatement", 
			"localVariableDeclaration", "methodDeclaration", "formalParameters", 
			"formalParameterList", "formalParameter", "variableDeclaratorId", "methodBody", 
			"statement", "braceStatement", "parExpression", "expressionList", "expression", 
			"forControl", "forInit", "switchBlockStatementGroup", "switchLabel", 
			"methodCall"
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
	public String getGrammarFileName() { return "GentleJava.g4"; }

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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GentleJavaParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeTypeOrVoid);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GentleJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(GentleJavaParser.BOOLEAN, 0); }
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitTypeType(this);
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
			setState(60);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GentleJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GentleJavaParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBooleanValue(this);
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
			setState(62);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterPossibleValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitPossibleValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitPossibleValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleValuesContext possibleValues() throws RecognitionException {
		PossibleValuesContext _localctx = new PossibleValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_possibleValues);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(64);
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

				setState(67);
				match(NUMBER);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GentleJavaParser.CONST, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(75);
			match(LEFT_BRACE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << CONST) | (1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << LEFT_BRACE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(76);
				blockStatement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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

	public static class MethodBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBlockContext methodBlock() throws RecognitionException {
		MethodBlockContext _localctx = new MethodBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << LEFT_BRACE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockStatement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				localVariableDeclaration();
				setState(90);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
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
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_localVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(96);
				variableModifier();
				}
			}

			setState(99);
			typeType();
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				identifier();
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						match(ASSIGN);
						setState(102);
						identifier();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(108);
				match(ASSIGN);
				setState(109);
				expression(0);
				}
				break;
			case 2:
				{
				setState(111);
				identifier();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(112);
					match(ASSIGN);
					setState(113);
					expression(0);
					}
				}

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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			typeTypeOrVoid();
			setState(119);
			identifier();
			setState(120);
			formalParameters();
			setState(121);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LEFT_PARENTHESES);
			setState(124);
			formalParameterList();
			setState(125);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			formalParameter();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				formalParameter();
				}
				}
				setState(134);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			typeType();
			setState(136);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GentleJavaParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GentleJavaParser.RIGHT_BRACE, 0); }
		public MethodBlockContext methodBlock() {
			return getRuleContext(MethodBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(GentleJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodBody);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(LEFT_BRACE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << LEFT_BRACE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(141);
					methodBlock();
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(144);
					match(RETURN);
					setState(145);
					expression(0);
					setState(146);
					match(SEMICOLON);
					}
				}

				setState(150);
				match(RIGHT_BRACE);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
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
	public static class BlockLabelStatementContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockLabelStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBlockLabelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBlockLabelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBlockLabelStatement(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext statementExpression;
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				_localctx = new BlockLabelStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((BlockLabelStatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(IF);
				setState(156);
				parExpression();
				setState(157);
				braceStatement();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(158);
					match(ELSE);
					setState(159);
					braceStatement();
					}
				}

				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(FOR);
				setState(163);
				match(LEFT_PARENTHESES);
				setState(164);
				forControl();
				setState(165);
				match(RIGHT_PARENTHESES);
				setState(166);
				braceStatement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(WHILE);
				setState(169);
				parExpression();
				setState(170);
				braceStatement();
				}
				break;
			case DO:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(DO);
				setState(173);
				braceStatement();
				setState(174);
				match(WHILE);
				setState(175);
				parExpression();
				setState(176);
				match(SEMICOLON);
				}
				break;
			case SWITCH:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(SWITCH);
				setState(179);
				parExpression();
				setState(180);
				match(LEFT_BRACE);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(187);
					switchLabel();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(RIGHT_BRACE);
				}
				break;
			case REPEAT:
				_localctx = new RepeatStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				match(REPEAT);
				setState(196);
				braceStatement();
				setState(197);
				match(UNTIL);
				setState(198);
				parExpression();
				setState(199);
				match(SEMICOLON);
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
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				((ExpressionStatementContext)_localctx).statementExpression = expression(0);
				setState(202);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBraceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBraceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBraceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceStatementContext braceStatement() throws RecognitionException {
		BraceStatementContext _localctx = new BraceStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_braceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LEFT_BRACE);
			setState(207);
			statement();
			setState(208);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LEFT_PARENTHESES);
			setState(211);
			expression(0);
			setState(212);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expression(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				expression(0);
				}
				}
				setState(221);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMulDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMulDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMulDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public ParenthesesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpressionContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(GentleJavaParser.ASSIGN, 0); }
		public AssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PossibleValueExpressionContext extends ExpressionContext {
		public PossibleValuesContext possibleValues() {
			return getRuleContext(PossibleValuesContext.class,0);
		}
		public PossibleValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterPossibleValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitPossibleValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitPossibleValueExpression(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new PossibleValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(223);
				possibleValues();
				}
				break;
			case 2:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new MethodCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				methodCall();
				}
				break;
			case 4:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				((PrefixExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION))) != 0)) ) {
					((PrefixExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				expression(8);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(LEFT_PARENTHESES);
				setState(229);
				expression(0);
				setState(230);
				match(RIGHT_PARENTHESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235);
						((MulDivModExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
							((MulDivModExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(238);
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
						setState(239);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(241);
						((RelationalExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRATER_THAN) | (1L << GRATER_EQUAL_THAN) | (1L << LOWER_THAN) | (1L << LOWER_EQUAL_THAN))) != 0)) ) {
							((RelationalExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new CompareExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(244);
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
						setState(245);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(247);
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
						setState(248);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new AssignExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(250);
						((AssignExpressionContext)_localctx).bop = match(ASSIGN);
						setState(251);
						expression(1);
						}
						break;
					case 7:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253);
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
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << CONST) | (1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(259);
				forInit();
				}
			}

			setState(262);
			match(SEMICOLON);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(263);
				expression(0);
				}
			}

			setState(266);
			match(SEMICOLON);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(267);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forInit);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
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
				setState(271);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				switchLabel();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				blockStatement();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << CONST) | (1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << LEFT_BRACE) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchLabel);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(CASE);
				setState(285);
				match(NUMBER);
				setState(286);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(DEFAULT);
				setState(288);
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
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			identifier();
			setState(292);
			match(LEFT_PARENTHESES);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << INCREMENT) | (1L << MINUS) | (1L << DECREMENT) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(293);
				expressionList();
				}
			}

			setState(296);
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
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u012d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\5\3=\n\3\3\4\3\4\3\5\3"+
		"\5\3\6\5\6D\n\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tP\n\t\f\t"+
		"\16\tS\13\t\3\t\3\t\3\n\6\nX\n\n\r\n\16\nY\3\13\3\13\3\13\3\13\3\13\5"+
		"\13a\n\13\3\f\5\fd\n\f\3\f\3\f\3\f\3\f\7\fj\n\f\f\f\16\fm\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fu\n\f\5\fw\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088\13\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\5\22\u0091\n\22\3\22\3\22\3\22\3\22\5\22\u0097"+
		"\n\22\3\22\3\22\5\22\u009b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a3"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00b9\n\23\f\23\16\23\u00bc\13"+
		"\23\3\23\7\23\u00bf\n\23\f\23\16\23\u00c2\13\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00dc\n\26\f\26\16\26\u00df\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00eb\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0101\n\27\f\27\16\27\u0104\13\27"+
		"\3\30\5\30\u0107\n\30\3\30\3\30\5\30\u010b\n\30\3\30\3\30\5\30\u010f\n"+
		"\30\3\31\3\31\5\31\u0113\n\31\3\32\6\32\u0116\n\32\r\32\16\32\u0117\3"+
		"\32\6\32\u011b\n\32\r\32\16\32\u011c\3\33\3\33\3\33\3\33\3\33\5\33\u0124"+
		"\n\33\3\34\3\34\3\34\5\34\u0129\n\34\3\34\3\34\3\34\2\3,\35\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\13\3\2\3\4\3\2\24"+
		"\25\4\2\31\31\33\33\4\2\31\34((\3\2\26\30\3\2\35 \4\2!!\'\'\3\2#$\4\2"+
		"\32\32\34\34\2\u013e\28\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nG\3"+
		"\2\2\2\fI\3\2\2\2\16K\3\2\2\2\20M\3\2\2\2\22W\3\2\2\2\24`\3\2\2\2\26c"+
		"\3\2\2\2\30x\3\2\2\2\32}\3\2\2\2\34\u0081\3\2\2\2\36\u0089\3\2\2\2 \u008c"+
		"\3\2\2\2\"\u009a\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d4\3\2\2\2"+
		"*\u00d8\3\2\2\2,\u00ea\3\2\2\2.\u0106\3\2\2\2\60\u0112\3\2\2\2\62\u0115"+
		"\3\2\2\2\64\u0123\3\2\2\2\66\u0125\3\2\2\289\7\62\2\29\3\3\2\2\2:=\5\6"+
		"\4\2;=\7\17\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\t\2\2\2?\7\3\2\2\2@A"+
		"\t\3\2\2A\t\3\2\2\2BD\t\4\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EH\7\61\2\2"+
		"FH\5\b\5\2GC\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IJ\7\21\2\2J\r\3\2\2\2KL\5\20"+
		"\t\2L\17\3\2\2\2MQ\7+\2\2NP\5\24\13\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR"+
		"\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7,\2\2U\21\3\2\2\2VX\5$\23\2WV\3\2\2\2"+
		"XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\23\3\2\2\2[\\\5\26\f\2\\]\7/\2\2]a\3\2"+
		"\2\2^a\5\30\r\2_a\5$\23\2`[\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\25\3\2\2\2bd"+
		"\5\f\7\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ev\5\6\4\2fk\5\2\2\2gh\7\"\2\2h"+
		"j\5\2\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2"+
		"no\7\"\2\2op\5,\27\2pw\3\2\2\2qt\5\2\2\2rs\7\"\2\2su\5,\27\2tr\3\2\2\2"+
		"tu\3\2\2\2uw\3\2\2\2vf\3\2\2\2vq\3\2\2\2w\27\3\2\2\2xy\5\4\3\2yz\5\2\2"+
		"\2z{\5\32\16\2{|\5\"\22\2|\31\3\2\2\2}~\7)\2\2~\177\5\34\17\2\177\u0080"+
		"\7*\2\2\u0080\33\3\2\2\2\u0081\u0086\5\36\20\2\u0082\u0083\7\60\2\2\u0083"+
		"\u0085\5\36\20\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\35\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\5\6\4\2\u008a\u008b\5 \21\2\u008b\37\3\2\2\2\u008c\u008d\5\2\2"+
		"\2\u008d!\3\2\2\2\u008e\u0090\7+\2\2\u008f\u0091\5\22\n\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0093\7\20\2\2"+
		"\u0093\u0094\5,\27\2\u0094\u0095\7/\2\2\u0095\u0097\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\7,\2\2\u0099"+
		"\u009b\7/\2\2\u009a\u008e\3\2\2\2\u009a\u0099\3\2\2\2\u009b#\3\2\2\2\u009c"+
		"\u00cf\5\20\t\2\u009d\u009e\7\5\2\2\u009e\u009f\5(\25\2\u009f\u00a2\5"+
		"&\24\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3\5&\24\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00cf\3\2\2\2\u00a4\u00a5\7\n\2\2\u00a5\u00a6\7)"+
		"\2\2\u00a6\u00a7\5.\30\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\5&\24\2\u00a9"+
		"\u00cf\3\2\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad\5"+
		"&\24\2\u00ad\u00cf\3\2\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\5&\24\2\u00b0"+
		"\u00b1\7\13\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\7/\2\2\u00b3\u00cf\3\2"+
		"\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5(\25\2\u00b6\u00ba\7+\2\2\u00b7"+
		"\u00b9\5\62\32\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00bf\5\64\33\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7,\2\2\u00c4\u00cf\3\2\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\5&\24"+
		"\2\u00c7\u00c8\7\16\2\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\7/\2\2\u00ca\u00cf"+
		"\3\2\2\2\u00cb\u00cc\5,\27\2\u00cc\u00cd\7/\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u009c\3\2\2\2\u00ce\u009d\3\2\2\2\u00ce\u00a4\3\2\2\2\u00ce\u00aa\3\2"+
		"\2\2\u00ce\u00ae\3\2\2\2\u00ce\u00b4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1\u00d2\5$\23\2\u00d2"+
		"\u00d3\7,\2\2\u00d3\'\3\2\2\2\u00d4\u00d5\7)\2\2\u00d5\u00d6\5,\27\2\u00d6"+
		"\u00d7\7*\2\2\u00d7)\3\2\2\2\u00d8\u00dd\5,\27\2\u00d9\u00da\7\60\2\2"+
		"\u00da\u00dc\5,\27\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de+\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\b\27\1\2\u00e1\u00eb\5\n\6\2\u00e2\u00eb\5\2\2\2\u00e3\u00eb\5"+
		"\66\34\2\u00e4\u00e5\t\5\2\2\u00e5\u00eb\5,\27\n\u00e6\u00e7\7)\2\2\u00e7"+
		"\u00e8\5,\27\2\u00e8\u00e9\7*\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e0\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00eb\u0102\3\2\2\2\u00ec\u00ed\f\t\2\2\u00ed\u00ee\t\6"+
		"\2\2\u00ee\u0101\5,\27\n\u00ef\u00f0\f\b\2\2\u00f0\u00f1\t\4\2\2\u00f1"+
		"\u0101\5,\27\t\u00f2\u00f3\f\7\2\2\u00f3\u00f4\t\7\2\2\u00f4\u0101\5,"+
		"\27\b\u00f5\u00f6\f\6\2\2\u00f6\u00f7\t\b\2\2\u00f7\u0101\5,\27\7\u00f8"+
		"\u00f9\f\5\2\2\u00f9\u00fa\t\t\2\2\u00fa\u0101\5,\27\6\u00fb\u00fc\f\3"+
		"\2\2\u00fc\u00fd\7\"\2\2\u00fd\u0101\5,\27\3\u00fe\u00ff\f\13\2\2\u00ff"+
		"\u0101\t\n\2\2\u0100\u00ec\3\2\2\2\u0100\u00ef\3\2\2\2\u0100\u00f2\3\2"+
		"\2\2\u0100\u00f5\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fb\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103-\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\5\60\31\2\u0106\u0105"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\7/\2\2\u0109"+
		"\u010b\5,\27\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\7/\2\2\u010d\u010f\5*\26\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f/\3\2\2\2\u0110\u0113\5\26\f\2\u0111\u0113\5*\26\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\61\3\2\2\2\u0114\u0116"+
		"\5\64\33\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\5\24\13\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\63\3\2\2\2\u011e\u011f\7\b\2\2\u011f\u0120\7\61\2\2\u0120\u0124\7&\2"+
		"\2\u0121\u0122\7\t\2\2\u0122\u0124\7&\2\2\u0123\u011e\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\65\3\2\2\2\u0125\u0126\5\2\2\2\u0126\u0128\7)\2\2\u0127"+
		"\u0129\5*\26\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\7*\2\2\u012b\67\3\2\2\2 <CGQY`cktv\u0086\u0090\u0096"+
		"\u009a\u00a2\u00ba\u00c0\u00ce\u00dd\u00ea\u0100\u0102\u0106\u010a\u010e"+
		"\u0112\u0117\u011c\u0123\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}