import java.util.*;

class Student {
    String name;

    public static void main(String args[]) {
        System.out.println("class student");
    }

    public void getName() {
        System.out.println(this.name);
    }
}

public class Q6 {
    public static void main(String[] args) {
        System.out.println("1");
        Student s2 = new Student();
        System.out.println("2");
        s2.getName();
        s2.name = "asdasd";
        s2.getName();
        System.out.println("3");
    }
}
