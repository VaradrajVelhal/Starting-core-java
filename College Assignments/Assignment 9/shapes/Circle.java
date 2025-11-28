package shapes;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    public void calculateCircumference() {
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }

}
