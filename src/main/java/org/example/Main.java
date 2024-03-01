package org.example;
// import built-in package with class name Scanner
import java.util.Scanner;
import math.*;
public class Main {
    public static void main(String[] args){
        // create a new object to access imported class
        Scanner myScannerObj = new Scanner(System.in);
        /*
        System.out.println("Enter username");
        String givenName = myScannerObj.nextLine();
        System.out.println("your name : " + givenName); */

        // Create an instance of Calculator
        Calculator calculator = new Calculator();
        System.out.println("Enter 1st num: ");
        int num1 = myScannerObj.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2 = myScannerObj.nextInt();
        System.out.println(calculator.add(num1,num2));
    }
}
