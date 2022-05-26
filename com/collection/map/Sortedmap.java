package com.collection.map;

import java.util.*;
import java.lang.*;

public class Sortedmap {
    public static void main(String[] args) {

        Map<Integer, String> m1 = new HashMap<>();

        m1.put(1, "Saurabh");
        m1.put(2, "Shankar");
        m1.put(3, "Shailesh");
        m1.put(4, "Rushikesh");
        m1.put(5,  "Sagar");

//        m1.merge()

        System.out.println(m1);

        for(Map.Entry print:m1.entrySet()){
            System.out.println(print.getKey()+" | "+print.getValue());
        }
    }
}
