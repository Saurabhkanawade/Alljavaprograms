package com.lambda;

public interface DemoSum {
    int sum(int a, int b);
}

class TestDemosum {
    public static void main(String[] args) {

        DemoSum ds = (int a, int b) -> {
            if (b > a) {
                throw new RuntimeException("Please enter correct value");
            } else {
                return a - b;
            }
        };

        System.out.println("The substract of the two no is :" + ds.sum(20, 10));
    }
}

