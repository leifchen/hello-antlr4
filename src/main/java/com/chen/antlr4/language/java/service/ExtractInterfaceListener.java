package com.chen.antlr4.language.java.service;

import com.chen.antlr4.language.java.parser.JavaBaseListener;
import com.chen.antlr4.language.java.parser.JavaParser;
import org.antlr.v4.runtime.TokenStream;

/**
 * ExtractInterfaceListener
 * <p>
 * @Author LeifChen
 * @Date 2020-11-13
 */
public class ExtractInterfaceListener extends JavaBaseListener {

    private JavaParser parser;

    public ExtractInterfaceListener(JavaParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        System.out.println(parser.getTokenStream().getText(ctx));
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println();
        System.out.println("interface I" + ctx.Identifier() + " {");
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String type = "void";

        if (ctx.type() != null) {
            type = tokens.getText(ctx.type());
        }
        String args = tokens.getText(ctx.formalParameters());
        System.out.println("\t" + type + " " + ctx.Identifier() + args + ";");
    }
}
