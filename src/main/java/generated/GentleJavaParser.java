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
		T__0=1, BOOLEAN=2, INT=3, IF=4, ELSE=5, SWITCH=6, CASE=7, DEFAULT=8, FOR=9, 
		WHILE=10, DO=11, REPEAT=12, UNTIL=13, VOID=14, RETURN=15, CONST=16, FUNCTION_KEYWORD=17, 
		TRUE=18, FALSE=19, MULT=20, DIV=21, MOD=22, PLUS=23, MINUS=24, GT=25, 
		GE=26, LT=27, LE=28, SAME=29, EQ=30, AND=31, OR=32, QUESTION=33, COLON=34, 
		NOT_EQ=35, NEGATION=36, LEFT_PARENTHESES=37, RIGHT_PARENTHESES=38, LEFT_BRACE=39, 
		RIGHT_BRACE=40, LEFT_BRACKET=41, RIGHT_BRACKET=42, SEMICOLON=43, COMMA=44, 
		WORD=45, DECIMAL=46, WHITESPACE=47, LINE_COMMENT=48;
	public static final int
		RULE_methodReturnType = 0, RULE_booleanValue = 1, RULE_possibleTypes = 2, 
		RULE_decimalSymbol = 3, RULE_identifier = 4, RULE_possibleValues = 5, 
		RULE_decimalVariable = 6, RULE_decimalValue = 7, RULE_boolVariable = 8, 
		RULE_boolValue = 9, RULE_localVariableDeclaration = 10, RULE_constVariableDeclaration = 11, 
		RULE_variableDeclaration = 12, RULE_paralelDeclaration = 13, RULE_variableAssigment = 14, 
		RULE_program = 15, RULE_block = 16, RULE_body = 17, RULE_blockStatement = 18, 
		RULE_blockBody = 19, RULE_statement = 20, RULE_expression = 21, RULE_expressionBody = 22, 
		RULE_forControl = 23, RULE_switchBlockStatement = 24, RULE_methodDeclaration = 25, 
		RULE_methodParameter = 26, RULE_methodBody = 27, RULE_methodCall = 28, 
		RULE_methodCallParameter = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"methodReturnType", "booleanValue", "possibleTypes", "decimalSymbol", 
			"identifier", "possibleValues", "decimalVariable", "decimalValue", "boolVariable", 
			"boolValue", "localVariableDeclaration", "constVariableDeclaration", 
			"variableDeclaration", "paralelDeclaration", "variableAssigment", "program", 
			"block", "body", "blockStatement", "blockBody", "statement", "expression", 
			"expressionBody", "forControl", "switchBlockStatement", "methodDeclaration", 
			"methodParameter", "methodBody", "methodCall", "methodCallParameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'boolean'", "'int'", "'consider'", "'nevertheless'", 
			"'switch'", "'case'", "'default'", "'discuss'", "'whilst'", "'perform'", 
			"'reiterate'", "'till'", "'void'", "'thanks'", "'const'", "'function'", 
			"'correct'", "'incorrect'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", 
			"'>='", "'<'", "'<='", "'=='", "'='", "'&&'", "'||'", "'?'", "':'", "'!='", 
			"'!'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "NEGATION", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "SEMICOLON", "COMMA", "WORD", "DECIMAL", 
			"WHITESPACE", "LINE_COMMENT"
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
	public static class MethodReturnTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GentleJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(GentleJavaParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(GentleJavaParser.VOID, 0); }
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_methodReturnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << VOID))) != 0)) ) {
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
		enterRule(_localctx, 2, RULE_booleanValue);
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

	public static class PossibleTypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GentleJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(GentleJavaParser.BOOLEAN, 0); }
		public PossibleTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_possibleTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterPossibleTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitPossibleTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitPossibleTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PossibleTypesContext possibleTypes() throws RecognitionException {
		PossibleTypesContext _localctx = new PossibleTypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_possibleTypes);
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

	public static class DecimalSymbolContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GentleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GentleJavaParser.MINUS, 0); }
		public DecimalSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterDecimalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitDecimalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitDecimalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalSymbolContext decimalSymbol() throws RecognitionException {
		DecimalSymbolContext _localctx = new DecimalSymbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decimalSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(GentleJavaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GentleJavaParser.WORD, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(GentleJavaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(GentleJavaParser.DECIMAL, i);
		}
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
		enterRule(_localctx, 8, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(WORD);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					_la = _input.LA(1);
					if ( !(_la==WORD || _la==DECIMAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public TerminalNode DECIMAL() { return getToken(GentleJavaParser.DECIMAL, 0); }
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_possibleValues);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(75);
					decimalSymbol();
					}
				}

				setState(78);
				match(DECIMAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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

	public static class DecimalVariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GentleJavaParser.INT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GentleJavaParser.EQ, 0); }
		public DecimalValueContext decimalValue() {
			return getRuleContext(DecimalValueContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
		public DecimalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterDecimalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitDecimalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitDecimalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalVariableContext decimalVariable() throws RecognitionException {
		DecimalVariableContext _localctx = new DecimalVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decimalVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(INT);
			setState(83);
			identifier();
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					paralelDeclaration();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(90);
			match(EQ);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(91);
				decimalSymbol();
				}
				break;
			}
			setState(94);
			decimalValue();
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

	public static class DecimalValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(GentleJavaParser.DECIMAL, 0); }
		public DecimalSymbolContext decimalSymbol() {
			return getRuleContext(DecimalSymbolContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public DecimalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalValueContext decimalValue() throws RecognitionException {
		DecimalValueContext _localctx = new DecimalValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimalValue);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(96);
					decimalSymbol();
					}
				}

				setState(99);
				match(DECIMAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				expressionBody(0);
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

	public static class BoolVariableContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GentleJavaParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GentleJavaParser.EQ, 0); }
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public List<ParalelDeclarationContext> paralelDeclaration() {
			return getRuleContexts(ParalelDeclarationContext.class);
		}
		public ParalelDeclarationContext paralelDeclaration(int i) {
			return getRuleContext(ParalelDeclarationContext.class,i);
		}
		public BoolVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVariableContext boolVariable() throws RecognitionException {
		BoolVariableContext _localctx = new BoolVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(BOOLEAN);
			setState(106);
			identifier();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					paralelDeclaration();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(113);
			match(EQ);
			setState(114);
			boolValue();
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

	public static class BoolValueContext extends ParserRuleContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolValue);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				booleanValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				expressionBody(0);
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
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public DecimalVariableContext decimalVariable() {
			return getRuleContext(DecimalVariableContext.class,0);
		}
		public BoolVariableContext boolVariable() {
			return getRuleContext(BoolVariableContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(122);
				decimalVariable();
				}
				break;
			case BOOLEAN:
				{
				setState(123);
				boolVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			match(SEMICOLON);
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

	public static class ConstVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GentleJavaParser.CONST, 0); }
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterConstVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitConstVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitConstVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVariableDeclarationContext constVariableDeclaration() throws RecognitionException {
		ConstVariableDeclarationContext _localctx = new ConstVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CONST);
			setState(129);
			localVariableDeclaration();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ConstVariableDeclarationContext constVariableDeclaration() {
			return getRuleContext(ConstVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INT:
				{
				setState(131);
				localVariableDeclaration();
				}
				break;
			case CONST:
				{
				setState(132);
				constVariableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParalelDeclarationContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(GentleJavaParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParalelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterParalelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitParalelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitParalelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParalelDeclarationContext paralelDeclaration() throws RecognitionException {
		ParalelDeclarationContext _localctx = new ParalelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paralelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(EQ);
			setState(136);
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

	public static class VariableAssigmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GentleJavaParser.EQ, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public VariableAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterVariableAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitVariableAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitVariableAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssigmentContext variableAssigment() throws RecognitionException {
		VariableAssigmentContext _localctx = new VariableAssigmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			identifier();
			setState(139);
			match(EQ);
			setState(140);
			expressionBody(0);
			setState(141);
			match(SEMICOLON);
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
		enterRule(_localctx, 30, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
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
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LEFT_BRACE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(146);
				blockStatement();
				}
			}

			setState(149);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(GentleJavaParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GentleJavaParser.RIGHT_BRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LEFT_BRACE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(152);
				blockBody();
				}
			}

			setState(155);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
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
		enterRule(_localctx, 36, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(157);
					statement();
					}
					break;
				case 2:
					{
					setState(158);
					methodDeclaration();
					}
					break;
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << VOID) | (1L << CONST) | (1L << WORD))) != 0) );
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

	public static class BlockBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				statement();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << CONST) | (1L << WORD))) != 0) );
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
	public static class StatementAssigmentContext extends StatementContext {
		public VariableAssigmentContext variableAssigment() {
			return getRuleContext(VariableAssigmentContext.class,0);
		}
		public StatementAssigmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementAssigment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementVariableDeclarationContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementVariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementRepeatContext extends StatementContext {
		public TerminalNode REPEAT() { return getToken(GentleJavaParser.REPEAT, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(GentleJavaParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementRepeatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(GentleJavaParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDoContext extends StatementContext {
		public TerminalNode DO() { return getToken(GentleJavaParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GentleJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementSwitchContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(GentleJavaParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(GentleJavaParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(GentleJavaParser.RIGHT_BRACE, 0); }
		public List<SwitchBlockStatementContext> switchBlockStatement() {
			return getRuleContexts(SwitchBlockStatementContext.class);
		}
		public SwitchBlockStatementContext switchBlockStatement(int i) {
			return getRuleContext(SwitchBlockStatementContext.class,i);
		}
		public StatementSwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(GentleJavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementMethodCallContext extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GentleJavaParser.SEMICOLON, 0); }
		public StatementMethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public TerminalNode IF() { return getToken(GentleJavaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GentleJavaParser.ELSE, 0); }
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IF);
				setState(169);
				expression();
				setState(170);
				body();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(171);
					match(ELSE);
					setState(172);
					body();
					}
				}

				}
				break;
			case 2:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(FOR);
				setState(176);
				forControl();
				setState(177);
				body();
				}
				break;
			case 3:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(WHILE);
				setState(180);
				expression();
				setState(181);
				body();
				}
				break;
			case 4:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(DO);
				setState(184);
				body();
				setState(185);
				match(WHILE);
				setState(186);
				expression();
				}
				break;
			case 5:
				_localctx = new StatementSwitchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(SWITCH);
				setState(189);
				expression();
				setState(190);
				match(LEFT_BRACE);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(191);
					switchBlockStatement();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(RIGHT_BRACE);
				}
				break;
			case 6:
				_localctx = new StatementRepeatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(REPEAT);
				setState(200);
				body();
				setState(201);
				match(UNTIL);
				setState(202);
				expression();
				}
				break;
			case 7:
				_localctx = new StatementMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				methodCall();
				setState(205);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new StatementAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				variableAssigment();
				}
				break;
			case 9:
				_localctx = new StatementVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				variableDeclaration();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LEFT_PARENTHESES);
			setState(212);
			expressionBody(0);
			setState(213);
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

	public static class ExpressionBodyContext extends ParserRuleContext {
		public ExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBody; }
	 
		public ExpressionBodyContext() { }
		public void copyFrom(ExpressionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNegContext extends ExpressionBodyContext {
		public TerminalNode NEGATION() { return getToken(GentleJavaParser.NEGATION, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprNegContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPlusContext extends ExpressionBodyContext {
		public TerminalNode PLUS() { return getToken(GentleJavaParser.PLUS, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprPlusContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAdditiveContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GentleJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GentleJavaParser.MINUS, 0); }
		public ExprAdditiveContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParContext extends ExpressionBodyContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public ExprParContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusContext extends ExpressionBodyContext {
		public TerminalNode MINUS() { return getToken(GentleJavaParser.MINUS, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public ExprMinusContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprRelationalContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode GT() { return getToken(GentleJavaParser.GT, 0); }
		public TerminalNode GE() { return getToken(GentleJavaParser.GE, 0); }
		public TerminalNode LT() { return getToken(GentleJavaParser.LT, 0); }
		public TerminalNode LE() { return getToken(GentleJavaParser.LE, 0); }
		public TerminalNode SAME() { return getToken(GentleJavaParser.SAME, 0); }
		public TerminalNode NOT_EQ() { return getToken(GentleJavaParser.NOT_EQ, 0); }
		public ExprRelationalContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdentifierContext extends ExpressionBodyContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprIdentifierContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPossibleValueContext extends ExpressionBodyContext {
		public PossibleValuesContext possibleValues() {
			return getRuleContext(PossibleValuesContext.class,0);
		}
		public ExprPossibleValueContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprPossibleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprPossibleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprPossibleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMethodCallContext extends ExpressionBodyContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ExprMethodCallContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLogicalContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode AND() { return getToken(GentleJavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(GentleJavaParser.OR, 0); }
		public ExprLogicalContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultipliContext extends ExpressionBodyContext {
		public Token op;
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GentleJavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GentleJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GentleJavaParser.MOD, 0); }
		public ExprMultipliContext(ExpressionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterExprMultipli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitExprMultipli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitExprMultipli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBodyContext expressionBody() throws RecognitionException {
		return expressionBody(0);
	}

	private ExpressionBodyContext expressionBody(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionBodyContext _localctx = new ExpressionBodyContext(_ctx, _parentState);
		ExpressionBodyContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expressionBody, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPossibleValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				possibleValues();
				}
				break;
			case 2:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				methodCall();
				}
				break;
			case 4:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LEFT_PARENTHESES);
				setState(220);
				expressionBody(0);
				setState(221);
				match(RIGHT_PARENTHESES);
				}
				break;
			case 5:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(NEGATION);
				setState(224);
				expressionBody(3);
				}
				break;
			case 6:
				{
				_localctx = new ExprMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(MINUS);
				setState(226);
				expressionBody(2);
				}
				break;
			case 7:
				{
				_localctx = new ExprPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(PLUS);
				setState(228);
				expressionBody(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultipliContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(231);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(232);
						((ExprMultipliContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExprMultipliContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expressionBody(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprAdditiveContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(235);
						((ExprAdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprAdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expressionBody(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(237);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(238);
						((ExprRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << SAME) | (1L << NOT_EQ))) != 0)) ) {
							((ExprRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						expressionBody(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprLogicalContext(new ExpressionBodyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionBody);
						setState(240);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(241);
						((ExprLogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprLogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expressionBody(6);
						}
						break;
					}
					} 
				}
				setState(247);
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
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(GentleJavaParser.EQ, 0); }
		public List<ExpressionBodyContext> expressionBody() {
			return getRuleContexts(ExpressionBodyContext.class);
		}
		public ExpressionBodyContext expressionBody(int i) {
			return getRuleContext(ExpressionBodyContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public List<DecimalSymbolContext> decimalSymbol() {
			return getRuleContexts(DecimalSymbolContext.class);
		}
		public DecimalSymbolContext decimalSymbol(int i) {
			return getRuleContext(DecimalSymbolContext.class,i);
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
		enterRule(_localctx, 46, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LEFT_PARENTHESES);
			setState(249);
			identifier();
			setState(250);
			match(EQ);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(251);
				decimalSymbol();
				}
				break;
			}
			setState(254);
			expressionBody(0);
			setState(255);
			match(T__0);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(256);
				decimalSymbol();
				}
				break;
			}
			setState(259);
			expressionBody(0);
			setState(260);
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

	public static class SwitchBlockStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GentleJavaParser.CASE, 0); }
		public TerminalNode DECIMAL() { return getToken(GentleJavaParser.DECIMAL, 0); }
		public TerminalNode COLON() { return getToken(GentleJavaParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(GentleJavaParser.DEFAULT, 0); }
		public SwitchBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterSwitchBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitSwitchBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitSwitchBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementContext switchBlockStatement() throws RecognitionException {
		SwitchBlockStatementContext _localctx = new SwitchBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switchBlockStatement);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(CASE);
				setState(263);
				match(DECIMAL);
				setState(264);
				match(COLON);
				setState(265);
				body();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(DEFAULT);
				setState(267);
				match(COLON);
				setState(268);
				body();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public TerminalNode FUNCTION_KEYWORD() { return getToken(GentleJavaParser.FUNCTION_KEYWORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GentleJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GentleJavaParser.COMMA, i);
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
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			methodReturnType();
			setState(272);
			match(FUNCTION_KEYWORD);
			setState(273);
			identifier();
			setState(274);
			match(LEFT_PARENTHESES);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INT) {
				{
				setState(275);
				methodParameter();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(276);
					match(COMMA);
					setState(277);
					methodParameter();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			match(RIGHT_PARENTHESES);
			setState(286);
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

	public static class MethodParameterContext extends ParserRuleContext {
		public PossibleTypesContext possibleTypes() {
			return getRuleContext(PossibleTypesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			possibleTypes();
			setState(289);
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
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(GentleJavaParser.RETURN, 0); }
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
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
		enterRule(_localctx, 54, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LEFT_BRACE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << IF) | (1L << SWITCH) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(292);
				blockBody();
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(295);
				match(RETURN);
				setState(296);
				expressionBody(0);
				setState(297);
				match(SEMICOLON);
				}
			}

			setState(301);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESES() { return getToken(GentleJavaParser.LEFT_PARENTHESES, 0); }
		public TerminalNode RIGHT_PARENTHESES() { return getToken(GentleJavaParser.RIGHT_PARENTHESES, 0); }
		public List<MethodCallParameterContext> methodCallParameter() {
			return getRuleContexts(MethodCallParameterContext.class);
		}
		public MethodCallParameterContext methodCallParameter(int i) {
			return getRuleContext(MethodCallParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GentleJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GentleJavaParser.COMMA, i);
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
		enterRule(_localctx, 56, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			identifier();
			setState(304);
			match(LEFT_PARENTHESES);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << PLUS) | (1L << MINUS) | (1L << NEGATION) | (1L << LEFT_PARENTHESES) | (1L << WORD) | (1L << DECIMAL))) != 0)) {
				{
				setState(305);
				methodCallParameter();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(306);
					match(COMMA);
					setState(307);
					methodCallParameter();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(315);
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

	public static class MethodCallParameterContext extends ParserRuleContext {
		public ExpressionBodyContext expressionBody() {
			return getRuleContext(ExpressionBodyContext.class,0);
		}
		public MethodCallParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).enterMethodCallParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GentleJavaListener ) ((GentleJavaListener)listener).exitMethodCallParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GentleJavaVisitor ) return ((GentleJavaVisitor<? extends T>)visitor).visitMethodCallParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallParameterContext methodCallParameter() throws RecognitionException {
		MethodCallParameterContext _localctx = new MethodCallParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodCallParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			expressionBody(0);
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
		case 22:
			return expressionBody_sempred((ExpressionBodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionBody_sempred(ExpressionBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0142\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\5\7O\n\7\3"+
		"\7\3\7\5\7S\n\7\3\b\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\b\3\b\5\b_\n\b\3"+
		"\b\3\b\3\t\5\td\n\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\7\no\n\n\f\n"+
		"\16\nr\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\5\f\177"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0096\n\22\3\22\3\22\3\23"+
		"\3\23\5\23\u009c\n\23\3\23\3\23\3\24\3\24\6\24\u00a2\n\24\r\24\16\24\u00a3"+
		"\3\25\6\25\u00a7\n\25\r\25\16\25\u00a8\3\26\3\26\3\26\3\26\3\26\5\26\u00b0"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00c3\n\26\f\26\16\26\u00c6\13\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d4\n\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00e8\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00f6\n\30\f\30\16\30\u00f9\13\30\3\31\3\31"+
		"\3\31\3\31\5\31\u00ff\n\31\3\31\3\31\3\31\5\31\u0104\n\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0110\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0119\n\33\f\33\16\33\u011c\13\33\5\33\u011e"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u0128\n\35\3\35\3\35"+
		"\3\35\3\35\5\35\u012e\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u0137"+
		"\n\36\f\36\16\36\u013a\13\36\5\36\u013c\n\36\3\36\3\36\3\37\3\37\3\37"+
		"\2\3. \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		"\2\n\4\2\4\5\20\20\3\2\24\25\3\2\4\5\3\2\31\32\3\2/\60\3\2\26\30\4\2\33"+
		"\37%%\3\2!\"\2\u0154\2>\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nF\3"+
		"\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24z\3\2\2\2\26~"+
		"\3\2\2\2\30\u0082\3\2\2\2\32\u0087\3\2\2\2\34\u0089\3\2\2\2\36\u008c\3"+
		"\2\2\2 \u0091\3\2\2\2\"\u0093\3\2\2\2$\u0099\3\2\2\2&\u00a1\3\2\2\2(\u00a6"+
		"\3\2\2\2*\u00d3\3\2\2\2,\u00d5\3\2\2\2.\u00e7\3\2\2\2\60\u00fa\3\2\2\2"+
		"\62\u010f\3\2\2\2\64\u0111\3\2\2\2\66\u0122\3\2\2\28\u0125\3\2\2\2:\u0131"+
		"\3\2\2\2<\u013f\3\2\2\2>?\t\2\2\2?\3\3\2\2\2@A\t\3\2\2A\5\3\2\2\2BC\t"+
		"\4\2\2C\7\3\2\2\2DE\t\5\2\2E\t\3\2\2\2FJ\7/\2\2GI\t\6\2\2HG\3\2\2\2IL"+
		"\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2\2\2MO\5\b\5\2NM\3\2\2\2"+
		"NO\3\2\2\2OP\3\2\2\2PS\7\60\2\2QS\5\4\3\2RN\3\2\2\2RQ\3\2\2\2S\r\3\2\2"+
		"\2TU\7\5\2\2UY\5\n\6\2VX\5\34\17\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7 \2\2]_\5\b\5\2^]\3\2\2\2^_\3\2\2\2_`\3"+
		"\2\2\2`a\5\20\t\2a\17\3\2\2\2bd\5\b\5\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2"+
		"ej\7\60\2\2fj\5:\36\2gj\5\n\6\2hj\5.\30\2ic\3\2\2\2if\3\2\2\2ig\3\2\2"+
		"\2ih\3\2\2\2j\21\3\2\2\2kl\7\4\2\2lp\5\n\6\2mo\5\34\17\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7 \2\2tu\5\24\13\2u\23"+
		"\3\2\2\2v{\5\4\3\2w{\5:\36\2x{\5\n\6\2y{\5.\30\2zv\3\2\2\2zw\3\2\2\2z"+
		"x\3\2\2\2zy\3\2\2\2{\25\3\2\2\2|\177\5\16\b\2}\177\5\22\n\2~|\3\2\2\2"+
		"~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7-\2\2\u0081\27\3\2\2\2\u0082"+
		"\u0083\7\22\2\2\u0083\u0084\5\26\f\2\u0084\31\3\2\2\2\u0085\u0088\5\26"+
		"\f\2\u0086\u0088\5\30\r\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\33\3\2\2\2\u0089\u008a\7 \2\2\u008a\u008b\5\n\6\2\u008b\35\3\2\2\2\u008c"+
		"\u008d\5\n\6\2\u008d\u008e\7 \2\2\u008e\u008f\5.\30\2\u008f\u0090\7-\2"+
		"\2\u0090\37\3\2\2\2\u0091\u0092\5\"\22\2\u0092!\3\2\2\2\u0093\u0095\7"+
		")\2\2\u0094\u0096\5&\24\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7*\2\2\u0098#\3\2\2\2\u0099\u009b\7)\2\2\u009a"+
		"\u009c\5(\25\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\7*\2\2\u009e%\3\2\2\2\u009f\u00a2\5*\26\2\u00a0\u00a2"+
		"\5\64\33\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\'\3\2\2\2\u00a5\u00a7\5"+
		"*\26\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9)\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5,\27\2"+
		"\u00ac\u00af\5$\23\2\u00ad\u00ae\7\7\2\2\u00ae\u00b0\5$\23\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00d4\3\2\2\2\u00b1\u00b2\7\13\2\2"+
		"\u00b2\u00b3\5\60\31\2\u00b3\u00b4\5$\23\2\u00b4\u00d4\3\2\2\2\u00b5\u00b6"+
		"\7\f\2\2\u00b6\u00b7\5,\27\2\u00b7\u00b8\5$\23\2\u00b8\u00d4\3\2\2\2\u00b9"+
		"\u00ba\7\r\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\5,"+
		"\27\2\u00bd\u00d4\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5,\27\2\u00c0"+
		"\u00c4\7)\2\2\u00c1\u00c3\5\62\32\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\u00d4\3\2\2\2\u00c9\u00ca\7\16"+
		"\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\5,\27\2\u00cd"+
		"\u00d4\3\2\2\2\u00ce\u00cf\5:\36\2\u00cf\u00d0\7-\2\2\u00d0\u00d4\3\2"+
		"\2\2\u00d1\u00d4\5\36\20\2\u00d2\u00d4\5\32\16\2\u00d3\u00aa\3\2\2\2\u00d3"+
		"\u00b1\3\2\2\2\u00d3\u00b5\3\2\2\2\u00d3\u00b9\3\2\2\2\u00d3\u00be\3\2"+
		"\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4+\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6\u00d7\5.\30\2"+
		"\u00d7\u00d8\7(\2\2\u00d8-\3\2\2\2\u00d9\u00da\b\30\1\2\u00da\u00e8\5"+
		"\f\7\2\u00db\u00e8\5\n\6\2\u00dc\u00e8\5:\36\2\u00dd\u00de\7\'\2\2\u00de"+
		"\u00df\5.\30\2\u00df\u00e0\7(\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e2\7&\2"+
		"\2\u00e2\u00e8\5.\30\5\u00e3\u00e4\7\32\2\2\u00e4\u00e8\5.\30\4\u00e5"+
		"\u00e6\7\31\2\2\u00e6\u00e8\5.\30\3\u00e7\u00d9\3\2\2\2\u00e7\u00db\3"+
		"\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00f7\3\2\2\2\u00e9\u00ea\f\n"+
		"\2\2\u00ea\u00eb\t\7\2\2\u00eb\u00f6\5.\30\13\u00ec\u00ed\f\t\2\2\u00ed"+
		"\u00ee\t\5\2\2\u00ee\u00f6\5.\30\n\u00ef\u00f0\f\b\2\2\u00f0\u00f1\t\b"+
		"\2\2\u00f1\u00f6\5.\30\t\u00f2\u00f3\f\7\2\2\u00f3\u00f4\t\t\2\2\u00f4"+
		"\u00f6\5.\30\b\u00f5\u00e9\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3\2"+
		"\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8/\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\'\2\2"+
		"\u00fb\u00fc\5\n\6\2\u00fc\u00fe\7 \2\2\u00fd\u00ff\5\b\5\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\5.\30\2\u0101"+
		"\u0103\7\3\2\2\u0102\u0104\5\b\5\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5.\30\2\u0106\u0107\7(\2\2\u0107"+
		"\61\3\2\2\2\u0108\u0109\7\t\2\2\u0109\u010a\7\60\2\2\u010a\u010b\7$\2"+
		"\2\u010b\u0110\5$\23\2\u010c\u010d\7\n\2\2\u010d\u010e\7$\2\2\u010e\u0110"+
		"\5$\23\2\u010f\u0108\3\2\2\2\u010f\u010c\3\2\2\2\u0110\63\3\2\2\2\u0111"+
		"\u0112\5\2\2\2\u0112\u0113\7\23\2\2\u0113\u0114\5\n\6\2\u0114\u011d\7"+
		"\'\2\2\u0115\u011a\5\66\34\2\u0116\u0117\7.\2\2\u0117\u0119\5\66\34\2"+
		"\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0121\58\35"+
		"\2\u0121\65\3\2\2\2\u0122\u0123\5\6\4\2\u0123\u0124\5\n\6\2\u0124\67\3"+
		"\2\2\2\u0125\u0127\7)\2\2\u0126\u0128\5(\25\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129\u012a\7\21\2\2\u012a\u012b\5"+
		".\30\2\u012b\u012c\7-\2\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7*\2\2\u01309\3\2\2\2\u0131"+
		"\u0132\5\n\6\2\u0132\u013b\7\'\2\2\u0133\u0138\5<\37\2\u0134\u0135\7."+
		"\2\2\u0135\u0137\5<\37\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u0133\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\7(\2\2\u013e;\3\2\2\2\u013f\u0140\5.\30\2\u0140=\3\2\2\2!JNRY^"+
		"cipz~\u0087\u0095\u009b\u00a1\u00a3\u00a8\u00af\u00c4\u00d3\u00e7\u00f5"+
		"\u00f7\u00fe\u0103\u010f\u011a\u011d\u0127\u012d\u0138\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}