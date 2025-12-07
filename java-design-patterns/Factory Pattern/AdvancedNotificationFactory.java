// File: AdvancedNotificationFactory.java
// Program 5: Domain Factory - Enum Based Notification Factory

enum NotificationType {
    EMAIL, SMS, WHATSAPP
}

interface Alert {
    void alert(String user, String message);
}

class EmailAlert implements Alert {
    public void alert(String user, String message) {
        System.out.println("EMAIL Alert to " + user + ": " + message);
    }
}

class SMSAlert implements Alert {
    public void alert(String user, String message) {
        System.out.println("SMS Alert to " + user + ": " + message);
    }
}

class WhatsAppAlert implements Alert {
    public void alert(String user, String message) {
        System.out.println("WHATSAPP Alert to " + user + ": " + message);
    }
}

class AlertFactory {

    /**
     * Factory method using ENUM
     */
    public static Alert createAlert(NotificationType type) {
        switch (type) {
            case EMAIL: return new EmailAlert();
            case SMS: return new SMSAlert();
            case WHATSAPP: return new WhatsAppAlert();
            default: throw new IllegalArgumentException("Unknown Type");
        }
    }
}

public class AlertDemo {
    public static void main(String[] args) {
        Alert email = AlertFactory.createAlert(NotificationType.EMAIL);
        email.alert("agent123", "Your commission is updated!");

        Alert sms = AlertFactory.createAlert(NotificationType.SMS);
        sms.alert("9876543210", "Your payout is released.");
    }
}
