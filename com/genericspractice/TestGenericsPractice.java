package com.genericspractice;

public class TestGenericsPractice {

    public static void main(String[] args) {

        GenericsPractice<String,Integer> genericsPractice = new GenericsPractice<String,Integer>();

        genericsPractice.setRollNumber(100211);
        genericsPractice.setFirstName("Saurabh");
        genericsPractice.setLastName("Kanawade");
        genericsPractice.setCollegeName("Smbst College sangamner");

        System.out.println(genericsPractice.getFirstName() + " | " + genericsPractice.getLastName() + " | " + genericsPractice.getRollNumber() + " | " + genericsPractice.getCollegeName());


        GenericsPractice.getElement("Hey this is a String input");
        GenericsPractice.getElement(475983427);
        GenericsPractice.getElement(84.63);
    }
}
