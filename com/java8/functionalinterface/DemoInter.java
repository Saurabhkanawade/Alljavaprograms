package com.java8.functionalinterface;

public interface DemoInter {

    void printInter();
}
class DemoFun implements DemoInter {

    public void printInter() {


    }

    public static void main(String[] args) {

    DemoInter demoInter=new DemoFun();

    demoInter.printInter();
    }
}