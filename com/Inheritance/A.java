package com.Inheritance;

class A {

    private static String firstName;

    public void print() {

        System.out.println(calculateArea(5, 5));
    }

    public static int calculateArea(int length, int width) {
        return length*width;

    }


    public static void main(String[] args) {

        A a = new A();

        System.out.println(firstName);
        a.print();
    }
}