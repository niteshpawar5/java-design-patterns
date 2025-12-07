// File: UserBuilderDemo.java
// Builder Pattern: Build User object with optional fields using method chaining

class User {
    private String name;
    private String email;
    private String phone;

    // Private constructor to enforce object creation through Builder
    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static Builder Class
    public static class Builder {
        private String name;   // mandatory
        private String email;  // optional
        private String phone;  // optional

        public Builder(String name) {  // mandatory value passed here
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;   // enables method chaining
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {   // final object creation
            return new User(this);
        }
    }

    public void show() {
        System.out.println(name + " | " + email + " | " + phone);
    }
}

public class UserBuilderDemo {
    public static void main(String[] args) {

        // Creating User object using Builder Pattern
        User u = new User.Builder("Nitesh")
                        .email("nitesh@test.com")
                        .phone("99999XXXXX")
                        .build();

        u.show();
    }
}
