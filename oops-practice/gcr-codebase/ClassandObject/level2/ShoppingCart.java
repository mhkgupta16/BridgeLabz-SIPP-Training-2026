class CartItem {

    String itemName;
    double price;
    int quantity;

    CartItem(String itemName,
             double price,
             int quantity) {

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {

        quantity += qty;

        System.out.println(qty + " items added.");
    }

    void removeItem(int qty) {

        if (qty <= quantity) {

            quantity -= qty;

            System.out.println(qty + " items removed.");

        } else {

            System.out.println("Cannot remove more than available quantity.");
        }
    }

    void displayTotalCost() {

        double total = price * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        CartItem item =
                new CartItem(
                        "Laptop",
                        60000,
                        1
                );

        item.addItem(2);

        item.removeItem(1);

        item.displayTotalCost();
    }
}