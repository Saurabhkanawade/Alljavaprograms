package com.java8.functionalinterface.predicate;


import java.util.function.*;

public class Checklength {

    public static void main(String[] args) {

        Predicate<String> predicate =str->str.length()==5;
        System.out.println(predicate.test("saura"));
    }
}
