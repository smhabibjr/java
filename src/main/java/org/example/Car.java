package org.example;

public class Car {
    private static String carName;
    private static String carCompany;
    private static int carYear;
    public Car(){
        carName = "unknown";
        carCompany = "unknown";
        carYear = 1945;
    }

    public static void displayResult(){
        System.out.println("Car name: " + carName);
        System.out.println("Car Company: " + carCompany);
        System.out.println("Car Year: " + carYear);
    }

    public Car(String carName, String carCompany, int carYear){
        Car.carName = carName;
        Car.carCompany = carCompany;
        Car.carYear = carYear;
    }
    public static void main(String[] args){
        Car myCar = new Car();
        System.out.println("hi there!" + carName);
        displayResult();
        Car myCar2 = new Car("volvo", "my car company", 2010);
        System.out.println("\n car with params: " + carName);
        displayResult();
    }
}
