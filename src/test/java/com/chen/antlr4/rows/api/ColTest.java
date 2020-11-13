package com.chen.antlr4.rows.api;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 提取文本指定列信息的单元测试
 * <p>
 * @Author LeifChen
 * @Date 2020-11-13
 */
@Slf4j
class ColTest {

    @Test
    void getCol() throws IOException {
        for (int i = 1; i <= 3; i++) {
            log.info("获取第{}列数据", i);
            Col.getCol(i);
        }
    }
}