package lab3;

public class Rectangle {
    // Attributes
    private int length;
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }

    // Main method to compare two rectangles
    public static void main(String[] args) {
        // Instantiate two rectangles with random values
        Rectangle rectangle1 = new Rectangle(10, 5); // Area = 50
        Rectangle rectangle2 = new Rectangle(8, 6);  // Area = 48

        // Calculate areas
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Display areas
        System.out.println("Area of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);

        // Compare using relational operators
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
