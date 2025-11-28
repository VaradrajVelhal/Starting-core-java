
// Write a Java program that takes two integers as input and divides them.
// Handle any potential ArithmeticException (such as division by zero) using a
// try-catch block.
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter 1st: ");
            int a = s.nextInt();
            System.out.print("Enter 2nd: ");
            int b = s.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
    }
}