package javaInterface;

interface Animal{
    public void animalSound();
    public void dogSound();
}

class Dog implements Animal {
    public void animalSound(){
        System.out.println("Animal sound!");
    }

    @Override
    public void dogSound() {
        System.out.println("Dog sound!");
    }
}
public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.animalSound();
        dog.dogSound();
    }
}
