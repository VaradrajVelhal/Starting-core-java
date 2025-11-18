//Write a Java program to check if a given string is a palindrome using both String and StringBuffer.
class Program3 {
    public static void main(String[] args) {

        String str1 = "madam";
        System.out.println("Using String method: " + isPalindromeString(str1));
        System.out.println("Using StringBuffer method: " + isPalindromeStringBuffer(str1));
    }

    public static boolean isPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromeStringBuffer(String str) {
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}
