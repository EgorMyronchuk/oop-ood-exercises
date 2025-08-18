package org.com.preparingOOD.behavioralpatterns.mediatorpattern.entity;

import org.com.preparingOOD.behavioralpatterns.mediatorpattern.mediatorabstract.ChatMediator;

public abstract class User {
    String name;
    ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
