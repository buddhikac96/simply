// Generated from /home/hackerbuddy/dev/fyp/simply/src/main/grammar/v3/SimplyV3Parser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplyV3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GET=1, CONST=2, LIST=3, SEND=4, CHECK=5, OTHERWISE=6, ITERATE=7, INT=8, 
		FLOAT=9, CHAR=10, STRING=11, BOOL=12, VOID=13, FUNCTION=14, FROM=15, TO=16, 
		CONTINUE=17, BREAK=18, OF=19, IntegerLiteral=20, SingedIntegerLiteral=21, 
		NonZeroInteger=22, NonZeroDigit=23, Digit=24, UnSingedIntegerLiteral=25, 
		Zero=26, FloatLiteral=27, BoolLiteral=28, CharLiteral=29, StringLiteral=30, 
		LPAREN=31, RPAREN=32, LBRACE=33, RBRACE=34, LBRACK=35, RBRACK=36, EOL=37, 
		COMMA=38, DOT=39, COLON=40, ASSIGN=41, GT=42, LT=43, BANG=44, EQUAL=45, 
		LE=46, GE=47, NOTEQUAL=48, AND=49, OR=50, ADD=51, SUB=52, MUL=53, DIV=54, 
		MOD=55, ADD_ASSIGN=56, SUB_ASSIGN=57, MUL_ASSIGN=58, DIV_ASSIGN=59, Identifier=60, 
		WS=61;
	public static final int
		RULE_compilationUnit = 0, RULE_libImport = 1, RULE_variableDeclaration = 2, 
		RULE_primitiveVariableDeclaration = 3, RULE_nonVoidDataTypeName = 4, RULE_expression = 5, 
		RULE_arithmaticExpression = 6, RULE_logicExpression = 7, RULE_unaryExpression = 8, 
		RULE_arrayAccess = 9, RULE_funcCallExpression = 10, RULE_libRef = 11, 
		RULE_literal = 12, RULE_integerLiteral = 13, RULE_floatLiteral = 14, RULE_arrayVariableDeclaration = 15, 
		RULE_arrayDeclaration = 16, RULE_emptyArrayDeclaration = 17, RULE_nonEmptyArrayDeclaration = 18, 
		RULE_arrayValues = 19, RULE_arrayValue = 20, RULE_functionDeclaration = 21, 
		RULE_functionSignature = 22, RULE_argList = 23, RULE_arg = 24, RULE_dataTypeName = 25, 
		RULE_block = 26, RULE_blockBody = 27, RULE_statements = 28, RULE_statement = 29, 
		RULE_ifStatement = 30, RULE_ifBlock = 31, RULE_conditionExpression = 32, 
		RULE_elseIfBlock = 33, RULE_elseBlock = 34, RULE_iterateStatement = 35, 
		RULE_loopExpression = 36, RULE_rangeExpression = 37, RULE_arrayLoopExpression = 38, 
		RULE_loopControlStatement = 39, RULE_assignment = 40, RULE_assignmentOperator = 41, 
		RULE_funcCallStatement = 42, RULE_returnStatemtnt = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "libImport", "variableDeclaration", "primitiveVariableDeclaration", 
			"nonVoidDataTypeName", "expression", "arithmaticExpression", "logicExpression", 
			"unaryExpression", "arrayAccess", "funcCallExpression", "libRef", "literal", 
			"integerLiteral", "floatLiteral", "arrayVariableDeclaration", "arrayDeclaration", 
			"emptyArrayDeclaration", "nonEmptyArrayDeclaration", "arrayValues", "arrayValue", 
			"functionDeclaration", "functionSignature", "argList", "arg", "dataTypeName", 
			"block", "blockBody", "statements", "statement", "ifStatement", "ifBlock", 
			"conditionExpression", "elseIfBlock", "elseBlock", "iterateStatement", 
			"loopExpression", "rangeExpression", "arrayLoopExpression", "loopControlStatement", 
			"assignment", "assignmentOperator", "funcCallStatement", "returnStatemtnt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'const'", "'list'", "'send'", "'check'", "'otherwise'", 
			"'iterate'", "'int'", "'float'", "'char'", "'string'", "'bool'", "'void'", 
			"'function'", "'from'", "'to'", "'continue'", "'break'", "'of'", null, 
			null, null, null, null, null, "'0'", null, null, null, null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "':'", "'='", "'>'", 
			"'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'and'", "'or'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", 
			"INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", "FUNCTION", "FROM", 
			"TO", "CONTINUE", "BREAK", "OF", "IntegerLiteral", "SingedIntegerLiteral", 
			"NonZeroInteger", "NonZeroDigit", "Digit", "UnSingedIntegerLiteral", 
			"Zero", "FloatLiteral", "BoolLiteral", "CharLiteral", "StringLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "EOL", "COMMA", 
			"DOT", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "Identifier", "WS"
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
	public String getGrammarFileName() { return "SimplyV3Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimplyV3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<LibImportContext> libImport() {
			return getRuleContexts(LibImportContext.class);
		}
		public LibImportContext libImport(int i) {
			return getRuleContext(LibImportContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GET) {
				{
				{
				setState(88);
				libImport();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << LIST) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				{
				setState(94);
				variableDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(100);
				functionDeclaration();
				}
				}
				setState(105);
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

	public static class LibImportContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(SimplyV3Parser.GET, 0); }
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public LibImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLibImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLibImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLibImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibImportContext libImport() throws RecognitionException {
		LibImportContext _localctx = new LibImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(GET);
			setState(107);
			match(Identifier);
			setState(108);
			match(EOL);
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
		public PrimitiveVariableDeclarationContext primitiveVariableDeclaration() {
			return getRuleContext(PrimitiveVariableDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationContext arrayVariableDeclaration() {
			return getRuleContext(ArrayVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				primitiveVariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				arrayVariableDeclaration();
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

	public static class PrimitiveVariableDeclarationContext extends ParserRuleContext {
		public NonVoidDataTypeNameContext nonVoidDataTypeName() {
			return getRuleContext(NonVoidDataTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public TerminalNode CONST() { return getToken(SimplyV3Parser.CONST, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplyV3Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimitiveVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterPrimitiveVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitPrimitiveVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitPrimitiveVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveVariableDeclarationContext primitiveVariableDeclaration() throws RecognitionException {
		PrimitiveVariableDeclarationContext _localctx = new PrimitiveVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiveVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(114);
				match(CONST);
				}
			}

			setState(117);
			nonVoidDataTypeName();
			setState(118);
			match(Identifier);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(119);
				match(ASSIGN);
				setState(120);
				expression();
				}
			}

			setState(123);
			match(EOL);
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

	public static class NonVoidDataTypeNameContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimplyV3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SimplyV3Parser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(SimplyV3Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(SimplyV3Parser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(SimplyV3Parser.BOOL, 0); }
		public NonVoidDataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonVoidDataTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNonVoidDataTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNonVoidDataTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNonVoidDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonVoidDataTypeNameContext nonVoidDataTypeName() throws RecognitionException {
		NonVoidDataTypeNameContext _localctx = new NonVoidDataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nonVoidDataTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmaticExpressionContext arithmaticExpression() {
			return getRuleContext(ArithmaticExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			arithmaticExpression(0);
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

	public static class ArithmaticExpressionContext extends ParserRuleContext {
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public ArithmaticExpressionContext arithmaticExpression() {
			return getRuleContext(ArithmaticExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SimplyV3Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimplyV3Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimplyV3Parser.MOD, 0); }
		public TerminalNode ADD() { return getToken(SimplyV3Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SimplyV3Parser.SUB, 0); }
		public ArithmaticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmaticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArithmaticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArithmaticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArithmaticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmaticExpressionContext arithmaticExpression() throws RecognitionException {
		return arithmaticExpression(0);
	}

	private ArithmaticExpressionContext arithmaticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmaticExpressionContext _localctx = new ArithmaticExpressionContext(_ctx, _parentState);
		ArithmaticExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arithmaticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			logicExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(MUL);
						setState(134);
						logicExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						match(DIV);
						setState(137);
						logicExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						match(MOD);
						setState(140);
						logicExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						match(ADD);
						setState(143);
						logicExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(144);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(145);
						match(SUB);
						setState(146);
						logicExpression(0);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(SimplyV3Parser.OR, 0); }
		public TerminalNode AND() { return getToken(SimplyV3Parser.AND, 0); }
		public TerminalNode GT() { return getToken(SimplyV3Parser.GT, 0); }
		public TerminalNode LT() { return getToken(SimplyV3Parser.LT, 0); }
		public TerminalNode GE() { return getToken(SimplyV3Parser.GE, 0); }
		public TerminalNode LE() { return getToken(SimplyV3Parser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(SimplyV3Parser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(SimplyV3Parser.NOTEQUAL, 0); }
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(153);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						match(OR);
						setState(157);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						match(AND);
						setState(160);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						match(GT);
						setState(163);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(164);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						match(LT);
						setState(166);
						unaryExpression();
						}
						break;
					case 5:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(GE);
						setState(169);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(LE);
						setState(172);
						unaryExpression();
						}
						break;
					case 7:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						match(EQUAL);
						setState(175);
						unaryExpression();
						}
						break;
					case 8:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(176);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(177);
						match(NOTEQUAL);
						setState(178);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public TerminalNode ADD() { return getToken(SimplyV3Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SimplyV3Parser.SUB, 0); }
		public TerminalNode BANG() { return getToken(SimplyV3Parser.BANG, 0); }
		public FuncCallExpressionContext funcCallExpression() {
			return getRuleContext(FuncCallExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpression);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(LPAREN);
				setState(185);
				expression();
				setState(186);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ADD);
				setState(189);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(SUB);
				setState(191);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(BANG);
				setState(193);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				funcCallExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(Identifier);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(197);
					arrayAccess();
					}
					break;
				}
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SimplyV3Parser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimplyV3Parser.RBRACK, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LBRACK);
			setState(203);
			expression();
			setState(204);
			match(RBRACK);
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

	public static class FuncCallExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public LibRefContext libRef() {
			return getRuleContext(LibRefContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimplyV3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplyV3Parser.COMMA, i);
		}
		public FuncCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFuncCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFuncCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFuncCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallExpressionContext funcCallExpression() throws RecognitionException {
		FuncCallExpressionContext _localctx = new FuncCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(206);
				libRef();
				}
				break;
			}
			setState(209);
			match(Identifier);
			setState(210);
			match(LPAREN);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SingedIntegerLiteral) | (1L << UnSingedIntegerLiteral) | (1L << FloatLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(211);
				expression();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				expression();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(RPAREN);
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

	public static class LibRefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(SimplyV3Parser.DOT, 0); }
		public LibRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLibRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLibRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLibRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibRefContext libRef() throws RecognitionException {
		LibRefContext _localctx = new LibRefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_libRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(Identifier);
			setState(224);
			match(DOT);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingedIntegerLiteral:
			case UnSingedIntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				integerLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				floatLiteral();
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode SingedIntegerLiteral() { return getToken(SimplyV3Parser.SingedIntegerLiteral, 0); }
		public TerminalNode UnSingedIntegerLiteral() { return getToken(SimplyV3Parser.UnSingedIntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==SingedIntegerLiteral || _la==UnSingedIntegerLiteral) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(SimplyV3Parser.FloatLiteral, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(FloatLiteral);
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

	public static class ArrayVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(SimplyV3Parser.LIST, 0); }
		public NonVoidDataTypeNameContext nonVoidDataTypeName() {
			return getRuleContext(NonVoidDataTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableDeclarationContext arrayVariableDeclaration() throws RecognitionException {
		ArrayVariableDeclarationContext _localctx = new ArrayVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LIST);
			setState(235);
			nonVoidDataTypeName();
			setState(236);
			match(Identifier);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(237);
				arrayDeclaration();
				}
			}

			setState(240);
			match(EOL);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public EmptyArrayDeclarationContext emptyArrayDeclaration() {
			return getRuleContext(EmptyArrayDeclarationContext.class,0);
		}
		public NonEmptyArrayDeclarationContext nonEmptyArrayDeclaration() {
			return getRuleContext(NonEmptyArrayDeclarationContext.class,0);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayDeclaration);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				emptyArrayDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				nonEmptyArrayDeclaration();
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

	public static class EmptyArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimplyV3Parser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(SimplyV3Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SimplyV3Parser.RBRACK, 0); }
		public EmptyArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyArrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterEmptyArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitEmptyArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitEmptyArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyArrayDeclarationContext emptyArrayDeclaration() throws RecognitionException {
		EmptyArrayDeclarationContext _localctx = new EmptyArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_emptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ASSIGN);
			setState(247);
			match(LBRACK);
			setState(248);
			match(RBRACK);
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

	public static class NonEmptyArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimplyV3Parser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(SimplyV3Parser.LBRACK, 0); }
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimplyV3Parser.RBRACK, 0); }
		public NonEmptyArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyArrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNonEmptyArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNonEmptyArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNonEmptyArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonEmptyArrayDeclarationContext nonEmptyArrayDeclaration() throws RecognitionException {
		NonEmptyArrayDeclarationContext _localctx = new NonEmptyArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nonEmptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ASSIGN);
			setState(251);
			match(LBRACK);
			setState(252);
			arrayValues();
			setState(253);
			match(RBRACK);
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

	public static class ArrayValuesContext extends ParserRuleContext {
		public List<ArrayValueContext> arrayValue() {
			return getRuleContexts(ArrayValueContext.class);
		}
		public ArrayValueContext arrayValue(int i) {
			return getRuleContext(ArrayValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimplyV3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplyV3Parser.COMMA, i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SingedIntegerLiteral) | (1L << UnSingedIntegerLiteral) | (1L << FloatLiteral))) != 0)) {
				{
				setState(255);
				arrayValue();
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				setState(259);
				arrayValue();
				}
				}
				setState(264);
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

	public static class ArrayValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			literal();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SimplyV3Parser.FUNCTION, 0); }
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimplyV3Parser.COLON, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LIST() { return getToken(SimplyV3Parser.LIST, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FUNCTION);
			setState(268);
			functionSignature();
			setState(269);
			match(COLON);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(270);
				match(LIST);
				}
			}

			setState(273);
			dataTypeName();
			setState(274);
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

	public static class FunctionSignatureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Identifier);
			setState(277);
			match(LPAREN);
			setState(278);
			argList();
			setState(279);
			match(RPAREN);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimplyV3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimplyV3Parser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(281);
				arg();
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(284);
				match(COMMA);
				setState(285);
				arg();
				}
				}
				setState(290);
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

	public static class ArgContext extends ParserRuleContext {
		public NonVoidDataTypeNameContext nonVoidDataTypeName() {
			return getRuleContext(NonVoidDataTypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode LIST() { return getToken(SimplyV3Parser.LIST, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(291);
				match(LIST);
				}
			}

			setState(294);
			nonVoidDataTypeName();
			setState(295);
			match(Identifier);
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

	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(SimplyV3Parser.VOID, 0); }
		public NonVoidDataTypeNameContext nonVoidDataTypeName() {
			return getRuleContext(NonVoidDataTypeNameContext.class,0);
		}
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterDataTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitDataTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dataTypeName);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(VOID);
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				nonVoidDataTypeName();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimplyV3Parser.LBRACE, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SimplyV3Parser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LBRACE);
			setState(302);
			blockBody();
			setState(303);
			match(RBRACE);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << LIST) | (1L << SEND) | (1L << CHECK) | (1L << ITERATE) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL) | (1L << CONTINUE) | (1L << BREAK) | (1L << Identifier))) != 0)) {
				{
				{
				setState(307);
				statement();
				}
				}
				setState(312);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterateStatementContext iterateStatement() {
			return getRuleContext(IterateStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FuncCallStatementContext funcCallStatement() {
			return getRuleContext(FuncCallStatementContext.class,0);
		}
		public ReturnStatemtntContext returnStatemtnt() {
			return getRuleContext(ReturnStatemtntContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public LoopControlStatementContext loopControlStatement() {
			return getRuleContext(LoopControlStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				iterateStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				funcCallStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				returnStatemtnt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				variableDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				loopControlStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElseIfBlockContext> elseIfBlock() {
			return getRuleContexts(ElseIfBlockContext.class);
		}
		public ElseIfBlockContext elseIfBlock(int i) {
			return getRuleContext(ElseIfBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			ifBlock();
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					elseIfBlock();
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(329);
				elseBlock();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(SimplyV3Parser.CHECK, 0); }
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(CHECK);
			setState(333);
			conditionExpression();
			setState(334);
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

	public static class ConditionExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LPAREN);
			setState(337);
			expression();
			setState(338);
			match(RPAREN);
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

	public static class ElseIfBlockContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(SimplyV3Parser.OTHERWISE, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitElseIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(OTHERWISE);
			setState(341);
			ifBlock();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(SimplyV3Parser.OTHERWISE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(OTHERWISE);
			setState(344);
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

	public static class IterateStatementContext extends ParserRuleContext {
		public TerminalNode ITERATE() { return getToken(SimplyV3Parser.ITERATE, 0); }
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IterateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIterateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIterateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIterateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterateStatementContext iterateStatement() throws RecognitionException {
		IterateStatementContext _localctx = new IterateStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iterateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(ITERATE);
			setState(347);
			match(LPAREN);
			setState(348);
			loopExpression();
			setState(349);
			match(RPAREN);
			setState(350);
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public ArrayLoopExpressionContext arrayLoopExpression() {
			return getRuleContext(ArrayLoopExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loopExpression);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				rangeExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				arrayLoopExpression();
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SimplyV3Parser.FROM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(SimplyV3Parser.TO, 0); }
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			arg();
			setState(358);
			match(FROM);
			setState(359);
			expression();
			setState(360);
			match(TO);
			setState(361);
			expression();
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

	public static class ArrayLoopExpressionContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode OF() { return getToken(SimplyV3Parser.OF, 0); }
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public FuncCallExpressionContext funcCallExpression() {
			return getRuleContext(FuncCallExpressionContext.class,0);
		}
		public ArrayLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLoopExpressionContext arrayLoopExpression() throws RecognitionException {
		ArrayLoopExpressionContext _localctx = new ArrayLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			arg();
			setState(364);
			match(OF);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(365);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(366);
				funcCallExpression();
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

	public static class LoopControlStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(SimplyV3Parser.CONTINUE, 0); }
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public TerminalNode BREAK() { return getToken(SimplyV3Parser.BREAK, 0); }
		public LoopControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLoopControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLoopControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLoopControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopControlStatementContext loopControlStatement() throws RecognitionException {
		LoopControlStatementContext _localctx = new LoopControlStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_loopControlStatement);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(CONTINUE);
				setState(370);
				match(EOL);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(BREAK);
				setState(372);
				match(EOL);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(Identifier);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(376);
				arrayAccess();
				}
			}

			setState(379);
			assignmentOperator();
			setState(380);
			expression();
			setState(381);
			match(EOL);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimplyV3Parser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(SimplyV3Parser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(SimplyV3Parser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(SimplyV3Parser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(SimplyV3Parser.DIV_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN))) != 0)) ) {
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

	public static class FuncCallStatementContext extends ParserRuleContext {
		public FuncCallExpressionContext funcCallExpression() {
			return getRuleContext(FuncCallExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public FuncCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFuncCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFuncCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFuncCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallStatementContext funcCallStatement() throws RecognitionException {
		FuncCallStatementContext _localctx = new FuncCallStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_funcCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			funcCallExpression();
			setState(386);
			match(EOL);
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

	public static class ReturnStatemtntContext extends ParserRuleContext {
		public TerminalNode SEND() { return getToken(SimplyV3Parser.SEND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public ReturnStatemtntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatemtnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterReturnStatemtnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitReturnStatemtnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitReturnStatemtnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatemtntContext returnStatemtnt() throws RecognitionException {
		ReturnStatemtntContext _localctx = new ReturnStatemtntContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_returnStatemtnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(SEND);
			setState(389);
			expression();
			setState(390);
			match(EOL);
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
		case 6:
			return arithmaticExpression_sempred((ArithmaticExpressionContext)_localctx, predIndex);
		case 7:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmaticExpression_sempred(ArithmaticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\7\2h\n\2\f\2\16\2k\13\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4s\n\4\3\5\5\5v\n"+
		"\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0096\n\b\f"+
		"\b\16\b\u0099\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b6\n\t"+
		"\f\t\16\t\u00b9\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00c9\n\n\5\n\u00cb\n\n\3\13\3\13\3\13\3\13\3\f\5\f\u00d2\n"+
		"\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u00e7\n\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\5\21\u00f1\n\21\3\21\3\21\3\22\3\22\5\22\u00f7\n\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\5\25\u0103\n\25\3\25"+
		"\3\25\7\25\u0107\n\25\f\25\16\25\u010a\13\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u0112\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\5\31"+
		"\u011d\n\31\3\31\3\31\7\31\u0121\n\31\f\31\16\31\u0124\13\31\3\32\5\32"+
		"\u0127\n\32\3\32\3\32\3\32\3\33\3\33\5\33\u012e\n\33\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\36\7\36\u0137\n\36\f\36\16\36\u013a\13\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0143\n\37\3 \3 \7 \u0147\n \f \16 \u014a"+
		"\13 \3 \5 \u014d\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\5&\u0166\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\5(\u0172\n(\3)\3)\3)\3)\5)\u0178\n)\3*\3*\5*\u017c\n*\3*\3*\3*\3*\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3-\3-\2\4\16\20.\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\5\3\2\n\16\4\2\27\27"+
		"\33\33\4\2++:=\2\u0193\2]\3\2\2\2\4l\3\2\2\2\6r\3\2\2\2\bu\3\2\2\2\n\177"+
		"\3\2\2\2\f\u0081\3\2\2\2\16\u0083\3\2\2\2\20\u009a\3\2\2\2\22\u00ca\3"+
		"\2\2\2\24\u00cc\3\2\2\2\26\u00d1\3\2\2\2\30\u00e1\3\2\2\2\32\u00e6\3\2"+
		"\2\2\34\u00e8\3\2\2\2\36\u00ea\3\2\2\2 \u00ec\3\2\2\2\"\u00f6\3\2\2\2"+
		"$\u00f8\3\2\2\2&\u00fc\3\2\2\2(\u0102\3\2\2\2*\u010b\3\2\2\2,\u010d\3"+
		"\2\2\2.\u0116\3\2\2\2\60\u011c\3\2\2\2\62\u0126\3\2\2\2\64\u012d\3\2\2"+
		"\2\66\u012f\3\2\2\28\u0133\3\2\2\2:\u0138\3\2\2\2<\u0142\3\2\2\2>\u0144"+
		"\3\2\2\2@\u014e\3\2\2\2B\u0152\3\2\2\2D\u0156\3\2\2\2F\u0159\3\2\2\2H"+
		"\u015c\3\2\2\2J\u0165\3\2\2\2L\u0167\3\2\2\2N\u016d\3\2\2\2P\u0177\3\2"+
		"\2\2R\u0179\3\2\2\2T\u0181\3\2\2\2V\u0183\3\2\2\2X\u0186\3\2\2\2Z\\\5"+
		"\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b"+
		"\5\6\4\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2di\3\2\2\2ec\3\2\2\2f"+
		"h\5,\27\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\3\3\2\2\2ki\3\2\2\2"+
		"lm\7\3\2\2mn\7>\2\2no\7\'\2\2o\5\3\2\2\2ps\5\b\5\2qs\5 \21\2rp\3\2\2\2"+
		"rq\3\2\2\2s\7\3\2\2\2tv\7\4\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\n\6"+
		"\2x{\7>\2\2yz\7+\2\2z|\5\f\7\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\'\2\2"+
		"~\t\3\2\2\2\177\u0080\t\2\2\2\u0080\13\3\2\2\2\u0081\u0082\5\16\b\2\u0082"+
		"\r\3\2\2\2\u0083\u0084\b\b\1\2\u0084\u0085\5\20\t\2\u0085\u0097\3\2\2"+
		"\2\u0086\u0087\f\7\2\2\u0087\u0088\7\67\2\2\u0088\u0096\5\20\t\2\u0089"+
		"\u008a\f\6\2\2\u008a\u008b\78\2\2\u008b\u0096\5\20\t\2\u008c\u008d\f\5"+
		"\2\2\u008d\u008e\79\2\2\u008e\u0096\5\20\t\2\u008f\u0090\f\4\2\2\u0090"+
		"\u0091\7\65\2\2\u0091\u0096\5\20\t\2\u0092\u0093\f\3\2\2\u0093\u0094\7"+
		"\66\2\2\u0094\u0096\5\20\t\2\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0095"+
		"\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\17\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\b\t\1\2\u009b\u009c\5\22\n\2\u009c\u00b7\3\2\2\2"+
		"\u009d\u009e\f\n\2\2\u009e\u009f\7\64\2\2\u009f\u00b6\5\22\n\2\u00a0\u00a1"+
		"\f\t\2\2\u00a1\u00a2\7\63\2\2\u00a2\u00b6\5\22\n\2\u00a3\u00a4\f\b\2\2"+
		"\u00a4\u00a5\7,\2\2\u00a5\u00b6\5\22\n\2\u00a6\u00a7\f\7\2\2\u00a7\u00a8"+
		"\7-\2\2\u00a8\u00b6\5\22\n\2\u00a9\u00aa\f\6\2\2\u00aa\u00ab\7\61\2\2"+
		"\u00ab\u00b6\5\22\n\2\u00ac\u00ad\f\5\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00b6"+
		"\5\22\n\2\u00af\u00b0\f\4\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b6\5\22\n\2"+
		"\u00b2\u00b3\f\3\2\2\u00b3\u00b4\7\62\2\2\u00b4\u00b6\5\22\n\2\u00b5\u009d"+
		"\3\2\2\2\u00b5\u00a0\3\2\2\2\u00b5\u00a3\3\2\2\2\u00b5\u00a6\3\2\2\2\u00b5"+
		"\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\21\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\5\f\7\2"+
		"\u00bc\u00bd\7\"\2\2\u00bd\u00cb\3\2\2\2\u00be\u00bf\7\65\2\2\u00bf\u00cb"+
		"\5\f\7\2\u00c0\u00c1\7\66\2\2\u00c1\u00cb\5\f\7\2\u00c2\u00c3\7.\2\2\u00c3"+
		"\u00cb\5\f\7\2\u00c4\u00cb\5\26\f\2\u00c5\u00cb\5\32\16\2\u00c6\u00c8"+
		"\7>\2\2\u00c7\u00c9\5\24\13\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00cb\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c0"+
		"\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00cd\7%\2\2\u00cd\u00ce\5\f\7\2"+
		"\u00ce\u00cf\7&\2\2\u00cf\25\3\2\2\2\u00d0\u00d2\5\30\r\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4"+
		"\u00d6\7!\2\2\u00d5\u00d7\5\f\7\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\7(\2\2\u00d9\u00db\5\f\7\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\"\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7)\2\2\u00e3\31\3\2\2\2\u00e4"+
		"\u00e7\5\34\17\2\u00e5\u00e7\5\36\20\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9\35\3\2\2\2\u00ea\u00eb"+
		"\7\35\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5\n\6\2\u00ee"+
		"\u00f0\7>\2\2\u00ef\u00f1\5\"\22\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3!\3\2\2\2\u00f4\u00f7"+
		"\5$\23\2\u00f5\u00f7\5&\24\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"#\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fb\7&\2\2\u00fb"+
		"%\3\2\2\2\u00fc\u00fd\7+\2\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\5(\25\2\u00ff"+
		"\u0100\7&\2\2\u0100\'\3\2\2\2\u0101\u0103\5*\26\2\u0102\u0101\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0108\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0107"+
		"\5*\26\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109)\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\5\32\16"+
		"\2\u010c+\3\2\2\2\u010d\u010e\7\20\2\2\u010e\u010f\5.\30\2\u010f\u0111"+
		"\7*\2\2\u0110\u0112\7\5\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\5\64\33\2\u0114\u0115\5\66\34\2\u0115-\3\2"+
		"\2\2\u0116\u0117\7>\2\2\u0117\u0118\7!\2\2\u0118\u0119\5\60\31\2\u0119"+
		"\u011a\7\"\2\2\u011a/\3\2\2\2\u011b\u011d\5\62\32\2\u011c\u011b\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e\u011f\7(\2\2\u011f\u0121"+
		"\5\62\32\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\61\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127"+
		"\7\5\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\5\n\6\2\u0129\u012a\7>\2\2\u012a\63\3\2\2\2\u012b\u012e\7\17\2"+
		"\2\u012c\u012e\5\n\6\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\65"+
		"\3\2\2\2\u012f\u0130\7#\2\2\u0130\u0131\58\35\2\u0131\u0132\7$\2\2\u0132"+
		"\67\3\2\2\2\u0133\u0134\5:\36\2\u01349\3\2\2\2\u0135\u0137\5<\37\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139;\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0143\5> \2\u013c\u0143"+
		"\5H%\2\u013d\u0143\5R*\2\u013e\u0143\5V,\2\u013f\u0143\5X-\2\u0140\u0143"+
		"\5\6\4\2\u0141\u0143\5P)\2\u0142\u013b\3\2\2\2\u0142\u013c\3\2\2\2\u0142"+
		"\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0142\u0141\3\2\2\2\u0143=\3\2\2\2\u0144\u0148\5@!\2\u0145\u0147"+
		"\5D#\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\5F"+
		"$\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d?\3\2\2\2\u014e\u014f"+
		"\7\7\2\2\u014f\u0150\5B\"\2\u0150\u0151\5\66\34\2\u0151A\3\2\2\2\u0152"+
		"\u0153\7!\2\2\u0153\u0154\5\f\7\2\u0154\u0155\7\"\2\2\u0155C\3\2\2\2\u0156"+
		"\u0157\7\b\2\2\u0157\u0158\5@!\2\u0158E\3\2\2\2\u0159\u015a\7\b\2\2\u015a"+
		"\u015b\5\66\34\2\u015bG\3\2\2\2\u015c\u015d\7\t\2\2\u015d\u015e\7!\2\2"+
		"\u015e\u015f\5J&\2\u015f\u0160\7\"\2\2\u0160\u0161\5\66\34\2\u0161I\3"+
		"\2\2\2\u0162\u0166\5\f\7\2\u0163\u0166\5L\'\2\u0164\u0166\5N(\2\u0165"+
		"\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166K\3\2\2\2"+
		"\u0167\u0168\5\62\32\2\u0168\u0169\7\21\2\2\u0169\u016a\5\f\7\2\u016a"+
		"\u016b\7\22\2\2\u016b\u016c\5\f\7\2\u016cM\3\2\2\2\u016d\u016e\5\62\32"+
		"\2\u016e\u0171\7\25\2\2\u016f\u0172\7>\2\2\u0170\u0172\5\26\f\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172O\3\2\2\2\u0173\u0174\7\23\2\2"+
		"\u0174\u0178\7\'\2\2\u0175\u0176\7\24\2\2\u0176\u0178\7\'\2\2\u0177\u0173"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0178Q\3\2\2\2\u0179\u017b\7>\2\2\u017a\u017c"+
		"\5\24\13\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2"+
		"\u017d\u017e\5T+\2\u017e\u017f\5\f\7\2\u017f\u0180\7\'\2\2\u0180S\3\2"+
		"\2\2\u0181\u0182\t\4\2\2\u0182U\3\2\2\2\u0183\u0184\5\26\f\2\u0184\u0185"+
		"\7\'\2\2\u0185W\3\2\2\2\u0186\u0187\7\6\2\2\u0187\u0188\5\f\7\2\u0188"+
		"\u0189\7\'\2\2\u0189Y\3\2\2\2#]ciru{\u0095\u0097\u00b5\u00b7\u00c8\u00ca"+
		"\u00d1\u00d6\u00dc\u00e6\u00f0\u00f6\u0102\u0108\u0111\u011c\u0122\u0126"+
		"\u012d\u0138\u0142\u0148\u014c\u0165\u0171\u0177\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}