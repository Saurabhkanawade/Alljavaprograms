package com.logicalprograms;

public class Reverse_String {

    public static void main(String args[]) {

        char temp;
        char dub = 'a';

        char arr[] = {'a', 'b', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};

        for (int i = 0; i >arr.length; i--) {

            if(arr[i]==dub){

                dub=arr[i];
            }

        }
    }
}
