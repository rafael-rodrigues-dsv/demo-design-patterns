package org.example;

import org.example.models.Life;

import java.util.ArrayList;
import java.util.List;

/** Memento in Java.
 * @author Rafael Rodrigues
 * @reference https://www.baeldung.com/java-memento-design-pattern
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testMemento();
    }

    private static void testMemento() {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();

        Life life = new Life();

        //time travel and record the eras
        life.set("1000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");

        life.restoreFromMemento(savedTimes.get(0));
    }
}