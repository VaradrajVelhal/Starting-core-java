//Write a Java program to demonstrate method overloading by creating a class MathOperations with overloaded methods add(int, int), add(double, double), and add(int, int, int).
class MathOperations {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Program1 {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        m1.add(10.50, 30.50);
        m1.add(10, 30);
        m1.add(10, 20, 30);
    }
}
