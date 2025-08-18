package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern;

public abstract class OrderHandler {
    public OrderHandler nextHandler;

    public OrderHandler setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public abstract boolean handleOrder(Order order);
}
