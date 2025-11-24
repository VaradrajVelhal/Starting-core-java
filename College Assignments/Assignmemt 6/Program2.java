//Write a Java program to demonstrate method overriding by creating a superclass Vehicle with a method start(). Create a subclass Car that overrides the start() method.
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is Staring.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
    }
}
