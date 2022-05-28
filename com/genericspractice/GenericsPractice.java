package com.genericspractice;

import lombok.Data;

@Data
public class GenericsPractice <T, I extends Number>{

    private I rollNumber;
    private T firstName;

    private T lastName;
    private T collegeName;






    public static <T> void getElement(T element){
        System.out.println("The element is : "+element );
    }





//
//    public T getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(T firstName) {
//        this.firstName = firstName;
//    }
//
//    public T getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(T lastName) {
//        this.lastName = lastName;
//    }
//
//    public T getCollegeName() {
//        return collegeName;
//    }
//
//    public void setCollegeName(T collegeName) {
//        this.collegeName = collegeName;
//    }
//
//    public I getRollNumber(){
//        return rollNumber;
//    }
//    public void setRollNumber(I rollNumber){
//        this.rollNumber=rollNumber;
//    }
}
