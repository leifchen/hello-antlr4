package com.chen.antlr4.array.api;

import com.chen.antlr4.array.parser.ArrayInitLexer;
import com.chen.antlr4.array.parser.ArrayInitParser;
import com.chen.antlr4.array.service.Int2UnicodeString;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * ArrayUtils
 * <p>
 * @Author LeifChen
 * @Date 2020-03-26
 */
public class ArrayInit {

    public static void print(String str) {
        // 新建一个CharStream，读取数据str
        CharStream input = CharStreams.fromString(str);
        // 新建一个词法分析器，处理输入的CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        // 新建一个词法符号的缓冲区，用于存储词法分析器生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 新建一个语法分析器，处理词法符号缓冲区的内容
        ArrayInitParser parser = new ArrayInitParser(tokens);
        // 针对init规则，开始语法分析
        ParseTree tree = parser.init();

        // 新建一个通用的、能够触发回调函数的语法分树遍历器
        ParseTreeWalker walker = new ParseTreeWalker();
        // 遍历语法分析过程中生成的语法分析树，触发回调
        walker.walk(new Int2UnicodeString(), tree);
        System.out.println();
    }
}
