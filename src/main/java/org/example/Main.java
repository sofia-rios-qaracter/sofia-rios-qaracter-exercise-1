package org.example;

public class Main {

    // Function that adds the three numbers passed as parameters
    public static int addition(int a, int b, int c){
        return a+b+c;
    }

    // Function that takes three parameters a, b, and c and rest the first one to the sum of the rest
    public static int substraction(int a, int b, int c){
        return a - (b+c);
    }

    // Function that takes two parameters and returns it substraction
    public static int substraction(int a, int b){
        return substraction(a,b,0);
    }

    public static void main(String[] args) {
        // Hello world created at creating the project
        System.out.println("Hello, World!");

        // Print created at first commit
        System.out.println("I'm Sofia Rios!!");

        // Print for verifying addition function works correctly
        System.out.println("La suma de 2, 3, y 4 es: "+addition(2,3,4));

        // Print for substraction function with 2 paramenters
        System.out.println("La resta de 5 menos 3 es: "+substraction(5,3));

        // Print for substraction function with 3 paramenters
        System.out.println("La resta de 10 menos 4 y 2 es: "+substraction(10, 4, 2));
    }
}