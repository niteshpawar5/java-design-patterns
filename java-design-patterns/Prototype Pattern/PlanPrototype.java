// File: PlanPrototype.java
// Domain Prototype: clone existing plan template

class Plan implements Cloneable {
    String planCode;
    int duration;
    double interestRate;

    public Plan(String planCode, int duration, double interestRate) {
        this.planCode = planCode;
        this.duration = duration;
        this.interestRate = interestRate;
    }

    public Plan clone() {
        try { return (Plan) super.clone(); }
        catch (Exception e) { return null; }
    }

    public void print() {
        System.out.println(planCode + " | " + duration + " | " + interestRate);
    }
}

public class PlanPrototype {
    public static void main(String[] args) {
        Plan basePlan = new Plan("BASE", 12, 6.5);

        // Clone for new customized plans
        Plan agentPlan = basePlan.clone();
        agentPlan.planCode = "AGENT";

        basePlan.print();
        agentPlan.print();
    }
}
