//Write a Java program to concatenate two strings using both the + operator and the concat() method.
class Program4 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // using +
        String plus = s1 + ", " + s2 + "!";
        System.out.println("Using + : " + plus);

        // using concat()
        String Concat = s1.concat(", ").concat(s2).concat("!");
        System.out.println("Using concat() : " + Concat);
    }
}
