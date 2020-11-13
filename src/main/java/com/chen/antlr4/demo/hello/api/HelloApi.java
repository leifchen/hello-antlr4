package com.chen.antlr4.demo.hello.api;

import com.chen.antlr4.demo.hello.parser.HelloLexer;
import com.chen.antlr4.demo.hello.parser.HelloParser;
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

    public static void main(String[] args) {
        // success
        HelloApi.check("hello antlr");
        // fail
        HelloApi.check("hello 123");
    }

    public static void check(String str) {
        CharStream input = CharStreams.fromString(str);
        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        parser.r();
    }
}
