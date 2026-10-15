package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void Test1() {
        assertEquals(4, App.Largest(2,3,4));
    }

    @Test
    void Test2() {
        assertEquals(30, App.Largest(5,30,20));
    }

    @Test
    void Test3() {
        assertEquals(100, App.Largest(100,15,20));
    }

    @Test
    void Test4() {
        assertEquals(90, App.Largest(80,90,20));
    }

}
