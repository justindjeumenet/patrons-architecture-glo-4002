package command.entity;

public class Stock {
    private String name = "Patates";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ name: " + name + ",  Quantity: " + quantity +" ] bought" );
    }

    public void sell() {
        System.out.println("Stock [ name: " + name + ",  Quantity: " + quantity +" ] sold" );
    }
}
