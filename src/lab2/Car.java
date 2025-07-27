package lab2;

import java.util.Scanner;

public class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("\nCar Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : Rs" + price);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Make:");
        String make = sc.nextLine();

        System.out.println("Enter Car Model:");
        String model = sc.nextLine();

        System.out.println("Enter Car Year:");
        short year = sc.nextShort();

        System.out.println("Enter Car Price:");
        int price = sc.nextInt();

        // Creating Car object using constructor
        Car myCar = new Car(make, model, year, price);

        // Display the car details
        myCar.displayInfo();

        sc.close();
    }
}
