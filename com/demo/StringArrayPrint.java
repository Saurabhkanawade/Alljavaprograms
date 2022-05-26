package com.demo;

public class StringArrayPrint {

    public static void main(String[] args) {

        String list[]={"saurabh","shankar","shailesh","rushikesh","sagar","harshal"};

        System.out.println();
        System.out.println("Printing the array using the for loop");
        for(int i=0;i<list.length;i++){

            System.out.println(list[i]);
        }

        System.out.println();
        System.out.println("Printing the array using the while loop ");
        int n=0;
        while(n<list.length){

            System.out.println(list[n]);
            n++;
        }

        System.out.println();
        System.out.println("Printing the array using the do-while loop");

        int m=0;
        do{
            System.out.println(list[m]);
            m++;
        }while(m<list.length);

        System.out.println();
        System.out.println("Printing the array using the for each loop");

        for (String print:list) {
            System.out.println(print);
        }
    }
}
