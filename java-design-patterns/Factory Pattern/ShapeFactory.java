// File: ShapeFactory.java
// Program 1: Basic Factory Method Example

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}

class Square implements Shape {
    public void draw() { System.out.println("Drawing Square"); }
}

class ShapeFactory {
    /**
     * Factory Method: returns object based on input type
     */
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (type.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("CIRCLE");
        Shape s2 = factory.getShape("SQUARE");

        s1.draw();
        s2.draw();
    }
}
