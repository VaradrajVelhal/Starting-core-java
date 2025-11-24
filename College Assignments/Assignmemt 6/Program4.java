//Write a Java program to create an interface Drivable with a method drive(). Create two classes, Car and Bike, that implement the Drivable interface and provide their own implementation for drive().
interface Drivable {
    void drive();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("We can drive a car.");
    }
}

class Bike implements Drivable {
    public void drive() {
        System.out.println("We can ride a bike.");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Car c1 = new Car();
        b1.drive();
        c1.drive();
    }
}
