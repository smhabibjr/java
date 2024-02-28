package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int x = 1222;

    static void myMethod(String msg){
        System.out.println("this is my msg"+ msg);
    }
    public static void main(String[] args) {
        System.out.println("hi  there");
        Second calculator = new Second();
        System.out.println(calculator.sum(10,20));
    }
}