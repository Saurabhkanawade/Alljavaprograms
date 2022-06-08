package com.java8.lambda.thread;

public class ThreadMain {

    public static void main(String[] args) {

        //create the thread of the jon
        Runnable thread1 = () -> {
//            this is thread body
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                try {
                    Thread.sleep(1001);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Thread t = new Thread(thread1);
//        t.start();

        Thread t1 = new Thread(thread1);

//        t1.start();


        Runnable thread2 = () -> {

            for (int i = 1; i <=10; i++) {
                int mul = i * 2;


                try {
                    Thread.sleep(100);
                    System.out.println(mul);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t4 = new Thread(thread2);

        t4.start();


    }
}
