//Write a Java program to create a class Circle with overloaded constructors—one default and one parameterized.
//Use the parameterized constructor to set the radius and calculate the area.

class Rectangle {
    int length;
    int width;

    // Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.displayArea();
    }
}
