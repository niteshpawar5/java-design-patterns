// File: RegistrationBuilder.java
// Builder Pattern: Build Registration object with optional fields

class Registration {
    private String name;
    private String email;
    private String mobile;
    private String nominee;
    private String bankName;

    private Registration(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.nominee = builder.nominee;
        this.bankName = builder.bankName;
    }

    // Builder class
    public static class Builder {
        private String name;
        private String mobile;
        private String email;
        private String nominee;
        private String bankName;

        // Mandatory fields
        public Builder(String name, String mobile) {
            this.name = name;
            this.mobile = mobile;
        }

        // Optional fields
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder nominee(String nominee) {
            this.nominee = nominee;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Registration build() {
            return new Registration(this);
        }
    }

    public void show() {
        System.out.println(name + ", " + mobile + ", " + email + ", Nominee: " + nominee + ", Bank: " + bankName);
    }
}

public class RegistrationBuilder {
    public static void main(String[] args) {
        Registration reg = new Registration.Builder("Ravi", "9876543210")
                                .email("ravi@test.com")
                                .nominee("Amit")
                                .bankName("HDFC")
                                .build();

        reg.show();
    }
}
