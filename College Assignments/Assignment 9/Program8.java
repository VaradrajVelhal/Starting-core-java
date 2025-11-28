//Write a Java program to create two interfaces, Flyable and Swimmable, with
//methods fly() and swim() respectively. Create a class Duck that implements
//both interfaces and provides concrete implementations.
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}

class Program8 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
