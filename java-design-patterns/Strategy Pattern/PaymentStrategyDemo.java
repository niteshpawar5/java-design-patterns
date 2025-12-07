// File: PaymentStrategyDemo.java
// Strategy changes payment method at runtime

interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using CARD: " + amount);
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class PaymentProcessor {
    private Payment payment;
    public PaymentProcessor(Payment payment) { this.payment = payment; }

    public void process(double amt) { payment.pay(amt); }
}

public class PaymentStrategyDemo {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PaymentProcessor(new CardPayment());
        p1.process(500);

        PaymentProcessor p2 = new PaymentProcessor(new UPIPayment());
        p2.process(800);
    }
}
