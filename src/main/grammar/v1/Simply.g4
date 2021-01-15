grammar Simply;

@header {
package antlr;
}


prog: stmt+ EOF;

stmt
    : number '+' number
    | number '-' number
    ;

number: INTEGER;

INTEGER: [1-9][0-9]*;

WS: [ \t\r] -> skip;