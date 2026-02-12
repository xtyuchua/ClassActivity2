package ClassActivity;

public class Parent {

    String color = "Blue";
}

// Child class
class Child extends Parent {

    void displayColor() {
        System.out.println("Parent color is: " + color);
    }
}

