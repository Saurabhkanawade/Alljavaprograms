package com.java8.methodreference.demo2;

public class App {

    public static void main(String[] args) {

        Demoreff demoreff=new Demoreff();

        DemoInter demoInter=demoreff::printData;

        demoreff.printData();
        demoInter.printInter();

    }
}
