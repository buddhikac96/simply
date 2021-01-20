lexer grammar SimplyV3Lexer;


// Keywords
GET: 'get';
CONST: 'const';
LIST: 'list';
TRUE: 'true';
FALSE: 'false';
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
FUNCTION: 'funtion' ;


// Literals
IntegerLiteral: [1-9][0-9]*;
FloatLiteral: IntegerLiteral DOT IntegerLiteral;
CharLiteral: '\'' [a-z] '\'';
StringLiteral: '"' [a-z]* '"';
BoolLiteral: TRUE | FALSE;


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


Identifier: [a-z]+;

WS: [ \t\n\r] -> skip;