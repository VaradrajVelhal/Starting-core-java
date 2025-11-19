//Write a Java program to demonstrate constructor chaining in inheritance by creating a class A with a constructor and a derived class B with its own constructor. Use super() to chain constructors.
class A {
    A() {
        System.out.println("Inside Class A constructor");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Inside Class B constructor");
    }
}

public class Program6 {
    public static void main(String[] args) {
        new B();
    }
}
