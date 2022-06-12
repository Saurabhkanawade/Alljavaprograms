package com.java8.functionalinterface.supplier;

import java.util.function.*;
public class RandNo {
    public static void main(String[] args) {

        Supplier <Double> randNo=()->Math.random();
        System.out.println(randNo.get());
    }
}
