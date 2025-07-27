package lab11;
// Abstract class
abstract class Shape {
    // Abstract method
    abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override calculateArea
    @Override
    double calculateArea() {
        return width * height;
    }
}

public class Area {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects
        Circle circle = new Circle(5); // radius = 5
        Rectangle rectangle = new Rectangle(4, 6); // width = 4, height = 6

        // Calculate and print areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
