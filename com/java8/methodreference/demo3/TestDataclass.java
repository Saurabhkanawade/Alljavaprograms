package com.java8.methodreference.demo3;

public class TestDataclass {
    public static void main(String[] args) {

        Dataclass dataclass = new Dataclass();

        Datainter datainter = dataclass::printData;

        datainter.printInter();

    }
}
