package org.example.model;

import org.example.contracts.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order Order){
        orderList.add(Order);
    }

    public void placeOrders(){

        for (Order Order : orderList) {
            Order.execute();
        }
        orderList.clear();
    }
}
