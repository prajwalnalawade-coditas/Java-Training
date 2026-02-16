package prog_4;

class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Inner Class
    class Transaction {

        // Deposit method
        public void deposit(double amount) {
            balance += amount;   // accessing private variable
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;   // accessing private variable
                System.out.println("Withdrawn: " + amount);
                System.out.println("Current Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}

public class a {

    public static void main(String[] args) {

        // Create outer class object
        BankAccount account = new BankAccount(5000);

        // Create inner class object
        BankAccount.Transaction transaction = account.new Transaction();

        transaction.deposit(1000);
        transaction.withdraw(2000);
        transaction.withdraw(6000);
    }
}
