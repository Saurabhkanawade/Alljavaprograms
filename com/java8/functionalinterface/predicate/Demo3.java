package com.java8.functionalinterface.predicate;

import java.util.function.Predicate;

class Demo3{
    public static void main(String[] args) {

        Predicate<String>predicate=t->t.length()>10;
        System.out.println(predicate.test("hello my name is saurabh kanawade"));
    }
}