package com.java8.lambda;

public class TestprintLambda {

    public static void main(String[] args) {

        Printlambda printlambda=()->{
            System.out.println("This is implementation of the interface method");
        };
        printlambda.printData();
    }
}
