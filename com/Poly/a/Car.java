package com.Poly.a;

public interface Car{

    void run();

    default void demo(){

        System.out.println("Hey this is default method");
    }
}
