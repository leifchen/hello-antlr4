package com.chen.antlr4.expr.api;

import org.junit.jupiter.api.Test;

/**
 * CalculateTest
 * <p>
 * @Author LeifChen
 * @Date 2020-04-01
 */
class CalculateTest {

    int x = 4;
    int y = 2;

    @Test
    void init() {
        Calculate.result(1 + 2 + "\n");
    }

    @Test
    void add() {
        Calculate.result(x + y + "\n");
    }

    @Test
    void sub() {
        Calculate.result(x - y + "\n");
    }

    @Test
    void mul() {
        Calculate.result(x * y + "\n");
    }

    @Test
    void div() {
        Calculate.result(x / y + "\n");
    }
}