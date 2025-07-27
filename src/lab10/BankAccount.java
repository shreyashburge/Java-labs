package lab10;

public class BankAccount {
    String accountHolderName;
    String bankName;
    double accountBalance;

    // Constructor
    BankAccount(String name, String bank, double balance) {
        accountHolderName = name;
        bankName = bank;
        accountBalance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited " + amount + " into " + accountHolderName + "'s account.");
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountHolderName + "'s account.");
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    // Display balance
    void showBalance() {
        System.out.println(accountHolderName + " (" + bankName + ") Balance: " + accountBalance);
    }

    // Main method
    public static void main(String[] args) {
        // Create 3 accounts
        BankAccount acc1 = new BankAccount("Aman", "Axis", 10000);
        BankAccount acc2 = new BankAccount("Bobby", "HDFC", 15000);
        BankAccount acc3 = new BankAccount("Raj", "SBI", 20000);

        // Transactions
        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.showBalance();

        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.showBalance();

        acc3.deposit(500);
        acc3.withdraw(1000);
        acc3.showBalance();
    }
}

