parser grammar SimplyV3Parser;

options {
    tokenVocab=SimplyV3Lexer;
}

// Compilation unit
compilationUnit
    : libImport* variableDeclaration* functionDeclaration*
    ;


// library import
libImport
    : GET Identifier EOL
    ;


// variable declaration
variableDeclaration
    : primitiveVariableDeclaration
    | arrayVariableDeclaration
    ;

// Primitive variable declaration
primitiveVariableDeclaration
    : CONST? nonVoidDataTypeName Identifier (ASSIGN expression)? EOL
    ;

// Non-void data type names
nonVoidDataTypeName
    : INT
    | FLOAT
    | CHAR
    | STRING
    | BOOL
    ;


// expressions
expression
    : arithmaticExpression
    ;

// Arithmatic expressions
arithmaticExpression
    : logicExpression
    | arithmaticExpression MUL logicExpression
    | arithmaticExpression DIV logicExpression
    | arithmaticExpression MOD logicExpression
    | arithmaticExpression ADD logicExpression
    | arithmaticExpression SUB logicExpression
    ;

// Logical expression
logicExpression
    : unaryExpression
    | logicExpression OR unaryExpression
    | logicExpression AND unaryExpression
    | logicExpression GT unaryExpression
    | logicExpression LT unaryExpression
    | logicExpression GE unaryExpression
    | logicExpression LE unaryExpression
    | logicExpression EQUAL unaryExpression
    | logicExpression NOTEQUAL unaryExpression
    ;

// Unary expressions
unaryExpression
    : LPAREN expression RPAREN
    | ADD expression
    | SUB expression
    | BANG expression
    | funcCallExpression
    | literal
    | Identifier arrayAccess?
    ;

// Array access -> arr[3]
arrayAccess
    : LBRACK expression RBRACK
    ;


// Function call -> add(2,3)
// TODO: LibRef standarize -> study java grammr
funcCallExpression
    : libRef? Identifier LPAREN expression? (COMMA expression)* RPAREN
    ;

// Library reference  -> math.root()
libRef
    : Identifier DOT
    ;

// Literal
literal
    : IntegerLiteral
    | FloatLiteral
    | BoolLiteral
    | CharLiteral
    | StringLiteral
    ;



// Array declaration
arrayVariableDeclaration
    : LIST nonVoidDataTypeName Identifier arrayDeclaration? EOL
    ;

arrayDeclaration
    : emptyArrayDeclaration
    | nonEmptyArrayDeclaration
    ;

// Empty array declaration -> list int arr = [];
emptyArrayDeclaration
    : ASSIGN LBRACK RBRACK
    ;

// Non-empty array declaration -> list int arr = [1,2,3];
nonEmptyArrayDeclaration
    : ASSIGN LBRACK arrayValues RBRACK
    ;


// Array elements
arrayValues
    : arrayValue? (COMMA arrayValue)*
    ;

arrayValue
    : literal
    ;


// Function declaration
functionDeclaration
    : FUNCTION functionSignature COLON LIST? dataTypeName block
    ;

functionSignature
    : Identifier LPAREN argList RPAREN
    ;

argList
    : arg? (COMMA arg)*
    ;

arg
    : LIST? nonVoidDataTypeName Identifier
    ;

dataTypeName
    : VOID
    | nonVoidDataTypeName
    ;

block
    : LBRACE blockBody RBRACE
    ;

blockBody
    : statements
    ;

statements
    : statement*
    ;

statement
    : ifStatement
    | iterateStatement
    | assignment
    | funcCallStatement
    | returnStatemtnt
    | variableDeclaration
    | loopControlStatement
    ;


// If Statement
ifStatement
    : ifBlock elseIfBlock* elseBlock?
    ;

ifBlock
    : CHECK conditionExpression block
    ;

conditionExpression
    : LPAREN expression RPAREN
    ;

elseIfBlock
    : OTHERWISE ifBlock
    ;

elseBlock
    : OTHERWISE block
    ;


// Loops
iterateStatement
    : ITERATE LPAREN loopExpression RPAREN block
    ;

loopExpression
    : expression
    | rangeExpression
    | arrayLoopExpression
    ;

// Loop through a range
rangeExpression
    : arg FROM expression TO expression
    ;

// Loop throug an array
arrayLoopExpression
    : arg OF (Identifier | funcCallExpression)
    ;

loopControlStatement
    : CONTINUE EOL
    | BREAK EOL
    ;

// Assignment operations
assignment
    : Identifier arrayAccess? assignmentOperator expression EOL
    ;

assignmentOperator
    : ASSIGN
    | ADD_ASSIGN
    | SUB_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    ;


funcCallStatement
    : funcCallExpression EOL
    ;

// Return
returnStatemtnt
    : SEND expression EOL
    ;
