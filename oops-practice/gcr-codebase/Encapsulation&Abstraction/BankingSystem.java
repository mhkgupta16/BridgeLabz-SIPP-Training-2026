abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber,
                       String holderName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accNo,
                          String name,
                          double balance,
                          double interestRate) {

        super(accNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {

    private double monthlyBonusRate;

    public CurrentAccount(String accNo,
                          String name,
                          double balance,
                          double monthlyBonusRate) {

        super(accNo, name, balance);
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount("S101", "Mahak",
                        50000, 4.5);

        CurrentAccount c1 =
                new CurrentAccount("C101", "Riya",
                        80000, 2);

        s1.deposit(5000);
        s1.withdraw(2000);

        c1.deposit(10000);
        c1.withdraw(5000);

        s1.displayAccountDetails();
        System.out.println("Interest: " +
                s1.calculateInterest());

        System.out.println();

        c1.displayAccountDetails();
        System.out.println("Interest: " +
                c1.calculateInterest());
    }
}
