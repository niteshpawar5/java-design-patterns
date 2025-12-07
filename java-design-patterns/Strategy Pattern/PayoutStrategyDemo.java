// File: PayoutStrategyDemo.java
// Strategy: different payout schedules

interface PayoutStrategy {
    double payout(double amount);
}

class MonthlyPayout implements PayoutStrategy {
    public double payout(double amount) { return amount / 12; }
}

class QuarterlyPayout implements PayoutStrategy {
    public double payout(double amount) { return amount / 4; }
}

// Context
class PayoutProcessor {
    private PayoutStrategy strategy;
    public PayoutProcessor(PayoutStrategy strategy) {
        this.strategy = strategy;
    }

    public double process(double amount) {
        return strategy.payout(amount);
    }
}

public class PayoutStrategyDemo {
    public static void main(String[] args) {
        PayoutProcessor monthly = new PayoutProcessor(new MonthlyPayout());
        System.out.println(monthly.process(12000));

        PayoutProcessor quarterly = new PayoutProcessor(new QuarterlyPayout());
        System.out.println(quarterly.process(12000));
    }
}
