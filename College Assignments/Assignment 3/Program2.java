//Write a Java program to count the frequency of each character in a string.
class Program2 {
    public static void main(String[] args) {

        String str = "hello world";

        // assuming ASCII (256 characters)
        int[] count = new int[256];

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            count[c]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("'" + (char) i + "': " + count[i]);
            }
        }
    }
}
