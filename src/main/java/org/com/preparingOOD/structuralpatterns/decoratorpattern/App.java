package org.com.preparingOOD.structuralpatterns.decoratorpattern;

public class App {

    public static void main(String[] args) {
        String baseMessage = "Hello, Decorator!";

        Message plainMessage = new PlainMessage(baseMessage);
        System.out.println(plainMessage.getContent());

        UppercaseDecorator uppercaseDecorator = new UppercaseDecorator(plainMessage);
        System.out.println(uppercaseDecorator);

        CensorVowelsDecorator censorVowelsDecorator = new CensorVowelsDecorator(plainMessage);
        System.out.println(censorVowelsDecorator.getContent());

        Message message = new TimestampDecorator(
                new CensorVowelsDecorator(
                        new UppercaseDecorator(
                                new PlainMessage("Hello, Decorator!")
                        )
                )
        );

        System.out.println(message.getContent());

    }

}
