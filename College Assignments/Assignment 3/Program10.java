
// Write a Java program to check if two given strings are anagrams of each other.
import java.util.Arrays;

class Program10 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean result = Arrays.equals(charArray1, charArray2);

        System.out.println("str1 and str2 are anagram ?" + result);
    }
}
