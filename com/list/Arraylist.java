package com.list;
import java.util.*;
public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("Dell");
        arrayList.add("Dell");
        arrayList.add("Dell");
        arrayList.add("Dell");
        arrayList.add("Hp");
        arrayList.add("Toshiba");
        arrayList.add("Apple");
        arrayList.add("Lenovo");

        System.out.println(arrayList.remove("Dell"));
        for(String print:arrayList){

            System.out.println(print);
        }


    }

}
