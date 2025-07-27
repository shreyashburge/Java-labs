package lab11;

import java.util.Scanner;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Intermediate class for multilevel inheritance
class Mammal extends Animal {
    // Can add shared mammal behavior here if needed
}

// Dog subclass
class Dog extends Mammal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Cat subclass
class Cat extends Mammal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}



// Main class
public class MultiLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal to create:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        // Use superclass reference
        Animal animal;

        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice. Defaulting to generic Animal.");
            animal = new Animal();
        }

        System.out.println("Result:");
        animal.makeSound(); // Calls overridden method

        sc.close();
    }
}
