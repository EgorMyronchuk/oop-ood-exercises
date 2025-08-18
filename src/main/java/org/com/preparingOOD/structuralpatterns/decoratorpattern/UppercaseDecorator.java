package org.com.preparingOOD.structuralpatterns.decoratorpattern;

public class UppercaseDecorator extends MessageDecorator{

    public UppercaseDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return super.getContent().toUpperCase();
    }
}
