// File: BasicObserverDemo.java
// Basic Observer: one subject, multiple observers get updates

import java.util.*;

interface Observer {
    void update(String msg);
}

interface Subject {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers(String msg);
}

class MessageService implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) { observers.add(o); }
    public void unsubscribe(Observer o) { observers.remove(o); }
    public void notifyObservers(String msg) {
        for (Observer o : observers) o.update(msg);
    }
}

class User implements Observer {
    private String name;
    public User(String name) { this.name = name; }

    public void update(String msg) {
        System.out.println(name + " received: " + msg);
    }
}

public class BasicObserverDemo {
    public static void main(String[] args) {
        MessageService service = new MessageService();

        User u1 = new User("Ravi");
        User u2 = new User("Nitesh");

        service.subscribe(u1);
        service.subscribe(u2);

        service.notifyObservers("New Update Available!");
    }
}
