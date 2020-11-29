grammar LabeledExpr_test;  // 这个语法文件用来做测试，生成的文件放置到 gen_test 这个目录下

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op expr
    |   INT
    |   ID
    |   '(' expr ')'
    ;

op:   MUL
  |   DIV
  |   ADD
  |   SUB
  ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
