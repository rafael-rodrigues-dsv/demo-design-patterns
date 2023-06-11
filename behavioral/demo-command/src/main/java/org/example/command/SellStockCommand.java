package org.example.command;

import org.example.contract.Order;
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
