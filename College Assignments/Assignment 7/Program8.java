// Write a Java program that uses the throws keyword to declare that a
//method may throw a FileNotFoundException. Read from a file that may
//not exist and handle the potential exception in the calling method.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program8 {
    static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("missing_file.txt");
    }

    public static void main(String[] args) {
        try {
            readFile(); // Must handle the declared exception here
        } catch (FileNotFoundException e) {
            System.out.println("Exception handled: File not found");
        }
    }
}
