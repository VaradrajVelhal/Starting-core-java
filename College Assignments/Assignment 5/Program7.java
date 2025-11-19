//Write a Java program to create an abstract class Shape with an abstract method draw(). Create two subclasses, Circle and Square, that provide implementations for the draw() method.
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Program7 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
