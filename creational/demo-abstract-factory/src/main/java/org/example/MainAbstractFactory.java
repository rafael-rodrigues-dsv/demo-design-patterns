package org.example;

import org.example.abstractfactory.ComputerFactory;
import org.example.abstractfactory.PCFactory;
import org.example.abstractfactory.ServerFactory;
import org.example.models.Computer;

/** Abstract Factory in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java
 * @version 1.0
 * @since 1.0
 */
public class MainAbstractFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}