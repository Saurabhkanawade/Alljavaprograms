package com.oopspractice.inheritance;

public interface AnimalInterface{

    void eat();
}
class Lion implements AnimalInterface{

    @Override
    public void eat() {
        System.out.println("The animal is Eating");
    }
}