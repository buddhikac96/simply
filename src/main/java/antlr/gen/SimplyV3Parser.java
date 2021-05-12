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
		CONTINUE=17, BREAK=18, OF=19, GLOBAL=20, RANGE=21, NEXT=22, IntegerLiteral=23, 
		FloatLiteral=24, BoolLiteral=25, CharLiteral=26, StringLiteral=27, LPAREN=28, 
		RPAREN=29, LBRACE=30, RBRACE=31, LBRACK=32, RBRACK=33, EOL=34, COMMA=35, 
		DOT=36, COLON=37, ASSIGN=38, GT=39, LT=40, BANG=41, EQUAL=42, LE=43, GE=44, 
		NOTEQUAL=45, AND=46, OR=47, ADD=48, SUB=49, MUL=50, DIV=51, MOD=52, ADD_ASSIGN=53, 
		SUB_ASSIGN=54, MUL_ASSIGN=55, DIV_ASSIGN=56, Identifier=57, WS=58, COMMENT=59, 
		LINE_COMMENT=60;
	public static final int
		RULE_compilationUnit = 0, RULE_libImport = 1, RULE_identifier = 2, RULE_globalVariableDeclaration = 3, 
		RULE_elementDeclaration = 4, RULE_variableDeclaration = 5, RULE_constantDeclaration = 6, 
		RULE_primitiveVariableDeclaration = 7, RULE_nonVoidDataTypeName = 8, RULE_expression = 9, 
		RULE_arithmaticExpression = 10, RULE_logicExpression = 11, RULE_unaryExpression = 12, 
		RULE_arrayAccess = 13, RULE_funcCall = 14, RULE_funcCallParamList = 15, 
		RULE_libRef = 16, RULE_literal = 17, RULE_arrayVariableDeclaration = 18, 
		RULE_arrayIntialization = 19, RULE_emptyArr = 20, RULE_nonEmptyArr = 21, 
		RULE_arrayValues = 22, RULE_arrayValue = 23, RULE_functionDeclaration = 24, 
		RULE_functionSignature = 25, RULE_argList = 26, RULE_arg = 27, RULE_dataTypeName = 28, 
		RULE_block = 29, RULE_blockBody = 30, RULE_statements = 31, RULE_statement = 32, 
		RULE_ifStatement = 33, RULE_ifBlock = 34, RULE_ifConditionExpression = 35, 
		RULE_elseIfBlock = 36, RULE_elseBlock = 37, RULE_iterateStatement = 38, 
		RULE_iterateConditionExpression = 39, RULE_rangeExpression = 40, RULE_newRangeExpression = 41, 
		RULE_nextExpression = 42, RULE_fromExpression = 43, RULE_toExpression = 44, 
		RULE_arrayIterateExpression = 45, RULE_loopControlStatement = 46, RULE_assignmentStatement = 47, 
		RULE_primitiveVariableAssignment = 48, RULE_arrayVariableAssignment = 49, 
		RULE_assignmentOperator = 50, RULE_funcCallStatement = 51, RULE_returnStatemtnt = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "libImport", "identifier", "globalVariableDeclaration", 
			"elementDeclaration", "variableDeclaration", "constantDeclaration", "primitiveVariableDeclaration", 
			"nonVoidDataTypeName", "expression", "arithmaticExpression", "logicExpression", 
			"unaryExpression", "arrayAccess", "funcCall", "funcCallParamList", "libRef", 
			"literal", "arrayVariableDeclaration", "arrayIntialization", "emptyArr", 
			"nonEmptyArr", "arrayValues", "arrayValue", "functionDeclaration", "functionSignature", 
			"argList", "arg", "dataTypeName", "block", "blockBody", "statements", 
			"statement", "ifStatement", "ifBlock", "ifConditionExpression", "elseIfBlock", 
			"elseBlock", "iterateStatement", "iterateConditionExpression", "rangeExpression", 
			"newRangeExpression", "nextExpression", "fromExpression", "toExpression", 
			"arrayIterateExpression", "loopControlStatement", "assignmentStatement", 
			"primitiveVariableAssignment", "arrayVariableAssignment", "assignmentOperator", 
			"funcCallStatement", "returnStatemtnt"
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GET) {
				{
				{
				setState(106);
				libImport();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(112);
				globalVariableDeclaration();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(118);
				functionDeclaration();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(126);
			match(GET);
			setState(127);
			identifier();
			setState(128);
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
			setState(130);
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
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
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
			setState(132);
			match(GLOBAL);
			setState(133);
			elementDeclaration();
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

	public static class ElementDeclarationContext extends ParserRuleContext {
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
	 
		public ElementDeclarationContext() { }
		public void copyFrom(ElementDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationRuleContext extends ElementDeclarationContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationRuleContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterVariableDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitVariableDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitVariableDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDeclarationRuleContext extends ElementDeclarationContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ConstantDeclarationRuleContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterConstantDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitConstantDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitConstantDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementDeclaration);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				_localctx = new VariableDeclarationRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				variableDeclaration();
				}
				break;
			case CONST:
				_localctx = new ConstantDeclarationRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				constantDeclaration();
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
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				primitiveVariableDeclaration();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
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
		enterRule(_localctx, 12, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CONST);
			setState(144);
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
		enterRule(_localctx, 14, RULE_primitiveVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			nonVoidDataTypeName();
			setState(147);
			identifier();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(148);
				match(ASSIGN);
				setState(149);
				expression();
				}
			}

			setState(152);
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
		enterRule(_localctx, 16, RULE_nonVoidDataTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmaticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			logicExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						match(MUL);
						setState(163);
						logicExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						match(DIV);
						setState(166);
						logicExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						match(MOD);
						setState(169);
						logicExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(170);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(171);
						match(ADD);
						setState(172);
						logicExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new ArithmaticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmaticExpression);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						match(SUB);
						setState(175);
						logicExpression(0);
						}
						break;
					}
					} 
				}
				setState(180);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(184);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(185);
						match(OR);
						setState(186);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						match(AND);
						setState(189);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(191);
						match(GT);
						setState(192);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						match(LT);
						setState(195);
						unaryExpression();
						}
						break;
					case 5:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						match(GE);
						setState(198);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						match(LE);
						setState(201);
						unaryExpression();
						}
						break;
					case 7:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(203);
						match(EQUAL);
						setState(204);
						unaryExpression();
						}
						break;
					case 8:
						{
						_localctx = new LogicExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(205);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(206);
						match(NOTEQUAL);
						setState(207);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(212);
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
	public static class VariableAccessExpressionContext extends UnaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableAccessExpressionContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterVariableAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitVariableAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitVariableAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends UnaryExpressionContext {
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
		enterRule(_localctx, 24, RULE_unaryExpression);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(LPAREN);
				setState(214);
				expression();
				setState(215);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new PrefixPlusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ADD);
				setState(218);
				expression();
				}
				break;
			case 3:
				_localctx = new PrefixMinusExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(SUB);
				setState(220);
				expression();
				}
				break;
			case 4:
				_localctx = new PrefixNotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(BANG);
				setState(222);
				expression();
				}
				break;
			case 5:
				_localctx = new FunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				funcCall();
				}
				break;
			case 6:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				literal();
				}
				break;
			case 7:
				_localctx = new VariableAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				identifier();
				}
				break;
			case 8:
				_localctx = new ArrayAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				arrayAccess();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			identifier();
			setState(230);
			match(LBRACK);
			setState(231);
			expression();
			setState(232);
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
		enterRule(_localctx, 28, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(234);
				libRef();
				}
				break;
			}
			setState(237);
			identifier();
			setState(238);
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
		enterRule(_localctx, 30, RULE_funcCallParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(LPAREN);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(241);
				expression();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				expression();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
		enterRule(_localctx, 32, RULE_libRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			identifier();
			setState(254);
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
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(IntegerLiteral);
				}
				break;
			case FloatLiteral:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(FloatLiteral);
				}
				break;
			case BoolLiteral:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(BoolLiteral);
				}
				break;
			case CharLiteral:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(CharLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
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
		enterRule(_localctx, 36, RULE_arrayVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LIST);
			setState(264);
			nonVoidDataTypeName();
			setState(265);
			identifier();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(266);
				arrayIntialization();
				}
			}

			setState(269);
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
		enterRule(_localctx, 38, RULE_arrayIntialization);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new EmptyArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				emptyArr();
				}
				break;
			case 2:
				_localctx = new NonEmptyArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
		enterRule(_localctx, 40, RULE_emptyArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ASSIGN);
			setState(276);
			match(LBRACK);
			setState(277);
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
		enterRule(_localctx, 42, RULE_nonEmptyArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ASSIGN);
			setState(280);
			match(LBRACK);
			setState(281);
			arrayValues();
			setState(282);
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
		enterRule(_localctx, 44, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(284);
				arrayValue();
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				arrayValue();
				}
				}
				setState(293);
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
		enterRule(_localctx, 46, RULE_arrayValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FUNCTION);
			setState(297);
			functionSignature();
			setState(298);
			match(COLON);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(299);
				match(LIST);
				}
			}

			setState(302);
			dataTypeName();
			setState(303);
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
		enterRule(_localctx, 50, RULE_functionSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			identifier();
			setState(306);
			match(LPAREN);
			setState(307);
			argList();
			setState(308);
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
		enterRule(_localctx, 52, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				setState(310);
				arg();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(313);
				match(COMMA);
				setState(314);
				arg();
				}
				}
				setState(319);
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
		enterRule(_localctx, 54, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(320);
				match(LIST);
				}
			}

			setState(323);
			nonVoidDataTypeName();
			setState(324);
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
		enterRule(_localctx, 56, RULE_dataTypeName);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
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
				setState(327);
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
		enterRule(_localctx, 58, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LBRACE);
			setState(331);
			blockBody();
			setState(332);
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
		enterRule(_localctx, 60, RULE_blockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 62, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << LIST) | (1L << SEND) | (1L << CHECK) | (1L << ITERATE) | (1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING) | (1L << BOOL) | (1L << CONTINUE) | (1L << BREAK) | (1L << Identifier))) != 0)) {
				{
				{
				setState(336);
				statement();
				}
				}
				setState(341);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterateStatementRuleContext extends StatementContext {
		public IterateStatementContext iterateStatement() {
			return getRuleContext(IterateStatementContext.class,0);
		}
		public IterateStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIterateStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIterateStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIterateStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementRuleContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterIfStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitIfStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitIfStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatemtntRuleContext extends StatementContext {
		public ReturnStatemtntContext returnStatemtnt() {
			return getRuleContext(ReturnStatemtntContext.class,0);
		}
		public ReturnStatemtntRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterReturnStatemtntRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitReturnStatemtntRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitReturnStatemtntRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopControlStatementRuleContext extends StatementContext {
		public LoopControlStatementContext loopControlStatement() {
			return getRuleContext(LoopControlStatementContext.class,0);
		}
		public LoopControlStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterLoopControlStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitLoopControlStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitLoopControlStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDeclarationStatementRuleContext extends StatementContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ConstantDeclarationStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterConstantDeclarationStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitConstantDeclarationStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitConstantDeclarationStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStatementRuleContext extends StatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public AssignmentStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterAssignmentStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitAssignmentStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitAssignmentStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallStatementRuleContext extends StatementContext {
		public FuncCallStatementContext funcCallStatement() {
			return getRuleContext(FuncCallStatementContext.class,0);
		}
		public FuncCallStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFuncCallStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFuncCallStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFuncCallStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationStatementRuleContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatementRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterVariableDeclarationStatementRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitVariableDeclarationStatementRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitVariableDeclarationStatementRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new IfStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				ifStatement();
				}
				break;
			case 2:
				_localctx = new IterateStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				iterateStatement();
				}
				break;
			case 3:
				_localctx = new AssignmentStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				assignmentStatement();
				}
				break;
			case 4:
				_localctx = new FuncCallStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				funcCallStatement();
				}
				break;
			case 5:
				_localctx = new ReturnStatemtntRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				returnStatemtnt();
				}
				break;
			case 6:
				_localctx = new VariableDeclarationStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				variableDeclaration();
				}
				break;
			case 7:
				_localctx = new ConstantDeclarationStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				constantDeclaration();
				}
				break;
			case 8:
				_localctx = new LoopControlStatementRuleContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(349);
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
		enterRule(_localctx, 66, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			ifBlock();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					elseIfBlock();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(359);
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
		enterRule(_localctx, 68, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(CHECK);
			setState(363);
			ifConditionExpression();
			setState(364);
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
		enterRule(_localctx, 70, RULE_ifConditionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LPAREN);
			setState(367);
			expression();
			setState(368);
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
		enterRule(_localctx, 72, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(OTHERWISE);
			setState(371);
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
		enterRule(_localctx, 74, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(OTHERWISE);
			setState(374);
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
		enterRule(_localctx, 76, RULE_iterateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ITERATE);
			setState(377);
			match(LPAREN);
			setState(378);
			iterateConditionExpression();
			setState(379);
			match(RPAREN);
			setState(380);
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
		public IterateConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterateConditionExpression; }
	 
		public IterateConditionExpressionContext() { }
		public void copyFrom(IterateConditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayIterateExpressionRuleContext extends IterateConditionExpressionContext {
		public ArrayIterateExpressionContext arrayIterateExpression() {
			return getRuleContext(ArrayIterateExpressionContext.class,0);
		}
		public ArrayIterateExpressionRuleContext(IterateConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayIterateExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayIterateExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayIterateExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanIterateExpressionRuleContext extends IterateConditionExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanIterateExpressionRuleContext(IterateConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterBooleanIterateExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitBooleanIterateExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitBooleanIterateExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewrangeExpressionRuleContext extends IterateConditionExpressionContext {
		public NewRangeExpressionContext newRangeExpression() {
			return getRuleContext(NewRangeExpressionContext.class,0);
		}
		public NewrangeExpressionRuleContext(IterateConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNewrangeExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNewrangeExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNewrangeExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeIterateExpressionRuleContext extends IterateConditionExpressionContext {
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public RangeIterateExpressionRuleContext(IterateConditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterRangeIterateExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitRangeIterateExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitRangeIterateExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterateConditionExpressionContext iterateConditionExpression() throws RecognitionException {
		IterateConditionExpressionContext _localctx = new IterateConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iterateConditionExpression);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new BooleanIterateExpressionRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				expression();
				}
				break;
			case 2:
				_localctx = new RangeIterateExpressionRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				rangeExpression();
				}
				break;
			case 3:
				_localctx = new NewrangeExpressionRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				newRangeExpression();
				}
				break;
			case 4:
				_localctx = new ArrayIterateExpressionRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
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
		public FromExpressionContext fromExpression() {
			return getRuleContext(FromExpressionContext.class,0);
		}
		public TerminalNode TO() { return getToken(SimplyV3Parser.TO, 0); }
		public ToExpressionContext toExpression() {
			return getRuleContext(ToExpressionContext.class,0);
		}
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
		enterRule(_localctx, 80, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			arg();
			setState(389);
			match(FROM);
			setState(390);
			fromExpression();
			setState(391);
			match(TO);
			setState(392);
			toExpression();
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

	public static class NewRangeExpressionContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(SimplyV3Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(SimplyV3Parser.EOL, i);
		}
		public TerminalNode RANGE() { return getToken(SimplyV3Parser.RANGE, 0); }
		public TerminalNode COLON() { return getToken(SimplyV3Parser.COLON, 0); }
		public FromExpressionContext fromExpression() {
			return getRuleContext(FromExpressionContext.class,0);
		}
		public TerminalNode TO() { return getToken(SimplyV3Parser.TO, 0); }
		public ToExpressionContext toExpression() {
			return getRuleContext(ToExpressionContext.class,0);
		}
		public NextExpressionContext nextExpression() {
			return getRuleContext(NextExpressionContext.class,0);
		}
		public NewRangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newRangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNewRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNewRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNewRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewRangeExpressionContext newRangeExpression() throws RecognitionException {
		NewRangeExpressionContext _localctx = new NewRangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newRangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			arg();
			setState(395);
			match(EOL);
			setState(396);
			match(RANGE);
			setState(397);
			match(COLON);
			setState(398);
			fromExpression();
			setState(399);
			match(TO);
			setState(400);
			toExpression();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(401);
				match(EOL);
				setState(402);
				nextExpression();
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

	public static class NextExpressionContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(SimplyV3Parser.NEXT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NextExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterNextExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitNextExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitNextExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextExpressionContext nextExpression() throws RecognitionException {
		NextExpressionContext _localctx = new NextExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nextExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(NEXT);
			setState(406);
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

	public static class FromExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FromExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterFromExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitFromExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitFromExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromExpressionContext fromExpression() throws RecognitionException {
		FromExpressionContext _localctx = new FromExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fromExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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

	public static class ToExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ToExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitToExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToExpressionContext toExpression() throws RecognitionException {
		ToExpressionContext _localctx = new ToExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_toExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 90, RULE_arrayIterateExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			arg();
			setState(413);
			match(OF);
			setState(414);
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
		enterRule(_localctx, 92, RULE_loopControlStatement);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(CONTINUE);
				setState(417);
				match(EOL);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(BREAK);
				setState(419);
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
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	 
		public AssignmentStatementContext() { }
		public void copyFrom(AssignmentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveVariableAssignmentRuleContext extends AssignmentStatementContext {
		public PrimitiveVariableAssignmentContext primitiveVariableAssignment() {
			return getRuleContext(PrimitiveVariableAssignmentContext.class,0);
		}
		public PrimitiveVariableAssignmentRuleContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterPrimitiveVariableAssignmentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitPrimitiveVariableAssignmentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitPrimitiveVariableAssignmentRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVariableAssignmentRuleContext extends AssignmentStatementContext {
		public ArrayVariableAssignmentContext arrayVariableAssignment() {
			return getRuleContext(ArrayVariableAssignmentContext.class,0);
		}
		public ArrayVariableAssignmentRuleContext(AssignmentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayVariableAssignmentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayVariableAssignmentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayVariableAssignmentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignmentStatement);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new PrimitiveVariableAssignmentRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				primitiveVariableAssignment();
				}
				break;
			case 2:
				_localctx = new ArrayVariableAssignmentRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				arrayVariableAssignment();
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

	public static class PrimitiveVariableAssignmentContext extends ParserRuleContext {
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
		public PrimitiveVariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveVariableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterPrimitiveVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitPrimitiveVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitPrimitiveVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveVariableAssignmentContext primitiveVariableAssignment() throws RecognitionException {
		PrimitiveVariableAssignmentContext _localctx = new PrimitiveVariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primitiveVariableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			identifier();
			setState(427);
			assignmentOperator();
			setState(428);
			expression();
			setState(429);
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

	public static class ArrayVariableAssignmentContext extends ParserRuleContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOL() { return getToken(SimplyV3Parser.EOL, 0); }
		public ArrayVariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).enterArrayVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplyV3ParserListener ) ((SimplyV3ParserListener)listener).exitArrayVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplyV3ParserVisitor ) return ((SimplyV3ParserVisitor<? extends T>)visitor).visitArrayVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableAssignmentContext arrayVariableAssignment() throws RecognitionException {
		ArrayVariableAssignmentContext _localctx = new ArrayVariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrayVariableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			arrayAccess();
			setState(432);
			assignmentOperator();
			setState(433);
			expression();
			setState(434);
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
		enterRule(_localctx, 100, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		enterRule(_localctx, 102, RULE_funcCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			funcCall();
			setState(439);
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
		enterRule(_localctx, 104, RULE_returnStatemtnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(SEND);
			setState(442);
			expression();
			setState(443);
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
		case 10:
			return arithmaticExpression_sempred((ArithmaticExpressionContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\7\2t\n\2\f\2\16"+
		"\2w\13\2\3\2\7\2z\n\2\f\2\16\2}\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\5\6\u008c\n\6\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b3\n\f\f"+
		"\f\16\f\u00b6\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d3\n\r"+
		"\f\r\16\r\u00d6\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00e6\n\16\3\17\3\17\3\17\3\17\3\17\3\20\5\20"+
		"\u00ee\n\20\3\20\3\20\3\20\3\21\3\21\5\21\u00f5\n\21\3\21\3\21\7\21\u00f9"+
		"\n\21\f\21\16\21\u00fc\13\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0108\n\23\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\24\3\24"+
		"\3\25\3\25\5\25\u0114\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\5\30\u0120\n\30\3\30\3\30\7\30\u0124\n\30\f\30\16\30\u0127\13\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u012f\n\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\5\34\u013a\n\34\3\34\3\34\7\34\u013e\n\34\f\34\16"+
		"\34\u0141\13\34\3\35\5\35\u0144\n\35\3\35\3\35\3\35\3\36\3\36\5\36\u014b"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3!\7!\u0154\n!\f!\16!\u0157\13!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0161\n\"\3#\3#\7#\u0165\n#\f#\16#\u0168"+
		"\13#\3#\5#\u016b\n#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\5)\u0185\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\5+\u0196\n+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\5\60\u01a7\n\60\3\61\3\61\5\61\u01ab\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\2\4\26\30\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\4\3\2\n\16\4\2((\67:\2\u01c4"+
		"\2o\3\2\2\2\4\u0080\3\2\2\2\6\u0084\3\2\2\2\b\u0086\3\2\2\2\n\u008b\3"+
		"\2\2\2\f\u008f\3\2\2\2\16\u0091\3\2\2\2\20\u0094\3\2\2\2\22\u009c\3\2"+
		"\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00b7\3\2\2\2\32\u00e5\3\2\2"+
		"\2\34\u00e7\3\2\2\2\36\u00ed\3\2\2\2 \u00f2\3\2\2\2\"\u00ff\3\2\2\2$\u0107"+
		"\3\2\2\2&\u0109\3\2\2\2(\u0113\3\2\2\2*\u0115\3\2\2\2,\u0119\3\2\2\2."+
		"\u011f\3\2\2\2\60\u0128\3\2\2\2\62\u012a\3\2\2\2\64\u0133\3\2\2\2\66\u0139"+
		"\3\2\2\28\u0143\3\2\2\2:\u014a\3\2\2\2<\u014c\3\2\2\2>\u0150\3\2\2\2@"+
		"\u0155\3\2\2\2B\u0160\3\2\2\2D\u0162\3\2\2\2F\u016c\3\2\2\2H\u0170\3\2"+
		"\2\2J\u0174\3\2\2\2L\u0177\3\2\2\2N\u017a\3\2\2\2P\u0184\3\2\2\2R\u0186"+
		"\3\2\2\2T\u018c\3\2\2\2V\u0197\3\2\2\2X\u019a\3\2\2\2Z\u019c\3\2\2\2\\"+
		"\u019e\3\2\2\2^\u01a6\3\2\2\2`\u01aa\3\2\2\2b\u01ac\3\2\2\2d\u01b1\3\2"+
		"\2\2f\u01b6\3\2\2\2h\u01b8\3\2\2\2j\u01bb\3\2\2\2ln\5\4\3\2ml\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2\2\2rt\5\b\5\2sr\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v{\3\2\2\2wu\3\2\2\2xz\5\62\32\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\2\2\3\177"+
		"\3\3\2\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5\6\4\2\u0082\u0083\7$\2\2"+
		"\u0083\5\3\2\2\2\u0084\u0085\7;\2\2\u0085\7\3\2\2\2\u0086\u0087\7\26\2"+
		"\2\u0087\u0088\5\n\6\2\u0088\t\3\2\2\2\u0089\u008c\5\f\7\2\u008a\u008c"+
		"\5\16\b\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\13\3\2\2\2\u008d"+
		"\u0090\5\20\t\2\u008e\u0090\5&\24\2\u008f\u008d\3\2\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\r\3\2\2\2\u0091\u0092\7\4\2\2\u0092\u0093\5\f\7\2\u0093\17"+
		"\3\2\2\2\u0094\u0095\5\22\n\2\u0095\u0098\5\6\4\2\u0096\u0097\7(\2\2\u0097"+
		"\u0099\5\24\13\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\7$\2\2\u009b\21\3\2\2\2\u009c\u009d\t\2\2\2\u009d\23"+
		"\3\2\2\2\u009e\u009f\5\26\f\2\u009f\25\3\2\2\2\u00a0\u00a1\b\f\1\2\u00a1"+
		"\u00a2\5\30\r\2\u00a2\u00b4\3\2\2\2\u00a3\u00a4\f\7\2\2\u00a4\u00a5\7"+
		"\64\2\2\u00a5\u00b3\5\30\r\2\u00a6\u00a7\f\6\2\2\u00a7\u00a8\7\65\2\2"+
		"\u00a8\u00b3\5\30\r\2\u00a9\u00aa\f\5\2\2\u00aa\u00ab\7\66\2\2\u00ab\u00b3"+
		"\5\30\r\2\u00ac\u00ad\f\4\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00b3\5\30\r"+
		"\2\u00af\u00b0\f\3\2\2\u00b0\u00b1\7\63\2\2\u00b1\u00b3\5\30\r\2\u00b2"+
		"\u00a3\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2"+
		"\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\27\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\r\1"+
		"\2\u00b8\u00b9\5\32\16\2\u00b9\u00d4\3\2\2\2\u00ba\u00bb\f\n\2\2\u00bb"+
		"\u00bc\7\61\2\2\u00bc\u00d3\5\32\16\2\u00bd\u00be\f\t\2\2\u00be\u00bf"+
		"\7\60\2\2\u00bf\u00d3\5\32\16\2\u00c0\u00c1\f\b\2\2\u00c1\u00c2\7)\2\2"+
		"\u00c2\u00d3\5\32\16\2\u00c3\u00c4\f\7\2\2\u00c4\u00c5\7*\2\2\u00c5\u00d3"+
		"\5\32\16\2\u00c6\u00c7\f\6\2\2\u00c7\u00c8\7.\2\2\u00c8\u00d3\5\32\16"+
		"\2\u00c9\u00ca\f\5\2\2\u00ca\u00cb\7-\2\2\u00cb\u00d3\5\32\16\2\u00cc"+
		"\u00cd\f\4\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d3\5\32\16\2\u00cf\u00d0\f"+
		"\3\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00ba\3\2\2\2\u00d2"+
		"\u00bd\3\2\2\2\u00d2\u00c0\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2\u00c6\3\2"+
		"\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2"+
		"\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\36\2\2\u00d8\u00d9\5\24\13\2\u00d9"+
		"\u00da\7\37\2\2\u00da\u00e6\3\2\2\2\u00db\u00dc\7\62\2\2\u00dc\u00e6\5"+
		"\24\13\2\u00dd\u00de\7\63\2\2\u00de\u00e6\5\24\13\2\u00df\u00e0\7+\2\2"+
		"\u00e0\u00e6\5\24\13\2\u00e1\u00e6\5\36\20\2\u00e2\u00e6\5$\23\2\u00e3"+
		"\u00e6\5\6\4\2\u00e4\u00e6\5\34\17\2\u00e5\u00d7\3\2\2\2\u00e5\u00db\3"+
		"\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\33\3\2\2"+
		"\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\5\24\13\2\u00ea"+
		"\u00eb\7#\2\2\u00eb\35\3\2\2\2\u00ec\u00ee\5\"\22\2\u00ed\u00ec\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\6\4\2\u00f0\u00f1"+
		"\5 \21\2\u00f1\37\3\2\2\2\u00f2\u00f4\7\36\2\2\u00f3\u00f5\5\24\13\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\7%"+
		"\2\2\u00f7\u00f9\5\24\13\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\7\37\2\2\u00fe!\3\2\2\2\u00ff\u0100\5\6\4\2\u0100\u0101"+
		"\7&\2\2\u0101#\3\2\2\2\u0102\u0108\7\31\2\2\u0103\u0108\7\32\2\2\u0104"+
		"\u0108\7\33\2\2\u0105\u0108\7\34\2\2\u0106\u0108\7\35\2\2\u0107\u0102"+
		"\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108%\3\2\2\2\u0109\u010a\7\5\2\2\u010a\u010b\5\22\n\2"+
		"\u010b\u010d\5\6\4\2\u010c\u010e\5(\25\2\u010d\u010c\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7$\2\2\u0110\'\3\2\2\2\u0111"+
		"\u0114\5*\26\2\u0112\u0114\5,\27\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2"+
		"\2\2\u0114)\3\2\2\2\u0115\u0116\7(\2\2\u0116\u0117\7\"\2\2\u0117\u0118"+
		"\7#\2\2\u0118+\3\2\2\2\u0119\u011a\7(\2\2\u011a\u011b\7\"\2\2\u011b\u011c"+
		"\5.\30\2\u011c\u011d\7#\2\2\u011d-\3\2\2\2\u011e\u0120\5\60\31\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u0122\7%"+
		"\2\2\u0122\u0124\5\60\31\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126/\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u0129\5\24\13\2\u0129\61\3\2\2\2\u012a\u012b\7\20\2\2\u012b\u012c"+
		"\5\64\33\2\u012c\u012e\7\'\2\2\u012d\u012f\7\5\2\2\u012e\u012d\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5:\36\2\u0131\u0132"+
		"\5<\37\2\u0132\63\3\2\2\2\u0133\u0134\5\6\4\2\u0134\u0135\7\36\2\2\u0135"+
		"\u0136\5\66\34\2\u0136\u0137\7\37\2\2\u0137\65\3\2\2\2\u0138\u013a\58"+
		"\35\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013f\3\2\2\2\u013b"+
		"\u013c\7%\2\2\u013c\u013e\58\35\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\67\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0144\7\5\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\5\22\n\2\u0146\u0147\5\6\4\2\u01479\3\2\2\2"+
		"\u0148\u014b\7\17\2\2\u0149\u014b\5\22\n\2\u014a\u0148\3\2\2\2\u014a\u0149"+
		"\3\2\2\2\u014b;\3\2\2\2\u014c\u014d\7 \2\2\u014d\u014e\5> \2\u014e\u014f"+
		"\7!\2\2\u014f=\3\2\2\2\u0150\u0151\5@!\2\u0151?\3\2\2\2\u0152\u0154\5"+
		"B\"\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156A\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0161\5D#\2\u0159"+
		"\u0161\5N(\2\u015a\u0161\5`\61\2\u015b\u0161\5h\65\2\u015c\u0161\5j\66"+
		"\2\u015d\u0161\5\f\7\2\u015e\u0161\5\16\b\2\u015f\u0161\5^\60\2\u0160"+
		"\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015b\3\2"+
		"\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161C\3\2\2\2\u0162\u0166\5F$\2\u0163\u0165\5J&\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\5L\'\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016bE\3\2\2\2\u016c\u016d\7\7\2\2"+
		"\u016d\u016e\5H%\2\u016e\u016f\5<\37\2\u016fG\3\2\2\2\u0170\u0171\7\36"+
		"\2\2\u0171\u0172\5\24\13\2\u0172\u0173\7\37\2\2\u0173I\3\2\2\2\u0174\u0175"+
		"\7\b\2\2\u0175\u0176\5F$\2\u0176K\3\2\2\2\u0177\u0178\7\b\2\2\u0178\u0179"+
		"\5<\37\2\u0179M\3\2\2\2\u017a\u017b\7\t\2\2\u017b\u017c\7\36\2\2\u017c"+
		"\u017d\5P)\2\u017d\u017e\7\37\2\2\u017e\u017f\5<\37\2\u017fO\3\2\2\2\u0180"+
		"\u0185\5\24\13\2\u0181\u0185\5R*\2\u0182\u0185\5T+\2\u0183\u0185\5\\/"+
		"\2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183"+
		"\3\2\2\2\u0185Q\3\2\2\2\u0186\u0187\58\35\2\u0187\u0188\7\21\2\2\u0188"+
		"\u0189\5X-\2\u0189\u018a\7\22\2\2\u018a\u018b\5Z.\2\u018bS\3\2\2\2\u018c"+
		"\u018d\58\35\2\u018d\u018e\7$\2\2\u018e\u018f\7\27\2\2\u018f\u0190\7\'"+
		"\2\2\u0190\u0191\5X-\2\u0191\u0192\7\22\2\2\u0192\u0195\5Z.\2\u0193\u0194"+
		"\7$\2\2\u0194\u0196\5V,\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"U\3\2\2\2\u0197\u0198\7\30\2\2\u0198\u0199\5\24\13\2\u0199W\3\2\2\2\u019a"+
		"\u019b\5\24\13\2\u019bY\3\2\2\2\u019c\u019d\5\24\13\2\u019d[\3\2\2\2\u019e"+
		"\u019f\58\35\2\u019f\u01a0\7\25\2\2\u01a0\u01a1\5\24\13\2\u01a1]\3\2\2"+
		"\2\u01a2\u01a3\7\23\2\2\u01a3\u01a7\7$\2\2\u01a4\u01a5\7\24\2\2\u01a5"+
		"\u01a7\7$\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7_\3\2\2\2\u01a8"+
		"\u01ab\5b\62\2\u01a9\u01ab\5d\63\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2"+
		"\2\2\u01aba\3\2\2\2\u01ac\u01ad\5\6\4\2\u01ad\u01ae\5f\64\2\u01ae\u01af"+
		"\5\24\13\2\u01af\u01b0\7$\2\2\u01b0c\3\2\2\2\u01b1\u01b2\5\34\17\2\u01b2"+
		"\u01b3\5f\64\2\u01b3\u01b4\5\24\13\2\u01b4\u01b5\7$\2\2\u01b5e\3\2\2\2"+
		"\u01b6\u01b7\t\3\2\2\u01b7g\3\2\2\2\u01b8\u01b9\5\36\20\2\u01b9\u01ba"+
		"\7$\2\2\u01bai\3\2\2\2\u01bb\u01bc\7\6\2\2\u01bc\u01bd\5\24\13\2\u01bd"+
		"\u01be\7$\2\2\u01bek\3\2\2\2\"ou{\u008b\u008f\u0098\u00b2\u00b4\u00d2"+
		"\u00d4\u00e5\u00ed\u00f4\u00fa\u0107\u010d\u0113\u011f\u0125\u012e\u0139"+
		"\u013f\u0143\u014a\u0155\u0160\u0166\u016a\u0184\u0195\u01a6\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}