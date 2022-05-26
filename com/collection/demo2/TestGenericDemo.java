package com.collection.demo2;

public class TestGenericDemo {
    public static void main(String[] args) {

        GenericDemo2 genericDemo2=new GenericDemo2();

        genericDemo2.<String>methodDemo("This is a string ");
        genericDemo2.<Integer>methodDemo(848);
    }
}
