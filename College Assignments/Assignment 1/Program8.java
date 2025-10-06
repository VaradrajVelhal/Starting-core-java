//Write a Java program to print the first N numbers in the Fibonacci series using a for loop.
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms :- ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("The first " + n + " numbers of the Fibonacci series are:-");

        for (int i = 1; i <= n; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

