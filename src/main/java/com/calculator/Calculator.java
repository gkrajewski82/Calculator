package com.calculator;

public class Calculator {
    private int a = 48;
    private int b = 12;

    public void addAToB() {
        System.out.println(a + b);
    }

    public void substractAFromB() {
        System.out.println(a - b);
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addAToB();
        calculator.substractAFromB();

    }
}
