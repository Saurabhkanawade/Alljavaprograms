package com.collection.demo4;

import java.util.*;

public class Testlist {

    public static void main(String[] args) {

        List<PrintArraylist> list2=new ArrayList<PrintArraylist>();


        PrintArraylist printArraylist1=new PrintArraylist("saurabh");
        PrintArraylist printArraylist2=new PrintArraylist("shankar");
        PrintArraylist printArraylist3=new PrintArraylist("shailesh");

         list2.add(printArraylist1);
         list2.add(printArraylist2);
         list2.add(printArraylist3);

//        System.out.println(list2);

         for(PrintArraylist print:list2){
             System.out.println(print.name);
         }

    }
}