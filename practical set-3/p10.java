/*
Design a class BankAccount with account_holder_name and balance. 
Use a static variable interest_rate (same for all accounts). 
Include methods to calculate and display the interest earned. 
Update interest rate using a static method.
*/

class BankAccount {
    String accountHolderName;
    double balance;
    static double interestRate = 5.0;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance : " + balance);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.printf("Interest Earned : %.2f\n", calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}

public class p10 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Priya", 15000);

        System.out.println("Before updating interest rate :\n");
        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        BankAccount.updateInterestRate(6.5);

        System.out.println("\nAfter updating interest rate :\n");
        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
    }
}
