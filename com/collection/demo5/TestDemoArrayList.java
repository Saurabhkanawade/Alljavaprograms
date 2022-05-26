package com.collection.demo5;

import java.util.ArrayList;

public class TestDemoArrayList {
    static int n = 5;

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {

            al.add(i);
        }
        al.remove(0);
            System.out.println(al);

            for (int j = 0; j < al.size(); j++) {
                System.out.print(al.get(j));
            }

        }
    }