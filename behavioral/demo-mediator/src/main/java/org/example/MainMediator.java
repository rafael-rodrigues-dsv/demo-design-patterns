package org.example;

import org.example.contract.ChatMediator;
import org.example.model.User;
import org.example.impl.ChatMediatorImpl;
import org.example.model.UserMessage;
import java.util.ArrayList;

/** Mediator in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
 * @version 1.0
 * @since 1.0
 */
public class MainMediator {
    public static void main(String[] args) {
        testMediator();
    }

    private static void testMediator() {
        ChatMediator mediator = new ChatMediatorImpl();

        ArrayList<User> users = new ArrayList<User>();
        users.add(new UserMessage(mediator, "Pankaj"));
        users.add(new UserMessage(mediator, "Lisa"));
        users.add(new UserMessage(mediator, "Saurabh"));
        users.add(new UserMessage(mediator, "David"));

        mediator.addUser(users.get(0));
        mediator.addUser(users.get(1));
        mediator.addUser(users.get(2));
        mediator.addUser(users.get(3));

        users.get(0).send("Hi All");
    }
}