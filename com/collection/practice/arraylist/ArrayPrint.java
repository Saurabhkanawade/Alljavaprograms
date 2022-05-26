package com.collection.practice.arraylist;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@EqualsAndHashCode
@Getter
@Setter
public class ArrayPrint {

    private int rollNumber;
    private String firstName;
    private String lastName;
    private String location;

    public ArrayPrint(int rollNumber,String firstName,String lastName){
        this.rollNumber=rollNumber;
        this.firstName=firstName;
        this.lastName=lastName;
    }



//
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

}


