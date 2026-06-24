
/*
1.  The Coffee Counter Chronicles ☕
Ravi runs a café. Each customer orders different coffee types with quantities. Write a program that:
●              Asks for coffee type (switch)
●              Calculates total bill (price * quantity)
●              Adds GST using arithmetic operators
 
Use while to continue for the next customer and break when "exit" is typed.
*/
import java.util.*;

public class CoffeeCounterChronicles {
  public static double Price(int choice) {
    switch (choice) {
      case 1:
        return 100;
      case 2:
        return 140;
      case 3:
        return 180;
      default:
        return 0;
    }
  }

  public static double totalBill(double price, int quantity) {
    return price * quantity;
  }

  public static double gstBill(double bill) {
    return bill + (bill * 18 / 100);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {

      System.out.println("\n1. Espresso");
      System.out.println("2. Cappuccino");
      System.out.println("3. Latte");
      System.out.println("Type 0 to Exit");

      System.out.print("Enter Coffee Choice: ");
      int choice = sc.nextInt();
      if (choice == 0) {
        break;
      }
      System.out.print("Enter Quantity: ");
      int quantity = sc.nextInt();

      double price = Price(choice);

      if (price == 0) {
        System.out.println("Invalid Coffee Choice");
        continue;
      }

      double bill = totalBill(price, quantity);
      double finalBill = gstBill(bill);

      System.out.println("Bill Before GST: ₹" + bill);
      System.out.println("Final Bill After GST: ₹" + finalBill);
    }

    System.out.println("Thank You! Visit Again.");
    sc.close();

  }
}
