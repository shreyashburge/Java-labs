package lab9;


class Shape {
    double getArea() {
        return 0.0;  // Default implementation (can be abstract in advanced usage)
    }
}


class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}


class Square extends Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}


class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}


public class ShapeArea {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(6, 3);


        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}

