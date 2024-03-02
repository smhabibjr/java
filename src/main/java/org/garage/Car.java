package org.garage;

public class Car extends Vehicle {
    private static int numOfWheels;

    public Car(String brand, String color, int numOfWheels){
        super(brand, color);
        Car.numOfWheels = numOfWheels;
    }

    public void displayCarInfo(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(numOfWheels);
    }
}
