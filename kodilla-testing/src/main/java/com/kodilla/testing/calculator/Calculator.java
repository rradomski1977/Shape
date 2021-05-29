package com.kodilla.testing.calculator;
import java.util.Scanner;


public class Calculator {

    private int add;
    private int subtract;
    public int getAdd() {

        int add = 0;
        return add;
    }
    public void setAdd(int add) {
        this.add = add;
    }
    public int getSubtract() {
        int subtract = 0;
        return subtract;
    }
    public void setSubtract(int subtract) {

        this.subtract = subtract;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        int add = a + b;
        int subtract = a - b;
        System.out.println("Sum: " + a + " + " + b + " = " + add);
        System.out.println("Difference: " + a + " - " + b + " = " + subtract);
    }
}