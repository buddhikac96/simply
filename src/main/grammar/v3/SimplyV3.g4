grammar SimplyV3;

// Compilation unit
compilationUnit
    : libImport* variableDeclaration* functionDeclaration*
    ;


// library import
libImport
    : 'get' Identifier ';'
    ;


// variable declaration
variableDeclaration
    : primitiveVariableDeclaration
    | arrayVariableDeclaration
    ;

primitiveVariableDeclaration: 'const'? nonVoidDataType declaration ';' ;

nonVoidDataType
    : 'int'
    | 'float'
    | 'char'
    | 'string'
    | 'bool'
    ;

declaration
    : Identifier ('=' initialize)?
    ;

initialize: expression;


// expressions
expression
    : arithmaticExpression
    ;

arithmaticExpression
    : logicExpression
    | arithmaticExpression '*' logicExpression
    | arithmaticExpression '/' logicExpression
    | arithmaticExpression '%' logicExpression
    | arithmaticExpression '+' logicExpression
    | arithmaticExpression '-' logicExpression
    ;

logicExpression
    : unaryExpression
    | logicExpression 'or' unaryExpression
    | logicExpression 'and' unaryExpression
    | logicExpression '>' unaryExpression
    | logicExpression '<' unaryExpression
    | logicExpression '==' unaryExpression
    | logicExpression '!=' unaryExpression
    ;

unaryExpression
    : '(' expression ')'
    | '+' expression
    | '-' expression
    | '!' expression
    | funcCall
    | literal
    | Identifier arrayAccess?// add array access value -> arr[6]
    ;

arrayAccess: '[' IntLit ']';

funcCall: libRef? Identifier '(' expression? (',' expression)* ')';

libRef: Identifier '.' ;

literal: IntLit | FloatLit | CharLit | StringLit | BoolLit;


// Array declaration
arrayVariableDeclaration: 'list' nonVoidDataType Identifier arrayDeclaration? ';' ;

arrayDeclaration: emptyArrayDeclaration | nonEmptyArrayDeclaration ;

emptyArrayDeclaration: '=' '[' ']' ;

nonEmptyArrayDeclaration: '=' '[' arrayValues ']' ;

arrayValues: arrayValue? (',' arrayValue)* ;

arrayValue: literal;


// function declaration
functionDeclaration
    : 'function' Identifier '(' argList ')' ':' dataType block
    ;

argList: arg? (',' arg)* ;

arg: nonVoidDataType Identifier;

dataType: 'void' | nonVoidDataType ;

block: '{' blockBody '}';

blockBody: statements ;

statements: statement* ;

statement
    : ifStatement
    | iterateStatement
    | assignment
    | funcCall ';'
    | returnStatemtnt ';'
    | variableDeclaration
    ;


// If Statement
ifStatement
    : ifBlock elseIfBlock* elseBlock?
    ;

ifBlock
    : 'check' conditionExpression block
    ;

conditionExpression
    : '(' expression ')'
    ;

elseIfBlock
    : 'otherwise' ifBlock
    ;

elseBlock
    : 'otherwise' block
    ;


// Loops
iterateStatement
    : 'iterate' '(' expression ')' block
    ;


// Assignment operations
assignment
    : Identifier arrayAccess? assignmentOperator expression ';'
    ;

assignmentOperator : '=' | '+=' | '-=' | '*=' | '/=' ;


// Return
returnStatemtnt: 'send' expression;













IntLit: [1-9][0-9]*;
FloatLit: IntLit '.' IntLit;
CharLit: '\'' [a-z] '\'';
StringLit: '"' [a-z]* '"';
BoolLit: 'true' | 'false';

Identifier: [a-z]+;

WS: [ \t\n\r] -> skip;