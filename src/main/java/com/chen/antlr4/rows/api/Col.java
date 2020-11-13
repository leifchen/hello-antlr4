package com.chen.antlr4.rows.api;

import com.chen.antlr4.rows.parser.RowsLexer;
import com.chen.antlr4.rows.parser.RowsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 提取文本指定列信息
 * <p>
 * @Author LeifChen
 * @Date 2020-11-13
 */
public class Col {

    public static void getCol(int col) throws IOException {
        File file = new File("src/main/resources/sample/t.rows");
        CharStream input = CharStreams.fromStream(new FileInputStream(file));

        RowsLexer lexer = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RowsParser parser = new RowsParser(tokens, col);
        // 不需要浪费时间建立语法分析树
        parser.setBuildParseTree(false);
        parser.file();
    }
}
