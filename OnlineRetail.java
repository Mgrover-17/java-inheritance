class Order{
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public String getOrderStatus(){
        return "order placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order{
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        System.out.println("calling shippedOrder constructor");
        this.trackingNumber=trackingNumber;
    }

    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        System.out.println("calling deliveredOrder constructor");
        this.deliveryDate=deliveryDate;
    }

    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery date: " + deliveryDate);
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-03-15");
        order.displayOrderDetails();
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-03-14", "TRK98765");
        shippedOrder.displayOrderDetails();
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-03-13", "TRK12345", "2025-03-16");
        deliveredOrder.displayOrderDetails();
    }



}
