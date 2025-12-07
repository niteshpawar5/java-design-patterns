// File: VehicleDecoratorDemo.java
// Decorator: dynamically add features to Vehicle

interface Vehicle {
    String getFeatures();
}

class BasicCar implements Vehicle {
    public String getFeatures() { return "Basic Car"; }
}

// Base Decorator
abstract class VehicleDecorator implements Vehicle {
    protected Vehicle v;
    public VehicleDecorator(Vehicle v) { this.v = v; }
}

class Sunroof extends VehicleDecorator {
    public Sunroof(Vehicle v) { super(v); }
    public String getFeatures() { return v.getFeatures() + ", Sunroof"; }
}

class AlloyWheels extends VehicleDecorator {
    public AlloyWheels(Vehicle v) { super(v); }
    public String getFeatures() { return v.getFeatures() + ", Alloy Wheels"; }
}

public class VehicleDecoratorDemo {
    public static void main(String[] args) {
        Vehicle car = new Sunroof(new AlloyWheels(new BasicCar()));
        System.out.println(car.getFeatures());
    }
}
