package com.lambda;

public interface Callable {

    void call();
}

class TestCallable {

    public static void main(String[] args) {

        Callable a1 = () -> {
            System.out.println("This is call method in java");
        };
        a1.call();

        Callable a2 = () -> System.out.println("This is call method in java");

        a2.call();
    }
}