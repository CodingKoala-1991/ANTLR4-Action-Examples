package org.codingkoala.expression;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class ExpressionMain {
    public static void main(String[] args) throws IOException {
        // 如果是本地 idea 直接运行，就用这种方式获取 resources 目录的文件
        // 打成 jar 包去运行也可以直接执行命令 "java -jar ./target/expression-1.0-SNAPSHOT-jar-with-dependencies.jar"
        // 从 resources 中获取需要解析的资源
        InputStream inputStream = ExpressionMain.class.getClassLoader().getResourceAsStream("expressionQueries");
        assert inputStream != null;
        ANTLRInputStream input = new ANTLRInputStream(inputStream);

        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog();

        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
