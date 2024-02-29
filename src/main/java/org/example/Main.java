package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String fullName;
    int age;
    public Main(String fname, int age) {
        fullName = fname;
        age = age;
    }

    public static void main(String[] args) {
        Main myMain = new Main("M Habib", 44);
        System.out.println("Output for main class: " + myMain.fullName + " Age: " + myMain.age);
    }
}