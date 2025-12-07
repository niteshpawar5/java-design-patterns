// File: StockObserverDemo.java
// Observer updates stock price for subscribers

import java.util.*;

interface StockObserver {
    void updatePrice(double price);
}

class StockMarket {
    private List<StockObserver> list = new ArrayList<>();
    private double price;

    public void subscribe(StockObserver o) { list.add(o); }
    public void unsubscribe(StockObserver o) { list.remove(o); }

    public void setPrice(double price) {
        this.price = price;
        for (StockObserver o : list) o.updatePrice(price);
    }
}

class Investor implements StockObserver {
    String name;
    public Investor(String name) { this.name = name; }

    public void updatePrice(double price) {
        System.out.println(name + " notified: Stock Price = " + price);
    }
}

public class StockObserverDemo {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        market.subscribe(new Investor("Amit"));
        market.subscribe(new Investor("Rohan"));

        market.setPrice(150.5);
        market.setPrice(180.0);
    }
}
