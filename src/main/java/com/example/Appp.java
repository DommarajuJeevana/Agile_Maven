package com.example;

public class Appp {

    public static String reverseString(String text) {
        if (text == null) throw new IllegalArgumentException("Text cannot be null.");
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Reverse string: " + reverseString("Maven"));
    }
}