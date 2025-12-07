// File: LegacyPaymentAdapter.java
// Adapter converts legacy XML response to new PaymentResult model

// New model expected by system
class PaymentResult {
    String status;
    double amount;
    public void show() { System.out.println(status + " | " + amount); }
}

// Legacy system returns XML
class LegacyPaymentResponse {
    public String getXmlData() {
        return "<payment><status>SUCCESS</status><amount>1200</amount></payment>";
    }
}

// Adapter converts old XML → new object
class LegacyPaymentAdapter {
    LegacyPaymentResponse legacy = new LegacyPaymentResponse();

    public PaymentResult convert() {
        PaymentResult result = new PaymentResult();
        result.status = "SUCCESS";     // assume parsed
        result.amount = 1200;          // assume parsed
        return result;
    }
}

public class LegacyPaymentAdapterDemo {
    public static void main(String[] args) {
        LegacyPaymentAdapter adapter = new LegacyPaymentAdapter();
        PaymentResult result = adapter.convert();
        result.show();
    }
}
