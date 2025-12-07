// File: CommissionProxyDemo.java
// Proxy restricts access to commission reports

interface CommissionReport {
    void generate();
}

class RealCommissionReport implements CommissionReport {
    public void generate() {
        System.out.println("Commission Report Generated");
    }
}

class CommissionProxy implements CommissionReport {
    private RealCommissionReport real = new RealCommissionReport();
    private boolean isManager;

    public CommissionProxy(boolean isManager) {
        this.isManager = isManager;
    }

    public void generate() {
        if (isManager)
            real.generate();
        else
            System.out.println("Access Denied: Only Manager can view report");
    }
}

public class CommissionProxyDemo {
    public static void main(String[] args) {
        CommissionReport user = new CommissionProxy(false);
        CommissionReport manager = new CommissionProxy(true);

        user.generate();
        manager.generate();
    }
}
