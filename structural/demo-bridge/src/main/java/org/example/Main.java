package org.example;

import org.example.contracts.Device;
import org.example.models.devices.Radio;
import org.example.models.devices.Tv;
import org.example.models.remotes.AdvancedRemote;
import org.example.models.remotes.BasicRemote;

/** Bridge in Java.
 * @author Rafael Rodrigues
 * @reference https://refactoring.guru/design-patterns/bridge/java/example
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testBridge();
    }

    private static void testBridge() {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}