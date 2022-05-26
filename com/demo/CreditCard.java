package com.demo;

public class CreditCard {


    public static String getCreditCard(String creditCardNumber) {

        String type = "";

        if(creditCardNumber != null){

        if (creditCardNumber.startsWith("3")) {
            type = "America Exress";
        } else if (creditCardNumber.startsWith("4")) {
            type = "Visa";
        } else if (creditCardNumber.startsWith("5")) {
            type = "MasterCard";
        } else if (creditCardNumber.startsWith("6")) {
            type = "discover";
        }
        }
        return type;
    }

    public static void main(String[] args){

        System.out.print("The Type of the Card is  : ");
        System.out.println(CreditCard.getCreditCard("*^(&%("));




        }
    }
