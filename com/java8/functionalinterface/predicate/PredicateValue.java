package com.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateValue {

    public static void main(String[] args) {

        Predicate<String>predicate=t->t.length()>10;

        System.out.println(predicate.test("Hey this is demo String"));
    }

}
