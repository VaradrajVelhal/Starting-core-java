//Create a function to print 10  to  0
public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello World");
        print0(9);
    }
    static int print0(int ten){
        if (ten < 10) {
            return ten;
        }
        System.out.println(ten);
        return print0(ten - 1);
    }
}
