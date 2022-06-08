package com.java8.lambda;

public class Main {
    public static void main(String[] args) {

        Suminterface suminterface = (int a, int b) ->{
        return a + b;
    };
        System.out.println(suminterface.sum(50, 50));
        System.out.println(suminterface.sum(52, 53));


        Suminterface suminterface1=(int a, int b)->{
            return a*b;
        };
        System.out.println(suminterface1.sum(4,4));
    }
}
