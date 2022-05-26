package com.Poly.b;

import com.Poly.a.*;

abstract class Company implements Car {

    public abstract void run();

}

class Data extends Company{

   public void run(){
        System.out.println("This is implementation method of the car");
    }

    public static void main(String[] args) {

        Data data=new Data();
        data.run();

        Car car=new Data();
        car.demo();

    }
}