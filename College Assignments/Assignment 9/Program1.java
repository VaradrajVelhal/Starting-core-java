//Write a Java program to create a package named shapes and define a class
//Circle within it. The class should include methods to calculate the area and
//circumference of a circle. Create another class in a different package that uses
//the Circle class.

import shapes.Circle;

class Program1 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.calculateArea();
        c.calculateCircumference();
    }
}
