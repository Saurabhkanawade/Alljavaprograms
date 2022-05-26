package com.demo;

import java.util.*;
public class SwapNo {

    public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
        System.out.println("Enter the A ");
        int a=s.nextInt();
        System.out.println("Enter the B");
        int b=s.nextInt();

////        swap the two numbers
//
//        temp=a;
//        a=b;
//        b=temp;
//
//
//        System.out.println("a :"+a);
//        System.out.println("b :"+b);

//        swapping the two number without the third variable

        b=a+b; //30
        a=b-a; //10
        b=b-a; //20

        System.out.println("a : "+a);
        System.out.println("b : "+b);



    }
}
