package com.lambda.test;

import com.lambda.*;

public class TestDisplay {
    public static void main(String[] args) {

        Display d=new Display(){

            public void display() {
                System.out.println("This is implementation of the method");
            }
        };
        d.display();
    }
}
