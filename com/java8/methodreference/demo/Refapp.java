package com.java8.methodreference.demo;

public class Refapp {
    public static void main(String[] args) {
        System.out.println("This is main method");

        Refmains refmains=new Refmains();

        refmains.doStuff();

//        WorkInter w=()->{
//
//            System.out.println("This is implementation of the doTask");
//        };
//        w.doTask();

        WorkInter workInter=refmains::doStuff;

        workInter.doTask();

//        we can use the method references with the class name but we have to declare the method as static and
//        if not so in that case we have to create the object of the class


    }

}
