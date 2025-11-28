
// Write a Java program to check if two given strings are anagrams of each other.
interface Utils {
    static boolean isNull(Object obj) {
        return obj == null;
    }
}

class Program10 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "Java";
        // Call static method directly using Interface name
        System.out.println("s1 is null? " + Utils.isNull(s1));
        System.out.println("s2 is null? " + Utils.isNull(s2));
    }
}
