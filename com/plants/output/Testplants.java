package com.plants.output;

import com.plants.Plants;

public class Testplants {

    public static void main(String[] args) {

        Plants plants=new Plants();

        plants.setPlantName("manogo tree");
        plants.setFruitName("mango fruit");

        System.out.println(plants.getPlantName()+" | "+plants.getFruitName());
    }
}
