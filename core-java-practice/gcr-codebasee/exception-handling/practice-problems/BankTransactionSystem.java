import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {

            throw new IllegalArgumentException(
                    "Invalid amount!");
        }

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful, new balance: "
                        + balance);
    }
}

public class BankTransactionSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account =
                new BankAccount(5000);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}