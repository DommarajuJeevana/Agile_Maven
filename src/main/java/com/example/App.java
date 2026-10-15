package com.example;

public class App {

    public static int Largest(int a, int b, int c) {
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Largest: " + Largest(1,2,3));
    }
}