package com.java8.methodreference.demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Refmains {

    public  void doStuff() {
        System.out.println("This is stuff method");
        System.out.println("this is second line");
        LocalDate now= LocalDate.now();
        System.out.println(now.toString());
        LocalTime now1= LocalTime.now();
        System.out.println(now1);
    }
}
