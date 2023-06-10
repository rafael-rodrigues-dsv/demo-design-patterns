package org.example;

import org.example.models.GlassHouse;
import org.example.models.WoodenHouse;
import org.example.templates.HouseTemplate;

/** Template Method in Java.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testTemplateMethod();
    }

    private static void testTemplateMethod() {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}