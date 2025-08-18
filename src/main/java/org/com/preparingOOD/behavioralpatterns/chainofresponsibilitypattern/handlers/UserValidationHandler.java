package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers;

import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.Order;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.OrderHandler;

public class UserValidationHandler extends OrderHandler {
    @Override
    public boolean handleOrder(Order order) {
        if (order.getUserId() == null || order.getUserId().isBlank()) {
            System.out.println("User ID is invalid!");
            return false;
        }
        System.out.println("User ID validation passed.");
        return nextHandler == null || nextHandler.handleOrder(order); // если next есть → прокидываем дальше
    }

}
