package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Calculator {
    public static double multiply(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    public static double divide(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }

    public static double sum(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    public static double subtract(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }
}