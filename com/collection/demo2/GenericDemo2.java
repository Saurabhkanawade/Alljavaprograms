package com.collection.demo2;

public class GenericDemo2<T> {

    public <T> void methodDemo(T data) {

        System.out.println();
        System.out.println("This is generic method :");
        System.out.println("The data is passed : " + data);
    }
}
