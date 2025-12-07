// File: BasicPrototypeDemo.java
// Basic Prototype: clone() creates object copy

class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student clone() {
        try { return (Student) super.clone(); }
        catch (Exception e) { return null; }
    }
}

public class BasicPrototypeDemo {
    public static void main(String[] args) {s
        Student s1 = new Student("Nitesh", 25);
        Student s2 = s1.clone();

        System.out.println(s1.name + " | " + s2.name);
        System.out.println(s1 == s2);  // false → different objects
    }
}
