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
        CharStream input = CharStreams.fromString(str);
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Int2UnicodeString(), tree);
        System.out.println();
    }
}
