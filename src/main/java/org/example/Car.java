package org.example;

public class Car {
    private final String carName;
    private final String carCompany;
    private final int carYear;
    public Car(){
        carName = "unknown";
        carCompany = "unknown";
        carYear = 1945;
    }

    public Car(String carName, String carCompany, int carYear){
        this.carName = carName;
        this.carCompany = carCompany;
        this.carYear = carYear;
    }
    public static void main(String[] args){
        Car myCar = new Car();
        Car myCar2 = new Car("volvo", "my car company", 2010);
        System.out.println("hi there!" + myCar.carName);
        System.out.println("\n car with params: " + myCar2.carName);
    }
}
