parser grammar SimplyV2Parser;

options {
    tokenVocab=SimplyV2Lexer;
}

program
    : libraryImport*  variableDeclaration* functionDeclaration* EOF
    ;

libraryImport
    : Get Identifier EOL
    ;

variableDeclaration
    : Const? nonVoidType Identifier ASSIGN expression EOL
    ;

dataType
    : nonVoidType
    | 'void'
    ;

nonVoidType
    : 'int'
    | 'float'
    | 'char'
    | 'string'
    | 'bool'
    ;

expression
    : assignment
    | orExpression
    ;

assignment: Identifier assignmentOperator expression;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'+='
	|	'-='
	;

orExpression
    : andExpression
    | orExpression 'or' andExpression
    ;

andExpression
    : equalityExpression
    | andExpression 'and' equalityExpression
    ;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	additiveExpression
	|	relationalExpression '<' additiveExpression
	|	relationalExpression '>' additiveExpression
	|	relationalExpression '<=' additiveExpression
	|	relationalExpression '>=' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	|   unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

unaryExpressionNotPlusMinus
	:	postfixExpression
	|	'!' unaryExpression
	;

postfixExpression
    : LPAREN expression RPAREN
    | literal
    | Identifier
    ;

literal
    : IntLiteral
    | FloatLiteral
    | BoolLiteral
    | CharLiteral
    | StringLiteral
    ;

functionDeclaration
    : Function Identifier LPAREN paramList RPAREN COLON dataType block
    ;

paramList
    : param? (COMMA param)*
    ;

param
    : nonVoidType Identifier
    ;

block
    : LBRACE blockBody RBRACE
    ;

blockBody
    : blockStatements
    ;

blockStatements
    : statement*
    ;

statement
    : variableDeclaration
    | ifStatement
    ;

ifStatement
    : ifBlock elseIfBlock* elseBlock?
    ;

ifBlock
    : If conditionExpression block
    ;

conditionExpression
    : LPAREN expression RPAREN
    ;

elseIfBlock
    : Else ifBlock
    ;

elseBlock
    : Else block
    ;