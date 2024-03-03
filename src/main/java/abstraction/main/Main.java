package abstraction.main;

import abstraction.animal.Dog;

public class Main extends Dog {
    public static void main(String[] args){
        Main mainObj = new Main();
        mainObj.sleep();
        mainObj.animalSound();
    }
}
