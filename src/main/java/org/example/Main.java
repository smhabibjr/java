package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static String[] myCars = {"asdfasdf", "adfasdf", "dasdfasdf"};

    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList<String>();

        myArray.add("Volvo");
        myArray.add("BMW");
        myArray.add("Ford");
        myArray.add("Mazda");
        Collections.sort(myArray);
        System.out.println(myArray);

        for(String i : myArray){
            System.out.println(i);
        }

        for (int i = 0; i < myCars.length; i++) {
            System.out.println("index: " + i + " And car: " + myCars[i]);
        }


    }


}
