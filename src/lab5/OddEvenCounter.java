package lab5;

import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nTotal Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);

        sc.close();
    }
}

