package lab12;

import java.util.Scanner;

public class ParseIntExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number as a string: ");
            String input = sc.nextLine();
// this may throw NumberFormatException or NullPointerException
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null input received.");
        } finally {
            sc.close();
        }
    }
}
