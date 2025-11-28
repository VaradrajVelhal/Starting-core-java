//Write a Java program to create an interface Calculator with a default method
//add(int a, int b) and an abstract method multiply(int a, int b). Create a class
//AdvancedCalculator that implements the interface and overrides the abstract method.
interface Calculator {
    default int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b);
}

class AdvancedCalculator implements Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
}

class Program9 {
    public static void main(String[] args) {
        AdvancedCalculator c = new AdvancedCalculator();
        System.out.println("Add: " + c.add(10, 20));
        System.out.println("Multiply: " + c.multiply(10, 20));
    }
}
