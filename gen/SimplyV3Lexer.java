// Generated from /home/hackerbuddy/dev/fyp/simply/src/main/grammar/v3/SimplyV3Lexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplyV3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GET=1, CONST=2, LIST=3, SEND=4, CHECK=5, OTHERWISE=6, ITERATE=7, INT=8, 
		FLOAT=9, CHAR=10, STRING=11, BOOL=12, VOID=13, FUNCTION=14, FROM=15, TO=16, 
		CONTINUE=17, BREAK=18, OF=19, IntegerLiteral=20, FloatLiteral=21, BoolLiteral=22, 
		CharLiteral=23, StringLiteral=24, LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, 
		LBRACK=29, RBRACK=30, EOL=31, COMMA=32, DOT=33, COLON=34, ASSIGN=35, GT=36, 
		LT=37, BANG=38, EQUAL=39, LE=40, GE=41, NOTEQUAL=42, AND=43, OR=44, ADD=45, 
		SUB=46, MUL=47, DIV=48, MOD=49, ADD_ASSIGN=50, SUB_ASSIGN=51, MUL_ASSIGN=52, 
		DIV_ASSIGN=53, Identifier=54, WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", "INT", 
			"FLOAT", "CHAR", "STRING", "BOOL", "VOID", "FUNCTION", "FROM", "TO", 
			"CONTINUE", "BREAK", "OF", "IntegerLiteral", "NonZeroInteger", "NonZeroDigit", 
			"Digit", "Zero", "FloatLiteral", "BoolLiteral", "CharLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "EOL", "COMMA", "DOT", "COLON", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "Identifier", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'const'", "'list'", "'send'", "'check'", "'otherwise'", 
			"'iterate'", "'int'", "'float'", "'char'", "'string'", "'bool'", "'void'", 
			"'function'", "'from'", "'to'", "'continue'", "'break'", "'of'", null, 
			null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "':'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", 
			"'!='", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", 
			"'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", 
			"INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", "FUNCTION", "FROM", 
			"TO", "CONTINUE", "BREAK", "OF", "IntegerLiteral", "FloatLiteral", "BoolLiteral", 
			"CharLiteral", "StringLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "EOL", "COMMA", "DOT", "COLON", "ASSIGN", "GT", "LT", 
			"BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"Identifier", "WS"
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


	public SimplyV3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimplyV3Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\5\25\u00f1\n\25\3\25\3\25\5\25\u00f5\n\25\3\26"+
		"\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\5\32\u0106\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0115\n\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\5\36\u011f\n\36\3\36\3\36\3\37\6\37\u0124\n\37\r\37\16\37\u0125"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\6>\u0170\n>\r"+
		">\16>\u0171\3?\3?\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2"+
		"\63\27\65\30\67\319\2;\32=\2?\2A\33C\34E\35G\36I\37K M!O\"Q#S$U%W&Y\'"+
		"[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\3\2\b\3\2\63;\3\2"+
		"\62;\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3\2c|\5\2\13\f\17\17\"\"\2\u0179"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c"+
		"\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2"+
		"\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2"+
		"\2}\3\2\2\2\3\177\3\2\2\2\5\u0083\3\2\2\2\7\u0089\3\2\2\2\t\u008e\3\2"+
		"\2\2\13\u0093\3\2\2\2\r\u0099\3\2\2\2\17\u00a3\3\2\2\2\21\u00ab\3\2\2"+
		"\2\23\u00af\3\2\2\2\25\u00b5\3\2\2\2\27\u00ba\3\2\2\2\31\u00c1\3\2\2\2"+
		"\33\u00c6\3\2\2\2\35\u00cb\3\2\2\2\37\u00d4\3\2\2\2!\u00d9\3\2\2\2#\u00dc"+
		"\3\2\2\2%\u00e5\3\2\2\2\'\u00eb\3\2\2\2)\u00f0\3\2\2\2+\u00f6\3\2\2\2"+
		"-\u00fd\3\2\2\2/\u00ff\3\2\2\2\61\u0101\3\2\2\2\63\u0105\3\2\2\2\65\u0114"+
		"\3\2\2\2\67\u0116\3\2\2\29\u011a\3\2\2\2;\u011c\3\2\2\2=\u0123\3\2\2\2"+
		"?\u0127\3\2\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E\u012d\3\2\2\2G\u012f\3"+
		"\2\2\2I\u0131\3\2\2\2K\u0133\3\2\2\2M\u0135\3\2\2\2O\u0137\3\2\2\2Q\u0139"+
		"\3\2\2\2S\u013b\3\2\2\2U\u013d\3\2\2\2W\u013f\3\2\2\2Y\u0141\3\2\2\2["+
		"\u0143\3\2\2\2]\u0145\3\2\2\2_\u0148\3\2\2\2a\u014b\3\2\2\2c\u014e\3\2"+
		"\2\2e\u0151\3\2\2\2g\u0155\3\2\2\2i\u0158\3\2\2\2k\u015a\3\2\2\2m\u015c"+
		"\3\2\2\2o\u015e\3\2\2\2q\u0160\3\2\2\2s\u0162\3\2\2\2u\u0165\3\2\2\2w"+
		"\u0168\3\2\2\2y\u016b\3\2\2\2{\u016f\3\2\2\2}\u0173\3\2\2\2\177\u0080"+
		"\7i\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\4\3\2\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7q\2\2\u0085\u0086\7p\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7v\2\2\u0088\6\3\2\2\2\u0089\u008a\7n\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7v\2\2\u008d\b\3\2\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\u0092\7f\2\2\u0092\n\3\2\2\2\u0093"+
		"\u0094\7e\2\2\u0094\u0095\7j\2\2\u0095\u0096\7g\2\2\u0096\u0097\7e\2\2"+
		"\u0097\u0098\7m\2\2\u0098\f\3\2\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v"+
		"\2\2\u009b\u009c\7j\2\2\u009c\u009d\7g\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7y\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\16\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\20\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7"+
		"v\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\24\3\2\2\2\u00b5\u00b6"+
		"\7e\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\30\3\2\2\2\u00c1"+
		"\u00c2\7d\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2"+
		"\u00c5\32\3\2\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7"+
		"k\2\2\u00c9\u00ca\7f\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd"+
		"\7w\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3\36\3\2\2\2\u00d4"+
		"\u00d5\7h\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7o\2\2"+
		"\u00d8 \3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7q\2\2\u00db\"\3\2\2\2"+
		"\u00dc\u00dd\7e\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7w\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7t\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7m\2\2\u00ea&\3\2\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7h\2\2\u00ed(\3\2\2\2\u00ee\u00f1\5k\66\2\u00ef"+
		"\u00f1\5i\65\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f5\5+\26\2\u00f3\u00f5\5\61\31\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5*\3\2\2\2\u00f6\u00fa\5-\27\2"+
		"\u00f7\u00f9\5/\30\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb,\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\t\2\2\2\u00fe.\3\2\2\2\u00ff\u0100\t\3\2\2\u0100\60\3\2\2\2\u0101"+
		"\u0102\7\62\2\2\u0102\62\3\2\2\2\u0103\u0106\5i\65\2\u0104\u0106\5k\66"+
		"\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0108\5)\25\2\u0108\u0109\5Q)\2\u0109\u010a\5)\25\2\u010a"+
		"\64\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u0115\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2"+
		"\u0112\u0113\7u\2\2\u0113\u0115\7g\2\2\u0114\u010b\3\2\2\2\u0114\u010f"+
		"\3\2\2\2\u0115\66\3\2\2\2\u0116\u0117\7)\2\2\u0117\u0118\59\35\2\u0118"+
		"\u0119\7)\2\2\u01198\3\2\2\2\u011a\u011b\n\4\2\2\u011b:\3\2\2\2\u011c"+
		"\u011e\7$\2\2\u011d\u011f\5=\37\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7$\2\2\u0121<\3\2\2\2\u0122\u0124"+
		"\5? \2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126>\3\2\2\2\u0127\u0128\n\5\2\2\u0128@\3\2\2\2\u0129"+
		"\u012a\7*\2\2\u012aB\3\2\2\2\u012b\u012c\7+\2\2\u012cD\3\2\2\2\u012d\u012e"+
		"\7}\2\2\u012eF\3\2\2\2\u012f\u0130\7\177\2\2\u0130H\3\2\2\2\u0131\u0132"+
		"\7]\2\2\u0132J\3\2\2\2\u0133\u0134\7_\2\2\u0134L\3\2\2\2\u0135\u0136\7"+
		"=\2\2\u0136N\3\2\2\2\u0137\u0138\7.\2\2\u0138P\3\2\2\2\u0139\u013a\7\60"+
		"\2\2\u013aR\3\2\2\2\u013b\u013c\7<\2\2\u013cT\3\2\2\2\u013d\u013e\7?\2"+
		"\2\u013eV\3\2\2\2\u013f\u0140\7@\2\2\u0140X\3\2\2\2\u0141\u0142\7>\2\2"+
		"\u0142Z\3\2\2\2\u0143\u0144\7#\2\2\u0144\\\3\2\2\2\u0145\u0146\7?\2\2"+
		"\u0146\u0147\7?\2\2\u0147^\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a\7?\2"+
		"\2\u014a`\3\2\2\2\u014b\u014c\7@\2\2\u014c\u014d\7?\2\2\u014db\3\2\2\2"+
		"\u014e\u014f\7#\2\2\u014f\u0150\7?\2\2\u0150d\3\2\2\2\u0151\u0152\7c\2"+
		"\2\u0152\u0153\7p\2\2\u0153\u0154\7f\2\2\u0154f\3\2\2\2\u0155\u0156\7"+
		"q\2\2\u0156\u0157\7t\2\2\u0157h\3\2\2\2\u0158\u0159\7-\2\2\u0159j\3\2"+
		"\2\2\u015a\u015b\7/\2\2\u015bl\3\2\2\2\u015c\u015d\7,\2\2\u015dn\3\2\2"+
		"\2\u015e\u015f\7\61\2\2\u015fp\3\2\2\2\u0160\u0161\7\'\2\2\u0161r\3\2"+
		"\2\2\u0162\u0163\7-\2\2\u0163\u0164\7?\2\2\u0164t\3\2\2\2\u0165\u0166"+
		"\7/\2\2\u0166\u0167\7?\2\2\u0167v\3\2\2\2\u0168\u0169\7,\2\2\u0169\u016a"+
		"\7?\2\2\u016ax\3\2\2\2\u016b\u016c\7\61\2\2\u016c\u016d\7?\2\2\u016dz"+
		"\3\2\2\2\u016e\u0170\t\6\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172|\3\2\2\2\u0173\u0174\t\7\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\u0176\b?\2\2\u0176~\3\2\2\2\13\2\u00f0\u00f4"+
		"\u00fa\u0105\u0114\u011e\u0125\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}