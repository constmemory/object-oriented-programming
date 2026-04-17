/*
Define a base class BankAccount with common attributes like accountNumber, accountHolderName, and
balance. Then, define two subclasses : SavingAccount and FixedDepositAccount, which inherit from
BankAccount. Implement basic operationslike openAccount(), deposit(), checkBalance(), and withdraw()
in BankAccount. The SavingAccount should include a calculateInterest() method specific to savings
accounts, and FixedDepositAccount should have a maturityAmount() method considering fixed deposit terms.
*/

import java.util.*;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited : " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn : " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.printf("Current Balance : %.2f\n", balance);
    }
}

class SavingAccount extends BankAccount {

    double calculateInterest() {
        double rate = 4.0;
        return (balance * rate) / 100;
    }
}

class FixedDepositAccount extends BankAccount {

    double maturityAmount(int years) {
        double rate = 6.5;
        return balance + (balance * rate * years / 100);
    }
}

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();

        System.out.print("Enter account number : ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name : ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance : ");
        double balance = sc.nextDouble();

        sa.openAccount(accNo, name, balance);

        sa.deposit(1000);
        sa.withdraw(500);
        sa.checkBalance();

        System.out.printf("Interest earned (Saving Account) : %.2f\n",
                sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "FD Holder", 20000);

        System.out.print("\nEnter FD duration (years) : ");
        int years = sc.nextInt();

        System.out.printf("Maturity Amount : %.2f",
                fd.maturityAmount(years));

        sc.close();
    }
}
