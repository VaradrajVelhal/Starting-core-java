//Write a Java program to reverse a string using a StringBuffer and the reverse() method.
class Program5 {
    public static void main(String[] args) {

        String original = "hello world";
        StringBuffer sb = new StringBuffer(original);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
    }
}
