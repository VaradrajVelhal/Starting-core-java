//Write a Java program to handle multiple exceptions in a single catch block (using Java 7 and above feature). Handle NumberFormatException and ArithmeticException in the same catch block.
public class Program6 {
    public static void main(String[] args) {
        try {

            int a = Integer.parseInt("abc"); // Throws NumberFormatException
            // int b = 10 / 0; // Throws ArithmeticException
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Caught: " + e);
        }
    }
}
