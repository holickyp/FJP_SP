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
INCREMENT : '++' ;
MINUS : '-' ;
DECREMENT : '--' ;
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

fragment DIGIT : [0-9] ;
fragment LETTER
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;
fragment LETTER_OR_DIGIT
    : LETTER
    | DIGIT
    ;
NUMBER : DIGIT+;
IDENTIFIER : LETTER LETTER_OR_DIGIT*;
WHITESPACE : [ \r\t\n]+ -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip;


/* -------------- parser rules -------------- */
identifier
    : IDENTIFIER
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

typeType
    : INT
    | BOOLEAN
    ;

booleanValue
  : TRUE
  | FALSE
  ;

possibleValues
  : (PLUS | MINUS)? NUMBER
  | booleanValue
  ;

variableModifier
    : CONST
    ;

program
  : block
  ;

block
    : LEFT_BRACE blockStatement* RIGHT_BRACE
    ;

methodBlock
    : (statement)+
    ;

blockStatement
    : localVariableDeclaration SEMICOLON
    | methodDeclaration
    | statement
    ;

localVariableDeclaration
    : variableModifier? typeType (identifier (ASSIGN identifier)* ASSIGN expression | identifier (ASSIGN expression)?)
    ;

methodDeclaration
    : typeTypeOrVoid identifier formalParameters methodBody
    ;

formalParameters
    : LEFT_PARENTHESES formalParameterList RIGHT_PARENTHESES
    ;

formalParameterList
    : formalParameter (COMMA formalParameter)*
    ;

formalParameter
    : typeType variableDeclaratorId
    ;

variableDeclarators
    : variableDeclarator
    ;

variableDeclarator
    : variableDeclaratorId (ASSIGN variableInitializer)?
    ;

variableDeclaratorId
    : identifier
    ;

variableInitializer
    : expression
    ;

methodBody
    : LEFT_BRACE methodBlock? (RETURN expression SEMICOLON)? RIGHT_BRACE
    | SEMICOLON
    ;

statement
    : blockLabel=block                                                                      #blockLabelStatement
    | IF parExpression braceStatement (ELSE braceStatement)?                                #ifStatement
    | FOR LEFT_PARENTHESES forControl RIGHT_PARENTHESES braceStatement                      #forStatement
    | WHILE parExpression braceStatement                                                    #whileStatement
    | DO braceStatement WHILE parExpression SEMICOLON                                       #doWhileStatement
    | SWITCH parExpression LEFT_BRACE switchBlockStatementGroup* switchLabel* RIGHT_BRACE   #switchStatement
    | REPEAT braceStatement UNTIL parExpression SEMICOLON                                   #repeatStatement
    | statementExpression=expression SEMICOLON                                              #expressionStatement
    ;

braceStatement
    : LEFT_BRACE statement RIGHT_BRACE
    ;

parExpression
    : LEFT_PARENTHESES expression RIGHT_PARENTHESES
    ;

expressionList
    : expression (COMMA expression)*
    ;

expression
    : possibleValues                                                                                #possibleValueExpression
    | identifier                                                                                    #identifierExpression
    | methodCall                                                                                    #methodCallExpression
    | expression postfix=(INCREMENT | DECREMENT)                                                    #postfixExpression
    | prefix=(NEGATION|PLUS|MINUS|INCREMENT|DECREMENT) expression                                   #prefixExpression
    | expression bop=(MULTIPLICATION|DIVISION|MODULO) expression                                    #mulDivModExpression
    | expression bop=(PLUS|MINUS) expression                                                        #plusMinusExpression
    | expression bop=(LOWER_EQUAL_THAN| GRATER_EQUAL_THAN | LOWER_THAN | GRATER_THAN) expression    #relationalExpression
    | expression bop=(EQUALS | NOT_EQUALS) expression                                               #compareExpression
    | expression bop=(AND | OR) expression                                                          #logicalExpression
    | LEFT_PARENTHESES expression RIGHT_PARENTHESES                                                 #parenthesesExpression
    | <assoc=right> expression bop=ASSIGN expression                                                #assignExpression
    ;

forControl
    : forInit? SEMICOLON expression? SEMICOLON forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE NUMBER COLON
    | DEFAULT COLON
    ;

methodCall
    : identifier LEFT_PARENTHESES expressionList? RIGHT_PARENTHESES
    ;