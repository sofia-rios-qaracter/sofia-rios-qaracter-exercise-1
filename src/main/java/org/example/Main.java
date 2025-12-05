package org.example;

public class Main {

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static int substraction(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("I'm Sofia Rios!!");
        System.out.println("La suma de 2, 3, y 4 es: "+suma(2,3,4));
        System.out.println("La resta de 5 menos 3 es: "+substraction(5,3));
    }
}