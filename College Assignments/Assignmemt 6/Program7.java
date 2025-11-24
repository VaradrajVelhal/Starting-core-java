//Write a Java program to demonstrate upcasting and downcasting with a superclass Fruit and subclasses Apple and Banana. Perform upcasting and then downcasting, and demonstrate any associated risks.
class Fruit {
    void eat() {
        System.out.println("Eating fruit...");
    }
}

class Apple extends Fruit {
    @Override
    void eat() {
        System.out.println("Eating Apple.");
    }

    void cut() {
        System.out.println("cutting apple.");
    }
}

class Banana extends Fruit {
    @Override
    void eat() {
        System.out.println("Eating a soft Banana.");
    }

    void peel() {
        System.out.println("Peeling the banana.");
    }
}

class Program7 {
    public static void main(String[] args) {
        // Upcasting
        Fruit f = new Apple();
        f.eat();

        // Downcasting
        if (f instanceof Apple) {
            Apple a = (Apple) f;
            a.cut();
        }
    }
}