package org.com.preparingOOD.behavioralpatterns.mediatorpattern;


import org.com.preparingOOD.behavioralpatterns.mediatorpattern.entity.ConcreteUser;
import org.com.preparingOOD.behavioralpatterns.mediatorpattern.entity.User;
import org.com.preparingOOD.behavioralpatterns.mediatorpattern.mediatorabstract.ChatMediator;

public class Demo {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User alice = new ConcreteUser("Alice", chatRoom);
        User bob = new ConcreteUser("Bob", chatRoom);
        User charlie = new ConcreteUser("Charlie", chatRoom);

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        alice.send("Привіт усім!");
        bob.send("Привіт, Alice!");
        charlie.send("Як справи?");
    }
}
