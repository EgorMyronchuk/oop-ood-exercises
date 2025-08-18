package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers;

import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.Order;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.OrderHandler;

public class DeliveryLimitHandler extends OrderHandler {
    @Override
    public boolean handleOrder(Order order) {
        if (order.getTotalPrice() < 50) {
            System.out.println("You don`t have enough money");
            return false;
        }
        System.out.println("Delivery limit passed");
        return nextHandler == null || nextHandler.handleOrder(order);
    }
}
