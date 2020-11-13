package com.chen.antlr4.language.java.api;

import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 接口提取器的单元测试
 * <p>
 * @Author LeifChen
 * @Date 2020-11-13
 */
class ExtractInterfaceToolTest {

    @Test
    void print() throws IOException {
        String str = "import java.util.List;\n" +
                "import java.util.Map;\n" +
                "public class Demo {\n" +
                "\tvoid f(int x, String y) { }\n" +
                "\tint[ ] g(/*no args*/) { return null; }\n" +
                "\tList<Map<String, Integer>>[] h() { return null; }\n" +
                "}\n";
        ExtractInterfaceTool.print();
    }
}