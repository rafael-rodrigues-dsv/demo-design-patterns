package org.example;

import org.example.model.State;
import org.example.model.TVContext;
import org.example.model.TVStartState;
import org.example.model.TVStopState;

/** State in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/state-design-pattern-java
 * @version 1.0
 * @since 1.0
 */
public class MainState {
    public static void main(String[] args) {
        testState();
    }

    private static void testState() {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}