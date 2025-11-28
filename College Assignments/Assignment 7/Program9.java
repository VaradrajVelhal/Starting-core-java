//Write a Java program to demonstrate handling of checked exceptions by
//reading a file using FileReader. Use try-catch blocks to handle IOException.

import java.io.FileReader;
import java.io.IOException;

public class Program9 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("missing_file.txt");

            // Reading might throw IOException
            System.out.println((char) file.read());

            file.close();
        } catch (IOException e) {
            System.out.println("Handled checked exception: " + e);
        }
    }
}
