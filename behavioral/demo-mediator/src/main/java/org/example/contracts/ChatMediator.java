package org.example.contracts;

import org.example.models.User;

public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
