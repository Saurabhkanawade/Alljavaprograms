package com.collection.test;

import java.util.*;

public class GenericsRunner {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void dublicate(X list) {
        list.addAll(list);

    }

    static Number sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;

    }
    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        System.out.println();
    }

        public static void main(String[] args) {


        System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfNumberList(List.of(1.3, 2.5, 3, 4, 5.4)));
        System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

        List emptylist=new ArrayList<Number>();
        addACoupleOfValues(emptylist);
            System.out.println(emptylist);

        String value1 = doubleValue(new String());
        Integer number1 = doubleValue(Integer.valueOf(5));
        ArrayList list1 = doubleValue(new ArrayList());

        List<Integer> numbbers = new ArrayList<>(List.of(1, 2, 3));
        dublicate(numbbers);
        System.out.println(numbbers);

//  This is a String List
        System.out.println();
        System.out.println("_____________________This is a String List______________________");

        MyCustomList<Long> customString = new MyCustomList<>();

        customString.addElement(5l);
        customString.addElement(8634l);
//        customString.addElement("This is Demo 3");
//        customString.addElement("This is Demo 4");
//        customString.addElement("This is Demo 5");

//        String value =customString.get(0);
//        System.out.println(value);

//        System.out.println(customString.get(0));

        System.out.println("The list of the element : " + customString);
        System.out.println();

        System.out.println("_____________________This is a Integer List______________________");

        MyCustomList<Integer> customInteger = new MyCustomList<>();

        customInteger.addElement(11);
        customInteger.addElement(12);
        customInteger.addElement(13);
        customInteger.addElement(14);
        customInteger.addElement(15);

        Integer number = customInteger.get(0);
        System.out.println(number);

        System.out.println(customInteger.removeElement(customInteger.get(0)));
        System.out.println(customInteger.get(3));

        System.out.println("The list of the element : " + customInteger);


    }
}