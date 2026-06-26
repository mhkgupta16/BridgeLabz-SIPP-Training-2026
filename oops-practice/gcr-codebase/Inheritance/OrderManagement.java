class Order {

    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(String orderId,
                 String orderDate,
                 String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(String orderId,
                   String orderDate,
                   String trackingNumber,
                   String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagement {

    public static void main(String[] args) {

        Order o1 = new Order("O101", "26-06-2026");

        ShippedOrder o2 = new ShippedOrder(
                "O102",
                "26-06-2026",
                "TRK567"
        );

        DeliveredOrder o3 = new DeliveredOrder(
                "O103",
                "26-06-2026",
                "TRK890",
                "28-06-2026"
        );

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}