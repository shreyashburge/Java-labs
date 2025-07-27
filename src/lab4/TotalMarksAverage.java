package lab4;

import java.util.Scanner;

public class TotalMarksAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1, marks2, marks3, marks4, marks5, total;
        double ave;

        System.out.println("Enter 1st subject marks out of 100:");
        marks1 = sc.nextInt();

        System.out.println("Enter 2nd subject marks out of 100:");
        marks2 = sc.nextInt();

        System.out.println("Enter 3rd subject marks out of 100:");
        marks3 = sc.nextInt();

        System.out.println("Enter 4th subject marks out of 100:");
        marks4 = sc.nextInt();

        System.out.println("Enter 5th subject marks out of 100:");
        marks5 = sc.nextInt();

        total = marks1 + marks2 + marks3 + marks4 + marks5;
        ave = total / 5.0;

        System.out.println("The total marks is: " + total + " out of 500");
        System.out.printf("The average is: %.2f%%\n", ave);

        if (ave > 90) {
            System.out.println("Grade is: Ex");
        } else if (ave > 80) {
            System.out.println("Grade is: A");
        } else if (ave > 60) {
            System.out.println("Grade is: B");
        } else if (ave >= 40) {
            System.out.println("Grade is: C");
        } else {
            System.out.println("Grade is: F");
        }

        sc.close(); // Always close Scanner
    }
}
