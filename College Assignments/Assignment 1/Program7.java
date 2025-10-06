//Write a Java program to calculate the sum of the digits of a given number using a while loop.

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number :- ");
        int num = sc.nextInt();

        int rem = 0;
        int sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("Sum of digits is :- " + sum);
    }
}
