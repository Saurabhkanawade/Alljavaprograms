package com.java8.functionalinterface.consumer;

import java.util.function.Consumer;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TestPerson{

    public static void main(String[] args) {

        Person p=new Person();

        Consumer<Person>setName=t->t.setName("Demo name");

        setName.accept(p);

        System.out.println(p.getName());
    }
}