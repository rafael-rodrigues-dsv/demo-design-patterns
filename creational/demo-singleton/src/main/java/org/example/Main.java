package org.example;

/** Singleton in Java.
 * @author Rafael Rodrigues
 * @reference https://refactoring.guru/pt-br/design-patterns/singleton/java/example
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testSingleton();
    }

    private static void testSingleton() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}