grammar Intepreter;

start: define_struct* ((define_multiple_data | define_single_data | value_attr_data|) SEMICOLON_)* define_function+ EOF;

instruction:
    (statement_return | expression) SEMICOLON_
    | cicle
    | statement_if
    | codeblock;

expression:
    | value_attr_data
    | define_single_data
    | define_multiple_data
    | call_function;

literal :
      BOOLVALUES_
    | DIGITS_
    | NUMBER_
    | STRING_VALUE_ ;

types :
      INT_
    | BOOLEAN_
    | REAL_
    | STRING_;

data_acess: IDENTIFIER_ array_acess* struct_acess?;

array_acess: SQUARE_LP_ (operation) SQUARE_RP_;

struct_acess: STRUCT_ACCESS_ data_acess;


operation:
      call_function
    | literal
    | data_acess
    | LP_ operation RP_
    | MINUS_ operation
    | operation (MULT_ | DIV_ | REMAINDER_) operation
    | operation (MINUS_ | PLUS_) operation
    | NOT_ operation
    | operation (LT_ | LTE_ | GT_ | GTE_) operation
    | operation (EQUAL_ | NEQUAL_) operation
    | operation AND_ operation
    | operation OR_ operation ;

define_function: (types | VOID_ | IDENTIFIER_) IDENTIFIER_ arguments_define_function codeblock;
arguments_define_function : LP_ (  (define_single_data (COLON_ define_single_data)*)+ | VOID_ )?  RP_;

call_function: (IDENTIFIER_|KEYWORD_FUNCTION) arguments_call_function;
arguments_call_function: LP_ ( (operation ) (COLON_ (operation ))*)? RP_;

codeblock: LCB_ (instruction)* RCB_;

define_multiple_data: define_single_data ( COLON_ defining_data)+;
define_single_data: (types | IDENTIFIER_) defining_data;
defining_data : (POINTER_)*IDENTIFIER_(array_acess)*;

value_attr_data: (define_single_data | data_acess ) ATRIBUTION_ operation;

statement_return: RETURN_ operation?;

statement_if: IF_ operation  THEN_ instruction (ELSE_ instruction)?;

cicle: statement_while | statement_for;

statement_while: WHILE_ operation  instruction;

statement_for: FOR_ value_attr_data (TO_|DOWNTO_) operation (STEP_ operation)? instruction;

define_struct: TYPE_ IDENTIFIER_ LCB_ ( (define_multiple_data | define_single_data) SEMICOLON_)+ RCB_;

INT_: 'int';
BOOLEAN_: 'bool';
REAL_: 'real';
STRING_: 'string';
VOID_: 'void';

PLUS_ : '+';
MINUS_ : '-';
MULT_: '*';
DIV_: '/';
REMAINDER_: '%';
LT_: '<';
LTE_: '<=';
GT_: '>';
GTE_: '>=';
EQUAL_: '==';
NEQUAL_: '!=';
AND_:'and';
OR_:'or';
NOT_:'not';
LP_:'(';
RP_:')';
SQUARE_LP_:'[';
SQUARE_RP_:']';
LCB_: '{';
RCB_: '}';
STRUCT_ACCESS_:'.';
BOOLVALUES_: TRUE_ | FALSE_;
fragment TRUE_: 'true';
fragment FALSE_: 'false';
POINTER_: '^';
ATRIBUTION_: '=';
COLON_: ',';

KEYWORD_FUNCTION: WRITE_ | WRITELN_ | READ_;

IF_: 'if';
THEN_: 'then';
ELSE_: 'else';
WHILE_: 'while';
FOR_: 'for';
TO_: 'to';
DOWNTO_: 'downto';
STEP_: 'step';
RETURN_: 'return';
fragment WRITE_: 'write';
fragment WRITELN_: 'writeln';
fragment READ_: 'read';
TYPE_: 'type';

IDENTIFIER_: (LETTER_ | '_')(LETTER_ | DIGIT_ | '_')*;
SEMICOLON_ : ';';
LETTER_ : [A-Za-z];
fragment DIGIT_: [0-9];
DIGITS_ : ([1-9]DIGIT_*) | '0';
NUMBER_: DIGITS_ ('.' DIGIT_*)?;
STRING_VALUE_: '"' (ESC | .)*? '"' ;
fragment ESC : '\\' [tnr"\\] ;

SL_COMMENT :   ('//' .*? ('\n' | EOF)) -> skip ;        // single-line comment
ML_COMMENT :   '/*' .*? '*/' -> skip ;       // multi-line comment
WHITE_SPACE :  [ \t\r\n]+ -> skip;
