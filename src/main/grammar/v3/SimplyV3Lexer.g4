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
// TODO : Literal values standard
IntegerLiteral: '0' | [1-9][0-9]*;
FloatLiteral: IntegerLiteral DOT IntegerLiteral;
BoolLiteral: 'true' | 'false' ;
CharLiteral: '\'' [a-z] '\'';
StringLiteral: '"' [a-z]* '"';



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