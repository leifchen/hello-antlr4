package com.chen.antlr4.hello.api;

import org.junit.jupiter.api.Test;

/**
 * HelloApiTest
 * <p>
 * @Author LeifChen
 * @Date 2020-03-27
 */
class HelloApiTest {

    @Test
    void checkSuccess() {
        HelloApi.check("hello antlr");
    }

    @Test
    void checkFail() {
        HelloApi.check("hello 123");
    }
}