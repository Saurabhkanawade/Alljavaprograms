package com.java8.methodreference.thread;

import com.java8.lambda.thread.ThreadMain;

public class AppThread {
    public static void main(String[] args) {
//
//        Runnable runnable=ThreadDemo::printThread;
//
//        runnable.run();


        ThreadInter  threadInter=ThreadDemo::printThread;

        threadInter.printInter();

        ;

    }
}
