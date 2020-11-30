grammar LabeledExpr; // rename to distinguish from Expr.g4


// 小写字母构成的是 规则
// 大写字母构成的是 特定的符号
// 对于自动生成的 BaseListener（监听器）
// 每一个 规则 xyz 都会在 BaseListener 生成一个 enterXyz 方法 和 exitXyz 方法，用于监听 进入 或者 退出 xyz 这个规则的时候的操作
// 每一个 规则 xyz 都会在 BaseVisitor 生成一个 visitXyz 方法，用于 访问 xyz 这个规则
// 每一个 规则 xyz 都会有自己的 context，即 Parser.XyzContext.
// 每一个 规则 xyz 对应的都是 AST 中的 非叶子节点
// 匹配出来的具体 token 在 AST 中就是 叶子节点


// 很好理解，g4 文件中，指定了 若干个字符，分别是 = （ ），就是分别对应 T__0, T__1, T__2, token 的编号就是 1 2 3
// 然后 g4 文件中每一个 大写字符串都是一个 token 规则，对应有自己的编号
// 如果这些 token 规则对应了具体的符号，就会被编号；如果是对应一组正则之类的，比如 ID 和 INT，就只有一个编号
// 所以，获得 token 编号的有两种情况：
// 1. 特定写死的字符
// 2. 大写字符串，也就是一个token规则，类似正则匹配这种
// 凡是 一个 token 规则有两个或者以上对应的字符串，那么对应的字符串都不会获得编号，只有 token 规则本身有编号，比如：
// 在 sql 的 g4 文件中
// NOT: 'NOT' | '!'           意味着 NOT 这个 token 规则 对应 "NOT" 和 "!" 两个字符串，那么 "NOT" 和 "!" 都不会获得编号
// 但是对于
// IN: 'IN'; 这条规则，IN 这个 token 规则，只有 "IN" 一个字符串，因此 IN 这个 规则 和 "IN" 这个字符串其实都有相同的 token 编号

// 生成的 tokens 文件内容如下：
// T__0=1
// T__1=2
// T__2=3
// MUL=4
// DIV=5
// ADD=6
// SUB=7
// ID=8
// INT=9
// NEWLINE=10
// WS=11
// '='=1
// '('=2
// ')'=3
// '*'=4
// '/'=5
// '+'=6
// '-'=7

// 另一方面，还有另一个生成的文件  .interp
// 这个文件是用于 IDE 的交互之类的，暂时可以不关心

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr  // 每个备选分支都会生成方法？？？？
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op expr                # operations
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
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
