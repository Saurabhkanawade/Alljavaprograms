package com.demo;

import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number to the Even Or Odd");

        int n = s.nextInt();

        if (n % 2 == 0) {

            System.out.println("The given no is Even");
        } else {

            System.out.println("The given no is Odd");
        }

    }
}