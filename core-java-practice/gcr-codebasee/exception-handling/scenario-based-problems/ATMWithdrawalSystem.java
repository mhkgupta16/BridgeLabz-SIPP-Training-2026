public class ATMWithdrawalSystem {

  static void withdraw(double balance, double amount)
      throws InsufficientBalanceException {

    if (amount > balance) {

      throw new InsufficientBalanceException(
          balance,
          amount);
    }

    System.out.println(
        "Withdrawal successful. Remaining balance = "
            + (balance - amount));
  }

  public static void main(String[] args) {

    double balance = 5000;
    double request = 8000;

    try {

      withdraw(balance, request);

    } catch (InsufficientBalanceException e) {

      System.out.println(e.getMessage());
      System.out.println("Available Balance: ₹"
          + e.getBalance());

      System.out.println("Requested Amount: ₹"
          + request);
    }
  }
}

class InsufficientBalanceException extends Exception {
  private double balance;
  private double amount;

  InsufficientBalanceException(double balance, double amount) {
    super("Insufficient balance: available " + balance + ", requested " + amount);
    this.balance = balance;
    this.amount = amount;
  }

  public double getBalance() {
    return balance;
  }

  public double getAmount() {
    return amount;
  }
}