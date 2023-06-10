package org.example;

import org.example.commands.BuyStockCommand;
import org.example.commands.SellStockCommand;
import org.example.models.Broker;
import org.example.models.Stock;

/** Decorator in Java.
 * @author Rafael Rodrigues
 * @reference https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 * @version 1.0
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        testCommand();
    }

    private static void testCommand() {
        Stock abcStock = new Stock();

        BuyStockCommand buyStockCommandOrder = new BuyStockCommand(abcStock);
        SellStockCommand sellStockCommandOrder = new SellStockCommand(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockCommandOrder);
        broker.takeOrder(sellStockCommandOrder);

        broker.placeOrders();
    }
}