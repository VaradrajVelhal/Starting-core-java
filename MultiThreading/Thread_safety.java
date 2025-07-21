import java.util.Scanner;
class Account{
    int bal;
    boolean isSufficient(int amt){
        if(bal>amt){
            return true;
        }else{
            return false;
        }
    }
    Account(int bal){
        this.bal=bal;
    }
     void withdraw(int amt,String n1){
        bal=bal-amt;
        System.out.println("Withdrawal of rs "+amt +" Is successfull....");
        System.out.println(n1+" Current balance is : "+bal);
    }
}
class Customer implements Runnable{
    Account a1;
    String name;
    Customer(Account a1, String name){
        this.a1=a1;
        this.name=name;
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        synchronized(a1){
        System.out.println(name +" Enter the amount you want to withdraw : ");
        int amt = sc.nextInt();
        if(a1.isSufficient(amt)){
            a1.withdraw(amt,name);
        }else{
            System.out.println("Insufficient balance....");
        }
    }
    
    }
}
public class Thread_safety {
    public static void main(String[] args) {
        Account a1=new Account(5000);
        Customer c1=new Customer(a1,"Amit");
        Customer c2=new Customer(a1,"Sumit");//One account a1 is being accesed by two customers
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();

    }
}
/*
Output Before using Syncronization :-

Amit Enter the amount you want to withdraw :
Sumit Enter the amount you want to withdraw :
2000
5000
Insufficient balance....
Withdrawal of rs 2000 Is successfull....
Sumit Current balance is : 3000

Output after using Syncronization :- 

Sumit Enter the amount you want to withdraw :
2000
Withdrawal of rs 2000 Is successfull....
Sumit Current balance is : 3000
Amit Enter the amount you want to withdraw :
5000
Insufficient balance....
 
*/