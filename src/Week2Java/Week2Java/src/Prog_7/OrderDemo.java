package Prog_7;

 enum OrderStatus {

    PLACED("Order has been placed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELLED("Order has been cancelled");

    private String message;

    // Constructor
    OrderStatus(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }
}

public class OrderDemo {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PLACED;

        System.out.println("Status: " + status);
        System.out.println("Message: " + status.getMessage());

        // Changing status
        status = OrderStatus.SHIPPED;

        System.out.println("Status: " + status);
        System.out.println("Message: " + status.getMessage());
    }
}
