//Write a Java program to create an abstract class Animal with an abstract
//method makeSound().Create two subclasses,Dog and Cat,that provide concrete 
//implementations of the makeSound() method.
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Program1 {
    public static void main(String[] args) {
        new Dog().makeSound();
        new Cat().makeSound();
    }
}
