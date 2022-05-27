package com.oopspractice.inheritance;

public class Animal {

    public void eat(){
        System.out.println("Animals are eating");
    }
}
class Dog extends Animal{

    public void run(){
        System.out.println("Running");
    }

}
