import java.io.IOException;

public class ThrowsEX {
    public static void main(String[] args) throws IOException {
        // throws keyword is used to tell compiler in advance that an exception is coming at runtime
        System.out.println("hello");
        throw new IOException(); // Output without using throws keyword the program will not compile :-
        //error: unreported exception IOException; must be caught or declared to be thrown
        //After using throws keyword the program will compile and the exception will be caught by java.

        //Atfer using throws keyword Output :-
        // hello
        // Exception in thread "main" java.io.IOException
        
    }
}
