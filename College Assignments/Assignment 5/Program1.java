//Write a Java program to demonstrate single inheritance by creating a base class Animal with a method eat() and 
//a derived class Dog that inherits from Animal and has its own method bark().

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("The dog barks.");
    }
}

class Program1 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();

        dog.bark();
    }
}