package GroupActivity;

public class Student {
    // Parent class
    static class Person {
        String name;
        String course;
        int id;

        void takeCourse() {
            System.out.println(name + " is taking " + course);
        }
    }

    // Student 1
    static class Student1 extends Person {
        void display() {
            name = "Kathryn";
            course = "Computer Science";
            id = 101;

            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            takeCourse();
        }
    }

    // Student 2
    static class Student2 extends Person {

        void display() {
            name = "David";
            course = "Software Engineering";
            id = 102;

            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            takeCourse();
        }
    }

    // Main class
    public static class Main {
        public static void main(String[] args) {

            Student1 s1 = new Student1();
            s1.display();

            System.out.println("------");

            Student2 s2 = new Student2();
            s2.display();
        }
    }
}
