package com.laptop.output;

import com.laptop.Laptop;

public class Laptopmain {

    public static void main(String[] args) {


        Laptop laptop=new Laptop();

        laptop.setCompanyName("Hp");
        laptop.setModelName("notebook");
        laptop.setPrice(66000);

        System.out.println(laptop.getCompanyName()+" | "+laptop.getModelName()+" | "+laptop.getPrice());
    }
}

