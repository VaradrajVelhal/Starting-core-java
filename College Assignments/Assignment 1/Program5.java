//Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding operation using a switch statement. 

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number :- ");
        int n1 = sc.nextInt();

        System.out.println("Enter 1st number :- ");
        int n2 = sc.nextInt();

        System.out.println("Enter Operation which you want to perform (+, -, *, /)  ");
        char op = sc.next().charAt(0);

        switch (op) {
                case '+':
                System.out.println("Addition of Two numbers is :-  " + (n1+n2));
                break;

                case '-':
                System.out.println("Subtraction of Two numbers is :-  " + (n1-n2));
                break;

                case '*':
                System.out.println("Multiplication of two numbers is :- " + (n1*n2));
                break;

                case '/':
                System.out.println("Division of Two numbers is :-  " + (n1/n2));
                break;
            default:
                System.out.println("Wrong Input....");
                break;
        }
    }
}
