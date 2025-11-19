//Write a Java program to demonstrate multilevel inheritance by creating a base class Vehicle, a derived class Car 
//that extends Vehicle, and another derived class ElectricCar that extends Car. Include relevant methods in
//each class and demonstrate calling them.
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.drive();
        tesla.charge();
    }
}
