package com.lombok;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
public class Employe {

    private int rollNumber;
    private String firstName;

    public String toString() {

        return rollNumber + " " + firstName;
    }

}
