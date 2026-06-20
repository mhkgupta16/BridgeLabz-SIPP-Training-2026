/*2. Warehouse Stock Recovery System 
A warehouse stores the stock count of products in an array. Due to a software glitch, exactly one product's stock value has become 0.
Write a program that:
Accepts stock quantities for N products.
Identifies the position where stock became 0.
Finds the average stock of all non-zero products.
Replaces the missing stock with the average value.
Displays the updated inventory.
 */

import java.util.*;
public class WarehouseStockRecovery{
  static void recover(int stock[]){
    int sum=0;
    int count=0;
    int pos=-1;

   for (int i = 0; i < stock.length; i++) {

            if (stock[i] == 0) {
                pos = i;
            } else {
                sum += stock[i];
                count++;
            }
        }

        int avg = sum / count;

        stock[pos] = avg;

        System.out.println("Missing stock found at position: " + pos);
        System.out.println("Average Stock = " + avg);

        System.out.println("Updated Inventory:");

        for (int s : stock) {
            System.out.print(s + " ");
        }
    }

    
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int stock[] = new int[n];

        System.out.println("Enter stock quantities:");

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        recover(stock);
  }
}
