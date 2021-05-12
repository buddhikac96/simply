// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Lexer.g4 by ANTLR 4.9.1

package antlr.gen;

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
		CONTINUE=17, BREAK=18, OF=19, GLOBAL=20, RANGE=21, NEXT=22, IntegerLiteral=23, 
		FloatLiteral=24, BoolLiteral=25, CharLiteral=26, StringLiteral=27, LPAREN=28, 
		RPAREN=29, LBRACE=30, RBRACE=31, LBRACK=32, RBRACK=33, EOL=34, COMMA=35, 
		DOT=36, COLON=37, ASSIGN=38, GT=39, LT=40, BANG=41, EQUAL=42, LE=43, GE=44, 
		NOTEQUAL=45, AND=46, OR=47, ADD=48, SUB=49, MUL=50, DIV=51, MOD=52, ADD_ASSIGN=53, 
		SUB_ASSIGN=54, MUL_ASSIGN=55, DIV_ASSIGN=56, Identifier=57, WS=58, COMMENT=59, 
		LINE_COMMENT=60;
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
			"CONTINUE", "BREAK", "OF", "GLOBAL", "RANGE", "NEXT", "IntegerLiteral", 
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
			null, "'get'", "'const'", "'list'", "'send'", "'check'", "'otherwise'", 
			"'iterate'", "'int'", "'float'", "'char'", "'string'", "'bool'", "'void'", 
			"'function'", "'from'", "'to'", "'continue'", "'break'", "'of'", "'global'", 
			"'range'", "'next'", null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "':'", "'='", "'>'", "'<'", 
			"'!'", "'=='", "'<='", "'>='", "'!='", "'and'", "'or'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", 
			"INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", "FUNCTION", "FROM", 
			"TO", "CONTINUE", "BREAK", "OF", "GLOBAL", "RANGE", "NEXT", "IntegerLiteral", 
			"FloatLiteral", "BoolLiteral", "CharLiteral", "StringLiteral", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "EOL", "COMMA", "DOT", 
			"COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\5\30\u0111\n\30\3\30\3\30\5\30\u0115\n\30\3\31\3\31\7\31"+
		"\u0119\n\31\f\31\16\31\u011c\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\5\35\u0126\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0135\n\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\5!\u013f"+
		"\n!\3!\3!\3\"\6\"\u0144\n\"\r\"\16\"\u0145\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3"+
		">\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\7A\u0192\nA\fA\16A\u0195\13A\5A\u0197"+
		"\nA\3B\3B\3C\5C\u019c\nC\3D\6D\u019f\nD\rD\16D\u01a0\3D\3D\3E\3E\3E\3"+
		"E\7E\u01a9\nE\fE\16E\u01ac\13E\3E\3E\3E\3E\3E\3F\3F\3F\3F\7F\u01b7\nF"+
		"\fF\16F\u01ba\13F\3F\3F\3\u01aa\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\2\63\2\65\2\67\29\32;\33=\34?\2A\35C\2E\2G\36I\37K M!O\"Q#S$U"+
		"%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:\u0081"+
		";\u0083\2\u0085\2\u0087<\u0089=\u008b>\3\2\13\3\2\63;\3\2\62;\6\2\f\f"+
		"\17\17))^^\6\2\f\f\17\17$$^^\4\2C\\c|\5\2C\\aac|\5\2\62;C\\c|\5\2\13\f"+
		"\16\17\"\"\4\2\f\f\17\17\2\u01c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2A"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0091"+
		"\3\2\2\2\7\u0097\3\2\2\2\t\u009c\3\2\2\2\13\u00a1\3\2\2\2\r\u00a7\3\2"+
		"\2\2\17\u00b1\3\2\2\2\21\u00b9\3\2\2\2\23\u00bd\3\2\2\2\25\u00c3\3\2\2"+
		"\2\27\u00c8\3\2\2\2\31\u00cf\3\2\2\2\33\u00d4\3\2\2\2\35\u00d9\3\2\2\2"+
		"\37\u00e2\3\2\2\2!\u00e7\3\2\2\2#\u00ea\3\2\2\2%\u00f3\3\2\2\2\'\u00f9"+
		"\3\2\2\2)\u00fc\3\2\2\2+\u0103\3\2\2\2-\u0109\3\2\2\2/\u0110\3\2\2\2\61"+
		"\u0116\3\2\2\2\63\u011d\3\2\2\2\65\u011f\3\2\2\2\67\u0121\3\2\2\29\u0125"+
		"\3\2\2\2;\u0134\3\2\2\2=\u0136\3\2\2\2?\u013a\3\2\2\2A\u013c\3\2\2\2C"+
		"\u0143\3\2\2\2E\u0147\3\2\2\2G\u0149\3\2\2\2I\u014b\3\2\2\2K\u014d\3\2"+
		"\2\2M\u014f\3\2\2\2O\u0151\3\2\2\2Q\u0153\3\2\2\2S\u0155\3\2\2\2U\u0157"+
		"\3\2\2\2W\u0159\3\2\2\2Y\u015b\3\2\2\2[\u015d\3\2\2\2]\u015f\3\2\2\2_"+
		"\u0161\3\2\2\2a\u0163\3\2\2\2c\u0165\3\2\2\2e\u0168\3\2\2\2g\u016b\3\2"+
		"\2\2i\u016e\3\2\2\2k\u0171\3\2\2\2m\u0175\3\2\2\2o\u0178\3\2\2\2q\u017a"+
		"\3\2\2\2s\u017c\3\2\2\2u\u017e\3\2\2\2w\u0180\3\2\2\2y\u0182\3\2\2\2{"+
		"\u0185\3\2\2\2}\u0188\3\2\2\2\177\u018b\3\2\2\2\u0081\u018e\3\2\2\2\u0083"+
		"\u0198\3\2\2\2\u0085\u019b\3\2\2\2\u0087\u019e\3\2\2\2\u0089\u01a4\3\2"+
		"\2\2\u008b\u01b2\3\2\2\2\u008d\u008e\7i\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7v\2\2\u0090\4\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7u\2\2\u0095\u0096\7v\2\2\u0096\6\3\2\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7k\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b"+
		"\b\3\2\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7m\2\2\u00a6\f\3\2\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b0\7g\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7h\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7v\2\2"+
		"\u00c2\24\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7"+
		"c\2\2\u00c6\u00c7\7t\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7i\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7q\2\2\u00d2\u00d3\7n\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7x\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7f\2\2\u00d8\34\3\2\2\2\u00d9"+
		"\u00da\7h\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7e\2\2"+
		"\u00dd\u00de\7v\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\36\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7o\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7g\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4"+
		"\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7m\2\2"+
		"\u00f8&\3\2\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7h\2\2\u00fb(\3\2\2\2\u00fc"+
		"\u00fd\7i\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7d\2\2"+
		"\u0100\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102*\3\2\2\2\u0103\u0104\7t\2"+
		"\2\u0104\u0105\7c\2\2\u0105\u0106\7p\2\2\u0106\u0107\7i\2\2\u0107\u0108"+
		"\7g\2\2\u0108,\3\2\2\2\u0109\u010a\7p\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7z\2\2\u010c\u010d\7v\2\2\u010d.\3\2\2\2\u010e\u0111\5q9\2\u010f\u0111"+
		"\5o8\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0115\5\61\31\2\u0113\u0115\5\67\34\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\60\3\2\2\2\u0116\u011a\5\63\32\2\u0117"+
		"\u0119\5\65\33\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\62\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\t\2\2\2\u011e\64\3\2\2\2\u011f\u0120\t\3\2\2\u0120\66\3\2\2\2\u0121"+
		"\u0122\7\62\2\2\u01228\3\2\2\2\u0123\u0126\5o8\2\u0124\u0126\5q9\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\5/\30\2\u0128\u0129\5W,\2\u0129\u012a\5/\30\2\u012a:"+
		"\3\2\2\2\u012b\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e\7w\2\2\u012e"+
		"\u0135\7g\2\2\u012f\u0130\7h\2\2\u0130\u0131\7c\2\2\u0131\u0132\7n\2\2"+
		"\u0132\u0133\7u\2\2\u0133\u0135\7g\2\2\u0134\u012b\3\2\2\2\u0134\u012f"+
		"\3\2\2\2\u0135<\3\2\2\2\u0136\u0137\7)\2\2\u0137\u0138\5? \2\u0138\u0139"+
		"\7)\2\2\u0139>\3\2\2\2\u013a\u013b\n\4\2\2\u013b@\3\2\2\2\u013c\u013e"+
		"\7$\2\2\u013d\u013f\5C\"\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\7$\2\2\u0141B\3\2\2\2\u0142\u0144\5E#\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146D\3\2\2\2\u0147\u0148\n\5\2\2\u0148F\3\2\2\2\u0149\u014a\7*"+
		"\2\2\u014aH\3\2\2\2\u014b\u014c\7+\2\2\u014cJ\3\2\2\2\u014d\u014e\7}\2"+
		"\2\u014eL\3\2\2\2\u014f\u0150\7\177\2\2\u0150N\3\2\2\2\u0151\u0152\7]"+
		"\2\2\u0152P\3\2\2\2\u0153\u0154\7_\2\2\u0154R\3\2\2\2\u0155\u0156\7=\2"+
		"\2\u0156T\3\2\2\2\u0157\u0158\7.\2\2\u0158V\3\2\2\2\u0159\u015a\7\60\2"+
		"\2\u015aX\3\2\2\2\u015b\u015c\7<\2\2\u015cZ\3\2\2\2\u015d\u015e\7?\2\2"+
		"\u015e\\\3\2\2\2\u015f\u0160\7@\2\2\u0160^\3\2\2\2\u0161\u0162\7>\2\2"+
		"\u0162`\3\2\2\2\u0163\u0164\7#\2\2\u0164b\3\2\2\2\u0165\u0166\7?\2\2\u0166"+
		"\u0167\7?\2\2\u0167d\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a\7?\2\2\u016a"+
		"f\3\2\2\2\u016b\u016c\7@\2\2\u016c\u016d\7?\2\2\u016dh\3\2\2\2\u016e\u016f"+
		"\7#\2\2\u016f\u0170\7?\2\2\u0170j\3\2\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7p\2\2\u0173\u0174\7f\2\2\u0174l\3\2\2\2\u0175\u0176\7q\2\2\u0176\u0177"+
		"\7t\2\2\u0177n\3\2\2\2\u0178\u0179\7-\2\2\u0179p\3\2\2\2\u017a\u017b\7"+
		"/\2\2\u017br\3\2\2\2\u017c\u017d\7,\2\2\u017dt\3\2\2\2\u017e\u017f\7\61"+
		"\2\2\u017fv\3\2\2\2\u0180\u0181\7\'\2\2\u0181x\3\2\2\2\u0182\u0183\7-"+
		"\2\2\u0183\u0184\7?\2\2\u0184z\3\2\2\2\u0185\u0186\7/\2\2\u0186\u0187"+
		"\7?\2\2\u0187|\3\2\2\2\u0188\u0189\7,\2\2\u0189\u018a\7?\2\2\u018a~\3"+
		"\2\2\2\u018b\u018c\7\61\2\2\u018c\u018d\7?\2\2\u018d\u0080\3\2\2\2\u018e"+
		"\u0196\5\u0083B\2\u018f\u0193\t\6\2\2\u0190\u0192\5\u0085C\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u018f\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0082\3\2\2\2\u0198\u0199\t\7\2\2\u0199\u0084\3\2\2\2\u019a"+
		"\u019c\t\b\2\2\u019b\u019a\3\2\2\2\u019c\u0086\3\2\2\2\u019d\u019f\t\t"+
		"\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\bD\2\2\u01a3\u0088\3\2"+
		"\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a6\7,\2\2\u01a6\u01aa\3\2\2\2\u01a7"+
		"\u01a9\13\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01ae\7,\2\2\u01ae\u01af\7\61\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\bE"+
		"\2\2\u01b1\u008a\3\2\2\2\u01b2\u01b3\7\61\2\2\u01b3\u01b4\7\61\2\2\u01b4"+
		"\u01b8\3\2\2\2\u01b5\u01b7\n\n\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\bF\2\2\u01bc\u008c\3\2\2\2\20\2\u0110\u0114"+
		"\u011a\u0125\u0134\u013e\u0145\u0193\u0196\u019b\u01a0\u01aa\u01b8\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}