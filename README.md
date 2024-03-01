### Java Packages & API
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)

Built-in Packages

The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.
```java
// import built-in scanner package 
import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
```
User-defined Packages (create your own packages)

Step 1: Create Package Directory Structure:
Step 2: Inside the math directory, create a Java file named Calculator.java.

```java
package math;

public class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int a, int b){
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0; // Return 0 for simplicity in this example
        }
    }
}
```
Step 3: Now you can use the Calculator class from the math package in your main class or any other class by importing it.

```java
// File: Main.java
import math.Calculator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform arithmetic operations
        int resultAdd = calculator.add(10, 5);
        int resultSubtract = calculator.subtract(10, 5);
        int resultMultiply = calculator.multiply(10, 5);
        int resultDivide = calculator.divide(10, 5);

        // Print results
        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
```