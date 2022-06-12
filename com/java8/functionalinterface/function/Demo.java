package com.java8.functionalinterface.function;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.function.*;


public class Demo {
    public static void main(String[] args) {

        Function<Integer,String>function=no->no*10+" | This is demo String. The thing is no is multiply with the 10 data | ";

        System.out.println(function.apply(5));
    }
}
