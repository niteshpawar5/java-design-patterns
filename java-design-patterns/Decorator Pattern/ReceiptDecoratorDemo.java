// File: ReceiptDecoratorDemo.java
// Decorator adds watermark and signature to receipt

interface Receipt {
    String generate();
}

class BasicReceipt implements Receipt {
    public String generate() { return "Receipt: Payment Success"; }
}

// Base Decorator
abstract class ReceiptDecorator implements Receipt {
    protected Receipt receipt;
    public ReceiptDecorator(Receipt r) { this.receipt = r; }
}

class Watermark extends ReceiptDecorator {
    public Watermark(Receipt r) { super(r); }
    public String generate() { return receipt.generate() + " [Watermark Added]"; }
}

class DigitalSignature extends ReceiptDecorator {
    public DigitalSignature(Receipt r) { super(r); }
    public String generate() { return receipt.generate() + " [Signed]"; }
}

public class ReceiptDecoratorDemo {
    public static void main(String[] args) {
        Receipt receipt = new Watermark(new DigitalSignature(new BasicReceipt()));
        System.out.println(receipt.generate());
    }
}
