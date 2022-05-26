package com.project;


public class Demo {

    private String firstName;
    private String lastName;

    public Demo(String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;

    }

    @Override
    public String toString() {
        return "Demo{" + "firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + '}';
    }
}