//Write a Java program to demonstrate runtime polymorphism by creating a superclass Animal with a method makeSound(). Create subclasses Dog and Cat that override makeSound(). Use a superclass reference to call the overridden methods.
class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.makeSound();
        Animal c1 = new Cat();
        c1.makeSound();
    }
}
