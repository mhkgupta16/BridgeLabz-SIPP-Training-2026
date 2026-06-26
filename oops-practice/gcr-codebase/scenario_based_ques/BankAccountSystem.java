class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Overdraft! Insufficient balance.");
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Mahak", 10000);
        BankAccount a2 = new BankAccount(102, "Riya", 15000);
        BankAccount a3 = new BankAccount(103, "Aman", 20000);

        // 5 transactions each
        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(3000);
        a1.deposit(1500);

        a2.deposit(500);
        a2.withdraw(1000);
        a2.deposit(2500);
        a2.withdraw(4000);
        a2.deposit(1200);

        a3.deposit(3000);
        a3.withdraw(2000);
        a3.deposit(1000);
        a3.withdraw(5000);
        a3.deposit(800);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.totalAccounts);
    }
}