// File: CommissionStrategyDemo.java
// Strategy: different commission algorithms

interface CommissionStrategy {
    double calculate(double amount);
}

// Promoter: 10% commission
class PromoterCommission implements CommissionStrategy {
    public double calculate(double amount) { return amount * 0.10; }
}

// Field Agent: 5% commission
class FieldCommission implements CommissionStrategy {
    public double calculate(double amount) { return amount * 0.05; }
}

// Context
class CommissionCalculator {
    private CommissionStrategy strategy;
    public CommissionCalculator(CommissionStrategy strategy) {
        this.strategy = strategy;
    }

    public double getCommission(double amount) {
        return strategy.calculate(amount);
    }
}

public class CommissionStrategyDemo {
    public static void main(String[] args) {
        CommissionCalculator promoter = new CommissionCalculator(new PromoterCommission());
        System.out.println(promoter.getCommission(10000));

        CommissionCalculator field = new CommissionCalculator(new FieldCommission());
        System.out.println(field.getCommission(10000));
    }
}
