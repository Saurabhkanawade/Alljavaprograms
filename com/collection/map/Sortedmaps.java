package com.collection.map;

import java.util.*;
import java.lang.*;

public class Sortedmaps<T, I extends Number> {

    public I getInteger(I number){
        return number;
    }

    public T getString(T str){
        return str;
    }




        public static void main(String[] args) {

            Sortedmaps sortedmaps=new Sortedmaps();

            System.out.println(sortedmaps.<Integer>getInteger(52652));

            System.out.println(sortedmaps.<String>getString("saurabh"));

        }
    }
