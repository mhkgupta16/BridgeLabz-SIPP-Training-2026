/* Design a simple BankAccount class that models real-world banking behavior. Each account should store basic details like account number, holder name, and balance.

You will implement methods to deposit and withdraw money, ensuring that withdrawals don't exceed the available balance. The class should also keep track of how many accounts have been created using a static variable. Finally, create multiple accounts and simulate transactions to observe how the system behaves.

Key Points

Create a class with accountNumber, holder, and balance

Implement deposit() and withdraw() with proper balance checks

Add getStatement() to display account details

Use a static variable to count total accounts created

Create 3 accounts and perform 5 transactions on each
 */

import java.util.*;
public class BankAccount{
  private int accountNo;
  private String holderName;
  private double balance;
  private static int totalAccount;

  public class BankAccount(int accountNo, String holderName, double balance){
    this.accountNo=accoutNo;
    this.holderName=holderName;
    this.balance=balance;
    totalAccount++;
  }
  public void deposit(int amount){
    if(amount>0){
      balance+=amount;
    }
    else{
      System.out.println("not valid");
    }
  }
  public void withdraw(int amount){
    if(amount>0&&amount<=balance){
      balance-=amount;
    }
    else{
      System.out.println("not sufficient balacne");
    }
  }
  public void getStatement(){
    System.out.println(accountNo);
    System.out.println(holderName);
    System.out.println(balance);
  }
  public static int getTotalAccount(){
    return totalAccounts;
  }
  


}
