package lab8;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance! Withdrawal denied.");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Starting with ₹1000

        try {
            System.out.println("Your current balance: ₹" + account.getBalance());

            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = sc.nextDouble();
            account.withdraw(withdrawalAmount);

            System.out.println("Your final balance: ₹" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Transaction error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

