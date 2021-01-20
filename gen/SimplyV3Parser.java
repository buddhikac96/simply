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
		IntegerLiteral=17, FloatLiteral=18, BoolLiteral=19, CharLiteral=20, StringLiteral=21, 
		LPAREN=22, RPAREN=23, LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, EOL=28, 
		COMMA=29, DOT=30, COLON=31, ASSIGN=32, GT=33, LT=34, BANG=35, EQUAL=36, 
		LE=37, GE=38, NOTEQUAL=39, AND=40, OR=41, ADD=42, SUB=43, MUL=44, DIV=45, 
		MOD=46, ADD_ASSIGN=47, SUB_ASSIGN=48, MUL_ASSIGN=49, DIV_ASSIGN=50, Identifier=51, 
		WS=52;
	public static final int
		RULE_compilationUnit = 0, RULE_libImport = 1, RULE_variableDeclaration = 2, 
		RULE_primitiveVariableDeclaration = 3, RULE_nonVoidDataTypeName = 4, RULE_expression = 5, 
		RULE_arithmaticExpression = 6, RULE_logicExpression = 7, RULE_unaryExpression = 8, 
		RULE_arrayAccess = 9, RULE_funcCall = 10, RULE_libRef = 11, RULE_literal = 12, 
		RULE_arrayVariableDeclaration = 13, RULE_arrayDeclaration = 14, RULE_emptyArrayDeclaration = 15, 
		RULE_nonEmptyArrayDeclaration = 16, RULE_arrayValues = 17, RULE_arrayValue = 18, 
		RULE_functionDeclaration = 19, RULE_argList = 20, RULE_arg = 21, RULE_dataTypeName = 22, 
		RULE_block = 23, RULE_blockBody = 24, RULE_statements = 25, RULE_statement = 26, 
		RULE_ifStatement = 27, RULE_ifBlock = 28, RULE_conditionExpression = 29, 
		RULE_elseIfBlock = 30, RULE_elseBlock = 31, RULE_iterateStatement = 32, 
		RULE_loopExpression = 33, RULE_rangeExpression = 34, RULE_assignment = 35, 
		RULE_assignmentOperator = 36, RULE_returnStatemtnt = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "libImport", "variableDeclaration", "primitiveVariableDeclaration", 
			"nonVoidDataTypeName", "expression", "arithmaticExpression", "logicExpression", 
			"unaryExpression", "arrayAccess", "funcCall", "libRef", "literal", "arrayVariableDeclaration", 
			"arrayDeclaration", "emptyArrayDeclaration", "nonEmptyArrayDeclaration", 
			"arrayValues", "arrayValue", "functionDeclaration", "argList", "arg", 
			"dataTypeName", "block", "blockBody", "statements", "statement", "ifStatement", 
			"ifBlock", "conditionExpression", "elseIfBlock", "elseBlock", "iterateStatement", 
			"loopExpression", "rangeExpression", "assignment", "assignmentOperator", 
			"returnStatemtnt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'const'", "'list'", "'send'", "'check'", "'otherwise'", 
			"'iterate'", "'int'", "'float'", "'char'", "'string'", "'bool'", "'void'", 
			"'function'", "'from'", "'to'", null, null, null, null, null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "':'", "'='", 
			"'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'and'", "'or'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "CONST", "LIST", "SEND", "CHECK", "OTHERWISE", "ITERATE", 
			"INT", "FLOAT", "CHAR", "STRING", "BOOL", "VOID", "FUNCTION", "FROM", 
			"TO", "IntegerLiteral", "FloatLiteral", "BoolLiteral", "CharLiteral", 
			"StringLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"EOL", "COMMA", "DOT", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "Identifier", 
			"WS"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GET) {
				{
				{
				setState(76);
				libImport();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << LIST) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				{
				setState(82);
				variableDeclaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(88);
				functionDeclaration();
				}
				}
				setState(93);
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
			setState(94);
			match(GET);
			setState(95);
			match(Identifier);
			setState(96);
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
			setState(100);
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
				setState(98);
				primitiveVariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(102);
				match(CONST);
				}
			}

			setState(105);
			nonVoidDataTypeName();
			setState(106);
			match(Identifier);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(107);
				match(ASSIGN);
				setState(108);
				expression();
				}
			}

			setState(111);
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
			setState(113);
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
			setState(115);
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
		public TerminalNode ADD() { return getToken(SimplyV3Parser.ADD, 0); }
		public TerminalNode DIV() { return getToken(SimplyV3Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimplyV3Parser.MOD, 0); }
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
			setState(118);
			logicExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						match(ADD);
						setState(122);
						logicExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(123);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(124);
						match(DIV);
						setState(125);
						logicExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127);
						match(MOD);
						setState(128);
						logicExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(129);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(130);
						match(ADD);
						setState(131);
						logicExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(132);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(133);
						match(SUB);
						setState(134);
						logicExpression(0);
						}
						break;
					}
					} 
				}
				setState(139);
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
			setState(141);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(143);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(144);
						match(OR);
						setState(145);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(147);
						match(AND);
						setState(148);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						match(GT);
						setState(151);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						match(LT);
						setState(154);
						unaryExpression();
						}
						break;
					case 5:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						match(GE);
						setState(157);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(LE);
						setState(160);
						unaryExpression();
						}
						break;
					case 7:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(EQUAL);
						setState(163);
						unaryExpression();
						}
						break;
					case 8:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(164);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(165);
						match(NOTEQUAL);
						setState(166);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(171);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(LPAREN);
				setState(173);
				expression();
				setState(174);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(ADD);
				setState(177);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(SUB);
				setState(179);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(BANG);
				setState(181);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				funcCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(Identifier);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(185);
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
		public TerminalNode IntegerLiteral() { return getToken(SimplyV3Parser.IntegerLiteral, 0); }
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
			setState(190);
			match(LBRACK);
			setState(191);
			match(IntegerLiteral);
			setState(192);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
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
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(194);
				libRef();
				}
				break;
			}
			setState(197);
			match(Identifier);
			setState(198);
			match(LPAREN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(199);
				expression();
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				expression();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(RPAREN);
			setState(210);
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
			setState(212);
			match(Identifier);
			setState(213);
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
		public TerminalNode IntegerLiteral() { return getToken(SimplyV3Parser.IntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(SimplyV3Parser.FloatLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(SimplyV3Parser.BoolLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(SimplyV3Parser.CharLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SimplyV3Parser.StringLiteral, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LIST);
			setState(218);
			nonVoidDataTypeName();
			setState(219);
			match(Identifier);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(220);
				arrayDeclaration();
				}
			}

			setState(223);
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
		enterRule(_localctx, 28, RULE_arrayDeclaration);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				emptyArrayDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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
		enterRule(_localctx, 30, RULE_emptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ASSIGN);
			setState(230);
			match(LBRACK);
			setState(231);
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
		enterRule(_localctx, 32, RULE_nonEmptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ASSIGN);
			setState(234);
			match(LBRACK);
			setState(235);
			arrayValues();
			setState(236);
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
		enterRule(_localctx, 34, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(238);
				arrayValue();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				arrayValue();
				}
				}
				setState(247);
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
		enterRule(_localctx, 36, RULE_arrayValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(SimplyV3Parser.COLON, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FUNCTION);
			setState(251);
			match(Identifier);
			setState(252);
			match(LPAREN);
			setState(253);
			argList();
			setState(254);
			match(RPAREN);
			setState(255);
			match(COLON);
			setState(256);
			dataTypeName();
			setState(257);
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
		enterRule(_localctx, 40, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(259);
				arg();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(262);
				match(COMMA);
				setState(263);
				arg();
				}
				}
				setState(268);
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
		enterRule(_localctx, 42, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			nonVoidDataTypeName();
			setState(270);
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
		enterRule(_localctx, 44, RULE_dataTypeName);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
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
				setState(273);
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
		enterRule(_localctx, 46, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LBRACE);
			setState(277);
			blockBody();
			setState(278);
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
		enterRule(_localctx, 48, RULE_blockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 50, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << LIST) | (1L << SEND) | (1L << CHECK) | (1L << ITERATE) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL) | (1L << Identifier))) != 0)) {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(287);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnStatemtntContext returnStatemtnt() {
			return getRuleContext(ReturnStatemtntContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				iterateStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				funcCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				returnStatemtnt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
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
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			ifBlock();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					elseIfBlock();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(303);
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
		enterRule(_localctx, 56, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(CHECK);
			setState(307);
			conditionExpression();
			setState(308);
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
		enterRule(_localctx, 58, RULE_conditionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(LPAREN);
			setState(311);
			expression();
			setState(312);
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
		enterRule(_localctx, 60, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(OTHERWISE);
			setState(315);
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
		enterRule(_localctx, 62, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(OTHERWISE);
			setState(318);
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
		enterRule(_localctx, 64, RULE_iterateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ITERATE);
			setState(321);
			match(LPAREN);
			setState(322);
			loopExpression();
			setState(323);
			match(RPAREN);
			setState(324);
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
		enterRule(_localctx, 66, RULE_loopExpression);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatLiteral:
			case BoolLiteral:
			case CharLiteral:
			case StringLiteral:
			case LPAREN:
			case BANG:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				expression();
				}
				break;
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				rangeExpression();
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
		enterRule(_localctx, 68, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			arg();
			setState(331);
			match(FROM);
			setState(332);
			expression();
			setState(333);
			match(TO);
			setState(334);
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
		enterRule(_localctx, 70, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(Identifier);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(337);
				arrayAccess();
				}
			}

			setState(340);
			assignmentOperator();
			setState(341);
			expression();
			setState(342);
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
		enterRule(_localctx, 72, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		enterRule(_localctx, 74, RULE_returnStatemtnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(SEND);
			setState(347);
			expression();
			setState(348);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0161\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\5\4g\n\4\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd\n\n\5\n\u00bf\n\n\3"+
		"\13\3\13\3\13\3\13\3\f\5\f\u00c6\n\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f"+
		"\7\f\u00cf\n\f\f\f\16\f\u00d2\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00e0\n\17\3\17\3\17\3\20\3\20\5\20\u00e6\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\5\23\u00f2\n\23\3\23"+
		"\3\23\7\23\u00f6\n\23\f\23\16\23\u00f9\13\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u0107\n\26\3\26\3\26\7\26\u010b"+
		"\n\26\f\26\16\26\u010e\13\26\3\27\3\27\3\27\3\30\3\30\5\30\u0115\n\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\33\7\33\u011e\n\33\f\33\16\33\u0121\13"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0129\n\34\3\35\3\35\7\35\u012d"+
		"\n\35\f\35\16\35\u0130\13\35\3\35\5\35\u0133\n\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5"+
		"#\u014b\n#\3$\3$\3$\3$\3$\3$\3%\3%\5%\u0155\n%\3%\3%\3%\3%\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\2\4\16\20(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJL\2\5\3\2\n\16\3\2\23\27\4\2\"\"\61\64\2\u0168"+
		"\2Q\3\2\2\2\4`\3\2\2\2\6f\3\2\2\2\bi\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16"+
		"w\3\2\2\2\20\u008e\3\2\2\2\22\u00be\3\2\2\2\24\u00c0\3\2\2\2\26\u00c5"+
		"\3\2\2\2\30\u00d6\3\2\2\2\32\u00d9\3\2\2\2\34\u00db\3\2\2\2\36\u00e5\3"+
		"\2\2\2 \u00e7\3\2\2\2\"\u00eb\3\2\2\2$\u00f1\3\2\2\2&\u00fa\3\2\2\2(\u00fc"+
		"\3\2\2\2*\u0106\3\2\2\2,\u010f\3\2\2\2.\u0114\3\2\2\2\60\u0116\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\u011f\3\2\2\2\66\u0128\3\2\2\28\u012a\3\2\2\2:\u0134"+
		"\3\2\2\2<\u0138\3\2\2\2>\u013c\3\2\2\2@\u013f\3\2\2\2B\u0142\3\2\2\2D"+
		"\u014a\3\2\2\2F\u014c\3\2\2\2H\u0152\3\2\2\2J\u015a\3\2\2\2L\u015c\3\2"+
		"\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RW\3\2\2\2SQ\3\2"+
		"\2\2TV\5\6\4\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2"+
		"\2\2Z\\\5(\25\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_]"+
		"\3\2\2\2`a\7\3\2\2ab\7\65\2\2bc\7\36\2\2c\5\3\2\2\2dg\5\b\5\2eg\5\34\17"+
		"\2fd\3\2\2\2fe\3\2\2\2g\7\3\2\2\2hj\7\4\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2"+
		"\2\2kl\5\n\6\2lo\7\65\2\2mn\7\"\2\2np\5\f\7\2om\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qr\7\36\2\2r\t\3\2\2\2st\t\2\2\2t\13\3\2\2\2uv\5\16\b\2v\r\3\2\2"+
		"\2wx\b\b\1\2xy\5\20\t\2y\u008b\3\2\2\2z{\f\7\2\2{|\7,\2\2|\u008a\5\20"+
		"\t\2}~\f\6\2\2~\177\7/\2\2\177\u008a\5\20\t\2\u0080\u0081\f\5\2\2\u0081"+
		"\u0082\7\60\2\2\u0082\u008a\5\20\t\2\u0083\u0084\f\4\2\2\u0084\u0085\7"+
		",\2\2\u0085\u008a\5\20\t\2\u0086\u0087\f\3\2\2\u0087\u0088\7-\2\2\u0088"+
		"\u008a\5\20\t\2\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\b\t\1\2\u008f\u0090\5\22\n\2\u0090\u00ab\3\2\2\2\u0091\u0092\f\n\2\2"+
		"\u0092\u0093\7+\2\2\u0093\u00aa\5\22\n\2\u0094\u0095\f\t\2\2\u0095\u0096"+
		"\7*\2\2\u0096\u00aa\5\22\n\2\u0097\u0098\f\b\2\2\u0098\u0099\7#\2\2\u0099"+
		"\u00aa\5\22\n\2\u009a\u009b\f\7\2\2\u009b\u009c\7$\2\2\u009c\u00aa\5\22"+
		"\n\2\u009d\u009e\f\6\2\2\u009e\u009f\7(\2\2\u009f\u00aa\5\22\n\2\u00a0"+
		"\u00a1\f\5\2\2\u00a1\u00a2\7\'\2\2\u00a2\u00aa\5\22\n\2\u00a3\u00a4\f"+
		"\4\2\2\u00a4\u00a5\7&\2\2\u00a5\u00aa\5\22\n\2\u00a6\u00a7\f\3\2\2\u00a7"+
		"\u00a8\7)\2\2\u00a8\u00aa\5\22\n\2\u00a9\u0091\3\2\2\2\u00a9\u0094\3\2"+
		"\2\2\u00a9\u0097\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9"+
		"\u00a0\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\7\31\2\2"+
		"\u00b1\u00bf\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00bf\5\f\7\2\u00b4\u00b5"+
		"\7-\2\2\u00b5\u00bf\5\f\7\2\u00b6\u00b7\7%\2\2\u00b7\u00bf\5\f\7\2\u00b8"+
		"\u00bf\5\26\f\2\u00b9\u00bf\5\32\16\2\u00ba\u00bc\7\65\2\2\u00bb\u00bd"+
		"\5\24\13\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2"+
		"\u00be\u00ae\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b6"+
		"\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf"+
		"\23\3\2\2\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\7\35"+
		"\2\2\u00c3\25\3\2\2\2\u00c4\u00c6\5\30\r\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\65\2\2\u00c8\u00ca\7\30\2\2"+
		"\u00c9\u00cb\5\f\7\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d0"+
		"\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\5\f\7\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d5\7\36\2\2"+
		"\u00d5\27\3\2\2\2\u00d6\u00d7\7\65\2\2\u00d7\u00d8\7 \2\2\u00d8\31\3\2"+
		"\2\2\u00d9\u00da\t\3\2\2\u00da\33\3\2\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd"+
		"\5\n\6\2\u00dd\u00df\7\65\2\2\u00de\u00e0\5\36\20\2\u00df\u00de\3\2\2"+
		"\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\36\2\2\u00e2"+
		"\35\3\2\2\2\u00e3\u00e6\5 \21\2\u00e4\u00e6\5\"\22\2\u00e5\u00e3\3\2\2"+
		"\2\u00e5\u00e4\3\2\2\2\u00e6\37\3\2\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9"+
		"\7\34\2\2\u00e9\u00ea\7\35\2\2\u00ea!\3\2\2\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00ed\7\34\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\7\35\2\2\u00ef#\3\2\2"+
		"\2\u00f0\u00f2\5&\24\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f7"+
		"\3\2\2\2\u00f3\u00f4\7\37\2\2\u00f4\u00f6\5&\24\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8%\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5\32\16\2\u00fb\'\3\2\2\2\u00fc"+
		"\u00fd\7\20\2\2\u00fd\u00fe\7\65\2\2\u00fe\u00ff\7\30\2\2\u00ff\u0100"+
		"\5*\26\2\u0100\u0101\7\31\2\2\u0101\u0102\7!\2\2\u0102\u0103\5.\30\2\u0103"+
		"\u0104\5\60\31\2\u0104)\3\2\2\2\u0105\u0107\5,\27\2\u0106\u0105\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107\u010c\3\2\2\2\u0108\u0109\7\37\2\2\u0109"+
		"\u010b\5,\27\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d+\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110"+
		"\5\n\6\2\u0110\u0111\7\65\2\2\u0111-\3\2\2\2\u0112\u0115\7\17\2\2\u0113"+
		"\u0115\5\n\6\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115/\3\2\2\2"+
		"\u0116\u0117\7\32\2\2\u0117\u0118\5\62\32\2\u0118\u0119\7\33\2\2\u0119"+
		"\61\3\2\2\2\u011a\u011b\5\64\33\2\u011b\63\3\2\2\2\u011c\u011e\5\66\34"+
		"\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\65\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0129\58\35\2\u0123"+
		"\u0129\5B\"\2\u0124\u0129\5H%\2\u0125\u0129\5\26\f\2\u0126\u0129\5L\'"+
		"\2\u0127\u0129\5\6\4\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124"+
		"\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\67\3\2\2\2\u012a\u012e\5:\36\2\u012b\u012d\5> \2\u012c\u012b\3\2\2\2"+
		"\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\5@!\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u01339\3\2\2\2\u0134\u0135\7\7\2\2\u0135\u0136\5<\37\2"+
		"\u0136\u0137\5\60\31\2\u0137;\3\2\2\2\u0138\u0139\7\30\2\2\u0139\u013a"+
		"\5\f\7\2\u013a\u013b\7\31\2\2\u013b=\3\2\2\2\u013c\u013d\7\b\2\2\u013d"+
		"\u013e\5:\36\2\u013e?\3\2\2\2\u013f\u0140\7\b\2\2\u0140\u0141\5\60\31"+
		"\2\u0141A\3\2\2\2\u0142\u0143\7\t\2\2\u0143\u0144\7\30\2\2\u0144\u0145"+
		"\5D#\2\u0145\u0146\7\31\2\2\u0146\u0147\5\60\31\2\u0147C\3\2\2\2\u0148"+
		"\u014b\5\f\7\2\u0149\u014b\5F$\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2"+
		"\2\u014bE\3\2\2\2\u014c\u014d\5,\27\2\u014d\u014e\7\21\2\2\u014e\u014f"+
		"\5\f\7\2\u014f\u0150\7\22\2\2\u0150\u0151\5\f\7\2\u0151G\3\2\2\2\u0152"+
		"\u0154\7\65\2\2\u0153\u0155\5\24\13\2\u0154\u0153\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\5J&\2\u0157\u0158\5\f\7\2\u0158"+
		"\u0159\7\36\2\2\u0159I\3\2\2\2\u015a\u015b\t\4\2\2\u015bK\3\2\2\2\u015c"+
		"\u015d\7\6\2\2\u015d\u015e\5\f\7\2\u015e\u015f\7\36\2\2\u015fM\3\2\2\2"+
		"\36QW]fio\u0089\u008b\u00a9\u00ab\u00bc\u00be\u00c5\u00ca\u00d0\u00df"+
		"\u00e5\u00f1\u00f7\u0106\u010c\u0114\u011f\u0128\u012e\u0132\u014a\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}