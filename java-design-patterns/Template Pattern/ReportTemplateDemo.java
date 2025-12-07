// File: ReportTemplateDemo.java
// Template Pattern: shared report generation steps

abstract class ReportGenerator {

    // Template Method
    public final void generateReport() {
        fetchData();
        formatData();
        exportReport();
    }

    abstract void fetchData();
    abstract void formatData();

    // Common step
    void exportReport() {
        System.out.println("Report exported as PDF");
    }
}

class SalesReport extends ReportGenerator {
    void fetchData() { System.out.println("Fetching Sales Data"); }
    void formatData() { System.out.println("Formatting Sales Report"); }
}

class CollectionReport extends ReportGenerator {
    void fetchData() { System.out.println("Fetching Collection Data"); }
    void formatData() { System.out.println("Formatting Collection Report"); }
}

public class ReportTemplateDemo {
    public static void main(String[] args) {
        ReportGenerator rep = new SalesReport();
        rep.generateReport();
    }
}
