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
			"CONTINUE", "BREAK", "OF", "IntegerLiteral", "FloatLiteral", "BoolLiteral", 
			"CharLiteral", "StringLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "EOL", "COMMA", "DOT", "COLON", "ASSIGN", "GT", "LT", 
			"BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", "MUL", 
			"DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"Identifier", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00e4\n\25"+
		"\f\25\16\25\u00e7\13\25\5\25\u00e9\n\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f8\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\7\31\u0100\n\31\f\31\16\31\u0103\13\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\6\67\u014d\n\67"+
		"\r\67\16\67\u014e\38\38\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\6\3\2\63;\3\2\62;\3\2c|\5\2"+
		"\13\f\17\17\"\"\2\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5u\3\2\2\2\7{\3\2\2\2\t"+
		"\u0080\3\2\2\2\13\u0085\3\2\2\2\r\u008b\3\2\2\2\17\u0095\3\2\2\2\21\u009d"+
		"\3\2\2\2\23\u00a1\3\2\2\2\25\u00a7\3\2\2\2\27\u00ac\3\2\2\2\31\u00b3\3"+
		"\2\2\2\33\u00b8\3\2\2\2\35\u00bd\3\2\2\2\37\u00c6\3\2\2\2!\u00cb\3\2\2"+
		"\2#\u00ce\3\2\2\2%\u00d7\3\2\2\2\'\u00dd\3\2\2\2)\u00e8\3\2\2\2+\u00ea"+
		"\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2\2\2\61\u00fd\3\2\2\2\63\u0106\3\2\2"+
		"\2\65\u0108\3\2\2\2\67\u010a\3\2\2\29\u010c\3\2\2\2;\u010e\3\2\2\2=\u0110"+
		"\3\2\2\2?\u0112\3\2\2\2A\u0114\3\2\2\2C\u0116\3\2\2\2E\u0118\3\2\2\2G"+
		"\u011a\3\2\2\2I\u011c\3\2\2\2K\u011e\3\2\2\2M\u0120\3\2\2\2O\u0122\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u012b\3\2\2\2W\u012e\3\2\2\2Y\u0132"+
		"\3\2\2\2[\u0135\3\2\2\2]\u0137\3\2\2\2_\u0139\3\2\2\2a\u013b\3\2\2\2c"+
		"\u013d\3\2\2\2e\u013f\3\2\2\2g\u0142\3\2\2\2i\u0145\3\2\2\2k\u0148\3\2"+
		"\2\2m\u014c\3\2\2\2o\u0150\3\2\2\2qr\7i\2\2rs\7g\2\2st\7v\2\2t\4\3\2\2"+
		"\2uv\7e\2\2vw\7q\2\2wx\7p\2\2xy\7u\2\2yz\7v\2\2z\6\3\2\2\2{|\7n\2\2|}"+
		"\7k\2\2}~\7u\2\2~\177\7v\2\2\177\b\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2\2\u0084\n\3\2\2\2\u0085\u0086"+
		"\7e\2\2\u0086\u0087\7j\2\2\u0087\u0088\7g\2\2\u0088\u0089\7e\2\2\u0089"+
		"\u008a\7m\2\2\u008a\f\3\2\2\2\u008b\u008c\7q\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2\u0090\u0091\7y\2\2"+
		"\u0091\u0092\7k\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\16\3\2"+
		"\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b\u009c\7g\2\2\u009c"+
		"\20\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\22\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8"+
		"\u00a9\7j\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\26\3\2\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7k\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1\u00b2\7i\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7"+
		"d\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7n\2\2\u00b7\32"+
		"\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7k\2\2"+
		"\u00c3\u00c4\7q\2\2\u00c4\u00c5\7p\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7"+
		"h\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7o\2\2\u00ca "+
		"\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7q\2\2\u00cd\"\3\2\2\2\u00ce\u00cf"+
		"\7e\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6$\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2"+
		"\2\u00da\u00db\7c\2\2\u00db\u00dc\7m\2\2\u00dc&\3\2\2\2\u00dd\u00de\7"+
		"q\2\2\u00de\u00df\7h\2\2\u00df(\3\2\2\2\u00e0\u00e9\7\62\2\2\u00e1\u00e5"+
		"\t\2\2\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9*\3\2\2\2\u00ea\u00eb"+
		"\5)\25\2\u00eb\u00ec\5C\"\2\u00ec\u00ed\5)\25\2\u00ed,\3\2\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f8\7g\2\2\u00f2"+
		"\u00f3\7h\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2"+
		"\u00f6\u00f8\7g\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8.\3\2"+
		"\2\2\u00f9\u00fa\7)\2\2\u00fa\u00fb\t\4\2\2\u00fb\u00fc\7)\2\2\u00fc\60"+
		"\3\2\2\2\u00fd\u0101\7$\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7$\2\2\u0105\62\3\2\2\2\u0106\u0107"+
		"\7*\2\2\u0107\64\3\2\2\2\u0108\u0109\7+\2\2\u0109\66\3\2\2\2\u010a\u010b"+
		"\7}\2\2\u010b8\3\2\2\2\u010c\u010d\7\177\2\2\u010d:\3\2\2\2\u010e\u010f"+
		"\7]\2\2\u010f<\3\2\2\2\u0110\u0111\7_\2\2\u0111>\3\2\2\2\u0112\u0113\7"+
		"=\2\2\u0113@\3\2\2\2\u0114\u0115\7.\2\2\u0115B\3\2\2\2\u0116\u0117\7\60"+
		"\2\2\u0117D\3\2\2\2\u0118\u0119\7<\2\2\u0119F\3\2\2\2\u011a\u011b\7?\2"+
		"\2\u011bH\3\2\2\2\u011c\u011d\7@\2\2\u011dJ\3\2\2\2\u011e\u011f\7>\2\2"+
		"\u011fL\3\2\2\2\u0120\u0121\7#\2\2\u0121N\3\2\2\2\u0122\u0123\7?\2\2\u0123"+
		"\u0124\7?\2\2\u0124P\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127\7?\2\2\u0127"+
		"R\3\2\2\2\u0128\u0129\7@\2\2\u0129\u012a\7?\2\2\u012aT\3\2\2\2\u012b\u012c"+
		"\7#\2\2\u012c\u012d\7?\2\2\u012dV\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130"+
		"\7p\2\2\u0130\u0131\7f\2\2\u0131X\3\2\2\2\u0132\u0133\7q\2\2\u0133\u0134"+
		"\7t\2\2\u0134Z\3\2\2\2\u0135\u0136\7-\2\2\u0136\\\3\2\2\2\u0137\u0138"+
		"\7/\2\2\u0138^\3\2\2\2\u0139\u013a\7,\2\2\u013a`\3\2\2\2\u013b\u013c\7"+
		"\61\2\2\u013cb\3\2\2\2\u013d\u013e\7\'\2\2\u013ed\3\2\2\2\u013f\u0140"+
		"\7-\2\2\u0140\u0141\7?\2\2\u0141f\3\2\2\2\u0142\u0143\7/\2\2\u0143\u0144"+
		"\7?\2\2\u0144h\3\2\2\2\u0145\u0146\7,\2\2\u0146\u0147\7?\2\2\u0147j\3"+
		"\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a\7?\2\2\u014al\3\2\2\2\u014b\u014d"+
		"\t\4\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014fn\3\2\2\2\u0150\u0151\t\5\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0153\b8\2\2\u0153p\3\2\2\2\b\2\u00e5\u00e8\u00f7\u0101\u014e\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}