import java.util.Scanner;

public class DeliveryChargeSystem {

    public static double calculateCharge(
            int distance) {

        return distance * 5;
    }

    public static double calculateCharge(
            int distance,
            int weight) {

        return (distance * 5) +
                (weight * 2);
    }

    public static double calculateCharge(
            int distance,
            int weight,
            boolean expressDelivery) {

        double charge =
                (distance * 5) +
                (weight * 2);

        if (expressDelivery) {
            charge += 100;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        int weight = sc.nextInt();

        System.out.print(
                "Express Delivery (true/false): ");

        boolean expressDelivery =
                sc.nextBoolean();

        System.out.println(
                "\nCharge (Distance Only) = ₹" +
                calculateCharge(distance));

        System.out.println(
                "Charge (Distance + Weight) = ₹" +
                calculateCharge(distance, weight));

        System.out.println(
                "Charge (Full Details) = ₹" +
                calculateCharge(
                        distance,
                        weight,
                        expressDelivery));
    }
}