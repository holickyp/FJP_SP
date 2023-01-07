grammar GentleJava;

/* lexer rules */

//keywords
//types
BOOLEAN : 'boolean' ;
INT : 'int' ;

//condition
IF : 'consider' ;
ELSE : 'nevertheless' ;
SWITCH : 'switch' ;
CASE  : 'case' ;
DEFAULT : 'default' ;

//loops
FOR   : 'discuss' ;
WHILE : 'whilst' ;
DO    : 'perform' ;
REPEAT  : 'reiterate' ;
UNTIL : 'till' ;

VOID  : 'void' ;
RETURN : 'thanks' ;
CONST : 'final' ;
VARIABLE_KEYWORD : 'introduce' ;
FUNCTION_KEYWORD : 'please' ;

//operators
TRUE  : 'correct' ;
FALSE : 'incorrect' ;
MULTIPLICATION  : '*' ;
DIVISION   : '/' ;
MODULO   : '%' ;
PLUS  : '+' ;
MINUS : '-' ;
GRATER_THAN    : '>' ;
GRATER_EQUAL_THAN    : '>=' ;
LOWER_THAN    : '<' ;
LOWER_EQUAL_THAN    : '<=' ;
EQUALS  : '==' ;
ASSIGN    : '=' ;
AND   : '&&' ;
OR    : '||' ;
QUESTION : '?' ;
COLON : ':' ;
NOT_EQUALS : '!=' ;
NEGATION : '!';

//separators
LEFT_PARENTHESES:       '(';
RIGHT_PARENTHESES:      ')';
LEFT_BRACE:             '{';
RIGHT_BRACE:            '}';
LEFT_BRACKET:           '[';
RIGHT_BRACKET:          ']';
SEMICOLON:              ';';
COMMA:                  ',';

/* ------ Literals ------ */

fragment DIGIT : [0-9]+ ;
fragment LOWECASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;
WORD  : (LOWECASE | UPPERCASE | '_')+ ;
NUMBER : DIGIT;
WHITESPACE : [ \r\t\n]+ -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip;

/* -------------- parser rules -------------- */
methodReturnType
  : INT
  | BOOLEAN
  | VOID
  ;

booleanValue
  : TRUE
  | FALSE
  ;

possibleTypes
  : INT
  | BOOLEAN
  ;

numberTypeSymbol
  : PLUS
  | MINUS
  ;

identifier
  : WORD (WORD | NUMBER)*
  ;

possibleValues
  : numberTypeSymbol? NUMBER
  | booleanValue
  ;

numberVariable
  : VARIABLE_KEYWORD INT identifier (paralelDeclaration)* ASSIGN numberTypeSymbol? numberValue
  ;


numberValue
  : numberTypeSymbol? NUMBER
  | methodCall
  | identifier
  | expressionBody
  ;

boolVariable
  : VARIABLE_KEYWORD BOOLEAN identifier (paralelDeclaration)* ASSIGN boolValue
  ;

boolValue
  : booleanValue
  | methodCall
  | identifier
  | expressionBody
  ;

localVariableDeclaration
  : (numberVariable | boolVariable) SEMICOLON
  ;

constVariableDeclaration
  : CONST localVariableDeclaration
  ;

variableDeclaration
  : (localVariableDeclaration | constVariableDeclaration)
  ;

paralelDeclaration
  : ASSIGN identifier
  ;


variableAssigment
  : identifier ASSIGN expressionBody SEMICOLON
  ;

program
  : block
  ;

block
  : LEFT_BRACE blockStatement? RIGHT_BRACE
  ;

body
  : LEFT_BRACE blockBody? RIGHT_BRACE
  ;

blockStatement
  : (statement
  | methodDeclaration)+
  ;

blockBody
  : (statement)+
  ;

statement
  : IF expression body (ELSE body)?                                 #statementIf
  | FOR forControl body                                             #statementFor
  | WHILE expression body                                           #statementWhile
  | DO body WHILE expression                                        #statementDo
  | SWITCH expression LEFT_BRACE switchBlockStatement* RIGHT_BRACE  #statementSwitch
  | REPEAT body UNTIL expression                                    #statementRepeat
  | methodCall SEMICOLON                                            #statementMethodCall
  | variableAssigment                                               #statementAssigment
  | variableDeclaration                                             #statementVariableDeclaration
  ;

expression
  : LEFT_PARENTHESES expressionBody RIGHT_PARENTHESES
  ;

expressionBody
  : possibleValues                                                          #exprPossibleValue
  | identifier                                                              #exprIdentifier
  | methodCall                                                              #exprMethodCall
  | expressionBody op=(MULTIPLICATION | DIVISION | MODULO) expressionBody                     #exprMultipli
  | expressionBody op=(PLUS | MINUS) expressionBody                         #exprAdditive
  | expressionBody op=(GRATER_THAN | GRATER_EQUAL_THAN | LOWER_THAN | LOWER_EQUAL_THAN | EQUALS | NOT_EQUALS) expressionBody    #exprRelational
  | expressionBody op=(AND | OR) expressionBody                             #exprLogical
  | LEFT_PARENTHESES expressionBody RIGHT_PARENTHESES                                            #exprPar
  | NEGATION expressionBody                                                 #exprNeg
  | MINUS expressionBody                                                    #exprMinus
  | PLUS expressionBody                                                     #exprPlus
  ;

forControl
  : LEFT_PARENTHESES identifier ASSIGN numberTypeSymbol? expressionBody '...' numberTypeSymbol? expressionBody RIGHT_PARENTHESES
  ;

switchBlockStatement
  : CASE NUMBER COLON body
  | DEFAULT COLON body
  ;

methodDeclaration
  : FUNCTION_KEYWORD methodReturnType identifier LEFT_PARENTHESES (methodParameter (COMMA methodParameter)*)? RIGHT_PARENTHESES methodBody
  ;

methodParameter
  : possibleTypes identifier
  ;

methodBody
  : LEFT_BRACE blockBody? (RETURN expressionBody SEMICOLON)? RIGHT_BRACE
  ;

methodCall
  : identifier LEFT_PARENTHESES (methodCallParameter (COMMA methodCallParameter)*)? RIGHT_PARENTHESES
  ;

methodCallParameter
  : expressionBody
  ;
