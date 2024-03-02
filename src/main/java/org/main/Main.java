package org.main;

import org.garage.Car;
import org.garage.Vehicle;

public class Main {
    public static void main(String[] args){
        // create an instance for vehicle class
        Vehicle vehicle = new Vehicle("BMW", "blue");
        vehicle.displyVehicleInfo();

        // Create an instance for car class
        Car car = new Car("Audi", "Orange", 25);
        car.displayCarInfo();
    }
}
