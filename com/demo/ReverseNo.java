package com.demo;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

public class ReverseNo {

    public static void main(String[] args) {

//        long no[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int i = no.length - 1; i > 0; i--) {
//
//            System.out.print("  " + no[i]);
//
//        }


        StringBuffer str=new StringBuffer("1,2,3,4,4,5,6,7,7,8,9");

        System.out.println(str.reverse());
    }
}