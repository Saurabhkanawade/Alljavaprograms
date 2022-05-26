package com.lambda;

public interface Runable {

    void run(String km);
}
class TestRunable{

    public static void main(String[] args) {

        Runable runable=(km) -> {

            System.out.println("This is run method"+km);
       };
        runable.run("13");
    }
}
