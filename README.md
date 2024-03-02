### Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.

Superclass:

Let's create a superclass named Vehicle with basic attributes and behavior.
```java
// Vehicle.java
public class Vehicle {
    // Fields
    protected String brand;
    protected String color;

    // Constructor
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
```
Subclass:

Now, let's create a subclass named Car that extends the Vehicle class and adds specific attributes and behavior.
```java
// Car.java
public class Car extends Vehicle {
    // Additional fields
    private int numWheels;

    // Constructor
    public Car(String brand, String color, int numWheels) {
        super(brand, color); // Call superclass constructor
        this.numWheels = numWheels;
    }

    // Additional method
    public void displayNumWheels() {
        System.out.println("Number of Wheels: " + numWheels);
    }
}
```
Using Inheritance:

Now, let's use the Vehicle and Car classes in a main class to demonstrate inheritance.
```java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle vehicle = new Vehicle("Toyota", "Red");
        System.out.println("Vehicle Information:");
        vehicle.displayInfo();

        // Creating a Car object
        Car car = new Car("BMW", "Blue", 4);
        System.out.println("\nCar Information:");
        car.displayInfo(); // Inherited method from Vehicle class
        car.displayNumWheels(); // Method specific to Car class
    }
}
```