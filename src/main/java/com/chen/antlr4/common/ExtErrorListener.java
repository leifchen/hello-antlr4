package com.chen.antlr4.common;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * 自定义Error监听器
 * <p>
 * @Author LeifChen
 * @Date 2020-03-27
 */
@Slf4j
public class ExtErrorListener extends BaseErrorListener {

    public static final ExtErrorListener INSTANCE = new ExtErrorListener();

    @Getter
    @Setter
    private boolean error;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Lexer lexer = (Lexer) recognizer;
        // String text = lexer._input.getText(Interval.of(lexer._tokenStartCharIndex, lexer._input.index()));
        // String msg2 = lexer.getErrorDisplay(text);
        // log.error("[词法错误] 行{}列{}错误词: {}", line, charPositionInLine, msg);

        error = true;
    }
}
