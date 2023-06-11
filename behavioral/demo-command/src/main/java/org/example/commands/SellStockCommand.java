package org.example.commands;

import org.example.contracts.Order;
import org.example.model.Stock;

public class SellStockCommand implements Order {
    private Stock abcStock;

    public SellStockCommand(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
