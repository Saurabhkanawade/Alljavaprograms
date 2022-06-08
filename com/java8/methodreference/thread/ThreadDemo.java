package com.java8.methodreference.thread;

public class ThreadDemo {

    public static void printThread(){

        for(int i=0;i<10;i++){

            try{
                Thread.sleep(1000);
                System.out.println(i*2);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
