
public class ExceptionHandling {
    /*
    What is Exception Handling?

Exception Handling in Java means:

    Catching and handling errors (called exceptions) so that the program doesn’t crash.


 What is an Exception?

An exception is an unexpected event or error that happens while the program is running.
For example:

     Dividing a number by zero

     Trying to open a file that doesn't exist

     Accessing an invalid array index


 Why handle exceptions?

Without handling:

int a = 10 / 0; // Program crashes here
System.out.println("Hello"); // This line never runs

With handling:

try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
System.out.println("Hello"); // Now this runs too!



 Basic Keywords:

Keyword	                   Use

try          	Block of code where exception might occur
catch	        Block that handles the exception
finally     	Block that always runs (cleanup code)
throw	        Manually throw an exception
throws	        Declares that a method might throw an exception


Simple Example:

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This always runs");
        }
    }
}

 Output:

Error: / by zero  
This always runs



 Types of Exceptions:

    Checked (compile-time): FileNotFoundException, IOException

    Unchecked (runtime): ArithmeticException, NullPointerException
*/
}
