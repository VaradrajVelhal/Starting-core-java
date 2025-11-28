//Write a Java program to demonstrate multiple catch blocks. Handle both
//ArrayIndexOutOfBoundsException and NullPointerException in the program.

public class Program2 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[10] = 50;

            String s = null;
            System.out.println(s.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error");
        }
    }
}
