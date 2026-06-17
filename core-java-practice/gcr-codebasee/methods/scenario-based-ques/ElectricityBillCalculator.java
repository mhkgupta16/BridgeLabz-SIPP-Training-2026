import java.util.Scanner;

public class ElectricityBillCalculator {

    public static int getUnitsConsumed() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units Consumed: ");
        return sc.nextInt();
    }

    public static double calculateBill(int unitsConsumed) {

        double ratePerUnit = 8.0;

        return unitsConsumed * ratePerUnit;
    }

    public static void displayBill(int unitsConsumed,
                                   double billAmount) {

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + unitsConsumed);
        System.out.println("Bill Amount    : ₹" + billAmount);
    }

    public static void main(String[] args) {

        int unitsConsumed = getUnitsConsumed();

        double billAmount =
                calculateBill(unitsConsumed);

        displayBill(unitsConsumed, billAmount);
    }
}