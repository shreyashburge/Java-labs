package lab2;

import java.util.Scanner;

public class Calculator {

    // First add() method: takes two int values
    public int add(int a, int b) {
        return a + b;
    }

    // Second add() method: takes three int values
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third add() method: takes two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Main method to demonstrate overloading
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Input for first method
        System.out.println("Enter two integers:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        int result1 = calc.add(int1, int2);
        System.out.println("Sum of two integers: " + result1);

        // Input for second method
        System.out.println("\nEnter three integers:");
        int int3 = sc.nextInt();
        int int4 = sc.nextInt();
        int int5 = sc.nextInt();
        int result2 = calc.add(int3, int4, int5);
        System.out.println("Sum of three integers: " + result2);

        // Input for third method
        System.out.println("\nEnter two decimal numbers:");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        double result3 = calc.add(double1, double2);
        System.out.println("Sum of two doubles: " + result3);

        sc.close();
    }
}
