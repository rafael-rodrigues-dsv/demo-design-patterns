package org.example;

import org.example.contracts.Car;
import org.example.models.BasicCar;
import org.example.models.LuxuryCar;
import org.example.models.SportsCar;

/** Decorator in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example
 * @version 1.0
 * @since 1.0
 */
public class MainDecorator {
    public static void main(String[] args) {
        testDecorator();
    }

    private static void testDecorator() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}