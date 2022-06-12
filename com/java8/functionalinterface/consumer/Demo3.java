package com.java8.functionalinterface.consumer;

import java.util.function.Consumer;

public class Demo3 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TestDemo3{

    public static void main(String[] args) {

        Demo3 demo3=new Demo3();

        Consumer<Demo3>setName=t->t.setName("Hello world !");
        setName.accept(demo3);

        System.out.println(demo3.getName());
    }
}
