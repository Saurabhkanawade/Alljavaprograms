package com.oopspractice.interfaces;

public interface AnimalInterface {

    void eat();
}
class Elephant implements AnimalInterface{

    public void eat(){
        System.out.println("The animal is eating ");
    }
}