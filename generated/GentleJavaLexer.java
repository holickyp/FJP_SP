// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GentleJavaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "INT", "IF", "ELSE", "SWITCH", "CASE", "DEFAULT", "FOR", "WHILE", 
			"DO", "REPEAT", "UNTIL", "VOID", "RETURN", "CONST", "VARIABLE_KEYWORD", 
			"FUNCTION_KEYWORD", "TRUE", "FALSE", "MULTIPLICATION", "DIVISION", "MODULO", 
			"PLUS", "INCREMENT", "MINUS", "DECREMENT", "GRATER_THAN", "GRATER_EQUAL_THAN", 
			"LOWER_THAN", "LOWER_EQUAL_THAN", "EQUALS", "ASSIGN", "AND", "OR", "QUESTION", 
			"COLON", "NOT_EQUALS", "NEGATION", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "SEMICOLON", 
			"COMMA", "DIGIT", "LETTER", "LETTER_OR_DIGIT", "NUMBER", "IDENTIFIER", 
			"WHITESPACE", "LINE_COMMENT"
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
		"\u0004\u00002\u0164\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u0141\b/\u00010\u00010\u00030\u0145\b0\u00011\u00041\u0148\b1\u000b"+
		"1\f1\u0149\u00012\u00012\u00052\u014e\b2\n2\f2\u0151\t2\u00013\u00043"+
		"\u0154\b3\u000b3\f3\u0155\u00013\u00013\u00014\u00014\u00014\u00014\u0005"+
		"4\u015e\b4\n4\f4\u0161\t4\u00014\u00014\u0000\u00005\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]\u0000"+
		"_\u0000a\u0000c/e0g1i2\u0001\u0000\u0007\u0001\u000009\u0004\u0000$$A"+
		"Z__az\u0002\u0000\u0000\u007f\u8000\ud800\u8000\udbff\u0001\u0000\u8000"+
		"\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000\n\n\r\r\u0167\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000"+
		"\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0001k"+
		"\u0001\u0000\u0000\u0000\u0003s\u0001\u0000\u0000\u0000\u0005w\u0001\u0000"+
		"\u0000\u0000\u0007\u0080\u0001\u0000\u0000\u0000\t\u008d\u0001\u0000\u0000"+
		"\u0000\u000b\u0094\u0001\u0000\u0000\u0000\r\u0099\u0001\u0000\u0000\u0000"+
		"\u000f\u00a1\u0001\u0000\u0000\u0000\u0011\u00a9\u0001\u0000\u0000\u0000"+
		"\u0013\u00b0\u0001\u0000\u0000\u0000\u0015\u00b8\u0001\u0000\u0000\u0000"+
		"\u0017\u00c2\u0001\u0000\u0000\u0000\u0019\u00c7\u0001\u0000\u0000\u0000"+
		"\u001b\u00cc\u0001\u0000\u0000\u0000\u001d\u00d3\u0001\u0000\u0000\u0000"+
		"\u001f\u00d9\u0001\u0000\u0000\u0000!\u00e3\u0001\u0000\u0000\u0000#\u00ea"+
		"\u0001\u0000\u0000\u0000%\u00f2\u0001\u0000\u0000\u0000\'\u00fc\u0001"+
		"\u0000\u0000\u0000)\u00fe\u0001\u0000\u0000\u0000+\u0100\u0001\u0000\u0000"+
		"\u0000-\u0102\u0001\u0000\u0000\u0000/\u0104\u0001\u0000\u0000\u00001"+
		"\u0107\u0001\u0000\u0000\u00003\u0109\u0001\u0000\u0000\u00005\u010c\u0001"+
		"\u0000\u0000\u00007\u010e\u0001\u0000\u0000\u00009\u0111\u0001\u0000\u0000"+
		"\u0000;\u0113\u0001\u0000\u0000\u0000=\u0116\u0001\u0000\u0000\u0000?"+
		"\u0119\u0001\u0000\u0000\u0000A\u011b\u0001\u0000\u0000\u0000C\u011e\u0001"+
		"\u0000\u0000\u0000E\u0121\u0001\u0000\u0000\u0000G\u0123\u0001\u0000\u0000"+
		"\u0000I\u0125\u0001\u0000\u0000\u0000K\u0128\u0001\u0000\u0000\u0000M"+
		"\u012a\u0001\u0000\u0000\u0000O\u012c\u0001\u0000\u0000\u0000Q\u012e\u0001"+
		"\u0000\u0000\u0000S\u0130\u0001\u0000\u0000\u0000U\u0132\u0001\u0000\u0000"+
		"\u0000W\u0134\u0001\u0000\u0000\u0000Y\u0136\u0001\u0000\u0000\u0000["+
		"\u0138\u0001\u0000\u0000\u0000]\u013a\u0001\u0000\u0000\u0000_\u0140\u0001"+
		"\u0000\u0000\u0000a\u0144\u0001\u0000\u0000\u0000c\u0147\u0001\u0000\u0000"+
		"\u0000e\u014b\u0001\u0000\u0000\u0000g\u0153\u0001\u0000\u0000\u0000i"+
		"\u0159\u0001\u0000\u0000\u0000kl\u0005b\u0000\u0000lm\u0005o\u0000\u0000"+
		"mn\u0005o\u0000\u0000no\u0005l\u0000\u0000op\u0005e\u0000\u0000pq\u0005"+
		"a\u0000\u0000qr\u0005n\u0000\u0000r\u0002\u0001\u0000\u0000\u0000st\u0005"+
		"i\u0000\u0000tu\u0005n\u0000\u0000uv\u0005t\u0000\u0000v\u0004\u0001\u0000"+
		"\u0000\u0000wx\u0005c\u0000\u0000xy\u0005o\u0000\u0000yz\u0005n\u0000"+
		"\u0000z{\u0005s\u0000\u0000{|\u0005i\u0000\u0000|}\u0005d\u0000\u0000"+
		"}~\u0005e\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0006\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005n\u0000\u0000\u0081\u0082\u0005e\u0000\u0000"+
		"\u0082\u0083\u0005v\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0085"+
		"\u0005r\u0000\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087\u0005h"+
		"\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005l\u0000\u0000"+
		"\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005s\u0000\u0000\u008b\u008c"+
		"\u0005s\u0000\u0000\u008c\b\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"s\u0000\u0000\u008e\u008f\u0005w\u0000\u0000\u008f\u0090\u0005i\u0000"+
		"\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092\u0005c\u0000\u0000\u0092"+
		"\u0093\u0005h\u0000\u0000\u0093\n\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005c\u0000\u0000\u0095\u0096\u0005a\u0000\u0000\u0096\u0097\u0005s"+
		"\u0000\u0000\u0097\u0098\u0005e\u0000\u0000\u0098\f\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005d\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b"+
		"\u009c\u0005f\u0000\u0000\u009c\u009d\u0005a\u0000\u0000\u009d\u009e\u0005"+
		"u\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f\u00a0\u0005t\u0000"+
		"\u0000\u00a0\u000e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005d\u0000\u0000"+
		"\u00a2\u00a3\u0005i\u0000\u0000\u00a3\u00a4\u0005s\u0000\u0000\u00a4\u00a5"+
		"\u0005c\u0000\u0000\u00a5\u00a6\u0005u\u0000\u0000\u00a6\u00a7\u0005s"+
		"\u0000\u0000\u00a7\u00a8\u0005s\u0000\u0000\u00a8\u0010\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005w\u0000\u0000\u00aa\u00ab\u0005h\u0000\u0000\u00ab"+
		"\u00ac\u0005i\u0000\u0000\u00ac\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005"+
		"s\u0000\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af\u0012\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005p\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2"+
		"\u00b3\u0005r\u0000\u0000\u00b3\u00b4\u0005f\u0000\u0000\u00b4\u00b5\u0005"+
		"o\u0000\u0000\u00b5\u00b6\u0005r\u0000\u0000\u00b6\u00b7\u0005m\u0000"+
		"\u0000\u00b7\u0014\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005r\u0000\u0000"+
		"\u00b9\u00ba\u0005e\u0000\u0000\u00ba\u00bb\u0005i\u0000\u0000\u00bb\u00bc"+
		"\u0005t\u0000\u0000\u00bc\u00bd\u0005e\u0000\u0000\u00bd\u00be\u0005r"+
		"\u0000\u0000\u00be\u00bf\u0005a\u0000\u0000\u00bf\u00c0\u0005t\u0000\u0000"+
		"\u00c0\u00c1\u0005e\u0000\u0000\u00c1\u0016\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005t\u0000\u0000\u00c3\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005"+
		"l\u0000\u0000\u00c5\u00c6\u0005l\u0000\u0000\u00c6\u0018\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005v\u0000\u0000\u00c8\u00c9\u0005o\u0000\u0000\u00c9"+
		"\u00ca\u0005i\u0000\u0000\u00ca\u00cb\u0005d\u0000\u0000\u00cb\u001a\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005t\u0000\u0000\u00cd\u00ce\u0005h\u0000"+
		"\u0000\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005n\u0000\u0000\u00d0"+
		"\u00d1\u0005k\u0000\u0000\u00d1\u00d2\u0005s\u0000\u0000\u00d2\u001c\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005f\u0000\u0000\u00d4\u00d5\u0005i\u0000"+
		"\u0000\u00d5\u00d6\u0005n\u0000\u0000\u00d6\u00d7\u0005a\u0000\u0000\u00d7"+
		"\u00d8\u0005l\u0000\u0000\u00d8\u001e\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005i\u0000\u0000\u00da\u00db\u0005n\u0000\u0000\u00db\u00dc\u0005t"+
		"\u0000\u0000\u00dc\u00dd\u0005r\u0000\u0000\u00dd\u00de\u0005o\u0000\u0000"+
		"\u00de\u00df\u0005d\u0000\u0000\u00df\u00e0\u0005u\u0000\u0000\u00e0\u00e1"+
		"\u0005c\u0000\u0000\u00e1\u00e2\u0005e\u0000\u0000\u00e2 \u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005p\u0000\u0000\u00e4\u00e5\u0005l\u0000\u0000"+
		"\u00e5\u00e6\u0005e\u0000\u0000\u00e6\u00e7\u0005a\u0000\u0000\u00e7\u00e8"+
		"\u0005s\u0000\u0000\u00e8\u00e9\u0005e\u0000\u0000\u00e9\"\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005c\u0000\u0000\u00eb\u00ec\u0005o\u0000\u0000"+
		"\u00ec\u00ed\u0005r\u0000\u0000\u00ed\u00ee\u0005r\u0000\u0000\u00ee\u00ef"+
		"\u0005e\u0000\u0000\u00ef\u00f0\u0005c\u0000\u0000\u00f0\u00f1\u0005t"+
		"\u0000\u0000\u00f1$\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005i\u0000\u0000"+
		"\u00f3\u00f4\u0005n\u0000\u0000\u00f4\u00f5\u0005c\u0000\u0000\u00f5\u00f6"+
		"\u0005o\u0000\u0000\u00f6\u00f7\u0005r\u0000\u0000\u00f7\u00f8\u0005r"+
		"\u0000\u0000\u00f8\u00f9\u0005e\u0000\u0000\u00f9\u00fa\u0005c\u0000\u0000"+
		"\u00fa\u00fb\u0005t\u0000\u0000\u00fb&\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005*\u0000\u0000\u00fd(\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005/"+
		"\u0000\u0000\u00ff*\u0001\u0000\u0000\u0000\u0100\u0101\u0005%\u0000\u0000"+
		"\u0101,\u0001\u0000\u0000\u0000\u0102\u0103\u0005+\u0000\u0000\u0103."+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005+\u0000\u0000\u0105\u0106\u0005"+
		"+\u0000\u0000\u01060\u0001\u0000\u0000\u0000\u0107\u0108\u0005-\u0000"+
		"\u0000\u01082\u0001\u0000\u0000\u0000\u0109\u010a\u0005-\u0000\u0000\u010a"+
		"\u010b\u0005-\u0000\u0000\u010b4\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		">\u0000\u0000\u010d6\u0001\u0000\u0000\u0000\u010e\u010f\u0005>\u0000"+
		"\u0000\u010f\u0110\u0005=\u0000\u0000\u01108\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005<\u0000\u0000\u0112:\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"<\u0000\u0000\u0114\u0115\u0005=\u0000\u0000\u0115<\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005=\u0000\u0000\u0117\u0118\u0005=\u0000\u0000\u0118"+
		">\u0001\u0000\u0000\u0000\u0119\u011a\u0005=\u0000\u0000\u011a@\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005&\u0000\u0000\u011c\u011d\u0005&\u0000"+
		"\u0000\u011dB\u0001\u0000\u0000\u0000\u011e\u011f\u0005|\u0000\u0000\u011f"+
		"\u0120\u0005|\u0000\u0000\u0120D\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"?\u0000\u0000\u0122F\u0001\u0000\u0000\u0000\u0123\u0124\u0005:\u0000"+
		"\u0000\u0124H\u0001\u0000\u0000\u0000\u0125\u0126\u0005!\u0000\u0000\u0126"+
		"\u0127\u0005=\u0000\u0000\u0127J\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"!\u0000\u0000\u0129L\u0001\u0000\u0000\u0000\u012a\u012b\u0005(\u0000"+
		"\u0000\u012bN\u0001\u0000\u0000\u0000\u012c\u012d\u0005)\u0000\u0000\u012d"+
		"P\u0001\u0000\u0000\u0000\u012e\u012f\u0005{\u0000\u0000\u012fR\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005}\u0000\u0000\u0131T\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005[\u0000\u0000\u0133V\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005]\u0000\u0000\u0135X\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		";\u0000\u0000\u0137Z\u0001\u0000\u0000\u0000\u0138\u0139\u0005,\u0000"+
		"\u0000\u0139\\\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0000\u0000\u0000"+
		"\u013b^\u0001\u0000\u0000\u0000\u013c\u0141\u0007\u0001\u0000\u0000\u013d"+
		"\u0141\b\u0002\u0000\u0000\u013e\u013f\u0007\u0003\u0000\u0000\u013f\u0141"+
		"\u0007\u0004\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0140\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141`\u0001"+
		"\u0000\u0000\u0000\u0142\u0145\u0003_/\u0000\u0143\u0145\u0003].\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000"+
		"\u0145b\u0001\u0000\u0000\u0000\u0146\u0148\u0003].\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014ad\u0001"+
		"\u0000\u0000\u0000\u014b\u014f\u0003_/\u0000\u014c\u014e\u0003a0\u0000"+
		"\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150f\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u0154\u0007\u0005\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u00063\u0000\u0000\u0158h\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"/\u0000\u0000\u015a\u015b\u0005/\u0000\u0000\u015b\u015f\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\b\u0006\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u00064\u0000\u0000\u0163"+
		"j\u0001\u0000\u0000\u0000\u0007\u0000\u0140\u0144\u0149\u014f\u0155\u015f"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}