package org.com.preparingOOD.structuralpatterns.decoratorpattern;

public abstract class MessageDecorator implements Message{
    Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent();
    }
}
