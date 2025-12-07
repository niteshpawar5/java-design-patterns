// File: CommissionTemplateDemo.java
// Template Method for commission calculation flow

abstract class CommissionTemplate {

    // Template method
    public final void process(double amount) {
        double commission = calculate(amount);
        applyTax(commission);
        printStatement();
    }

    abstract double calculate(double amount);

    void applyTax(double commission) {
        System.out.println("Tax applied on commission: " + (commission * 0.05));
    }

    void printStatement() {
        System.out.println("Commission statement generated");
    }
}

class PromoterCommission extends CommissionTemplate {
    double calculate(double amount) {
        double c = amount * 0.10;
        System.out.println("Promoter Commission: " + c);
        return c;
    }
}

class FieldCommission extends CommissionTemplate {
    double calculate(double amount) {
        double c = amount * 0.05;
        System.out.println("Field Commission: " + c);
        return c;
    }
}

public class CommissionTemplateDemo {
    public static void main(String[] args) {
        CommissionTemplate promoter = new PromoterCommission();
        promoter.process(10000);
    }
}
