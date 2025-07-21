import java.util.Scanner;

class Account {
    int bal;

    Account(int bal) {
        this.bal = bal;
    }

    // Synchronized method to ensure thread safety
    synchronized void withdraw(int amt, String n1) {
        if (bal >= amt) {
            bal = bal - amt;
            System.out.println("Withdrawal of Rs " + amt + " is successful by " + n1);
            System.out.println(n1 + "'s Current balance is: " + bal);
        } else {
            System.out.println("Insufficient balance for " + n1);
        }
    }
}

class Customer implements Runnable {
    Account a1;
    String name;

    Customer(Account a1, String name) {
        this.a1 = a1;
        this.name = name;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(name + ", enter the amount you want to withdraw: ");
        int amt = sc.nextInt();

        // Withdraw logic is synchronized inside Account
        a1.withdraw(amt, name);
    }
}

public class Thread_safety {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Amit");
        Customer c2 = new Customer(a1, "Sumit");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
