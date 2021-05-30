// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Lexer.g4 by ANTLR 4.9.1

package antlr.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplyV3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GET=1, CONST=2, LIST=3, SEND=4, CHECK=5, OTHERWISE=6, ITERATE=7, FUNCTION=8, 
		FROM=9, TO=10, CONTINUE=11, BREAK=12, OF=13, GLOBAL=14, RANGE=15, NEXT=16, 
		OUT=17, IN=18, INT=19, FLOAT=20, CHAR=21, STRING=22, BOOL=23, VOID=24, 
		IntegerLiteral=25, FloatLiteral=26, BoolLiteral=27, CharLiteral=28, StringLiteral=29, 
		LPAREN=30, RPAREN=31, LBRACE=32, RBRACE=33, LBRACK=34, RBRACK=35, EOL=36, 
		COMMA=37, DOT=38, COLON=39, ASSIGN=40, GT=41, LT=42, BANG=43, EQUAL=44, 
		LE=45, GE=46, NOTEQUAL=47, AND=48, OR=49, ADD=50, SUB=51, MUL=52, DIV=53, 
		MOD=54, ADD_ASSIGN=55, SUB_ASSIGN=56, MUL_ASSIGN=57, DIV_ASSIGN=58, Identifier=59, 
		WS=60, COMMENT=61, LINE_COMMENT=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", "FUNCTION", 
			"FROM", "TO", "CONTINUE", "BREAK", "OF", "GLOBAL", "RANGE", "NEXT", "OUT", 
			"IN", "INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", "IntegerLiteral", 
			"NonZeroInteger", "NonZeroDigit", "Digit", "Zero", "FloatLiteral", "BoolLiteral", 
			"CharLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "EOL", "COMMA", "DOT", "COLON", "ASSIGN", "GT", "LT", "BANG", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "Identifier", 
			"IdentifierStart", "IdentifierEnd", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'constant'", "'list'", "'return'", "'if'", "'else'", 
			"'repeat'", "'function'", "'from'", "'to'", "'continue'", "'break'", 
			"'of'", "'global'", "'range'", "'next'", "'out'", "'in'", "'integer'", 
			"'float'", "'character'", "'string'", "'boolean'", "'no'", null, null, 
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "':'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", 
			"'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", 
			"'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", 
			"FUNCTION", "FROM", "TO", "CONTINUE", "BREAK", "OF", "GLOBAL", "RANGE", 
			"NEXT", "OUT", "IN", "INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", 
			"IntegerLiteral", "FloatLiteral", "BoolLiteral", "CharLiteral", "StringLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "EOL", "COMMA", 
			"DOT", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\5\32\u0122\n\32\3\32\3\32\5\32\u0126\n\32\3\33\3\33"+
		"\7\33\u012a\n\33\f\33\16\33\u012d\13\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\5\37\u0137\n\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0146\n \3!\3!\3!\3!\3\"\3\"\3#\3#\5#\u0150\n#\3#\3#\3$\6$\u0155"+
		"\n$\r$\16$\u0156\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\3:"+
		"\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C"+
		"\3C\7C\u01a3\nC\fC\16C\u01a6\13C\5C\u01a8\nC\3D\3D\3E\5E\u01ad\nE\3F\6"+
		"F\u01b0\nF\rF\16F\u01b1\3F\3F\3G\3G\3G\3G\7G\u01ba\nG\fG\16G\u01bd\13"+
		"G\3G\3G\3G\3G\3G\3H\3H\3H\3H\7H\u01c8\nH\fH\16H\u01cb\13H\3H\3H\3\u01bb"+
		"\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\29\2;\2"+
		"=\34?\35A\36C\2E\37G\2I\2K M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62"+
		"q\63s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087\2\u0089\2\u008b"+
		">\u008d?\u008f@\3\2\13\3\2\63;\3\2\62;\6\2\f\f\17\17))^^\6\2\f\f\17\17"+
		"$$^^\4\2C\\c|\5\2C\\aac|\5\2\62;C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\2\u01d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2E\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2"+
		"\2\5\u0095\3\2\2\2\7\u009e\3\2\2\2\t\u00a3\3\2\2\2\13\u00aa\3\2\2\2\r"+
		"\u00ad\3\2\2\2\17\u00b2\3\2\2\2\21\u00b9\3\2\2\2\23\u00c2\3\2\2\2\25\u00c7"+
		"\3\2\2\2\27\u00ca\3\2\2\2\31\u00d3\3\2\2\2\33\u00d9\3\2\2\2\35\u00dc\3"+
		"\2\2\2\37\u00e3\3\2\2\2!\u00e9\3\2\2\2#\u00ee\3\2\2\2%\u00f2\3\2\2\2\'"+
		"\u00f5\3\2\2\2)\u00fd\3\2\2\2+\u0103\3\2\2\2-\u010d\3\2\2\2/\u0114\3\2"+
		"\2\2\61\u011c\3\2\2\2\63\u0121\3\2\2\2\65\u0127\3\2\2\2\67\u012e\3\2\2"+
		"\29\u0130\3\2\2\2;\u0132\3\2\2\2=\u0136\3\2\2\2?\u0145\3\2\2\2A\u0147"+
		"\3\2\2\2C\u014b\3\2\2\2E\u014d\3\2\2\2G\u0154\3\2\2\2I\u0158\3\2\2\2K"+
		"\u015a\3\2\2\2M\u015c\3\2\2\2O\u015e\3\2\2\2Q\u0160\3\2\2\2S\u0162\3\2"+
		"\2\2U\u0164\3\2\2\2W\u0166\3\2\2\2Y\u0168\3\2\2\2[\u016a\3\2\2\2]\u016c"+
		"\3\2\2\2_\u016e\3\2\2\2a\u0170\3\2\2\2c\u0172\3\2\2\2e\u0174\3\2\2\2g"+
		"\u0176\3\2\2\2i\u0179\3\2\2\2k\u017c\3\2\2\2m\u017f\3\2\2\2o\u0182\3\2"+
		"\2\2q\u0186\3\2\2\2s\u0189\3\2\2\2u\u018b\3\2\2\2w\u018d\3\2\2\2y\u018f"+
		"\3\2\2\2{\u0191\3\2\2\2}\u0193\3\2\2\2\177\u0196\3\2\2\2\u0081\u0199\3"+
		"\2\2\2\u0083\u019c\3\2\2\2\u0085\u019f\3\2\2\2\u0087\u01a9\3\2\2\2\u0089"+
		"\u01ac\3\2\2\2\u008b\u01af\3\2\2\2\u008d\u01b5\3\2\2\2\u008f\u01c3\3\2"+
		"\2\2\u0091\u0092\7i\2\2\u0092\u0093\7g\2\2\u0093\u0094\7v\2\2\u0094\4"+
		"\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7c\2\2\u009b\u009c\7p\2\2"+
		"\u009c\u009d\7v\2\2\u009d\6\3\2\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7k"+
		"\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2\b\3\2\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7h\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\16\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2"+
		"\u00b7\u00b8\7v\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7"+
		"w\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7v\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\22\3\2\2\2\u00c2\u00c3"+
		"\7h\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7o\2\2\u00c6"+
		"\24\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7q\2\2\u00c9\26\3\2\2\2\u00ca"+
		"\u00cb\7e\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\30\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7m\2\2\u00d8\32\3\2\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7h\2\2\u00db\34\3\2\2\2\u00dc\u00dd\7i\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7n\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7g\2\2\u00e8 \3\2\2\2\u00e9"+
		"\u00ea\7p\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7z\2\2\u00ec\u00ed\7v\2\2"+
		"\u00ed\"\3\2\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7v"+
		"\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4&\3\2\2"+
		"\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"(\3\2\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7v\2\2\u0102*\3\2\2\2\u0103\u0104\7e\2\2\u0104"+
		"\u0105\7j\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107\u0108\7c\2\2"+
		"\u0108\u0109\7e\2\2\u0109\u010a\7v\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7t\2\2\u010c,\3\2\2\2\u010d\u010e\7u\2\2\u010e\u010f\7v\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7i\2\2\u0113"+
		".\3\2\2\2\u0114\u0115\7d\2\2\u0115\u0116\7q\2\2\u0116\u0117\7q\2\2\u0117"+
		"\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a\u011b\7p\2\2"+
		"\u011b\60\3\2\2\2\u011c\u011d\7p\2\2\u011d\u011e\7q\2\2\u011e\62\3\2\2"+
		"\2\u011f\u0122\5u;\2\u0120\u0122\5s:\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0126\5\65\33\2"+
		"\u0124\u0126\5;\36\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\64"+
		"\3\2\2\2\u0127\u012b\5\67\34\2\u0128\u012a\59\35\2\u0129\u0128\3\2\2\2"+
		"\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\66"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\t\2\2\2\u012f8\3\2\2\2\u0130"+
		"\u0131\t\3\2\2\u0131:\3\2\2\2\u0132\u0133\7\62\2\2\u0133<\3\2\2\2\u0134"+
		"\u0137\5s:\2\u0135\u0137\5u;\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\5\63\32\2\u0139\u013a"+
		"\5[.\2\u013a\u013b\5\63\32\2\u013b>\3\2\2\2\u013c\u013d\7v\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7w\2\2\u013f\u0146\7g\2\2\u0140\u0141\7h\2\2\u0141"+
		"\u0142\7c\2\2\u0142\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0146\7g\2\2"+
		"\u0145\u013c\3\2\2\2\u0145\u0140\3\2\2\2\u0146@\3\2\2\2\u0147\u0148\7"+
		")\2\2\u0148\u0149\5C\"\2\u0149\u014a\7)\2\2\u014aB\3\2\2\2\u014b\u014c"+
		"\n\4\2\2\u014cD\3\2\2\2\u014d\u014f\7$\2\2\u014e\u0150\5G$\2\u014f\u014e"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7$\2\2\u0152"+
		"F\3\2\2\2\u0153\u0155\5I%\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157H\3\2\2\2\u0158\u0159\n\5\2\2"+
		"\u0159J\3\2\2\2\u015a\u015b\7*\2\2\u015bL\3\2\2\2\u015c\u015d\7+\2\2\u015d"+
		"N\3\2\2\2\u015e\u015f\7}\2\2\u015fP\3\2\2\2\u0160\u0161\7\177\2\2\u0161"+
		"R\3\2\2\2\u0162\u0163\7]\2\2\u0163T\3\2\2\2\u0164\u0165\7_\2\2\u0165V"+
		"\3\2\2\2\u0166\u0167\7=\2\2\u0167X\3\2\2\2\u0168\u0169\7.\2\2\u0169Z\3"+
		"\2\2\2\u016a\u016b\7\60\2\2\u016b\\\3\2\2\2\u016c\u016d\7<\2\2\u016d^"+
		"\3\2\2\2\u016e\u016f\7?\2\2\u016f`\3\2\2\2\u0170\u0171\7@\2\2\u0171b\3"+
		"\2\2\2\u0172\u0173\7>\2\2\u0173d\3\2\2\2\u0174\u0175\7#\2\2\u0175f\3\2"+
		"\2\2\u0176\u0177\7?\2\2\u0177\u0178\7?\2\2\u0178h\3\2\2\2\u0179\u017a"+
		"\7>\2\2\u017a\u017b\7?\2\2\u017bj\3\2\2\2\u017c\u017d\7@\2\2\u017d\u017e"+
		"\7?\2\2\u017el\3\2\2\2\u017f\u0180\7#\2\2\u0180\u0181\7?\2\2\u0181n\3"+
		"\2\2\2\u0182\u0183\7c\2\2\u0183\u0184\7p\2\2\u0184\u0185\7f\2\2\u0185"+
		"p\3\2\2\2\u0186\u0187\7q\2\2\u0187\u0188\7t\2\2\u0188r\3\2\2\2\u0189\u018a"+
		"\7-\2\2\u018at\3\2\2\2\u018b\u018c\7/\2\2\u018cv\3\2\2\2\u018d\u018e\7"+
		",\2\2\u018ex\3\2\2\2\u018f\u0190\7\61\2\2\u0190z\3\2\2\2\u0191\u0192\7"+
		"\'\2\2\u0192|\3\2\2\2\u0193\u0194\7-\2\2\u0194\u0195\7?\2\2\u0195~\3\2"+
		"\2\2\u0196\u0197\7/\2\2\u0197\u0198\7?\2\2\u0198\u0080\3\2\2\2\u0199\u019a"+
		"\7,\2\2\u019a\u019b\7?\2\2\u019b\u0082\3\2\2\2\u019c\u019d\7\61\2\2\u019d"+
		"\u019e\7?\2\2\u019e\u0084\3\2\2\2\u019f\u01a7\5\u0087D\2\u01a0\u01a4\t"+
		"\6\2\2\u01a1\u01a3\5\u0089E\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2"+
		"\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u0086\3\2\2\2\u01a9"+
		"\u01aa\t\7\2\2\u01aa\u0088\3\2\2\2\u01ab\u01ad\t\b\2\2\u01ac\u01ab\3\2"+
		"\2\2\u01ad\u008a\3\2\2\2\u01ae\u01b0\t\t\2\2\u01af\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b4\bF\2\2\u01b4\u008c\3\2\2\2\u01b5\u01b6\7\61\2\2\u01b6"+
		"\u01b7\7,\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\13\2\2\2\u01b9\u01b8\3\2"+
		"\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7,\2\2\u01bf\u01c0\7\61"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bG\2\2\u01c2\u008e\3\2\2\2\u01c3"+
		"\u01c4\7\61\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c8\n"+
		"\n\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\bH"+
		"\2\2\u01cd\u0090\3\2\2\2\20\2\u0121\u0125\u012b\u0136\u0145\u014f\u0156"+
		"\u01a4\u01a7\u01ac\u01b1\u01bb\u01c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}