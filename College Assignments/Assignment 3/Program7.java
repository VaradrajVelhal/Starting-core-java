//Write a Java program to replace all occurrences of a specific character in a string with another character using the replace() method.
class Program7 {
    public static void main(String[] args) {

        String str = "banana";

        // replace all occurrences of 'a' with 'o'
        String newStr = str.replace('a', 'o');

        System.out.println("Replaced 'a' with 'o': " + newStr);

    }
}
