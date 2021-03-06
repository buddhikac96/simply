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

// TODO: Write seperate rules for global constant and global variable
globalVariableDeclaration
    : GLOBAL elementDeclaration
    ;

elementDeclaration
    : variableDeclaration           # variableDeclarationRule
    | constantDeclaration           # constantDeclarationRule
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
// TODO: remove prefix plus expression
unaryExpression
    : LPAREN expression RPAREN      # parenExpression
    | ADD expression                # prefixPlusExpression
    | SUB expression                # prefixMinusExpression
    | BANG expression               # prefixNotExpression
    | funcCall                      # functionCallExpression
    | literal                       # literalExpression
    | identifier                    # variableAccessExpression
    | arrayAccess                   # arrayAccessExpression
    ;


// Array access -> arr[3]
arrayAccess
    : identifier LBRACK expression RBRACK
    ;


// Function call -> add(2,3)
// TODO: LibRef standarize -> study java grammr
funcCall
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
    : IntegerLiteral    # integerLiteral
    | FloatLiteral      # floatLiteral
    | BoolLiteral       # boolLiteral
    | CharLiteral       # charLiteral
    | StringLiteral     # stringLiteral
    ;



// Array declaration
arrayVariableDeclaration
    : LIST nonVoidDataTypeName identifier arrayIntialization? EOL
    ;

arrayIntialization
    : emptyArr              # emptyArrayInitialization
    | nonEmptyArr           # nonEmptyArrayInitialization
    ;

// Empty array declaration -> list int arr = [];
emptyArr
    : ASSIGN LBRACK RBRACK
    ;

// Non-empty array declaration -> list int arr = [1,2,3];
nonEmptyArr
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
    : FUNCTION functionSignature OUT COLON LIST? dataTypeName block
    ;

functionSignature
    : identifier LPAREN IN COLON argList RPAREN
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
    : ifStatement               # ifStatementRule
    | iterateStatement          # iterateStatementRule
    | assignmentStatement       # assignmentStatementRule
    | funcCallStatement         # funcCallStatementRule
    | returnStatemtnt           # returnStatemtntRule
    | variableDeclaration       # variableDeclarationStatementRule
    | constantDeclaration       # constantDeclarationStatementRule
    | loopControlStatement      # loopControlStatementRule
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
    : expression                            # booleanIterateExpressionRule
    | rangeExpression                       # rangeIterateExpressionRule
    | newRangeExpression                    # newrangeExpressionRule
    | arrayIterateExpression                # arrayIterateExpressionRule
    ;

// Loop through a range
rangeExpression
    : arg FROM fromExpression TO toExpression
    ;

newRangeExpression
    : arg EOL RANGE COLON fromExpression TO toExpression (EOL nextExpression)?
    ;

// TODO: NEXT COLON EXPRESSION
nextExpression
    : NEXT expression
    ;

fromExpression
    : expression
    ;

toExpression
    : expression
    ;

// Loop throug an array
arrayIterateExpression
    : arg OF expression
    ;

loopControlStatement
    : CONTINUE EOL
    | BREAK EOL
    ;

// Assignment operations
assignmentStatement
    : primitiveVariableAssignment           # primitiveVariableAssignmentRule
    | arrayVariableAssignment               # arrayVariableAssignmentRule
    ;

primitiveVariableAssignment
    : identifier assignmentOperator expression EOL
    ;

arrayVariableAssignment
    : arrayAccess assignmentOperator expression EOL
    ;

assignmentOperator
    : ASSIGN
    | ADD_ASSIGN
    | SUB_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    ;


funcCallStatement
    : funcCall EOL
    ;

// Return
returnStatemtnt
    : SEND expression EOL
    ;
