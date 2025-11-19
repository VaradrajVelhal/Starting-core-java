//Write a Java program to demonstrate hierarchical inheritance by creating a base class Shape and two derived
// classes, Circle and Rectangle, each having methods to calculate the area. 
class Shape {
    void identify() {
        System.out.println("I am a generic shape.");
    }
}

class Circle extends Shape {
    void area(double r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area(double l, double w) {
        System.out.println("Rectangle Area: " + (l * w));
    }
}

public class Program3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.identify();
        c.area(5);
        r.identify();
        r.area(4, 6);
    }
}
