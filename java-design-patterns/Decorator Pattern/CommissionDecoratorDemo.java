// File: CommissionDecoratorDemo.java
// Decorator enhances commission report with extra info

interface CommissionReport {
    String print();
}

class BasicCommissionReport implements CommissionReport {
    public String print() { return "Commission Report: Base Data"; }
}

// Base Decorator
abstract class CommissionDecorator implements CommissionReport {
    protected CommissionReport report;
    public CommissionDecorator(CommissionReport r) { this.report = r; }
}

class AddAgentDetails extends CommissionDecorator {
    public AddAgentDetails(CommissionReport r) { super(r); }
    public String print() { return report.print() + " | Agent Details Added"; }
}

class AddPlanSummary extends CommissionDecorator {
    public AddPlanSummary(CommissionReport r) { super(r); }
    public String print() { return report.print() + " | Plan Summary Included"; }
}

public class CommissionDecoratorDemo {
    public static void main(String[] args) {
        CommissionReport report = new AddAgentDetails(new AddPlanSummary(new BasicCommissionReport()));
        System.out.println(report.print());
    }
}
