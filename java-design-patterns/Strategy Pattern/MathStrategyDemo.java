// File: MathStrategyDemo.java
// Strategy: different operations interchangeable

interface Operation {
    int apply(int a, int b);
}

class Add implements Operation {
    public int apply(int a, int b) { return a + b; }
}

class Subtract implements Operation {
    public int apply(int a, int b) { return a - b; }
}

// Context uses selected strategy
class Calculator {
    private Operation op;
    public Calculator(Operation op) { this.op = op; }

    public int calculate(int a, int b) { return op.apply(a, b); }
}

public class MathStrategyDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(new Add());
        System.out.println(c1.calculate(10, 5));

        Calculator c2 = new Calculator(new Subtract());
        System.out.println(c2.calculate(10, 5));
    }
}
