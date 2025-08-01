package org.com.ooppart1;

/**
 * Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
 **/


public class Task1 {

    static class MessagePrinter {
       static public void printMessage(String name){
           System.out.printf("hello %s\n" , name);
       }
    }

    public static void main(String[] args) {
        MessagePrinter.printMessage("Egor");
        MessagePrinter.printMessage("Artem");
        MessagePrinter.printMessage("Lev");
        MessagePrinter.printMessage("Non");
    }
}
