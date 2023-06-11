package org.example.commands;

import org.example.contracts.Order;
import org.example.model.Stock;

public class BuyStockCommand implements Order {
    private Stock abcStock;

    public BuyStockCommand(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() { abcStock.buy(); }
}
