package com.chen.antlr4.demo.expr.api;

import com.chen.antlr4.demo.expr.parser.ExprLexer;
import com.chen.antlr4.demo.expr.parser.ExprParser;
import com.chen.antlr4.demo.expr.service.EvalVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Calculate
 * <p>
 * @Author LeifChen
 * @Date 2020-04-01
 */
public class Calculate {

    public static void main(String[] args) {
        int x = 4;
        int y = 2;

        Calculate.result(1 + 2 + "\n");
        Calculate.result(x + y + "\n");
        Calculate.result(x - y + "\n");
        Calculate.result(x * y + "\n");
        Calculate.result(x / y + "\n");
    }

    public static void result(String str) {
        CharStream input = CharStreams.fromString(str);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prog();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
