package org.example;

import org.example.middleware.Middleware;
import org.example.middleware.RoleCheckMiddleware;
import org.example.middleware.ThrottlingMiddleware;
import org.example.middleware.UserExistsMiddleware;
import org.example.models.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Decorator in Java.
 * @author Rafael Rodrigues
 * @reference https://refactoring.guru/design-patterns/chain-of-responsibility/java/example
 * @version 1.0
 * @since 1.0
 */
public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        testChainOfResponsability();
    }

    private static void testChainOfResponsability() throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}