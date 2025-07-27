package lab6;

// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

// Garage class
class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

// Main class
public class Vehicles {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Garage garage = new Garage();

        garage.serviceVehicle(car);
        garage.serviceVehicle(motorcycle);
    }
}

