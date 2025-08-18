package org.com.preparingOOD.behavioralpatterns.mediatorpattern;

import org.com.preparingOOD.behavioralpatterns.mediatorpattern.entity.User;
import org.com.preparingOOD.behavioralpatterns.mediatorpattern.mediatorabstract.ChatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> users = new ArrayList<User>();


    @Override
    public void sendMessage(String message, User sender) {
        users.stream()
                .filter(x -> !x.equals(sender))
                .forEach(x -> x.receive(message));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
