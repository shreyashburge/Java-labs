package lab9;

class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive() {
        System.out.println("Vehicle is driving.");
    }

    void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maximumSpeed + " km/h");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle {
    Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 240);
        Bike bike = new Bike("Yamaha", "R15", 2021, 180);

        System.out.println("Car Details:");
        car.printDetails();
        car.drive();

        System.out.println("\nBike Details:");
        bike.printDetails();
        bike.drive();
    }
}

