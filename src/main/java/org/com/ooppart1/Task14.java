package org.com.ooppart1;

/**
 * Create a class BankAccount with members AcctNo, balance, and AcctType. Implement the following operations:
 *   - Deposit an amount of 10,000.
 *   - Withdraw an amount of 5,000.
 *   - Display account details.
**/
public class Task14 {

    public static class BankAccount {
        int AcctNo;
        double balance;
        String AcctType;

        public BankAccount(int acctNo, double balance, String acctType) {
            AcctNo = acctNo;
            this.balance = balance;
            AcctType = acctType;
        }

        public void deposit (double amount) {
            this.balance += amount;
            System.out.println("Deposited successfully");
        }
        public void withdraw (double amount) {
            if (amount < this.balance) {
                this.balance -= amount;
                System.out.println("Withdrawn successfully");
                return;
            }
            System.out.println("Insufficient Funds");
        }
        public void showBalance () {
            System.out.printf( "Balance: %.2f\n", this.balance );
        }
    }


    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(1234, 1000, "Bank Account");
        acct1.showBalance();
        acct1.deposit(500);
        acct1.showBalance();
        acct1.withdraw(15000);
        acct1.withdraw(150);
        acct1.showBalance();
    }

}


