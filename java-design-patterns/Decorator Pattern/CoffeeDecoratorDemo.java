// File: CoffeeDecoratorDemo.java
// Decorator adds toppings to coffee

interface Coffee {
    String getDescription();
    double getCost();
}

// Base class
class BasicCoffee implements Coffee {
    public String getDescription() { return "Basic Coffee"; }
    public double getCost() { return 50; }
}

// Base Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) { this.coffee = coffee; }
}

// Concrete Decorators
class Milk extends CoffeeDecorator {
    public Milk(Coffee c) { super(c); }
    public String getDescription() { return coffee.getDescription() + ", Milk"; }
    public double getCost() { return coffee.getCost() + 10; }
}

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee c) { super(c); }
    public String getDescription() { return coffee.getDescription() + ", Sugar"; }
    public double getCost() { return coffee.getCost() + 5; }
}

public class CoffeeDecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new Milk(new Sugar(new BasicCoffee()));
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
