package org.example;

import org.example.models.Computer;

/** Builder in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java
 * @version 1.0
 * @since 1.0
 */
public class MainBuilder {
    public static void main(String[] args) {
        testBuilder();
    }

    private static void testBuilder() {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}