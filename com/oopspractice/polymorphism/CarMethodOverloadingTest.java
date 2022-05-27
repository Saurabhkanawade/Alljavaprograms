package com.oopspractice.polymorphism;


class CarMethodOverloadingTest {

    public static void main(String[] args) {

        CarMethodOverloading carMethodOverloading=new CarMethodOverloading();

        carMethodOverloading.car("Mahindra",87932999);
        carMethodOverloading.car("Honda",938483932,"Japan");
    }
}