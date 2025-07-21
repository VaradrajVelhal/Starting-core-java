import java.util.Scanner;

//Throwing custom exception using throw keyword
 
public class Exception_HEX2 {
    public static void main(String[] args) {
        int bal = 10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw....");
        int amt=sc.nextInt();
        try{
        if(amt>bal){
            throw new ArithmeticException("Insufficient balance");
        }else{
            bal=bal-amt;
            System.out.println("Transaction sucessful...");
            System.out.println("Remaining balance is: "+bal);
        }
       }catch(ArithmeticException e){
        System.out.println(e);
       }
    }
}
