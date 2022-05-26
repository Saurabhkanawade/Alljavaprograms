package com.Inheritance;

public class Demo {

    public String firstName="Ram";
}

class Demo2 extends Demo{

    protected String firstName="Sham";

    public void print(){
        System.out.println(this.firstName);
    }

    public static void main(String[] args) {

        Demo2 demo2=new Demo2();

        demo2.print();
    }
}

