// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Lexer.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
		DIV_ASSIGN=53, Identifier=54, WS=55, COMMENT=56, LINE_COMMENT=57;
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
			"MUL_ASSIGN", "DIV_ASSIGN", "Identifier", "IdentifierStart", "IdentifierEnd", 
			"WS", "COMMENT", "LINE_COMMENT"
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
			"Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5\25\u00f9\n\25\3\25\3\25"+
		"\5\25\u00fd\n\25\3\26\3\26\7\26\u0101\n\26\f\26\16\26\u0104\13\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u010e\n\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011d\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u0127\n\36\3\36\3\36\3\37\6\37\u012c"+
		"\n\37\r\37\16\37\u012d\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3"+
		"=\3=\3>\3>\3>\7>\u017a\n>\f>\16>\u017d\13>\5>\u017f\n>\3?\3?\3@\5@\u0184"+
		"\n@\3A\6A\u0187\nA\rA\16A\u0188\3A\3A\3B\3B\3B\3B\7B\u0191\nB\fB\16B\u0194"+
		"\13B\3B\3B\3B\3B\3B\3C\3C\3C\3C\7C\u019f\nC\fC\16C\u01a2\13C\3C\3C\3\u0192"+
		"\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\27\65\30\67\319\2;\32"+
		"=\2?\2A\33C\34E\35G\36I\37K M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o"+
		"\62q\63s\64u\65w\66y\67{8}\2\177\2\u00819\u0083:\u0085;\3\2\13\3\2\63"+
		";\3\2\62;\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\4\2C\\c|\5\2C\\aac|\5\2"+
		"\62;C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u01a9\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008b\3\2\2\2\7\u0091\3\2\2"+
		"\2\t\u0096\3\2\2\2\13\u009b\3\2\2\2\r\u00a1\3\2\2\2\17\u00ab\3\2\2\2\21"+
		"\u00b3\3\2\2\2\23\u00b7\3\2\2\2\25\u00bd\3\2\2\2\27\u00c2\3\2\2\2\31\u00c9"+
		"\3\2\2\2\33\u00ce\3\2\2\2\35\u00d3\3\2\2\2\37\u00dc\3\2\2\2!\u00e1\3\2"+
		"\2\2#\u00e4\3\2\2\2%\u00ed\3\2\2\2\'\u00f3\3\2\2\2)\u00f8\3\2\2\2+\u00fe"+
		"\3\2\2\2-\u0105\3\2\2\2/\u0107\3\2\2\2\61\u0109\3\2\2\2\63\u010d\3\2\2"+
		"\2\65\u011c\3\2\2\2\67\u011e\3\2\2\29\u0122\3\2\2\2;\u0124\3\2\2\2=\u012b"+
		"\3\2\2\2?\u012f\3\2\2\2A\u0131\3\2\2\2C\u0133\3\2\2\2E\u0135\3\2\2\2G"+
		"\u0137\3\2\2\2I\u0139\3\2\2\2K\u013b\3\2\2\2M\u013d\3\2\2\2O\u013f\3\2"+
		"\2\2Q\u0141\3\2\2\2S\u0143\3\2\2\2U\u0145\3\2\2\2W\u0147\3\2\2\2Y\u0149"+
		"\3\2\2\2[\u014b\3\2\2\2]\u014d\3\2\2\2_\u0150\3\2\2\2a\u0153\3\2\2\2c"+
		"\u0156\3\2\2\2e\u0159\3\2\2\2g\u015d\3\2\2\2i\u0160\3\2\2\2k\u0162\3\2"+
		"\2\2m\u0164\3\2\2\2o\u0166\3\2\2\2q\u0168\3\2\2\2s\u016a\3\2\2\2u\u016d"+
		"\3\2\2\2w\u0170\3\2\2\2y\u0173\3\2\2\2{\u0176\3\2\2\2}\u0180\3\2\2\2\177"+
		"\u0183\3\2\2\2\u0081\u0186\3\2\2\2\u0083\u018c\3\2\2\2\u0085\u019a\3\2"+
		"\2\2\u0087\u0088\7i\2\2\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\4"+
		"\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090\6\3\2\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\b\3\2\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2"+
		"\u009a\n\3\2\2\2\u009b\u009c\7e\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g"+
		"\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7m\2\2\u00a0\f\3\2\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7y\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7u\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7"+
		"v\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"\24\3\2\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7i\2\2"+
		"\u00c8\30\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7"+
		"q\2\2\u00cc\u00cd\7n\2\2\u00cd\32\3\2\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7f\2\2\u00d2\34\3\2\2\2\u00d3\u00d4"+
		"\7h\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7e\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2"+
		"\u00db\36\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7"+
		"q\2\2\u00df\u00e0\7o\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3"+
		"\7q\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\u00eb\7w\2\2\u00eb\u00ec\7g\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7d\2\2\u00ee"+
		"\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7m\2\2"+
		"\u00f2&\3\2\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7h\2\2\u00f5(\3\2\2\2\u00f6"+
		"\u00f9\5k\66\2\u00f7\u00f9\5i\65\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fd\5+\26\2\u00fb"+
		"\u00fd\5\61\31\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd*\3\2\2"+
		"\2\u00fe\u0102\5-\27\2\u00ff\u0101\5/\30\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103,\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\t\2\2\2\u0106.\3\2\2\2\u0107\u0108\t\3\2\2"+
		"\u0108\60\3\2\2\2\u0109\u010a\7\62\2\2\u010a\62\3\2\2\2\u010b\u010e\5"+
		"i\65\2\u010c\u010e\5k\66\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5)\25\2\u0110\u0111\5Q"+
		")\2\u0111\u0112\5)\25\2\u0112\64\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115"+
		"\7t\2\2\u0115\u0116\7w\2\2\u0116\u011d\7g\2\2\u0117\u0118\7h\2\2\u0118"+
		"\u0119\7c\2\2\u0119\u011a\7n\2\2\u011a\u011b\7u\2\2\u011b\u011d\7g\2\2"+
		"\u011c\u0113\3\2\2\2\u011c\u0117\3\2\2\2\u011d\66\3\2\2\2\u011e\u011f"+
		"\7)\2\2\u011f\u0120\59\35\2\u0120\u0121\7)\2\2\u01218\3\2\2\2\u0122\u0123"+
		"\n\4\2\2\u0123:\3\2\2\2\u0124\u0126\7$\2\2\u0125\u0127\5=\37\2\u0126\u0125"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7$\2\2\u0129"+
		"<\3\2\2\2\u012a\u012c\5? \2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e>\3\2\2\2\u012f\u0130\n\5\2\2"+
		"\u0130@\3\2\2\2\u0131\u0132\7*\2\2\u0132B\3\2\2\2\u0133\u0134\7+\2\2\u0134"+
		"D\3\2\2\2\u0135\u0136\7}\2\2\u0136F\3\2\2\2\u0137\u0138\7\177\2\2\u0138"+
		"H\3\2\2\2\u0139\u013a\7]\2\2\u013aJ\3\2\2\2\u013b\u013c\7_\2\2\u013cL"+
		"\3\2\2\2\u013d\u013e\7=\2\2\u013eN\3\2\2\2\u013f\u0140\7.\2\2\u0140P\3"+
		"\2\2\2\u0141\u0142\7\60\2\2\u0142R\3\2\2\2\u0143\u0144\7<\2\2\u0144T\3"+
		"\2\2\2\u0145\u0146\7?\2\2\u0146V\3\2\2\2\u0147\u0148\7@\2\2\u0148X\3\2"+
		"\2\2\u0149\u014a\7>\2\2\u014aZ\3\2\2\2\u014b\u014c\7#\2\2\u014c\\\3\2"+
		"\2\2\u014d\u014e\7?\2\2\u014e\u014f\7?\2\2\u014f^\3\2\2\2\u0150\u0151"+
		"\7>\2\2\u0151\u0152\7?\2\2\u0152`\3\2\2\2\u0153\u0154\7@\2\2\u0154\u0155"+
		"\7?\2\2\u0155b\3\2\2\2\u0156\u0157\7#\2\2\u0157\u0158\7?\2\2\u0158d\3"+
		"\2\2\2\u0159\u015a\7c\2\2\u015a\u015b\7p\2\2\u015b\u015c\7f\2\2\u015c"+
		"f\3\2\2\2\u015d\u015e\7q\2\2\u015e\u015f\7t\2\2\u015fh\3\2\2\2\u0160\u0161"+
		"\7-\2\2\u0161j\3\2\2\2\u0162\u0163\7/\2\2\u0163l\3\2\2\2\u0164\u0165\7"+
		",\2\2\u0165n\3\2\2\2\u0166\u0167\7\61\2\2\u0167p\3\2\2\2\u0168\u0169\7"+
		"\'\2\2\u0169r\3\2\2\2\u016a\u016b\7-\2\2\u016b\u016c\7?\2\2\u016ct\3\2"+
		"\2\2\u016d\u016e\7/\2\2\u016e\u016f\7?\2\2\u016fv\3\2\2\2\u0170\u0171"+
		"\7,\2\2\u0171\u0172\7?\2\2\u0172x\3\2\2\2\u0173\u0174\7\61\2\2\u0174\u0175"+
		"\7?\2\2\u0175z\3\2\2\2\u0176\u017e\5}?\2\u0177\u017b\t\6\2\2\u0178\u017a"+
		"\5\177@\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0177"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f|\3\2\2\2\u0180\u0181\t\7\2\2\u0181"+
		"~\3\2\2\2\u0182\u0184\t\b\2\2\u0183\u0182\3\2\2\2\u0184\u0080\3\2\2\2"+
		"\u0185\u0187\t\t\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\bA\2\2\u018b"+
		"\u0082\3\2\2\2\u018c\u018d\7\61\2\2\u018d\u018e\7,\2\2\u018e\u0192\3\2"+
		"\2\2\u018f\u0191\13\2\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0196\7,\2\2\u0196\u0197\7\61\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\bB\2\2\u0199\u0084\3\2\2\2\u019a\u019b\7\61\2\2\u019b\u019c\7\61"+
		"\2\2\u019c\u01a0\3\2\2\2\u019d\u019f\n\n\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\bC\2\2\u01a4\u0086\3\2\2\2\20\2\u00f8"+
		"\u00fc\u0102\u010d\u011c\u0126\u012d\u017b\u017e\u0183\u0188\u0192\u01a0"+
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