// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Parser.g4 by ANTLR 4.9.1

package antlr.gen;

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
	public static final int
		RULE_compilationUnit = 0, RULE_libImport = 1, RULE_identifier = 2, RULE_globalVariableDeclaration = 3, 
		RULE_variableDeclaration = 4, RULE_constantDeclaration = 5, RULE_primitiveVariableDeclaration = 6, 
		RULE_nonVoidDataTypeName = 7, RULE_expression = 8, RULE_arithmaticExpression = 9, 
		RULE_logicExpression = 10, RULE_unaryExpression = 11, RULE_arrayAccess = 12, 
		RULE_funcCall = 13, RULE_funcCallParamList = 14, RULE_libRef = 15, RULE_literal = 16, 
		RULE_arrayVariableDeclaration = 17, RULE_arrayIntialization = 18, RULE_emptyArr = 19, 
		RULE_nonEmptyArr = 20, RULE_arrayValues = 21, RULE_arrayValue = 22, RULE_functionDeclaration = 23, 
		RULE_functionSignature = 24, RULE_argList = 25, RULE_arg = 26, RULE_dataTypeName = 27, 
		RULE_block = 28, RULE_blockBody = 29, RULE_statements = 30, RULE_statement = 31, 
		RULE_ifStatement = 32, RULE_ifBlock = 33, RULE_ifConditionExpression = 34, 
		RULE_elseIfBlock = 35, RULE_elseBlock = 36, RULE_iterateStatement = 37, 
		RULE_iterateConditionExpression = 38, RULE_rangeExpression = 39, RULE_arrayIterateExpression = 40, 
		RULE_loopControlStatement = 41, RULE_assignmentStatement = 42, RULE_assignmentOperator = 43, 
		RULE_funcCallStatement = 44, RULE_returnStatemtnt = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "libImport", "identifier", "globalVariableDeclaration", 
			"variableDeclaration", "constantDeclaration", "primitiveVariableDeclaration", 
			"nonVoidDataTypeName", "expression", "arithmaticExpression", "logicExpression", 
			"unaryExpression", "arrayAccess", "funcCall", "funcCallParamList", "libRef", 
			"literal", "arrayVariableDeclaration", "arrayIntialization", "emptyArr", 
			"nonEmptyArr", "arrayValues", "arrayValue", "functionDeclaration", "functionSignature", 
			"argList", "arg", "dataTypeName", "block", "blockBody", "statements", 
			"statement", "ifStatement", "ifBlock", "ifConditionExpression", "elseIfBlock", 
			"elseBlock", "iterateStatement", "iterateConditionExpression", "rangeExpression", 
			"arrayIterateExpression", "loopControlStatement", "assignmentStatement", 
			"assignmentOperator", "funcCallStatement", "returnStatemtnt"
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
		public TerminalNode EOF() { return getToken(SimplyV3Parser.EOF, 0); }
		public List<LibImportContext> libImport() {
			return getRuleContexts(LibImportContext.class);
		}
		public LibImportContext libImport(int i) {
			return getRuleContext(LibImportContext.class,i);
		}
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GET) {
				{
				{
				setState(92);
				libImport();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(98);
				globalVariableDeclaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(104);
				functionDeclaration();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(EOF);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(112);
			match(GET);
			setState(113);
			identifier();
			setState(114);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimplyV3Parser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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

	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(SimplyV3Parser.GLOBAL, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitGlobalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitGlobalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(GLOBAL);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				{
				setState(119);
				variableDeclaration();
				}
				break;
			case CONST:
				{
				setState(120);
				constantDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 8, RULE_variableDeclaration);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				primitiveVariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SimplyV3Parser.CONST, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CONST);
			setState(128);
			variableDeclaration();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
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
		enterRule(_localctx, 12, RULE_primitiveVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			nonVoidDataTypeName();
			setState(131);
			identifier();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(132);
				match(ASSIGN);
				setState(133);
				expression();
				}
			}

			setState(136);
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
		enterRule(_localctx, 14, RULE_nonVoidDataTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmaticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			logicExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(145);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(146);
						match(MUL);
						setState(147);
						logicExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(148);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(149);
						match(DIV);
						setState(150);
						logicExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(151);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(152);
						match(MOD);
						setState(153);
						logicExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(154);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(155);
						match(ADD);
						setState(156);
						logicExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(157);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(158);
						match(SUB);
						setState(159);
						logicExpression(0);
						}
						break;
					}
					} 
				}
				setState(164);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(168);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(169);
						match(OR);
						setState(170);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						match(AND);
						setState(173);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						match(GT);
						setState(176);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(178);
						match(LT);
						setState(179);
						unaryExpression();
						}
						break;
					case 5:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181);
						match(GE);
						setState(182);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						match(LE);
						setState(185);
						unaryExpression();
						}
						break;
					case 7:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						match(EQUAL);
						setState(188);
						unaryExpression();
						}
						break;
					case 8:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(189);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(190);
						match(NOTEQUAL);
						setState(191);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(196);
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
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAccessExpressionContext extends UnaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixPlusExpressionContext extends UnaryExpressionContext {
		public TerminalNode ADD() { return getToken(SimplyV3Parser.ADD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixPlusExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterPrefixPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitPrefixPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitPrefixPlusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixNotExpressionContext extends UnaryExpressionContext {
		public TerminalNode BANG() { return getToken(SimplyV3Parser.BANG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixNotExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterPrefixNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitPrefixNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitPrefixNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixMinusExpressionContext extends UnaryExpressionContext {
		public TerminalNode SUB() { return getToken(SimplyV3Parser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixMinusExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterPrefixMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitPrefixMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitPrefixMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends UnaryExpressionContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FunctionCallExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends UnaryExpressionContext {
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public ParenExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends UnaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unaryExpression);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(LPAREN);
				setState(198);
				expression();
				setState(199);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new PrefixPlusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ADD);
				setState(202);
				expression();
				}
				break;
			case 3:
				_localctx = new PrefixMinusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(SUB);
				setState(204);
				expression();
				}
				break;
			case 4:
				_localctx = new PrefixNotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(BANG);
				setState(206);
				expression();
				}
				break;
			case 5:
				_localctx = new FunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				funcCall();
				}
				break;
			case 6:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				literal();
				}
				break;
			case 7:
				_localctx = new ArrayAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				identifier();
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(210);
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
		enterRule(_localctx, 24, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LBRACK);
			setState(216);
			expression();
			setState(217);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncCallParamListContext funcCallParamList() {
			return getRuleContext(FuncCallParamListContext.class,0);
		}
		public LibRefContext libRef() {
			return getRuleContext(LibRefContext.class,0);
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
		enterRule(_localctx, 26, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(219);
				libRef();
				}
				break;
			}
			setState(222);
			identifier();
			setState(223);
			funcCallParamList();
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

	public static class FuncCallParamListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
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
		public FuncCallParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFuncCallParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFuncCallParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFuncCallParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallParamListContext funcCallParamList() throws RecognitionException {
		FuncCallParamListContext _localctx = new FuncCallParamListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcCallParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LPAREN);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(226);
				expression();
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				expression();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_libRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			identifier();
			setState(239);
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
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode StringLiteral() { return getToken(SimplyV3Parser.StringLiteral, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public TerminalNode IntegerLiteral() { return getToken(SimplyV3Parser.IntegerLiteral, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
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
	public static class FloatLiteralContext extends LiteralContext {
		public TerminalNode FloatLiteral() { return getToken(SimplyV3Parser.FloatLiteral, 0); }
		public FloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
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
	public static class CharLiteralContext extends LiteralContext {
		public TerminalNode CharLiteral() { return getToken(SimplyV3Parser.CharLiteral, 0); }
		public CharLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLiteralContext extends LiteralContext {
		public TerminalNode BoolLiteral() { return getToken(SimplyV3Parser.BoolLiteral, 0); }
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(IntegerLiteral);
				}
				break;
			case FloatLiteral:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(FloatLiteral);
				}
				break;
			case BoolLiteral:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(BoolLiteral);
				}
				break;
			case CharLiteral:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(CharLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(StringLiteral);
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

	public static class ArrayVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(SimplyV3Parser.LIST, 0); }
		public NonVoidDataTypeNameContext nonVoidDataTypeName() {
			return getRuleContext(NonVoidDataTypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public ArrayIntializationContext arrayIntialization() {
			return getRuleContext(ArrayIntializationContext.class,0);
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
		enterRule(_localctx, 34, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LIST);
			setState(249);
			nonVoidDataTypeName();
			setState(250);
			identifier();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(251);
				arrayIntialization();
				}
			}

			setState(254);
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

	public static class ArrayIntializationContext extends ParserRuleContext {
		public ArrayIntializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIntialization; }
	 
		public ArrayIntializationContext() { }
		public void copyFrom(ArrayIntializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonEmptyArrayInitializationContext extends ArrayIntializationContext {
		public NonEmptyArrContext nonEmptyArr() {
			return getRuleContext(NonEmptyArrContext.class,0);
		}
		public NonEmptyArrayInitializationContext(ArrayIntializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNonEmptyArrayInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNonEmptyArrayInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNonEmptyArrayInitialization(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyArrayInitializationContext extends ArrayIntializationContext {
		public EmptyArrContext emptyArr() {
			return getRuleContext(EmptyArrContext.class,0);
		}
		public EmptyArrayInitializationContext(ArrayIntializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterEmptyArrayInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitEmptyArrayInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitEmptyArrayInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIntializationContext arrayIntialization() throws RecognitionException {
		ArrayIntializationContext _localctx = new ArrayIntializationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayIntialization);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new EmptyArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				emptyArr();
				}
				break;
			case 2:
				_localctx = new NonEmptyArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				nonEmptyArr();
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

	public static class EmptyArrContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimplyV3Parser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(SimplyV3Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SimplyV3Parser.RBRACK, 0); }
		public EmptyArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterEmptyArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitEmptyArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitEmptyArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyArrContext emptyArr() throws RecognitionException {
		EmptyArrContext _localctx = new EmptyArrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_emptyArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ASSIGN);
			setState(261);
			match(LBRACK);
			setState(262);
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

	public static class NonEmptyArrContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimplyV3Parser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(SimplyV3Parser.LBRACK, 0); }
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimplyV3Parser.RBRACK, 0); }
		public NonEmptyArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNonEmptyArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNonEmptyArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNonEmptyArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonEmptyArrContext nonEmptyArr() throws RecognitionException {
		NonEmptyArrContext _localctx = new NonEmptyArrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nonEmptyArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ASSIGN);
			setState(265);
			match(LBRACK);
			setState(266);
			arrayValues();
			setState(267);
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
		enterRule(_localctx, 42, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(269);
				arrayValue();
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				arrayValue();
				}
				}
				setState(278);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 44, RULE_arrayValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 46, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(FUNCTION);
			setState(282);
			functionSignature();
			setState(283);
			match(COLON);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(284);
				match(LIST);
				}
			}

			setState(287);
			dataTypeName();
			setState(288);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_functionSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			identifier();
			setState(291);
			match(LPAREN);
			setState(292);
			argList();
			setState(293);
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
		enterRule(_localctx, 50, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(295);
				arg();
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(298);
				match(COMMA);
				setState(299);
				arg();
				}
				}
				setState(304);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(305);
				match(LIST);
				}
			}

			setState(308);
			nonVoidDataTypeName();
			setState(309);
			identifier();
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
		enterRule(_localctx, 54, RULE_dataTypeName);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
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
				setState(312);
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
		enterRule(_localctx, 56, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LBRACE);
			setState(316);
			blockBody();
			setState(317);
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
		enterRule(_localctx, 58, RULE_blockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 60, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << LIST) | (1L << SEND) | (1L << CHECK) | (1L << ITERATE) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL) | (1L << CONTINUE) | (1L << BREAK) | (1L << Identifier))) != 0)) {
				{
				{
				setState(321);
				statement();
				}
				}
				setState(326);
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
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
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
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
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
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				iterateStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				funcCallStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				returnStatemtnt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				variableDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				constantDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
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
		enterRule(_localctx, 64, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			ifBlock();
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					elseIfBlock();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(344);
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
		public IfConditionExpressionContext ifConditionExpression() {
			return getRuleContext(IfConditionExpressionContext.class,0);
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
		enterRule(_localctx, 66, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(CHECK);
			setState(348);
			ifConditionExpression();
			setState(349);
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

	public static class IfConditionExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimplyV3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplyV3Parser.RPAREN, 0); }
		public IfConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIfConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIfConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIfConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionExpressionContext ifConditionExpression() throws RecognitionException {
		IfConditionExpressionContext _localctx = new IfConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifConditionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LPAREN);
			setState(352);
			expression();
			setState(353);
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
		enterRule(_localctx, 70, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(OTHERWISE);
			setState(356);
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
		enterRule(_localctx, 72, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(OTHERWISE);
			setState(359);
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
		public IterateConditionExpressionContext iterateConditionExpression() {
			return getRuleContext(IterateConditionExpressionContext.class,0);
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
		enterRule(_localctx, 74, RULE_iterateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ITERATE);
			setState(362);
			match(LPAREN);
			setState(363);
			iterateConditionExpression();
			setState(364);
			match(RPAREN);
			setState(365);
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

	public static class IterateConditionExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public ArrayIterateExpressionContext arrayIterateExpression() {
			return getRuleContext(ArrayIterateExpressionContext.class,0);
		}
		public IterateConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterateConditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIterateConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIterateConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIterateConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterateConditionExpressionContext iterateConditionExpression() throws RecognitionException {
		IterateConditionExpressionContext _localctx = new IterateConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iterateConditionExpression);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				rangeExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				arrayIterateExpression();
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
		enterRule(_localctx, 78, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			arg();
			setState(373);
			match(FROM);
			setState(374);
			expression();
			setState(375);
			match(TO);
			setState(376);
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

	public static class ArrayIterateExpressionContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode OF() { return getToken(SimplyV3Parser.OF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrayIterateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIterateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayIterateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayIterateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayIterateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIterateExpressionContext arrayIterateExpression() throws RecognitionException {
		ArrayIterateExpressionContext _localctx = new ArrayIterateExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayIterateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			arg();
			setState(379);
			match(OF);
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(380);
				identifier();
				}
				break;
			case 2:
				{
				setState(381);
				funcCall();
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
		enterRule(_localctx, 82, RULE_loopControlStatement);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(CONTINUE);
				setState(385);
				match(EOL);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(BREAK);
				setState(387);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			identifier();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(391);
				arrayAccess();
				}
			}

			setState(394);
			assignmentOperator();
			setState(395);
			expression();
			setState(396);
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
		enterRule(_localctx, 86, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
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
		enterRule(_localctx, 88, RULE_funcCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			funcCall();
			setState(401);
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
		enterRule(_localctx, 90, RULE_returnStatemtnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(SEND);
			setState(404);
			expression();
			setState(405);
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
		case 9:
			return arithmaticExpression_sempred((ArithmaticExpressionContext)_localctx, predIndex);
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\7\2f\n\2\f\2\16"+
		"\2i\13\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\5\5|\n\5\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\5\b\u0089\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a3"+
		"\n\13\f\13\16\13\u00a6\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00c3\n\f\f\f\16\f\u00c6\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\5\r\u00d8\n\r\3\16\3\16\3\16\3\16\3\17"+
		"\5\17\u00df\n\17\3\17\3\17\3\17\3\20\3\20\5\20\u00e6\n\20\3\20\3\20\7"+
		"\20\u00ea\n\20\f\20\16\20\u00ed\13\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00f9\n\22\3\23\3\23\3\23\3\23\5\23\u00ff\n\23"+
		"\3\23\3\23\3\24\3\24\5\24\u0105\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\5\27\u0111\n\27\3\27\3\27\7\27\u0115\n\27\f\27\16\27\u0118"+
		"\13\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0120\n\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\5\33\u012b\n\33\3\33\3\33\7\33\u012f\n\33"+
		"\f\33\16\33\u0132\13\33\3\34\5\34\u0135\n\34\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u013c\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \7 \u0145\n \f \16 \u0148"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0152\n!\3\"\3\"\7\"\u0156\n\"\f\"\16"+
		"\"\u0159\13\"\3\"\5\"\u015c\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u0175\n(\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\5*\u0181\n*\3+\3+\3+\3+\5+\u0187\n+\3,\3,\5,\u018b\n,\3,\3"+
		",\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\2\4\24\26\60\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\4\3\2\n"+
		"\16\4\2&&\658\2\u01a4\2a\3\2\2\2\4r\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n\177"+
		"\3\2\2\2\f\u0081\3\2\2\2\16\u0084\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3"+
		"\2\2\2\24\u0090\3\2\2\2\26\u00a7\3\2\2\2\30\u00d7\3\2\2\2\32\u00d9\3\2"+
		"\2\2\34\u00de\3\2\2\2\36\u00e3\3\2\2\2 \u00f0\3\2\2\2\"\u00f8\3\2\2\2"+
		"$\u00fa\3\2\2\2&\u0104\3\2\2\2(\u0106\3\2\2\2*\u010a\3\2\2\2,\u0110\3"+
		"\2\2\2.\u0119\3\2\2\2\60\u011b\3\2\2\2\62\u0124\3\2\2\2\64\u012a\3\2\2"+
		"\2\66\u0134\3\2\2\28\u013b\3\2\2\2:\u013d\3\2\2\2<\u0141\3\2\2\2>\u0146"+
		"\3\2\2\2@\u0151\3\2\2\2B\u0153\3\2\2\2D\u015d\3\2\2\2F\u0161\3\2\2\2H"+
		"\u0165\3\2\2\2J\u0168\3\2\2\2L\u016b\3\2\2\2N\u0174\3\2\2\2P\u0176\3\2"+
		"\2\2R\u017c\3\2\2\2T\u0186\3\2\2\2V\u0188\3\2\2\2X\u0190\3\2\2\2Z\u0192"+
		"\3\2\2\2\\\u0195\3\2\2\2^`\5\4\3\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2bg\3\2\2\2ca\3\2\2\2df\5\b\5\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2"+
		"\2\2hm\3\2\2\2ig\3\2\2\2jl\5\60\31\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2rs\7\3\2\2st\5\6\4\2tu"+
		"\7\"\2\2u\5\3\2\2\2vw\79\2\2w\7\3\2\2\2x{\7\26\2\2y|\5\n\6\2z|\5\f\7\2"+
		"{y\3\2\2\2{z\3\2\2\2|\t\3\2\2\2}\u0080\5\16\b\2~\u0080\5$\23\2\177}\3"+
		"\2\2\2\177~\3\2\2\2\u0080\13\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5"+
		"\n\6\2\u0083\r\3\2\2\2\u0084\u0085\5\20\t\2\u0085\u0088\5\6\4\2\u0086"+
		"\u0087\7&\2\2\u0087\u0089\5\22\n\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\"\2\2\u008b\17\3\2\2\2\u008c\u008d"+
		"\t\2\2\2\u008d\21\3\2\2\2\u008e\u008f\5\24\13\2\u008f\23\3\2\2\2\u0090"+
		"\u0091\b\13\1\2\u0091\u0092\5\26\f\2\u0092\u00a4\3\2\2\2\u0093\u0094\f"+
		"\7\2\2\u0094\u0095\7\62\2\2\u0095\u00a3\5\26\f\2\u0096\u0097\f\6\2\2\u0097"+
		"\u0098\7\63\2\2\u0098\u00a3\5\26\f\2\u0099\u009a\f\5\2\2\u009a\u009b\7"+
		"\64\2\2\u009b\u00a3\5\26\f\2\u009c\u009d\f\4\2\2\u009d\u009e\7\60\2\2"+
		"\u009e\u00a3\5\26\f\2\u009f\u00a0\f\3\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a3"+
		"\5\26\f\2\u00a2\u0093\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u0099\3\2\2\2"+
		"\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\b\f\1\2\u00a8\u00a9\5\30\r\2\u00a9\u00c4\3\2\2\2\u00aa\u00ab\f"+
		"\n\2\2\u00ab\u00ac\7/\2\2\u00ac\u00c3\5\30\r\2\u00ad\u00ae\f\t\2\2\u00ae"+
		"\u00af\7.\2\2\u00af\u00c3\5\30\r\2\u00b0\u00b1\f\b\2\2\u00b1\u00b2\7\'"+
		"\2\2\u00b2\u00c3\5\30\r\2\u00b3\u00b4\f\7\2\2\u00b4\u00b5\7(\2\2\u00b5"+
		"\u00c3\5\30\r\2\u00b6\u00b7\f\6\2\2\u00b7\u00b8\7,\2\2\u00b8\u00c3\5\30"+
		"\r\2\u00b9\u00ba\f\5\2\2\u00ba\u00bb\7+\2\2\u00bb\u00c3\5\30\r\2\u00bc"+
		"\u00bd\f\4\2\2\u00bd\u00be\7*\2\2\u00be\u00c3\5\30\r\2\u00bf\u00c0\f\3"+
		"\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00aa\3\2\2\2\u00c2"+
		"\u00ad\3\2\2\2\u00c2\u00b0\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b6\3\2"+
		"\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\34\2\2\u00c8\u00c9\5\22\n\2\u00c9"+
		"\u00ca\7\35\2\2\u00ca\u00d8\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00d8\5"+
		"\22\n\2\u00cd\u00ce\7\61\2\2\u00ce\u00d8\5\22\n\2\u00cf\u00d0\7)\2\2\u00d0"+
		"\u00d8\5\22\n\2\u00d1\u00d8\5\34\17\2\u00d2\u00d8\5\"\22\2\u00d3\u00d5"+
		"\5\6\4\2\u00d4\u00d6\5\32\16\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d8\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00cd"+
		"\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00da\7 \2\2\u00da\u00db\5\22\n"+
		"\2\u00db\u00dc\7!\2\2\u00dc\33\3\2\2\2\u00dd\u00df\5 \21\2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\5\6\4\2\u00e1"+
		"\u00e2\5\36\20\2\u00e2\35\3\2\2\2\u00e3\u00e5\7\34\2\2\u00e4\u00e6\5\22"+
		"\n\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00eb\3\2\2\2\u00e7"+
		"\u00e8\7#\2\2\u00e8\u00ea\5\22\n\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7\35\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\5\6\4"+
		"\2\u00f1\u00f2\7$\2\2\u00f2!\3\2\2\2\u00f3\u00f9\7\27\2\2\u00f4\u00f9"+
		"\7\30\2\2\u00f5\u00f9\7\31\2\2\u00f6\u00f9\7\32\2\2\u00f7\u00f9\7\33\2"+
		"\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7\5\2\2\u00fb"+
		"\u00fc\5\20\t\2\u00fc\u00fe\5\6\4\2\u00fd\u00ff\5&\24\2\u00fe\u00fd\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\"\2\2\u0101"+
		"%\3\2\2\2\u0102\u0105\5(\25\2\u0103\u0105\5*\26\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0103\3\2\2\2\u0105\'\3\2\2\2\u0106\u0107\7&\2\2\u0107\u0108\7"+
		" \2\2\u0108\u0109\7!\2\2\u0109)\3\2\2\2\u010a\u010b\7&\2\2\u010b\u010c"+
		"\7 \2\2\u010c\u010d\5,\27\2\u010d\u010e\7!\2\2\u010e+\3\2\2\2\u010f\u0111"+
		"\5.\30\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112"+
		"\u0113\7#\2\2\u0113\u0115\5.\30\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117-\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011a\5\22\n\2\u011a/\3\2\2\2\u011b\u011c\7\20\2\2\u011c"+
		"\u011d\5\62\32\2\u011d\u011f\7%\2\2\u011e\u0120\7\5\2\2\u011f\u011e\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\58\35\2\u0122"+
		"\u0123\5:\36\2\u0123\61\3\2\2\2\u0124\u0125\5\6\4\2\u0125\u0126\7\34\2"+
		"\2\u0126\u0127\5\64\33\2\u0127\u0128\7\35\2\2\u0128\63\3\2\2\2\u0129\u012b"+
		"\5\66\34\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2"+
		"\u012c\u012d\7#\2\2\u012d\u012f\5\66\34\2\u012e\u012c\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\65\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0135\7\5\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5\20\t\2\u0137\u0138\5\6\4\2\u0138"+
		"\67\3\2\2\2\u0139\u013c\7\17\2\2\u013a\u013c\5\20\t\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013a\3\2\2\2\u013c9\3\2\2\2\u013d\u013e\7\36\2\2\u013e\u013f"+
		"\5<\37\2\u013f\u0140\7\37\2\2\u0140;\3\2\2\2\u0141\u0142\5> \2\u0142="+
		"\3\2\2\2\u0143\u0145\5@!\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147?\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0149\u0152\5B\"\2\u014a\u0152\5L\'\2\u014b\u0152\5V,\2\u014c\u0152\5"+
		"Z.\2\u014d\u0152\5\\/\2\u014e\u0152\5\n\6\2\u014f\u0152\5\f\7\2\u0150"+
		"\u0152\5T+\2\u0151\u0149\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2"+
		"\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0150\3\2\2\2\u0152A\3\2\2\2\u0153\u0157\5D#\2\u0154\u0156"+
		"\5H%\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\5J"+
		"&\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015cC\3\2\2\2\u015d\u015e"+
		"\7\7\2\2\u015e\u015f\5F$\2\u015f\u0160\5:\36\2\u0160E\3\2\2\2\u0161\u0162"+
		"\7\34\2\2\u0162\u0163\5\22\n\2\u0163\u0164\7\35\2\2\u0164G\3\2\2\2\u0165"+
		"\u0166\7\b\2\2\u0166\u0167\5D#\2\u0167I\3\2\2\2\u0168\u0169\7\b\2\2\u0169"+
		"\u016a\5:\36\2\u016aK\3\2\2\2\u016b\u016c\7\t\2\2\u016c\u016d\7\34\2\2"+
		"\u016d\u016e\5N(\2\u016e\u016f\7\35\2\2\u016f\u0170\5:\36\2\u0170M\3\2"+
		"\2\2\u0171\u0175\5\22\n\2\u0172\u0175\5P)\2\u0173\u0175\5R*\2\u0174\u0171"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175O\3\2\2\2\u0176"+
		"\u0177\5\66\34\2\u0177\u0178\7\21\2\2\u0178\u0179\5\22\n\2\u0179\u017a"+
		"\7\22\2\2\u017a\u017b\5\22\n\2\u017bQ\3\2\2\2\u017c\u017d\5\66\34\2\u017d"+
		"\u0180\7\25\2\2\u017e\u0181\5\6\4\2\u017f\u0181\5\34\17\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181S\3\2\2\2\u0182\u0183\7\23\2\2\u0183"+
		"\u0187\7\"\2\2\u0184\u0185\7\24\2\2\u0185\u0187\7\"\2\2\u0186\u0182\3"+
		"\2\2\2\u0186\u0184\3\2\2\2\u0187U\3\2\2\2\u0188\u018a\5\6\4\2\u0189\u018b"+
		"\5\32\16\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2"+
		"\u018c\u018d\5X-\2\u018d\u018e\5\22\n\2\u018e\u018f\7\"\2\2\u018fW\3\2"+
		"\2\2\u0190\u0191\t\3\2\2\u0191Y\3\2\2\2\u0192\u0193\5\34\17\2\u0193\u0194"+
		"\7\"\2\2\u0194[\3\2\2\2\u0195\u0196\7\6\2\2\u0196\u0197\5\22\n\2\u0197"+
		"\u0198\7\"\2\2\u0198]\3\2\2\2#agm{\177\u0088\u00a2\u00a4\u00c2\u00c4\u00d5"+
		"\u00d7\u00de\u00e5\u00eb\u00f8\u00fe\u0104\u0110\u0116\u011f\u012a\u0130"+
		"\u0134\u013b\u0146\u0151\u0157\u015b\u0174\u0180\u0186\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}