package C_Comparator_interface;

import java.util.*;
import java.io.*;
public class Student_data {
	public static void main(String[] args) {

		ArrayList<Student> a = new ArrayList<Student>();

		a.add(new Student(101, "Saurabh Kanawade", 67));
		a.add(new Student(102, "Shailesh Karpe  ", 83));
		a.add(new Student(103, "Rushi Kandekar  ", 73));
		a.add(new Student(104, "Saurabh kandekar", 46));
		a.add(new Student(105, "Sagar bhomale   ", 75));

		System.out.println("This is sorted marks data");
		System.out.println();

		Collections.sort(a, new Student_age());

		for (Student print : a) {

			System.out.println(print.roll + " | " + print.name + " | " + print.marks);
		}

		System.out.println();
		System.out.println("This is sorted name data");
        System.out.println();
        
		Collections.sort(a, new Student_name());

		for (Student print2 : a) {

			System.out.println(print2.roll + " | " + print2.name + " | " + print2.marks);
		}}}