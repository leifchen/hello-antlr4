package com.chen.antlr4.language.java.api;

import com.chen.antlr4.language.java.parser.JavaLexer;
import com.chen.antlr4.language.java.parser.JavaParser;
import com.chen.antlr4.language.java.service.ExtractInterfaceListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 接口提取器
 * <p>
 * @Author LeifChen
 * @Date 2020-11-13
 */
public class ExtractInterfaceTool {

    public static void print() throws IOException {
        File file = new File("src/main/resources/sample/Demo.java");
        CharStream input = CharStreams.fromStream(new FileInputStream(file));

        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ExtractInterfaceListener(parser), tree);
    }
}
