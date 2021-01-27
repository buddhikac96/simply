parser grammar SimplyV3Parser;

options {
    tokenVocab=SimplyV3Lexer;
}

@header {
package antlr.gen;
}

// Compilation unit
compilationUnit
    : libImport* globalVariableDeclaration* functionDeclaration* EOF
    ;


// library import
libImport
    : GET identifier EOL
    ;

identifier
    : Identifier
    ;


globalVariableDeclaration
    : GLOBAL (variableDeclaration | constantDeclaration)
    ;

// variable declaration
variableDeclaration
    : primitiveVariableDeclaration
    | arrayVariableDeclaration
    ;

constantDeclaration
    : CONST variableDeclaration
    ;


// Primitive variable declaration
primitiveVariableDeclaration
    : nonVoidDataTypeName identifier (ASSIGN expression)? EOL
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
    : logicExpression                               # logic
    | arithmaticExpression MUL logicExpression      # multiplication
    | arithmaticExpression DIV logicExpression      # division
    | arithmaticExpression MOD logicExpression      # modulos
    | arithmaticExpression ADD logicExpression      # addition
    | arithmaticExpression SUB logicExpression      # substraction
    ;

// Logical expression
logicExpression
    : unaryExpression                               # unary
    | logicExpression OR unaryExpression            # logicalOr
    | logicExpression AND unaryExpression           # logicalAnd
    | logicExpression GT unaryExpression            # greaterThan
    | logicExpression LT unaryExpression            # lessThan
    | logicExpression GE unaryExpression            # greaterOrEqualThan
    | logicExpression LE unaryExpression            # lessOrEqualThan
    | logicExpression EQUAL unaryExpression         # equals
    | logicExpression NOTEQUAL unaryExpression      # notEquals
    ;

// Unary expressions
unaryExpression
    : LPAREN expression RPAREN
    | ADD expression
    | SUB expression
    | BANG expression
    | funcCallExpression
    | literal
    | identifier arrayAccess?
    ;

// Array access -> arr[3]
arrayAccess
    : LBRACK expression RBRACK
    ;


// Function call -> add(2,3)
// TODO: LibRef standarize -> study java grammr
funcCallExpression
    : libRef? identifier funcCallParamList
    ;

funcCallParamList
    : LPAREN expression? (COMMA expression)* RPAREN
    ;


// Library reference  -> math.root()
libRef
    : identifier DOT
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
    : LIST nonVoidDataTypeName identifier arrayIntialization? EOL
    ;

arrayIntialization
    : emptyArrayIntialization
    | nonEmptyArrayIntialization
    ;

// Empty array declaration -> list int arr = [];
emptyArrayIntialization
    : ASSIGN LBRACK RBRACK
    ;

// Non-empty array declaration -> list int arr = [1,2,3];
nonEmptyArrayIntialization
    : ASSIGN LBRACK arrayValues RBRACK
    ;


// Array elements
arrayValues
    : arrayValue? (COMMA arrayValue)*
    ;

arrayValue
    : expression
    ;


// Function declaration
functionDeclaration
    : FUNCTION functionSignature COLON LIST? dataTypeName block
    ;

functionSignature
    : identifier LPAREN argList RPAREN
    ;

argList
    : arg? (COMMA arg)*
    ;

arg
    : LIST? nonVoidDataTypeName identifier
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
    | assignmentStatement
    | funcCallStatement
    | returnStatemtnt
    | variableDeclaration
    | constantDeclaration
    | loopControlStatement
    ;


// If Statement
ifStatement
    : ifBlock elseIfBlock* elseBlock?
    ;

ifBlock
    : CHECK ifConditionExpression block
    ;

ifConditionExpression
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
    : ITERATE LPAREN iterateConditionExpression RPAREN block
    ;

iterateConditionExpression
    : expression
    | rangeExpression
    | arrayIterateExpression
    ;

// Loop through a range
rangeExpression
    : arg FROM expression TO expression
    ;

// Loop throug an array
arrayIterateExpression
    : arg OF ( identifier | funcCallExpression )
    ;

loopControlStatement
    : CONTINUE EOL
    | BREAK EOL
    ;

// Assignment operations
assignmentStatement
    : identifier arrayAccess? assignmentOperator expression EOL
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
