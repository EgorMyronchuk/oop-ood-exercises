package org.com.ooppart2;

import java.util.LinkedList;

public class Task1 {
    /**
     * Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance.
     * Include methods for depositing and withdrawing money, as well as checking the balance.
     * Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.
     **/

    public static class BankAccount {
        int accountNumber;
        String accountHolderName;
        double balance;

        public BankAccount(int accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            this.balance += amount;
            System.out.println("Deposited successfully");
        }

        public void withdraw(double amount) {
            if (amount < this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawn successfully");
                return;
            }
            System.out.println("Insufficient Funds");
        }
    }

    public static final class SavingsAccount extends BankAccount {
        final double interestRate;

        public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
            super(accountNumber, accountHolderName, balance);
            this.interestRate = 0.05;
        }

        public void makeInterestRate() {
            this.balance += this.balance * interestRate;
            System.out.println("Interest has been applied to your bank account.");
        }
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1234, "John Smith", 55_000);
        SavingsAccount savingsAccount1 = new SavingsAccount(132, "Sergei Smith", 15_000);
        SavingsAccount savingsAccount2 = new SavingsAccount(154, "Lev Smith", 1000);

        System.out.printf("sa1 %.2f , sa2 %.2f , sa3 %.2f\n", savingsAccount.balance, savingsAccount1.balance, savingsAccount2.balance);
        savingsAccount.makeInterestRate();
        savingsAccount1.makeInterestRate();
        savingsAccount2.makeInterestRate();
        System.out.printf("sa1 %.2f , sa2 %.2f , sa3 %.2f", savingsAccount.balance, savingsAccount1.balance, savingsAccount2.balance);
    }

}
