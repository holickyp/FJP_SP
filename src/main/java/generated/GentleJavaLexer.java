package generated;

// Generated from GentleJava.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GentleJavaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", 
			"FOR", "WHILE", "DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "FUNCTION_KEYWORD", 
			"TRUE", "FALSE", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", 
			"LE", "SAME", "EQ", "AND", "OR", "QUESTION", "COLON", "NOT_EQ", "NEGATION", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "SEMICOLON", "COMMA", "NUMBER", "LOWECASE", 
			"UPPERCASE", "WORD", "DECIMAL", "WHITESPACE", "LINE_COMMENT"
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


	public GentleJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GentleJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0152\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\6.\u0130\n.\r.\16.\u0131\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\6\61\u013b\n\61\r\61\16\61\u013c\3\62\3\62\3\63\6\63\u0142\n\63\r\63"+
		"\16\63\u0143\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u014c\n\64\f\64\16\64"+
		"\u014f\13\64\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2"+
		"a/c\60e\61g\62\3\2\7\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u0154\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\3i\3\2\2\2\5m\3\2\2\2\7u\3\2\2\2\ty\3\2\2\2\13\u0082\3"+
		"\2\2\2\r\u008f\3\2\2\2\17\u0096\3\2\2\2\21\u009b\3\2\2\2\23\u00a3\3\2"+
		"\2\2\25\u00ab\3\2\2\2\27\u00b2\3\2\2\2\31\u00ba\3\2\2\2\33\u00c4\3\2\2"+
		"\2\35\u00c9\3\2\2\2\37\u00ce\3\2\2\2!\u00d5\3\2\2\2#\u00db\3\2\2\2%\u00e4"+
		"\3\2\2\2\'\u00ec\3\2\2\2)\u00f6\3\2\2\2+\u00f8\3\2\2\2-\u00fa\3\2\2\2"+
		"/\u00fc\3\2\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2\2\65\u0102\3\2\2\2\67"+
		"\u0105\3\2\2\29\u0107\3\2\2\2;\u010a\3\2\2\2=\u010d\3\2\2\2?\u010f\3\2"+
		"\2\2A\u0112\3\2\2\2C\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011c"+
		"\3\2\2\2K\u011e\3\2\2\2M\u0120\3\2\2\2O\u0122\3\2\2\2Q\u0124\3\2\2\2S"+
		"\u0126\3\2\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012c\3\2\2\2[\u012f\3\2"+
		"\2\2]\u0133\3\2\2\2_\u0135\3\2\2\2a\u013a\3\2\2\2c\u013e\3\2\2\2e\u0141"+
		"\3\2\2\2g\u0147\3\2\2\2ij\7\60\2\2jk\7\60\2\2kl\7\60\2\2l\4\3\2\2\2mn"+
		"\7d\2\2no\7q\2\2op\7q\2\2pq\7n\2\2qr\7g\2\2rs\7c\2\2st\7p\2\2t\6\3\2\2"+
		"\2uv\7k\2\2vw\7p\2\2wx\7v\2\2x\b\3\2\2\2yz\7e\2\2z{\7q\2\2{|\7p\2\2|}"+
		"\7u\2\2}~\7k\2\2~\177\7f\2\2\177\u0080\7g\2\2\u0080\u0081\7t\2\2\u0081"+
		"\n\3\2\2\2\u0082\u0083\7p\2\2\u0083\u0084\7g\2\2\u0084\u0085\7x\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7t\2\2\u0087\u0088\7v\2\2\u0088\u0089\7j\2\2"+
		"\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7u\2\2\u008e\f\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091"+
		"\7y\2\2\u0091\u0092\7k\2\2\u0092\u0093\7v\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7j\2\2\u0095\16\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\20\3\2\2\2\u009b\u009c\7f\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7w\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00a2\7v\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7"+
		"f\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8"+
		"\7w\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7u\2\2\u00aa\24\3\2\2\2\u00ab\u00ac"+
		"\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7q\2\2"+
		"\u00b7\u00b8\7t\2\2\u00b8\u00b9\7o\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7"+
		"t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7v\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7n\2\2\u00c7\u00c8\7n\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7x\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7f\2\2\u00cd\36\3\2\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\u00d3\7m\2\2\u00d3\u00d4\7u\2\2\u00d4 \3\2\2\2\u00d5\u00d6\7e\2"+
		"\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\"\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de"+
		"\7p\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7p\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7e\2\2\u00ea\u00eb\7v\2\2\u00eb&\3\2\2\2\u00ec\u00ed\7k\2"+
		"\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5(\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7*\3\2\2\2\u00f8\u00f9"+
		"\7\61\2\2\u00f9,\3\2\2\2\u00fa\u00fb\7\'\2\2\u00fb.\3\2\2\2\u00fc\u00fd"+
		"\7-\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7/\2\2\u00ff\62\3\2\2\2\u0100\u0101"+
		"\7@\2\2\u0101\64\3\2\2\2\u0102\u0103\7@\2\2\u0103\u0104\7?\2\2\u0104\66"+
		"\3\2\2\2\u0105\u0106\7>\2\2\u01068\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109"+
		"\7?\2\2\u0109:\3\2\2\2\u010a\u010b\7?\2\2\u010b\u010c\7?\2\2\u010c<\3"+
		"\2\2\2\u010d\u010e\7?\2\2\u010e>\3\2\2\2\u010f\u0110\7(\2\2\u0110\u0111"+
		"\7(\2\2\u0111@\3\2\2\2\u0112\u0113\7~\2\2\u0113\u0114\7~\2\2\u0114B\3"+
		"\2\2\2\u0115\u0116\7A\2\2\u0116D\3\2\2\2\u0117\u0118\7<\2\2\u0118F\3\2"+
		"\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011bH\3\2\2\2\u011c\u011d"+
		"\7#\2\2\u011dJ\3\2\2\2\u011e\u011f\7*\2\2\u011fL\3\2\2\2\u0120\u0121\7"+
		"+\2\2\u0121N\3\2\2\2\u0122\u0123\7}\2\2\u0123P\3\2\2\2\u0124\u0125\7\177"+
		"\2\2\u0125R\3\2\2\2\u0126\u0127\7]\2\2\u0127T\3\2\2\2\u0128\u0129\7_\2"+
		"\2\u0129V\3\2\2\2\u012a\u012b\7=\2\2\u012bX\3\2\2\2\u012c\u012d\7.\2\2"+
		"\u012dZ\3\2\2\2\u012e\u0130\t\2\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\\\3\2\2\2\u0133\u0134"+
		"\t\3\2\2\u0134^\3\2\2\2\u0135\u0136\t\4\2\2\u0136`\3\2\2\2\u0137\u013b"+
		"\5]/\2\u0138\u013b\5_\60\2\u0139\u013b\7a\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013db\3\2\2\2\u013e\u013f\5[.\2\u013fd\3\2\2"+
		"\2\u0140\u0142\t\5\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\63\2\2"+
		"\u0146f\3\2\2\2\u0147\u0148\7\61\2\2\u0148\u0149\7\61\2\2\u0149\u014d"+
		"\3\2\2\2\u014a\u014c\n\6\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0151\b\64\2\2\u0151h\3\2\2\2\b\2\u0131\u013a\u013c\u0143\u014d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}