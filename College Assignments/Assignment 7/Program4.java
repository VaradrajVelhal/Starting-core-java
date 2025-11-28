//Write a Java program that demonstrates the use of the finally block.
//Include a finally block to close a Scanner object after reading input from
//the user, regardless of whether an exception occurs.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter num: ");
            int n = s.nextInt();
            System.out.println("Result: " + (10 / n));
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            s.close();
            System.out.println("Scanner closed");
        }
    }
}
