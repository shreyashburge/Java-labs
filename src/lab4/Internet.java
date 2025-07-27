package lab4;

import java.util.Scanner;

public class Internet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: total GB consumed
        System.out.print("Enter total data consumed (in GB): ");
        double totalGB = sc.nextDouble();

        double billAmount;

        // Logic based on data consumption
        if (totalGB < 10) {
            billAmount = 300; // Basic charge
        } else if (totalGB <= 30) {
            billAmount = 300 + 5 * (totalGB - 10);
        } else {
            billAmount = 400 + 3 * (totalGB - 30);
        }

        // Display the bill amount
        System.out.println("Total Bill Amount: ₹" + billAmount);

        sc.close();
    }
}
