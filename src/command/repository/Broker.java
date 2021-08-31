package command.repository;

import command.services.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
        order.execute();
    }

    public void placeOrder(){
        orderList.clear();
    }
}
