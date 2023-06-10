package org.example;

import org.example.respositories.ColorStore;

/** Prototype in Java.
 * @author Rafael Rodrigues
 * @reference https://www.geeksforgeeks.org/prototype-design-pattern/
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testPrototype();
    }

    private static void testPrototype() {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
    }
}