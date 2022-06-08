package com.java8.lambda;

public class AnonymousClass {

    public void printData(){
        System.out.println("This is anonymous class");
    }
}
class TestAnonymousClass{

    public static void main(String[] args) {

        AnonymousClass anonymousClass =new AnonymousClass(){

            public void printData(){
                System.out.println("This is anonymous overridden method");
            }
        };
        anonymousClass.printData();
    }
}