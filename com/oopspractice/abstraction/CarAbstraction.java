package com.oopspractice.abstraction;

public abstract class CarAbstraction {

     abstract void run();
}

class Ferrari extends CarAbstraction{

   public void run(){
        System.out.println("This is implemented method of the class");
    }

}