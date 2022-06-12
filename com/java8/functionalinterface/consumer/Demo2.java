package com.java8.functionalinterface.consumer;
import java.util.function.*;
public class Demo2 {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
class TestDemo2{

    public static void main(String[] args) {

        Demo2 demo2=new Demo2();

        Consumer<Demo2>consumer=s->s.setAddress("This is new Address");

        consumer.accept(demo2);
        System.out.println(demo2.getAddress());
    }
}
