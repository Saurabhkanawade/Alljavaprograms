package com.collection.practice.arraylist;

import com.collection.practice.arraylist.ArrayPrint;

import java.util.*;

public class TestArrayPrint {

    public static void main(String[] args) {

//        ArrayPrint arrayPrint1=new ArrayPrint(100211,"saurabh ","Kanawade");
//        ArrayPrint arrayPrint2=new ArrayPrint(100212,"Uttam   ","Singh    ");
//        ArrayPrint arrayPrint3=new ArrayPrint(100213,"Shankar ","Kandekar ");
//        ArrayPrint arrayPrint4=new ArrayPrint(100214,"Shailesh","Karpe    ");

//
//        arrayPrint.setFirstName("Saurabh");
//        arrayPrint.setLastName("Kanawade");
//        arrayPrint.setRollNumber(100211);

        List<ArrayPrint> list=new ArrayList<ArrayPrint>();

//        list.add(arrayPrint1);
//        list.add(arrayPrint2);
//        list.add(arrayPrint3);
//        list.add(arrayPrint4);

        list.add(new ArrayPrint(100211,"saurabh ","Kanawade"));
        list.add(new ArrayPrint(100211,"shankar ","Kandekar "));

//        System.out.println(list.removeAll(list));
//        System.out.println(list.remove(1));
        System.out.println(list.contains("saurabh"));

        for(ArrayPrint print:list){

            System.out.println(print.getRollNumber()+" | "+print.getFirstName()+" | "+print.getLastName());
        }

    }
}
