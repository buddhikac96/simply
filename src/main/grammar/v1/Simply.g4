grammar Simply;

@header {
package antlr;
}

prog
    : get* function* EOF
    ;

get
    : 'get' identifier TERMINAL
    ;

function
    : FUNCTION identifier LEFT_PARAN params RIGHT_PARAN LEFT_CURL stmt+ RIGHT_CURL
    ;

stmt
    : vardeclare
    | loop
    | check
    | expr
    ;


expr
    : '(' expr ')'
    | '[' literal? (',' literal)* ']'
    | 'keyin' '(' (literal) ')'
    | IDENTIFIER '.' IDENTIFIER '(' params ')'
    | arithmatic_op
    | logical_op
    | IDENTIFIER
    | literal
    ;

arithmatic_op
    : expr '**' expr
    | expr '%' expr
    | expr '*' expr
    | expr '/' expr
    | expr '+' expr
    | expr '-' expr
    | IDENTIFIER ('++' | '--')
    | ('++' | '--') IDENTIFIER
    ;

logical_op
    : '!' expr
    | expr '<' expr
    | expr '<=' expr
    | expr '>' expr
    | expr '>=' expr
    | expr '==' expr
    | expr '!=' expr
    | expr 'and' expr
    | expr 'or' expr
    ;

identifier
    : IDENTIFIER
    ;

params
    : param? (COMMA param)*
    ;

param
    : data_type identifier
    ;

data_type
    : INT
    | FLOAT
    | FLOAT
    | CHAR
    | VOID
    ;


vardeclare
    : data_type identifier EQUAL literal
    ;



loop
    : ITERATE LEFT_PARAN condition RIGHT_PARAN LEFT_CURL stmt+ RIGHT_CURL
    ;


check
    : CHECK LEFT_PARAN condition RIGHT_PARAN LEFT_CURL stmt+ RIGHT_CURL checkotherwise* otherwise
    ;


checkotherwise
    : CHECK OTHERWISE LEFT_PARAN condition RIGHT_PARAN LEFT_CURL stmt+ RIGHT_CURL
    ;

otherwise
    : OTHERWISE LEFT_CURL stmt+ RIGHT_CURL
    ;

condition
    : BOOL_LIT
    | logical_op
    ;

literal
    : INT_LIT
    | FLOAT_LIT
    | STRING_LIT
    | CHAR_LIT
    | BOOL_LIT
    ;


// Key Words

CHECK: 'check' ;

OTHERWISE: 'otherwise';

ITERATE: 'iterate' ;

FUNCTION: 'function';

// Literals

INT_LIT: [1-9] [0-9]*;

FLOAT_LIT: INT_LIT DOT INT_LIT;

STRING_LIT: '"' [a-z]* '"' ;

CHAR_LIT: '\'' [a-z]* '\'';

BOOL_LIT
    : 'true'
    | 'false'
    ;

// Symbols

EQUAL: '=' ;

INT: 'int' ;

FLOAT: 'float' ;

STRING: 'string' ;

CHAR: 'char' ;

VOID: 'void' ;

COMMA: ',' ;

DOT: '.' ;

LEFT_PARAN: '(';

RIGHT_PARAN: ')';

LEFT_CURL: '{' ;

RIGHT_CURL: '}' ;

IDENTIFIER: [a-z]+;

TERMINAL: ';';

WS: [ \n\t] -> skip;