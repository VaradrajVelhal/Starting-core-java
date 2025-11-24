//Write a Java program to create an abstract class Shape with an abstract method draw().Create two subclasses,Circle and Rectangle,that provide specific implementations of the draw()method.Demonstrate polymorphism using a reference of type Shape.
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}
