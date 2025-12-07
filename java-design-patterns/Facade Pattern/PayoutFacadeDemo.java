// File: PayoutFacadeDemo.java
// Facade handles payout calculation, tax, and notification

class CommissionService {
    double calculate(double amount) {
        System.out.println("Commission Calculated");
        return amount * 0.10;
    }
}

class TaxService {
    double applyTax(double commission) {
        System.out.println("Tax Applied");
        return commission - (commission * 0.05);
    }
}

class NotificationService {
    void notifyAgent(String msg) {
        System.out.println("Notification Sent: " + msg);
    }
}

// Facade
class PayoutFacade {
    CommissionService cs = new CommissionService();
    TaxService ts = new TaxService();
    NotificationService ns = new NotificationService();

    public void processPayout(double amount) {
        double comm = cs.calculate(amount);
        double finalAmt = ts.applyTax(comm);
        ns.notifyAgent("Final Commission: " + finalAmt);
    }
}

public class PayoutFacadeDemo {
    public static void main(String[] args) {
        new PayoutFacade().processPayout(10000);
    }
}
