package com.oopspractice.polymorphism;

public class Bank {

    public void getIntrest() {
        System.out.println("This is the rate of intrest");
    }
}
class Axis extends Bank {

    public void getData() {
        System.out.println("The data of the bank");
    }
}
    class TestB {
        public static void main(String[] args) {

            Bank bank = new Bank();

            bank.getIntrest();
        }
    }
