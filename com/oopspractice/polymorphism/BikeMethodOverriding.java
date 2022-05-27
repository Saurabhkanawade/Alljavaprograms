package com.oopspractice.polymorphism;

public class BikeMethodOverriding {

    int s=100;

    void speed(){
        System.out.println("The speed of the bike is 1 :"+s);
    }
}

class Yamaha extends BikeMethodOverriding {

    void speed(){
        System.out.println("The speed of the bike 2 is :"+s);
    }
}
