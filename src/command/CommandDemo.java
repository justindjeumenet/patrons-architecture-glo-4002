package command;

import command.entity.Stock;
import command.repository.Broker;
import command.services.BuyStock;
import command.services.SellStock;

public class CommandDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();
    }
}
