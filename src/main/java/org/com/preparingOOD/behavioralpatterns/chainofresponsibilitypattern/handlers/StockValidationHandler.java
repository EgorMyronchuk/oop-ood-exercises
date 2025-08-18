package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers;

import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.Order;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.OrderHandler;

public class StockValidationHandler extends OrderHandler {
    @Override
    public boolean handleOrder(Order order) {
        if (order.getQuantity() <= 0) {
            System.out.println("Sorry we don`t have enough stock");
            return false;
        }
        System.out.println("Stock validate passed");
        return nextHandler == null || nextHandler.handleOrder(order);
    }
}
