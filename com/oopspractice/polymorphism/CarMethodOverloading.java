package com.oopspractice.polymorphism;

public class CarMethodOverloading {

    public String car(String carName, int carPrice) {

        System.out.println("This is a car 1 :" + carPrice + " " + carName);
        return carName + " " + carPrice;
    }

    public String car(String carName, int carPrice, String carMadeOfOrigin) {

        System.out.println("This is a car 2 :" + carPrice + " " + carName + " " + carMadeOfOrigin);
        return carName + " " + carPrice + " " + carMadeOfOrigin;
    }
}


