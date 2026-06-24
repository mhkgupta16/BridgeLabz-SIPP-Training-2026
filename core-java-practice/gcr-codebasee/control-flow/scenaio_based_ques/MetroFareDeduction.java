/* 1.   Metro Smart Card Fare Deduction 🚇
In Delhi Metro, fare varies by distance.
●  Ask the user for distance.
●  Calculate fare using ternary operator.
●  Deduct from smart card balance.
Loop until balance is exhausted or the user quits.

 */


import java.util.Scanner;
public class MetroFareDeduction{
     public static double calculateFare(double d) {
        return (d >= 5) ? 10 : (d >= 15) ? 20 : 30;
    }

    public static double deductFare(double smartCard, double fare) {
        return smartCard - fare;
    }

    public static void displayBalance(double fare, double smartCard) {
        System.out.println("fare deducted " + fare);
        System.out.println("Remaining balance: " + smartCard);
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double d= sc.nextDouble();
    double fare=sc.nextDouble();
    double smartCard=sc.nextDouble();

  while(smartCard>0){
    fare=(d>=5)?10:(d>=15)? 20:30;
    if(smartCard>=fare){
      smartCard-=fare;
      System.out.println("fare dedcuted" + fare);
      System.out.println("Remaining balance: " + smartCard);
    }
  
  else{
    System.out.println("Insufficient balance. Please recharge your smart card.");
    break;
  }
  }
     System.out.println("Thank you for using Metro Smart Card.");
        sc.close();
  }
}