//Write a Java program to extract a substring from a given string using the substring() method.
class Program6 {
    public static void main(String[] args) {
        String original = "hello world";
        StringBuffer sb = new StringBuffer(original);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println("Reversed string: " + reversed);
    }
}
