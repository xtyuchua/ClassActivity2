package ClassActivityII;

    // Parent class
    class Vehicle {
        String color = "Red";
        String name = "Toyota";

        void move() {
            System.out.println(name + " is moving");
        }
    }

    // Child class 1
    class Bike extends Vehicle {

        void displayBike() {
            name = "Bike";
            System.out.println("Color: " + color);
            move();
        }
    }

    // Child class 2
    class Truck extends Vehicle {

        void displayTruck() {
            name = "Truck";
            System.out.println("Color: " + color);
            move();
        }
    }

