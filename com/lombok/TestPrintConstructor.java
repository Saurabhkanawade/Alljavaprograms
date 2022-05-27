package com.lombok;

public class TestPrintConstructor {

    public static void main(String[] args) {

//        PrintConstructor printConstructor = new PrintConstructor(100211, "Saurabh", "Kanawade", "Sangamner");


//        System.out.println(printConstructor);

        PrintConstructor printConstructor=new PrintConstructor();

        printConstructor.setAddress("Sangamner");

        System.out.println(printConstructor.getAddress());

    }
}
