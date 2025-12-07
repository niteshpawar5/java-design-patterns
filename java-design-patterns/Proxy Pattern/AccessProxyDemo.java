// File: AccessProxyDemo.java
// Proxy controls access to RealService

interface Service {
    void perform();
}

// Real Object
class RealService implements Service {
    public void perform() {
        System.out.println("Real Service Executed");
    }
}

// Proxy adds access control
class ServiceProxy implements Service {
    private RealService real = new RealService();
    private boolean isAdmin;

    public ServiceProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void perform() {
        if (isAdmin)
            real.perform();
        else
            System.out.println("Access Denied");
    }
}

public class AccessProxyDemo {
    public static void main(String[] args) {
        Service user = new ServiceProxy(false);
        user.perform();

        Service admin = new ServiceProxy(true);
        admin.perform();
    }
}
