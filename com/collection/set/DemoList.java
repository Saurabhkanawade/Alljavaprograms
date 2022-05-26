package com.collection.set;

import java.util.*;

public class DemoList {
    public static void main(String[] args) {

        Set<Integer> l = new LinkedHashSet<>();
        l.add(23);
        l.add(88);
        l.add(433);
        l.add(88);

        Set<Integer> l1 = new LinkedHashSet<>();
        l1.add(828);
        l1.add(88);
        l1.add(722);
        l1.add(433);

//        l.getClass();
//        System.out.println(l.toArray());
//        System.out.println(l.size());
//        System.out.println(l.removeAll(l));
//        l.clear();
//        System.out.println(l1.retainAll(l));
//        System.out.println(l.hashCode());
//        System.out.println(l.getClass().getName());
//        System.out.println(l.isEmpty());
//        System.out.println(l.contains(88));
//        l.clear();
//        l1.removeAll(l1);
//        l.addAll(l1);
//
//        System.out.println(l);

        System.out.println("This is l list");
        Iterator i = l.iterator();
        while (i.hasNext()) {
            System.out.print(" " + i.next());
        }
        System.out.println();
        System.out.println("This is l1 list");
        Iterator j = l1.iterator();
        while (j.hasNext()) {
            System.out.print(" " + j.next());
        }
    }
}
