//Write a Java program to create an abstract class Shape with a field color and
//an abstract method calculateArea().Create subclasses Circle and Rectangle that 
//provide concrete implementations for the abstract method.
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    double r;

    Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    double calculateArea() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l, w;

    Rectangle(String color, double l, double w) {
        super(color);
        this.l = l;
        this.w = w;
    }

    double calculateArea() {
        return l * w;
    }
}

class Program4 {
    public static void main(String[] args) {
        Shape c = new Circle("Red", 5);
        Shape r = new Rectangle("Blue", 4, 5);

        System.out.println(c.color + " Circle Area: " + c.calculateArea());
        System.out.println(r.color + " Rect Area: " + r.calculateArea());
    }
}
