package lab10;

import java.util.Scanner;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class AnimalVoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which animal do you want to create?");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        Animal animal;

        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice. Defaulting to generic Animal.");
            animal = new Animal();
        }

        // Call the overridden method
        animal.makeSound();

        sc.close();
    }
}

