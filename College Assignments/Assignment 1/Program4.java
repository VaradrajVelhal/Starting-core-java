//Write a Java program to find the largest of three numbers using nested if-else statements.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number :- ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd Number :- ");
        int n2 = sc.nextInt();

        System.out.println("Enter 3rd Number :- ");
        int n3 = sc.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("All numbers are equal....");
        }else if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largest....");
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " is Largest....");
        }else {
            System.out.println(n3 + " is Largest....");
        }
    }
}
