package org.com.preparingOOD.structuralpatterns.decoratorpattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends MessageDecorator{

    public TimestampDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return  localDateTime.format(formatter) + " " + super.getContent();
    }
}
