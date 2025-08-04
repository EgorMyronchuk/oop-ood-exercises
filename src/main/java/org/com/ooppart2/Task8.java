package org.com.ooppart2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Task8 {
    /**
     *  Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date.
     *  Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number.
     *  Implement methods to calculate delivery time based on the address and update the tracking status.
     **/

    public static class CustomerOrder {
        UUID Id;
        String customerName;
        LocalDateTime orderDate;

        public CustomerOrder(UUID id, String customerName, LocalDateTime orderDate) {
            Id = id;
            this.customerName = customerName;
            this.orderDate = orderDate;
        }

    }

    public static class OnlineOrder extends CustomerOrder {
       String deliveryAddress;
       int trackingNumber;

        public OnlineOrder(UUID id, String customerName, LocalDateTime orderDate, String deliveryAddress, int trackingNumber) {
            super(id, customerName, orderDate);
            this.deliveryAddress = deliveryAddress;
            this.trackingNumber = trackingNumber;
        }

        public int calculateDeliveryTime() {
            return switch (deliveryAddress.toLowerCase()) {
                case "kyiv" -> 2;
                case "lviv" -> 3;
                case "london" -> 7;
                default -> 10;
            };
        }

        public void displayOrderDetails() {
            System.out.println("Order ID: " + Id);
            System.out.println("Customer: " + customerName);
            System.out.println("Order Date: " + orderDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            System.out.println("Delivery Address: " + deliveryAddress);
            System.out.println("Tracking Number: " + trackingNumber);
            System.out.println("Estimated Delivery (days): " + calculateDeliveryTime());
        }

    }

    public static void main(String[] args) {
        UUID orderId = UUID.randomUUID();
        LocalDateTime now = LocalDateTime.now();

        OnlineOrder order = new OnlineOrder(orderId, "Artem Smith", now, "Kyiv", 123456);

        System.out.println("=== Order Created ===");
        order.displayOrderDetails();
    }
}
