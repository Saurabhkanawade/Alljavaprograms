package com.collection.demo1;

public class TestGenericDemo {

    public static void main(String[] args) {

        GenericDemo<Integer> genericDemo=new GenericDemo<>();
        genericDemo.setData(88);
        System.out.println("The return of the method : "+genericDemo.getData());

        GenericDemo<String> genericDemo1=new GenericDemo<>();
        genericDemo1.setData("This is a String value");
        System.out.println("The return of the method : "+genericDemo1.getData());

    }
}
