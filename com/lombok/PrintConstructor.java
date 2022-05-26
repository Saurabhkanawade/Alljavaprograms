package com.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class PrintConstructor {

    private int rollNumber;
    private String firstName;
    private String lastName;
    private String address;
}
