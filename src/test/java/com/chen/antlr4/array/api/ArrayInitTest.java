package com.chen.antlr4.array.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ArrayInitTest
 * <p>
 * @Author LeifChen
 * @Date 2020-04-01
 */
class ArrayInitTest {

    @Test
    void print() {
        ArrayInit.print("{1, 2, 3}");
        ArrayInit.print("{2020, {1, 2, 3, {99}}}");
    }
}