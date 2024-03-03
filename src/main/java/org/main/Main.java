package org.main;


import java.awt.*;

class Animal {
    public void animalSound(){
        System.out.println("This is the default animal sound!");
    }
}

class Pig extends Animal {
    public void animalSound(){
        System.out.println("this is pig sound!");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("This is Dog sound!");
    }
}

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();


        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
