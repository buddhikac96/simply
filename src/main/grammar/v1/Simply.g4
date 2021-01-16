grammar Simply;

@header{
package antlr;
}

prog
    : get* function* EOF
    ;

get
    : GET IDENTIFIER EOL
    ;

function
    : FUNCTION IDENTIFIER LEFT_PARAN param_list RIGHT_PARAN COLON return_type LEFT_CURL stmt* RIGHT_CURL
    ;

param_list
    : param? (COMMA param)*
    ;

param
    : non_void_dtype IDENTIFIER
    ;

non_void_dtype
    : INT
    | FLOAT
    | STRING
    | CHAR
    | BOOL
    ;

return_type
    : VOID
    | non_void_dtype
    ;

stmt
    : var_assign
    | print
    | return
    | iterate
    | check
    ;

var_assign
    : non_void_dtype? IDENTIFIER EQUAL expression EOL
    ;

print
    : PRINT LEFT_PARAN expression RIGHT_PARAN EOL
    ;

expression
    : LEFT_PARAN expression RIGHT_PARAN // ( expression )
    | expression MULTIPLY expression
    | expression DIVIDE expression
    | expression PLUS expression
    | expression SUBSTRACT expression
    | NOT expression
    | expression OR expression
    | expression AND expression
    | expression IS_EQUAL expression
    | expression NOT_EQUAL expression
    | expression GREATER_THAN expression
    | expression LESS_THAN expression
    | expression GREATER_OR_EQUAL_THAN expression
    | expression LESS_OR_EQUAL_THAN expression
    | func_call
    | LITERAL
    | IDENTIFIER
    ;

func_call
    : IDENTIFIER LEFT_PARAN (LITERAL | IDENTIFIER)? (COMMA (LITERAL | IDENTIFIER)*) RIGHT_PARAN
    ;

return
    : SEND expression EOL
    ;

iterate
    : ITERATE LEFT_PARAN condition RIGHT_PARAN LEFT_CURL stmt* RIGHT_CURL
    ;

condition
    : expression
    | BOOL_LIT
    ;

check
    : ifStmt elseIfStmt* elseStmt?
    ;

ifStmt
    : CHECK LEFT_PARAN condition RIGHT_PARAN LEFT_CURL stmt* RIGHT_CURL
    ;

elseIfStmt
    : OTHERWISE ifStmt
    ;

elseStmt
    : OTHERWISE LEFT_CURL stmt* RIGHT_CURL
    ;





// Literals

LITERAL
    : INT_LIT
    | FLOAT_LIT
    | STRING_LIT
    | CHAR_LIT
    | BOOL_LIT
    ;

INT_LIT : [1-9] [0-9]* ;

FLOAT_LIT : INT_LIT PERIOD INT_LIT;

STRING_LIT : DOUBLE_QUOTE [a-zA-Z'#_ ]+ DOUBLE_QUOTE ;

CHAR_LIT : SINGLE_QUOTE [a-zA-Z0-9] SINGLE_QUOTE ;

BOOL_LIT
    : 'true'
    | 'false'
    ;




// Keywords

GET : 'get' ;
FUNCTION : 'function' ;
PRINT : 'print' ;
AND : 'and' ;
OR : 'or' ;
ITERATE : 'iterate' ;
SEND : 'send' ;
CHECK : 'check' ;
OTHERWISE : 'otherwise' ;

// Data Types

INT : 'int' ;
FLOAT : 'float' ;
STRING : 'string' ;
CHAR : 'char' ;
BOOL : 'bool' ;
VOID : 'void' ;

// Symbols

LEFT_PARAN : '(' ;
RIGHT_PARAN: ')' ;
LEFT_CURL : '{' ;
RIGHT_CURL : '}' ;
COMMA: ',' ;
EOL : ';' ;
EQUAL: '=' ;
PERIOD : '.' ;
SINGLE_QUOTE : '\'' ;
DOUBLE_QUOTE : '"' ;
COLON : ':' ;
PLUS : '+' ;
SUBSTRACT : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
NOT : '!' ;
IS_EQUAL: '==' ;
NOT_EQUAL : '!= ' ;
GREATER_THAN : '>' ;
LESS_THAN : '<' ;
GREATER_OR_EQUAL_THAN : '>=' ;
LESS_OR_EQUAL_THAN : '<=' ;


IDENTIFIER
    : [a-z]+
    ;

WS : [ \t\n] -> skip;