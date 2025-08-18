package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern;

public class Order {

    private String userId;
    private boolean isPaid;
    private int quantity;
    private double totalPrice;

    public Order(String userId, boolean isPaid, int quantity, double totalPrice) {
        this.userId = userId;
        this.isPaid = isPaid;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{userId='%s', isPaid=%s, quantity=%d, totalPrice=%s}".formatted(userId, isPaid, quantity, totalPrice);
    }
}
