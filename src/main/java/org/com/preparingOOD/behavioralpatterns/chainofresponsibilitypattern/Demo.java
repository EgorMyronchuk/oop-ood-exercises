package org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern;

import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers.DeliveryLimitHandler;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers.PaymentValidationHandler;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers.StockValidationHandler;
import org.com.preparingOOD.behavioralpatterns.chainofresponsibilitypattern.handlers.UserValidationHandler;

public class Demo {

    public static void main(String[] args) {
        UserValidationHandler userHandler = new UserValidationHandler();
        StockValidationHandler stockHandler = new StockValidationHandler();
        PaymentValidationHandler paymentHandler = new PaymentValidationHandler();
        DeliveryLimitHandler deliveryHandler = new DeliveryLimitHandler();


        userHandler.setNextHandler(stockHandler);
        stockHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(deliveryHandler);

        OrderHandler chain = userHandler;

        Order order1 = new Order("", true, 5, 60);
        processOrder(order1, chain);

        Order order2 = new Order("user123", false, 3, 70);
        processOrder(order2, chain);

        Order order3 = new Order("user456", true, 0, 80);
        processOrder(order3, chain);

        Order order4 = new Order("user789", true, 10, 100);
        processOrder(order4, chain);
    }

    private static void processOrder(Order order, OrderHandler chain) {
        System.out.println("\nProcessing order: " + order);
        boolean result = chain.handleOrder(order);
        if (result) {
            System.out.println("!!! Order processed successfully.");
        } else {
            System.out.println("!!! Order failed validation.");
        }
    }

}
