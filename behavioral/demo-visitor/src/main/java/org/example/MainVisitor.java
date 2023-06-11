package org.example;

import org.example.contracts.ItemElement;
import org.example.contracts.ShoppingCartVisitor;
import org.example.model.Book;
import org.example.model.Fruit;
import org.example.model.ShoppingCartVisitorImpl;

/** State in Visitor.
 * @author Rafael Rodrigues
 * @reference https://www.digitalocean.com/community/tutorials/visitor-design-pattern-java
 * @version 1.0
 * @since 1.0
 */
public class MainVisitor {
    public static void main(String[] args) {
        testVisitor();
    }

    private static void testVisitor() {
        ItemElement[] items = new ItemElement[] {
            new Book(20, "1234"),
            new Book(100, "5678"),
            new Fruit(10, 2, "Banana"),
            new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}