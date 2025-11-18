//Write a Java program to define a class Rectangle with a parameterized constructor to initialize its length
//and width. Calculate and display the area of the rectangle.

class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.displayArea();
    }
}
