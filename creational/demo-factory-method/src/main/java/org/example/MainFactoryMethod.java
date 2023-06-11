package org.example;


import org.example.factory.ComputerFactory;
import org.example.model.Computer;

/** Factory Method in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java
 * @version 1.0
 * @since 1.0
 */
public class MainFactoryMethod {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    private static void testFactoryMethod() {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}