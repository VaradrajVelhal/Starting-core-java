//Write a Java program to create a class BankAccount with private attributes accountNumber,balance,and accountHolderName.Use setters to validate input data(e.g.,balance cannot be negative)before updating the attributes.
class BankAccount {
    private String accountNumber, accountHolderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(String n) {
        if (n != null && !n.trim().isEmpty())
            this.accountNumber = n;
    }

    public void setAccountHolderName(String n) {
        if (n != null && !n.trim().isEmpty())
            this.accountHolderName = n;
    }

    public void setBalance(double b) {
        if (b >= 0)
            this.balance = b;
    }

}

public class Program10 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("ACC-123");
        acc.setAccountHolderName("Alice");
        acc.setBalance(5000);

        System.out.println(acc.getAccountHolderName() + ": " + acc.getBalance());

        acc.setBalance(-100); // Invalid, won't update
        System.out.println("Balance remains: " + acc.getBalance());
    }
}
