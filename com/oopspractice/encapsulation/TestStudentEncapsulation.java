package com.oopspractice.encapsulation;


class TestStudentEncapsulation {

    public static void main(String[] args) {

        StudentEncapsulation studentEncapsulation = new StudentEncapsulation();
        studentEncapsulation.setFirstName("Saurabh");
        studentEncapsulation.setLastName("Kanawade");
        studentEncapsulation.setRollNumber(100211);
//        studentEncapsulation.setCollegeName("Smbst");

        System.out.println(studentEncapsulation.getFirstName() + " " + studentEncapsulation.getLastName() + " " + studentEncapsulation.getRollNumber() + " " +StudentEncapsulation.collegeName );
    }
}

