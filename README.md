### Java Constructors

A Java constructor is a special type of method in a class that is used to initialize objects. It's called automatically when an object of the class is created. The main purpose of a constructor is to initialize the newly created object.

Here's what you should know about Java constructors:

1. Name: A constructor must have the same name as the class.
2. No return type: Constructors don't have a return type, not even void.
3. Initialization: Constructors are primarily used to initialize the instance variables of the object.
4. Multiple constructors: You can have multiple constructors in a class with different parameters. This is called constructor overloading.
5. Default constructor: If you don't provide any constructor in your class, Java provides a default constructor which initializes member variables to their default values.
6. Invocation: Constructors are invoked using the new keyword when an object is created.

```java
public class Car {
    // Member variables
    String make;
    String model;
    int year;

    // Constructor without parameters (default constructor)
    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        Car car1 = new Car(); // Using default constructor
        Car car2 = new Car("Toyota", "Corolla", 2022); // Using parameterized constructor

        // Displaying car details
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}
```
### Java Modifiers

public: Most accessible. Can be accessed from anywhere.

protected: Accessible within package and by subclasses.

default (no modifier): Accessible only within the same package.

private: Least accessible. Accessible only within the same class.

