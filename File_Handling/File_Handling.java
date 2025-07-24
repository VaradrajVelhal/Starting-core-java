

public class File_Handling {
   /* 
    What is File Handling?

File handling means:

    Reading from or writing to files (like .txt, .csv, etc.) using Java code.

This allows your program to store data or retrieve data from files on your computer.

Why is it useful?

You can:

    Save user data (e.g. a score, settings)

    Read data from a file (e.g. student list)

    Write logs, results, and more

           Java Classes Used:
Class                               Purpose
	                                
File	                          To create or get file info
FileWriter	                      To write to a file
FileReader	                      To read from a file
BufferedReader	                  To read line by line
BufferedWriter	                  To write efficiently
Scanner	                          To read file easily

Example: Writing to a File

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

 Example: Reading from a File

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

 Always use try-catch:

Because file operations may fail (like file not found), Java forces you to handle exceptions using try-catch.
 Summary:

    Use FileWriter to write

    Use FileReader or Scanner to read

    Handle exceptions like IOException or FileNotFoundException
*/
}
