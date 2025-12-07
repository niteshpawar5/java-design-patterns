// File: CommissionConfig.java
// Program 5: Domain Singleton - Commission Configuration

import java.math.BigDecimal;

public class CommissionConfig {

    private static CommissionConfig instance;

    private BigDecimal promoterCommission = new BigDecimal("0.10"); // 10%
    private BigDecimal fieldCommission = new BigDecimal("0.05");    // 5%

    private CommissionConfig() {
        System.out.println("CommissionConfig Loaded");
    }

    /**
     * Lazy Singleton
     */
    public static CommissionConfig getInstance() {
        if (instance == null) {
            instance = new CommissionConfig();
        }
        return instance;
    }

    public BigDecimal getPromoterCommission() {
        return promoterCommission;
    }

    public BigDecimal getFieldCommission() {
        return fieldCommission;
    }

    public static void main(String[] args) {
        CommissionConfig cfg1 = CommissionConfig.getInstance();
        CommissionConfig cfg2 = CommissionConfig.getInstance();

        System.out.println(cfg1 == cfg2);
    }
}
