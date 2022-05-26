package com.collection.demo;

public class GenericDemo {

    public static <T> void getElement(T element){

        System.out.println(element.getClass().getName() +" = "+ element);
    }

}
