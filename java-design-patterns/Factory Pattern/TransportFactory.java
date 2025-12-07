// File: TransportFactory.java
// Program 3: Abstract Creator Example

interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() { System.out.println("Delivering by TRUCK"); }
}

class Ship implements Transport {
    public void deliver() { System.out.println("Delivering by SHIP"); }
}

abstract class Logistics {
    /**
     * Factory Method to be overridden by subclasses
     */
    abstract Transport createTransport();

    /**
     * Business method using factory-created object
     */
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}

class RoadLogistics extends Logistics {
    public Transport createTransport() { return new Truck(); }
}

class SeaLogistics extends Logistics {
    public Transport createTransport() { return new Ship(); }
}

public class LogisticsDemo {
    public static void main(String[] args) {
        Logistics road = new RoadLogistics();
        road.planDelivery();

        Logistics sea = new SeaLogistics();
        sea.planDelivery();
    }
}
