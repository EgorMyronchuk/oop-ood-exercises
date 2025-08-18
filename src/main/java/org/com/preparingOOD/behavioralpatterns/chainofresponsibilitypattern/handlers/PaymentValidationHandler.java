package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers;

import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.Order;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.OrderHandler;

public class PaymentValidationHandler extends OrderHandler {
    @Override
    public boolean handleOrder(Order order) {
        if(!order.isPaid()) {
            System.out.println("Payment failed");
            return false;
        }
        System.out.println("Payment successful");
        return nextHandler == null || nextHandler.handleOrder(order);
    }
}
