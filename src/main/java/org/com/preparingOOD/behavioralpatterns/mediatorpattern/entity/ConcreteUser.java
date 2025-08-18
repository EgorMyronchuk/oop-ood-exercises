package org.com.preparingOOD.behavioralpatterns.mediatorpattern.entity;

import org.com.preparingOOD.behavioralpatterns.mediatorpattern.mediatorabstract.ChatMediator;

public class ConcreteUser extends User {


    public ConcreteUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message , this);
    }

    @Override
    public void receive(String message) {
        System.out.printf("User %s отримав: %s\n", name, message);
    }
}
