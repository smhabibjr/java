package org.example;

public class Second {
    public static void main(String[] args){
        System.out.println("this is second class ");
        System.out.println(sum(5,10));
    }

    public static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return  result;
    }
}
