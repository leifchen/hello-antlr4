package com.chen.antlr4.expr.api;

import com.chen.antlr4.expr.parser.ExprLexer;
import com.chen.antlr4.expr.parser.ExprParser;
import com.chen.antlr4.expr.service.EvalVisitor;
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
