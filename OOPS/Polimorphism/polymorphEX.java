// Compile-Time Polymorphism (Method Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Run-Time Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class polymorphEX {
    public static void main(String[] args) {
        // Overloading
        Calculator calc = new Calculator();
        System.out.println("Int add: " + calc.add(5, 3));         // Output: 8
        System.out.println("Double add: " + calc.add(2.5, 4.3));   // Output: 6.8

        // Overriding (polymorphism through inheritance)
        Animal a = new Dog();  // Reference of parent, object of child
        a.sound();             // Output: Dog barks
        Animal animal=new Animal();
        animal.sound();
    }
}
