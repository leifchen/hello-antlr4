package com.chen.antlr4.array.service;

import com.chen.antlr4.array.parser.ArrayInitBaseListener;
import com.chen.antlr4.array.parser.ArrayInitParser;

/**
 * Int整数转换成十六进制的String
 * <p>
 * @Author LeifChen
 * @Date 2020-03-26
 */
public class Int2UnicodeString extends ArrayInitBaseListener {
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        if (ctx.INT() != null) {
            Integer value = Integer.valueOf(ctx.INT().getText());
            System.out.printf("\\u%04x", value);
        }
    }
}
