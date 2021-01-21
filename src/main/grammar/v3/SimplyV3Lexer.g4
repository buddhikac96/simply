lexer grammar SimplyV3Lexer;


// Keywords
GET: 'get';
CONST: 'const';
LIST: 'list';
SEND: 'send';
CHECK: 'check';
OTHERWISE: 'otherwise';
ITERATE: 'iterate';
INT: 'int';
FLOAT: 'float';
CHAR: 'char';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
FUNCTION: 'function' ;
FROM: 'from' ;
TO: 'to' ;
CONTINUE: 'continue' ;
BREAK: 'break' ;
OF: 'of' ;


// Literals

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


// TODO : standard identifier
Identifier: [a-z]+;

WS: [ \t\n\r] -> skip;