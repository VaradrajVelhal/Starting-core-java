//Write a Java program to demonstrate nested try-catch blocks. Use nested
//blocks to catch ArithmeticException and ArrayIndexOutOfBoundsException.
public class Program3 {
    public static void main(String[] args) {
        try {
            try {
                int x = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Div by 0");
            }
            int[] a = new int[5];
            a[10] = 50; // Array Index Error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error");
        }
    }
}
