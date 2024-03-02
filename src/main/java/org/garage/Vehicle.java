package org.garage;

public class Vehicle {
    protected static String brand;
    protected static String color;


    public Vehicle(String brand, String color){
        Vehicle.brand = brand;
        Vehicle.color = color;
    }

    public void displyVehicleInfo(){
        System.out.println(brand);
        System.out.println(color);
    }
}
