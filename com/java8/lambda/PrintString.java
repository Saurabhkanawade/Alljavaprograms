package com.java8.lambda;

public interface PrintString {
    String print(String str);
    
}

class TestprintString {
    public static void main(String[] args) {

        PrintString printString = (str) -> {
            return str;
        };
        System.out.println(printString.print("hello1"));
    }
}

