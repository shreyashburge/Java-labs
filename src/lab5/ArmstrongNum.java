package lab5;

import java.util.Scanner;

class ArmstrongNum{

    // Method to print Armstrong numbers in a given range
    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;

                
                int cube = 1;
                for (int i = 0; i < 3; i++) {
                    cube *= digit;
                }

                sum += cube;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }

    // Main method to take input and call printArmstrongNumber
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        printArmstrongNumber(start, end);

        scanner.close();
    }
}

