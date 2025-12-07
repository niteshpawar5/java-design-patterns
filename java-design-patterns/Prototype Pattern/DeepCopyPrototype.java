// File: DeepCopyPrototype.java
// Prototype: deep copy by cloning inner object manually

class Address {
    String city;
    public Address(String city) { this.city = city; }
}

class Employee implements Cloneable {
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee clone() {
        Employee copy = null;
        try { copy = (Employee) super.clone(); }
        catch (Exception e) {}

        // Deep copy inner object
        copy.address = new Address(this.address.city);
        return copy;
    }
}

public class DeepCopyPrototype {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", new Address("Pune"));
        Employee e2 = e1.clone();

        e2.address.city = "Mumbai";

        System.out.println(e1.address.city);  // Pune
        System.out.println(e2.address.city);  // Mumbai
    }
}
