// File: PrototypeRegistryDemo.java
// Prototype Registry: stores prototypes and clones on demand

import java.util.HashMap;

abstract class Shape implements Cloneable {
    String type;
    public abstract void draw();

    public Shape clone() {
        try { return (Shape) super.clone(); }
        catch (Exception e) { return null; }
    }
}

class Circle extends Shape {
    public Circle() { this.type = "Circle"; }
    public void draw() { System.out.println("Circle Drawn"); }
}

class Rectangle extends Shape {
    public Rectangle() { this.type = "Rectangle"; }
    public void draw() { System.out.println("Rectangle Drawn"); }
}

class ShapeRegistry {
    private static HashMap<String, Shape> registry = new HashMap<>();

    public static void addPrototype(String key, Shape shape) {
        registry.put(key, shape);
    }

    public static Shape getClone(String key) {
        return registry.get(key).clone();
    }
}

public class PrototypeRegistryDemo {
    public static void main(String[] args) {
        ShapeRegistry.addPrototype("CIRCLE", new Circle());
        ShapeRegistry.addPrototype("RECT", new Rectangle());

        Shape c1 = ShapeRegistry.getClone("CIRCLE");
        Shape r1 = ShapeRegistry.getClone("RECT");

        c1.draw();
        r1.draw();
    }
}
