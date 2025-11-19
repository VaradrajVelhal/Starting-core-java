//Write a Java program to create a class Circle with overloaded constructors—one default and one parameterized.
//Use the parameterized constructor to set the radius and calculate the area.

class Circle {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.displayArea();
    }
}
