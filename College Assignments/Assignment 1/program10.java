// Write a Java program to display the multiplication table for a given number using a while loop.

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;

        System.out.println("Enter a Number :- ");
        int num = sc.nextInt();
        
        while (i <= 10) {
            System.out.println(num +" * "+ i +" = "+ (num * i));
            i++;
        }
    }
}
