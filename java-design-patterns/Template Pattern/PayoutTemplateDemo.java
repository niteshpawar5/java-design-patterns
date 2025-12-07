// File: PayoutTemplateDemo.java
// Template: Defines payout steps

abstract class PayoutTemplate {

    public final void payout(double amount) {
        double eligibleAmount = calculateEligibility(amount);
        transfer(eligibleAmount);
        notifyAgent();
    }

    abstract double calculateEligibility(double amount);
    abstract void transfer(double finalAmount);

    void notifyAgent() {
        System.out.println("Agent notified about payout");
    }
}

class MonthlyPayout extends PayoutTemplate {
    double calculateEligibility(double amount) {
        double val = amount * 0.90;  // 10% hold
        System.out.println("Monthly Eligibility: " + val);
        return val;
    }

    void transfer(double finalAmount) {
        System.out.println("Monthly payout transferred: " + finalAmount);
    }
}

class QuarterlyPayout extends PayoutTemplate {
    double calculateEligibility(double amount) {
        double val = amount * 0.95;
        System.out.println("Quarterly Eligibility: " + val);
        return val;
    }

    void transfer(double finalAmount) {
        System.out.println("Quarterly payout transferred: " + finalAmount);
    }
}

public class PayoutTemplateDemo {
    public static void main(String[] args) {
        PayoutTemplate payout = new MonthlyPayout();
        payout.payout(20000);
    }
}
