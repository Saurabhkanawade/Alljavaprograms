package com.demo;

public class FindMax {

    public static void main(String[] args) {


        int max = Integer.MIN_VALUE;

        int n[] = {11, 832, 3, 45, 56, 86, 37, 8, 9, 10, 11, 12};

        for (int i = 0; i < n.length; i++) {

            if (n[i] > max) {

                max = n[i];
            }
        }
        System.out.println("The Maximum No from the Array is :" + max);

        int min = Integer.MAX_VALUE;

        int m[] = {11, 832, 3, 45, 56, 86, 37, 8, 9, 10, 11, 12};

        for (int i = 0; i < n.length; i++) {

            if (m[i] < min) {

                min = m[i];
            }
        }
        System.out.println("The Minimum No from the Array is :" + min);
    }
}
