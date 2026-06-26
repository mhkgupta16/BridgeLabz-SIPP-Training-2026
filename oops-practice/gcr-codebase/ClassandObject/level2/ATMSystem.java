class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String accountHolder,
                long accountNumber,
                double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {

        balance += amount;

        System.out.println("₹" + amount + " deposited.");
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("₹" + amount + " withdrawn.");

        } else {

            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {

        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMSystem {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount(
                        "Mahak",
                        1234567890L,
                        10000
                );

        account.displayBalance();

        account.deposit(2000);

        account.withdraw(5000);

        account.displayBalance();
    }
}
