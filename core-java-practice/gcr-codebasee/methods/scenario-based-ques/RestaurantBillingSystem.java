import java.util.Scanner;

public class RestaurantBillingSystem {

    public static double calculateFoodCost(
            double foodPrice,
            int quantity) {

        return foodPrice * quantity;
    }

    public static double calculateGST(
            double foodCost) {

        double gstRate = 0.18;

        return foodCost * gstRate;
    }

    public static double calculateDiscount(
            double foodCost) {

        double discountRate = 0.10;

        return foodCost * discountRate;
    }

    public static double generateFinalBill(
            double foodCost,
            double gst,
            double discount) {

        return foodCost + gst - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Food Price: ");
        double foodPrice = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double foodCost =
                calculateFoodCost(foodPrice, quantity);

        double gst =
                calculateGST(foodCost);

        double discount =
                calculateDiscount(foodCost);

        double finalBill =
                generateFinalBill(
                        foodCost,
                        gst,
                        discount);

        System.out.println("\nFood Cost = ₹" + foodCost);
        System.out.println("GST = ₹" + gst);
        System.out.println("Discount = ₹" + discount);
        System.out.println("Final Bill = ₹" + finalBill);
    }
}