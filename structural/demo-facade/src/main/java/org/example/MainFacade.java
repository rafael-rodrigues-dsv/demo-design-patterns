package org.example;

import org.example.facades.ShapeMaker;

/** Facade in Java.
 * @author Rafael Rodrigues
 * @reference https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
 * @version 1.0
 * @since 1.0
 */
public class MainFacade {
    public static void main(String[] args) {
        testFacade();
    }

    private static void testFacade() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}