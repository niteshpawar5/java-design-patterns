// File: ReportBuilderDemo.java
// Builder Pattern: Create Report object using method chaining

class Report {
    private String title;
    private String author;
    private String content;

    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
    }

    // Builder class
    public static class Builder {
        private String title;
        private String author;
        private String content;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }

    public void display() {
        System.out.println(title + " by " + author);
        System.out.println(content);
    }
}

public class ReportBuilderDemo {
    public static void main(String[] args) {
        Report report = new Report.Builder()
                            .title("Payout Summary Report")
                            .author("Admin")
                            .content("Commission Details for Agent XYZ")
                            .build();

        report.display();
    }
}
