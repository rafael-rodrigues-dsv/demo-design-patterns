package org.example;

import org.example.contract.Internet;
import org.example.model.ProxyInternet;

/** Prototype in Java.
 * @author Rafael Rodrigues
 * @reference https://www.geeksforgeeks.org/proxy-design-pattern/
 * @version 1.0
 * @since 1.0
 */
public class MainProxy {
    public static void main(String[] args) {
        testProxy();
    }

    private static void testProxy() {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}