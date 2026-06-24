/*A hospital billing system must never crash. Wrap division-by-zero
(bills with zero items), array out-of-bounds (invalid patient index),
and number format exceptions (bad input) with meaningful
messages. Create a custom InsufficientFundsException for payment
failures. */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {

    static void makePayment(double bill, double amount)
            throws InsufficientFundsException {

        if (amount < bill) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment Successful.");
    }

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int totalBill = 1000;
            int items = 0;

            int costPerItem = totalBill / items;

            System.out.println(costPerItem);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            String[] patients = {"Ram", "Shyam", "Mohan"};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        // 3. NumberFormatException
        try {
            String input = "ABC";

            int amount = Integer.parseInt(input);

            System.out.println(amount);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        // 4. Custom Exception
        try {
            makePayment(5000, 3000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}