package com.chen.antlr4.hello.api;

import com.chen.antlr4.hello.parser.HelloLexer;
import com.chen.antlr4.hello.parser.HelloParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * HelloApi
 * <p>
 * @Author LeifChen
 * @Date 2020-03-27
 */
public class HelloApi {

    public static void check(String str) {
        CharStream input = CharStreams.fromString(str);
        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        parser.r();
    }
}
