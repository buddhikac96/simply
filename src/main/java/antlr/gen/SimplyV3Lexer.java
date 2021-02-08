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
		GET=1, CONST=2, LIST=3, SEND=4, CHECK=5, OTHERWISE=6, ITERATE=7, INT=8, 
		FLOAT=9, CHAR=10, STRING=11, BOOL=12, VOID=13, FUNCTION=14, FROM=15, TO=16, 
		CONTINUE=17, BREAK=18, OF=19, GLOBAL=20, IntegerLiteral=21, FloatLiteral=22, 
		BoolLiteral=23, CharLiteral=24, StringLiteral=25, LPAREN=26, RPAREN=27, 
		LBRACE=28, RBRACE=29, LBRACK=30, RBRACK=31, EOL=32, COMMA=33, DOT=34, 
		COLON=35, ASSIGN=36, GT=37, LT=38, BANG=39, EQUAL=40, LE=41, GE=42, NOTEQUAL=43, 
		AND=44, OR=45, ADD=46, SUB=47, MUL=48, DIV=49, MOD=50, ADD_ASSIGN=51, 
		SUB_ASSIGN=52, MUL_ASSIGN=53, DIV_ASSIGN=54, Identifier=55, WS=56, COMMENT=57, 
		LINE_COMMENT=58;
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
			"CONTINUE", "BREAK", "OF", "GLOBAL", "IntegerLiteral", "NonZeroInteger", 
			"NonZeroDigit", "Digit", "Zero", "FloatLiteral", "BoolLiteral", "CharLiteral", 
			"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "EOL", "COMMA", 
			"DOT", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "Identifier", "IdentifierStart", "IdentifierEnd", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'const'", "'list'", "'send'", "'check'", "'otherwise'", 
			"'iterate'", "'int'", "'float'", "'char'", "'string'", "'bool'", "'void'", 
			"'function'", "'from'", "'to'", "'continue'", "'break'", "'of'", "'global'", 
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "':'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", 
			"'>='", "'!='", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
			"'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", 
			"INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", "FUNCTION", "FROM", 
			"TO", "CONTINUE", "BREAK", "OF", "GLOBAL", "IntegerLiteral", "FloatLiteral", 
			"BoolLiteral", "CharLiteral", "StringLiteral", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "EOL", "COMMA", "DOT", "COLON", "ASSIGN", 
			"GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\5\26\u0102\n\26\3\26\3\26\5\26\u0106\n\26\3\27\3\27\7"+
		"\27\u010a\n\27\f\27\16\27\u010d\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\5\33\u0117\n\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0126\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\5\37\u0130\n\37\3\37\3\37\3 \6 \u0135\n \r \16 \u0136\3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\7?\u0183\n?\f?"+
		"\16?\u0186\13?\5?\u0188\n?\3@\3@\3A\5A\u018d\nA\3B\6B\u0190\nB\rB\16B"+
		"\u0191\3B\3B\3C\3C\3C\3C\7C\u019a\nC\fC\16C\u019d\13C\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\7D\u01a8\nD\fD\16D\u01ab\13D\3D\3D\3\u019b\2E\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\2/\2\61\2\63\2\65\30\67\319\32;\2=\33?\2A\2C\34E\35"+
		"G\36I\37K M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66"+
		"y\67{8}9\177\2\u0081\2\u0083:\u0085;\u0087<\3\2\13\3\2\63;\3\2\62;\6\2"+
		"\f\f\17\17))^^\6\2\f\f\17\17$$^^\4\2C\\c|\5\2C\\aac|\5\2\62;C\\c|\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\2\u01b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2=\3\2\2\2\2C\3"+
		"\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008d\3\2\2\2\7\u0093\3\2\2"+
		"\2\t\u0098\3\2\2\2\13\u009d\3\2\2\2\r\u00a3\3\2\2\2\17\u00ad\3\2\2\2\21"+
		"\u00b5\3\2\2\2\23\u00b9\3\2\2\2\25\u00bf\3\2\2\2\27\u00c4\3\2\2\2\31\u00cb"+
		"\3\2\2\2\33\u00d0\3\2\2\2\35\u00d5\3\2\2\2\37\u00de\3\2\2\2!\u00e3\3\2"+
		"\2\2#\u00e6\3\2\2\2%\u00ef\3\2\2\2\'\u00f5\3\2\2\2)\u00f8\3\2\2\2+\u0101"+
		"\3\2\2\2-\u0107\3\2\2\2/\u010e\3\2\2\2\61\u0110\3\2\2\2\63\u0112\3\2\2"+
		"\2\65\u0116\3\2\2\2\67\u0125\3\2\2\29\u0127\3\2\2\2;\u012b\3\2\2\2=\u012d"+
		"\3\2\2\2?\u0134\3\2\2\2A\u0138\3\2\2\2C\u013a\3\2\2\2E\u013c\3\2\2\2G"+
		"\u013e\3\2\2\2I\u0140\3\2\2\2K\u0142\3\2\2\2M\u0144\3\2\2\2O\u0146\3\2"+
		"\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c\3\2\2\2W\u014e\3\2\2\2Y\u0150"+
		"\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u0156\3\2\2\2a\u0159\3\2\2\2c"+
		"\u015c\3\2\2\2e\u015f\3\2\2\2g\u0162\3\2\2\2i\u0166\3\2\2\2k\u0169\3\2"+
		"\2\2m\u016b\3\2\2\2o\u016d\3\2\2\2q\u016f\3\2\2\2s\u0171\3\2\2\2u\u0173"+
		"\3\2\2\2w\u0176\3\2\2\2y\u0179\3\2\2\2{\u017c\3\2\2\2}\u017f\3\2\2\2\177"+
		"\u0189\3\2\2\2\u0081\u018c\3\2\2\2\u0083\u018f\3\2\2\2\u0085\u0195\3\2"+
		"\2\2\u0087\u01a3\3\2\2\2\u0089\u008a\7i\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7v\2\2\u008c\4\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\6\3\2\2\2\u0093\u0094"+
		"\7n\2\2\u0094\u0095\7k\2\2\u0095\u0096\7u\2\2\u0096\u0097\7v\2\2\u0097"+
		"\b\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7f\2\2\u009c\n\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7m\2\2\u00a2\f\3\2\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7u\2\2\u00ab\u00ac\7g\2\2\u00ac\16\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\22\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\24\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7"+
		"c\2\2\u00c2\u00c3\7t\2\2\u00c3\26\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7v\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7i\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7n\2\2\u00cf\32\3\2\2\2\u00d0\u00d1\7x\2\2\u00d1"+
		"\u00d2\7q\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7f\2\2\u00d4\34\3\2\2\2\u00d5"+
		"\u00d6\7h\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd"+
		"\7p\2\2\u00dd\36\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7q\2\2\u00e1\u00e2\7o\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\"\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7p\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec"+
		"\u00ed\7w\2\2\u00ed\u00ee\7g\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7m\2\2"+
		"\u00f4&\3\2\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7h\2\2\u00f7(\3\2\2\2\u00f8"+
		"\u00f9\7i\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7d\2\2"+
		"\u00fc\u00fd\7c\2\2\u00fd\u00fe\7n\2\2\u00fe*\3\2\2\2\u00ff\u0102\5m\67"+
		"\2\u0100\u0102\5k\66\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0106\5-\27\2\u0104\u0106\5\63\32\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106,\3\2\2\2\u0107\u010b\5"+
		"/\30\2\u0108\u010a\5\61\31\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c.\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010e\u010f\t\2\2\2\u010f\60\3\2\2\2\u0110\u0111\t\3\2\2\u0111\62\3\2"+
		"\2\2\u0112\u0113\7\62\2\2\u0113\64\3\2\2\2\u0114\u0117\5k\66\2\u0115\u0117"+
		"\5m\67\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\5+\26\2\u0119\u011a\5S*\2\u011a\u011b\5+\26"+
		"\2\u011b\66\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0126\7g\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u0126\7g\2\2\u0125\u011c\3\2\2"+
		"\2\u0125\u0120\3\2\2\2\u01268\3\2\2\2\u0127\u0128\7)\2\2\u0128\u0129\5"+
		";\36\2\u0129\u012a\7)\2\2\u012a:\3\2\2\2\u012b\u012c\n\4\2\2\u012c<\3"+
		"\2\2\2\u012d\u012f\7$\2\2\u012e\u0130\5? \2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7$\2\2\u0132>\3\2\2\2\u0133"+
		"\u0135\5A!\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137@\3\2\2\2\u0138\u0139\n\5\2\2\u0139B\3\2\2"+
		"\2\u013a\u013b\7*\2\2\u013bD\3\2\2\2\u013c\u013d\7+\2\2\u013dF\3\2\2\2"+
		"\u013e\u013f\7}\2\2\u013fH\3\2\2\2\u0140\u0141\7\177\2\2\u0141J\3\2\2"+
		"\2\u0142\u0143\7]\2\2\u0143L\3\2\2\2\u0144\u0145\7_\2\2\u0145N\3\2\2\2"+
		"\u0146\u0147\7=\2\2\u0147P\3\2\2\2\u0148\u0149\7.\2\2\u0149R\3\2\2\2\u014a"+
		"\u014b\7\60\2\2\u014bT\3\2\2\2\u014c\u014d\7<\2\2\u014dV\3\2\2\2\u014e"+
		"\u014f\7?\2\2\u014fX\3\2\2\2\u0150\u0151\7@\2\2\u0151Z\3\2\2\2\u0152\u0153"+
		"\7>\2\2\u0153\\\3\2\2\2\u0154\u0155\7#\2\2\u0155^\3\2\2\2\u0156\u0157"+
		"\7?\2\2\u0157\u0158\7?\2\2\u0158`\3\2\2\2\u0159\u015a\7>\2\2\u015a\u015b"+
		"\7?\2\2\u015bb\3\2\2\2\u015c\u015d\7@\2\2\u015d\u015e\7?\2\2\u015ed\3"+
		"\2\2\2\u015f\u0160\7#\2\2\u0160\u0161\7?\2\2\u0161f\3\2\2\2\u0162\u0163"+
		"\7c\2\2\u0163\u0164\7p\2\2\u0164\u0165\7f\2\2\u0165h\3\2\2\2\u0166\u0167"+
		"\7q\2\2\u0167\u0168\7t\2\2\u0168j\3\2\2\2\u0169\u016a\7-\2\2\u016al\3"+
		"\2\2\2\u016b\u016c\7/\2\2\u016cn\3\2\2\2\u016d\u016e\7,\2\2\u016ep\3\2"+
		"\2\2\u016f\u0170\7\61\2\2\u0170r\3\2\2\2\u0171\u0172\7\'\2\2\u0172t\3"+
		"\2\2\2\u0173\u0174\7-\2\2\u0174\u0175\7?\2\2\u0175v\3\2\2\2\u0176\u0177"+
		"\7/\2\2\u0177\u0178\7?\2\2\u0178x\3\2\2\2\u0179\u017a\7,\2\2\u017a\u017b"+
		"\7?\2\2\u017bz\3\2\2\2\u017c\u017d\7\61\2\2\u017d\u017e\7?\2\2\u017e|"+
		"\3\2\2\2\u017f\u0187\5\177@\2\u0180\u0184\t\6\2\2\u0181\u0183\5\u0081"+
		"A\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0180\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188~\3\2\2\2\u0189\u018a\t\7\2\2\u018a\u0080"+
		"\3\2\2\2\u018b\u018d\t\b\2\2\u018c\u018b\3\2\2\2\u018d\u0082\3\2\2\2\u018e"+
		"\u0190\t\t\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\bB\2\2\u0194"+
		"\u0084\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7,\2\2\u0197\u019b\3\2"+
		"\2\2\u0198\u019a\13\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u019f\7,\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\bC\2\2\u01a2\u0086\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\7\61"+
		"\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a8\n\n\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\bD\2\2\u01ad\u0088\3\2\2\2\20\2\u0101"+
		"\u0105\u010b\u0116\u0125\u012f\u0136\u0184\u0187\u018c\u0191\u019b\u01a9"+
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