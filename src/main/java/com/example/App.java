package com.example;

import java.util.Arrays;

public class App {

    // Addition of two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Check whether a number is even or odd
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    // Find the largest of three numbers
    public static int largestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Find the factorial of a number
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result = Math.multiplyExact(result, i);
        }
        return result;
    }

    // Check whether a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= number / i; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Generate the Fibonacci series for the requested number of terms
    public static long[] fibonacci(int terms) {
        if (terms < 0) {
            throw new IllegalArgumentException("Number of terms cannot be negative.");
        }
        long[] series = new long[terms];
        if (terms > 0) series[0] = 0;
        if (terms > 1) series[1] = 1;
        for (int i = 2; i < terms; i++) {
            series[i] = Math.addExact(series[i - 1], series[i - 2]);
        }
        return series;
    }

    // Reverse a number
    public static int reverseNumber(int number) {
        long value = Math.abs((long) number);
        long reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        if (number < 0) reversed = -reversed;
        return Math.toIntExact(reversed);
    }

    // Check whether a number is a palindrome
    public static boolean isNumberPalindrome(int number) {
        return number >= 0 && number == reverseNumber(number);
    }

    // Calculate simple interest: (principal * rate * time) / 100
    public static double simpleInterest(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Principal, rate, and time cannot be negative.");
        }
        return principal * rate * time / 100.0;
    }

    // Calculate a student's grade based on marks (assumed scale)
    public static String calculateGrade(double marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        if (marks >= 50) return "E";
        return "F";
    }

    // Find the sum of elements in an array
    public static int sumArray(int[] numbers) {
        if (numbers == null) throw new IllegalArgumentException("Array cannot be null.");
        int sum = 0;
        for (int number : numbers) sum = Math.addExact(sum, number);
        return sum;
    }

    // Find the maximum element in an array
    public static int maxArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }
        int maximum = numbers[0];
        for (int number : numbers) maximum = Math.max(maximum, number);
        return maximum;
    }

    // Count the number of vowels in a string
    public static int countVowels(String text) {
        if (text == null) throw new IllegalArgumentException("Text cannot be null.");
        int count = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        return count;
    }

    // Reverse a string
    public static String reverseString(String text) {
        if (text == null) throw new IllegalArgumentException("Text cannot be null.");
        return new StringBuilder(text).reverse().toString();
    }

    // Check whether a string is a palindrome (ignores case and non-alphanumeric characters)
    public static boolean isStringPalindrome(String text) {
        if (text == null) throw new IllegalArgumentException("Text cannot be null.");
        String normalized = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return normalized.contentEquals(new StringBuilder(normalized).reverse());
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 20));
        System.out.println("Even or odd: " + evenOrOdd(7));
        System.out.println("Largest of three: " + largestOfThree(10, 25, 15));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Prime: " + isPrime(17));
        System.out.println("Fibonacci: " + Arrays.toString(fibonacci(7)));
        System.out.println("Reverse number: " + reverseNumber(1234));
        System.out.println("Number palindrome: " + isNumberPalindrome(1221));
        System.out.println("Simple interest: " + simpleInterest(1000, 5, 2));
        System.out.println("Grade: " + calculateGrade(85));
        System.out.println("Array sum: " + sumArray(new int[]{1, 2, 3, 4}));
        System.out.println("Array maximum: " + maxArray(new int[]{1, 9, 3, 7}));
        System.out.println("Vowel count: " + countVowels("Hello World"));
        System.out.println("Reverse string: " + reverseString("Maven"));
        System.out.println("String palindrome: " + isStringPalindrome("Never odd or even"));
    }
}
