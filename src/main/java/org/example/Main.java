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
        System.out.println("The sum between 2, 3, and 4 is: "+addition(2,3,4));

        // Print for substraction function with 2 paramenters
        System.out.println("The substraction between 5 and 3 is: "+substraction(5,3));

        // Print for substraction function with 3 paramenters
        System.out.println("The substraction between 10 and (4 plus 2) is: "+substraction(10, 4, 2));
    }
}