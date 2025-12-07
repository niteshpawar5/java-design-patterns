// File: PaymentAdapterDemo.java
// Adapter converts NewPaymentGateway to OldPaymentInterface

// Old system expects this interface
interface OldPayment {
    void makePayment(double amt);
}

// New system (incompatible)
class NewPaymentGateway {
    public void process(double amount) {
        System.out.println("Processed using new gateway: " + amount);
    }
}

// Adapter converts new → old
class PaymentAdapter implements OldPayment {
    NewPaymentGateway gateway = new NewPaymentGateway();

    public void makePayment(double amt) {
        gateway.process(amt);
    }
}

public class PaymentAdapterDemo {
    public static void main(String[] args) {
        OldPayment payment = new PaymentAdapter();
        payment.makePayment(500);
    }
}
