lexer grammar SimplyV2Lexer;

// Keywords

Get: 'get' ;
Const: 'const' ;
Void: 'void';
Int: 'int';
Float: 'float';
Char: 'char';
Bool: 'bool';
String: 'string';
Function: 'function';
If: 'check';
Else: 'otherwise' ;

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
COLON: ':';

// Operators

ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
QUESTION : '?';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : 'and';
OR : 'or';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';


// Literals

FloatLiteral: [1-9][0-9]* DOT [1-9][0-9]*;
IntLiteral: [1-9][0-9]*;
BoolLiteral: 'true' | 'false' ;
CharLiteral: '\'' [a-zA-Z] '\'';
StringLiteral: '"' [a-zA-Z]* '"' ;



Identifier: [a-zA-Z]+ ;


// Skips

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;