package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    // Question: Reverse a string
    @Test
    void Test1() {
        assertEquals("nevaM", Appp.reverseString("Maven"));
    }

    @Test
    void Test2() {
        assertEquals("", Appp.reverseString(""));
    }

    @Test
    void Test3() {
        assertEquals("a", Appp.reverseString("a"));
    }

    @Test
    void Test4() {
        assertEquals("!dlroW olleH", Appp.reverseString("Hello World!"));
    }

}
