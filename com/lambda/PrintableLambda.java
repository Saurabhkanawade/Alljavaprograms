package com.lambda;

public interface PrintableLambda {
    void print();

}

class TestPrintableLambda {

    public static void main(String[] args) {
        int length = 30;

        PrintableLambda p = () -> {

            System.out.println("The length is :" + length);
        };
        p.print();
    }
}
