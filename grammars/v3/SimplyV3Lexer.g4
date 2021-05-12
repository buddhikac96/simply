lexer grammar SimplyV3Lexer;

@header{
package antlr.gen;
}

//
// Keywords
//

GET: 'get';
CONST: 'constant';
LIST: 'list';
SEND: 'return';
CHECK: 'if';
OTHERWISE: 'else';
ITERATE: 'repeat';
FUNCTION: 'function' ;
FROM: 'from' ;
TO: 'to' ;
CONTINUE: 'continue' ;
BREAK: 'break' ;
OF: 'of' ;
GLOBAL: 'global';
RANGE: 'range';
NEXT: 'next';
OUT: 'out';
IN: 'in';


//
//  Keywords | Data types
//
INT: 'integer';
FLOAT: 'float';
CHAR: 'character';
STRING: 'string';
BOOL: 'boolean';
VOID: 'no';

//
// Literals
//

// Integer
IntegerLiteral
    : (SUB | ADD)?  (NonZeroInteger | Zero)
    ;

fragment
NonZeroInteger
    : NonZeroDigit Digit*
    ;

fragment
NonZeroDigit: [1-9];

fragment
Digit: [0-9];

fragment
Zero: '0' ;


// Floating-point
FloatLiteral
    : (ADD | SUB)? IntegerLiteral DOT IntegerLiteral
    ;


// Boolean
BoolLiteral
    : 'true'
    | 'false'
    ;

// Character
CharLiteral
    : '\'' SingleCharacter '\''
    ;

fragment
SingleCharacter
    : ~['\\\r\n]
    ;


// String
StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	;



//
// Symbols
//

// Seperators
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
EOL : ';';
COMMA : ',';
DOT : '.';
COLON: ':' ;


// Operators
ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : 'and';
OR : 'or';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';


//
// Identifier
//

Identifier
    : IdentifierStart ([a-zA-Z] IdentifierEnd*)?
    ;

fragment
IdentifierStart
    : [_a-zA-Z]
    ;

fragment
IdentifierEnd
    : [a-zA-Z]
    | [0-9]
    ;

//
// White Spaces , Comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;