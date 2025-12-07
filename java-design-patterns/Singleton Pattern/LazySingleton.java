// File: LazySingleton.java
// Program 2: Lazy Initialization Singleton

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton Instance Created");
    }

    /**
     * Creates instance only when required
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void message() {
        System.out.println("Hello from Lazy Singleton");
    }

    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();

        System.out.println(obj1 == obj2);
    }
}
