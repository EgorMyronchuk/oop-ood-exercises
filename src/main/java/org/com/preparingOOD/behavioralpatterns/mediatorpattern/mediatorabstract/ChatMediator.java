package org.com.preparingOOD.behavioralpatterns.mediatorpattern.mediatorabstract;

import org.com.preparingOOD.behavioralpatterns.mediatorpattern.entity.User;

public interface ChatMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
