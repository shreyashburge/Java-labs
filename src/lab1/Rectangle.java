package lab1;

public class Rectangle {
    // Member variables
    double width;
    double height;

    // This is Enum declaration inside the class
    enum Color {
        RED, GREEN, BLUE
    }

    // This is a Member variable of type Color
    Color boxColor;

    // Main method
    public static void main(String[] args) {
        
        System.out.println(Color.BLUE);
    }
}
