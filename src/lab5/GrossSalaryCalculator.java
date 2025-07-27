package lab5;

import java.util.Scanner;

public class GrossSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice == -1) {
            System.out.print("Enter basic salary of employee: ");
            double basic = scanner.nextDouble();

            double hra, da;

            // Applying conditions
            if (basic > 15000) {
                hra = 0.20 * basic; // 20% HRA
                da = 0.60 * basic;  // 60% DA
            } else {
                hra = 3000;              // Fixed HRA
                da = 0.70 * basic;       // 70% DA
            }

            double gross = basic + hra + da;

            System.out.println("Gross Salary = " + gross);

            // Ask user if they want to continue
            System.out.println("Enter -1 to continue or any other number to exit:");
            choice = scanner.nextInt();
        }

        System.out.println("Program ended.");
        scanner.close();


    }
}