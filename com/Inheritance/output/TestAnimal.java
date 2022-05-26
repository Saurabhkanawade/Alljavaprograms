package com.Inheritance.output;

import com.Inheritance.*;

class Dog extends Animal {

    public void eat(String name) {
         String firstName;
        System.out.println("Animal is eating the food"+name);
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat("curd");
        dog.bark();

    }
}


