//  Write a Java program to demonstrate a superclass reference holding a subclass object by creating a superclass Animal and subclass Dog. Use an Animal reference to point to a Dog object and call the methods.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog eats.");
    }
}

public class program10 {
    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.sound();
    }
}
