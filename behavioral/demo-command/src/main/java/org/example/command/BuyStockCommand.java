package org.example.command;

import org.example.contract.Order;
import org.example.model.Stock;

public class BuyStockCommand implements Order {
    private Stock abcStock;

    public BuyStockCommand(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() { abcStock.buy(); }
}
