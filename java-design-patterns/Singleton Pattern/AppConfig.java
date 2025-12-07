// File: AppConfig.java
// Program 1: Eager Initialization Singleton

public class AppConfig {

    // Eager instance creation - created when class loads
    private static final AppConfig instance = new AppConfig();

    // Private constructor prevents external instantiation
    private AppConfig() {
        System.out.println("AppConfig Instance Created");
    }

    /**
     * Global access point
     */
    public static AppConfig getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("This is AppConfig Singleton");
    }

    public static void main(String[] args) {
        AppConfig s1 = AppConfig.getInstance();
        AppConfig s2 = AppConfig.getInstance();

        System.out.println(s1 == s2);  
        s1.showMessage();
    }
}
