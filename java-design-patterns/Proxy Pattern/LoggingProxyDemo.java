// File: LoggingProxyDemo.java
// Proxy adds logging before calling RealService

interface Task {
    void execute();
}

class RealTask implements Task {
    public void execute() { System.out.println("Task Executed"); }
}

class LoggingProxy implements Task {
    private RealTask task = new RealTask();

    public void execute() {
        System.out.println("LOG: Task started");
        task.execute();
        System.out.println("LOG: Task finished");
    }
}

public class LoggingProxyDemo {
    public static void main(String[] args) {
        Task t = new LoggingProxy();
        t.execute();
    }
}
