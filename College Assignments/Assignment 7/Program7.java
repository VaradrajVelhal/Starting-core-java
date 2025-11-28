//Write a Java program to demonstrate the use of the throw keyword to explicitly throw an exception. Throw an IllegalArgumentException if the user inputs a negative number.

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter positive num: ");
        int n = s.nextInt();

        if (n < 0) {
            // throwing an exception
            throw new IllegalArgumentException("Number cannot be negative");
        }

        System.out.println("Valid input: " + n);
    }
}
