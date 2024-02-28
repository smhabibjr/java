package org.example;

public class Second {
    public static void main(String[] args){
        System.out.println("this is second class ");
        myMethod();
        System.out.println(sum(5,10));
        Main myObject = new Main();
        System.out.println(myObject.x);
        myObject.myMethod("hi htere !");
    }

    private static void myMethod() {
        System.out.println("i am here " + "Habib");
    }

    public static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return  result;
    }
}
