// File: GameTemplateDemo.java
// Template Method: defines steps of a game, subclasses fill details

abstract class Game {

    // Template Method (final so subclasses can't change algorithm)
    public final void play() {
        start();
        run();
        stop();
    }

    // Steps to be implemented by subclasses
    abstract void start();
    abstract void run();
    abstract void stop();
}

class Cricket extends Game {
    void start() { System.out.println("Cricket Game Started"); }
    void run() { System.out.println("Cricket in Progress"); }
    void stop() { System.out.println("Cricket Game Stopped"); }
}

class Football extends Game {
    void start() { System.out.println("Football Game Started"); }
    void run() { System.out.println("Football in Progress"); }
    void stop() { System.out.println("Football Game Stopped"); }
}

public class GameTemplateDemo {
    public static void main(String[] args) {
        Game g1 = new Cricket();
        g1.play();

        Game g2 = new Football();
        g2.play();
    }
}
