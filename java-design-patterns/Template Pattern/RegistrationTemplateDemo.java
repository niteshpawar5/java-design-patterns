// File: RegistrationTemplateDemo.java
// Template Method for agent registration process

abstract class RegistrationTemplate {

    public final void register() {
        validateData();
        saveToDatabase();
        sendNotification();
    }

    abstract void validateData();
    abstract void saveToDatabase();

    void sendNotification() {
        System.out.println("Notification Sent to Agent");
    }
}

class BasicAgentRegistration extends RegistrationTemplate {
    void validateData() { System.out.println("Basic Agent Data validated"); }
    void saveToDatabase() { System.out.println("Basic Agent saved in DB"); }
}

class PremiumAgentRegistration extends RegistrationTemplate {
    void validateData() { System.out.println("Premium Agent Data validated with extra checks"); }
    void saveToDatabase() { System.out.println("Premium Agent saved in DB with extra details"); }
}

public class RegistrationTemplateDemo {
    public static void main(String[] args) {
        RegistrationTemplate reg = new PremiumAgentRegistration();
        reg.register();
    }
}
