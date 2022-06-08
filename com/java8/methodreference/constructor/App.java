package com.java8.methodreference.constructor;

public class App {

    public static void main(String[] args) {

        Provider provider=Student::new;

        Student student=provider.getInfo();

        student.display();
        provider.getInfo();
    }
}
