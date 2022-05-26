package com.company.model;


import lombok.Data;

@Data
public class Person {

    private String firstName;


    public static void main(String[] args) {

    Person person=new Person();

    person.setFirstName("Hello saurabh");

        System.out.println(person.getFirstName());
    }
}