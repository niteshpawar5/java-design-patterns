// File: RegistrationFacadeDemo.java
// Facade hides complex agent registration steps

class DataValidator {
    void validate(String name) { System.out.println("Data Validated for " + name); }
}

class DatabaseService {
    void save(String name) { System.out.println("Saved to DB: " + name); }
}

class WelcomeNotification {
    void send(String name) { System.out.println("Welcome Message Sent to " + name); }
}

// Facade
class RegistrationFacade {
    DataValidator validator = new DataValidator();
    DatabaseService db = new DatabaseService();
    WelcomeNotification notify = new WelcomeNotification();

    public void registerAgent(String name) {
        validator.validate(name);
        db.save(name);
        notify.send(name);
    }
}

public class RegistrationFacadeDemo {
    public static void main(String[] args) {
        new RegistrationFacade().registerAgent("Ravi Kumar");
    }
}
