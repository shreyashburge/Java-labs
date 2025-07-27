package lab6;


class Student {
    String name;
    int age;
    String department;

    // this is default constructor
    Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    // this is constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Constructor
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}


public class Students {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();

        // Using constructor with name and age
        Student student2 = new Student("Alice", 22);

        // Using constructor with name, age, and department
        Student student3 = new Student("Bob", 23, "Computer Science");



        // Print details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
    }
}
