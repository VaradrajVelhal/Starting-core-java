//Write a Java program to count the number of vowels and consonants in a string.
class Program8 {
    public static void main(String[] args) {

        String str = "Hello World!";
        int vowels = 0;
        int consonants = 0;
        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
