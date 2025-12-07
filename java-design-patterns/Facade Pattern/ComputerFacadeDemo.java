// File: ComputerFacadeDemo.java
// Facade hides complex computer startup sequence

class CPU { void start() { System.out.println("CPU Started"); } }
class Memory { void load() { System.out.println("Memory Loaded"); } }
class Disk { void spin() { System.out.println("Disk Spinning"); } }

// Facade
class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory mem = new Memory();
    private Disk disk = new Disk();

    public void startComputer() {
        cpu.start();
        mem.load();
        disk.spin();
    }
}

public class ComputerFacadeDemo {
    public static void main(String[] args) {
        new ComputerFacade().startComputer();
    }
}
