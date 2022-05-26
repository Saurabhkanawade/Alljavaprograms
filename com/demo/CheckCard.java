package com.demo;

public class CheckCard {

    public static String checktype(String no){

        String type="";

        if(no.startsWith("3")){
            type="American Express";
        }

        else if(no.startsWith("4")){
            type="visa";
        }

        else if(no.startsWith("5")){
            type="mastercard";
        }

        else if(no.startsWith("6")){
            type="rupay";
        }

        return type;

    }

    public static void main(String[] args) {

        CheckCard checkCard=new CheckCard();

        System.out.println(CheckCard.checktype("3"));
    }
}
