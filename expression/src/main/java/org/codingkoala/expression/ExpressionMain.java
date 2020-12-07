package org.codingkoala.expression;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class ExpressionMain {
    public static void main(String[] args) throws IOException {
        // 如果是本地 idea 直接运行，就用这种方式获取 resources 目录的文件
        // 打成 jar 包去运行也可以直接执行命令 "java -jar ./target/expression-1.0-SNAPSHOT-jar-with-dependencies.jar"
        // 从 resources 中获取需要解析的资源
        System.out.println("**************** 加载需要解析的字符串资源 ****************");
        InputStream inputStream = ExpressionMain.class.getClassLoader().getResourceAsStream("expressionQueries");
        assert inputStream != null;
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        // getText 传入的对象是 Interval 类型，这里表示读取 从 0 读取 到 max 长度那么多，max 长度远远大于设置的样例长度，因此可以把样例都读进去
        System.out.println(input.getText(new Interval(0, Interval.INTERVAL_POOL_MAX_VALUE)));

        // 将需要被解析的数据传入 lexer，通过 lexer 构建了 tokens
        System.out.println("**************** 传入字符串，借助lexer，构建tokens ****************");
        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();  // 从开始到结束符，获取所有的token，必须有这一句，然后才会可以挨个遍历 所有的 tokens
        // 打印匹配的每一个 token 以及 在 tokens 文件中对应的那个编号
        for(Token token:tokens.getTokens()) {
            if (token.getText().equals("\n") || token.getText().equals("\r")) {
                System.out.println("newLine" + "(" + token.getType() + ")\t");
            } else {
                System.out.print(token.getText() + "(" + token.getType() + ")\t");
            }
        }
        System.out.println();

        System.out.println("**************** 传入 tokens，构建parser，并生成AST ****************");
        LabeledExprParser parser = new LabeledExprParser(tokens);
        // 从入口的 语法规则 开始递归的构建 AST
        ParseTree tree = parser.prog();

        System.out.println(parser.getATN().states.toString());

        List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
        String prettyTree = TreeUtils.toPrettyTree(tree, ruleNamesList);
        System.out.println(prettyTree);

//        for (String token: LabeledExprParser.tokenNames) {
//            System.out.print(token + " ");
//        }
//        System.out.println();
//        System.out.println(parser.getVocabulary().getDisplayName(12));


//        EvalVisitor visitor = new EvalVisitor();
//        visitor.visit(tree);
    }
}
