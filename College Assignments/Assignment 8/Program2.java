//Write a Java program to create an abstract class Vehicle with both abstract and
//concrete methods.Include an abstract method move()and a concrete method startEngine().Create 
//subclasses Car and Bicycle to implement the abstract method.
abstract class Vehicle {
    // Abstract method
    abstract void move();

    // Concrete method
    void startEngine() {
        System.out.println("Engine Started...");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car drives on road");
    }
}

class Bicycle extends Vehicle {
    void move() {
        System.out.println("Bicycle pedals on path");
    }
}

class Program2 {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.startEngine();
        c.move();

        Vehicle b = new Bicycle();
        b.move();
    }
}
