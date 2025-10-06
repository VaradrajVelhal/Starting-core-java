//Write a Java program that takes a student's score as input and assigns a grade
//(A, B, C, D, F) using nested if-else statements.
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score :- ");
        int score = sc.nextInt();
        if (score >= 80 && score <= 100) {
           System.out.println("You got A grade....");
        }else if (score >= 65 && score < 80) {
            System.out.println("You got B grade....");
        }else if (score >= 50 && score < 65) {
            System.out.println("You got C grade....");
        }else if (score >= 35 && score < 50) {
            System.out.println("You got D grade....");
        }else{
            System.out.println("You got F grade....");
        }
    }
}
