package org.com.preparingOOD.structuralpatterns.decoratorpattern;

public class PlainMessage implements Message {
    String content;
    public PlainMessage(String message) {
        this.content = message;
    }
    public String getContent(){
        return content;
    }

}
