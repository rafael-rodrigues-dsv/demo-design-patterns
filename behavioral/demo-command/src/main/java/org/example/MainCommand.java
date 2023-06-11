package org.example;

import org.example.command.BuyStockCommand;
import org.example.command.SellStockCommand;
import org.example.model.Broker;
import org.example.model.Stock;

/** Decorator in Java.
 * @author Rafael Rodrigues
 * @reference https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 * @version 1.0
 * @since 1.0
 */
public class MainCommand {
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