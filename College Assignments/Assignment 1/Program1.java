//Write a Java program to check whether a given number is even or odd using an
//if-else statement.
import java.util.Scanner;
class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("The number is Even....");
        }else{
            System.out.println("The Number is Odd....");
        }
    }
}