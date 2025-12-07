// File: ThreadSafeSingleton.java
// Program 3: Double Checked Locking Singleton

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton Instance Created");
    }

    /**
     * Thread-safe approach
     */
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("Thread-safe singleton method called");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> ThreadSafeSingleton.getInstance().print());
        Thread t2 = new Thread(() -> ThreadSafeSingleton.getInstance().print());

        t1.start();
        t2.start();
    }
}
