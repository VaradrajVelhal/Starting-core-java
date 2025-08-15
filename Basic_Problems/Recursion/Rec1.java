//WAP to print numbers from 1 to 10.

public class Rec1 {
    public static void nums(int n){
        if (n>10) {
            return ;
        }
        System.out.println(n);
        nums(n+1);
    }
    public static void main(String[] args) {
        nums(0);
    }
}
