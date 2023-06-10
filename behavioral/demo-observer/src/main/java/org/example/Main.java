package org.example;

import org.example.contracts.Observer;
import org.example.models.MyTopic;
import org.example.models.MyTopicSubscriber;

import java.util.ArrayList;

/** Observer in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testObserver();
    }

    private static void testObserver() {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        ArrayList<Observer> observers = new ArrayList<Observer>();

        observers.add(new MyTopicSubscriber("Obj1"));
        observers.add(new MyTopicSubscriber("Obj2"));
        observers.add(new MyTopicSubscriber("Obj3"));

        //register observers to the subject
        topic.register(observers.get(0));
        topic.register(observers.get(1));
        topic.register(observers.get(2));

        //attach observer to subject
        observers.get(0).setSubject(topic);
        observers.get(1).setSubject(topic);
        observers.get(2).setSubject(topic);

        //check if any update is available
        observers.get(0).update();

        //now send message to subject
        topic.postMessage("New Message");
    }
}