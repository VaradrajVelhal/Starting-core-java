// Write a Java program to demonstrate try-with-resources by reading from a
//file using BufferedReader. Ensure that the resource is closed
//automatically, even if an exception occurs.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program10 {
    public static void main(String[] args) {
        // The resource (BufferedReader) is declared INSIDE the try parentheses
        // It will be closed automatically when the block ends
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}