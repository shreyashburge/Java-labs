package lab12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();  // May throw InputMismatchException
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: That is not a valid integer.");
        } finally {
            sc.close();
        }
    }
}
