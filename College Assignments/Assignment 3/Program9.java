//Write a Java program to split a string into an array of substrings using a delimiter with the split() method.
class Program9 {
    public static void main(String[] args) {

        String str = "mango,banana,apple,pineapple";

        String[] fruits = str.split(",");

        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
