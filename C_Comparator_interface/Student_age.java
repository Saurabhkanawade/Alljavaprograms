package C_Comparator_interface;

import java.util.*;

public  class Student_age implements Comparator<Student>{

	public int compare(Student p1,Student p2) {
	

	Student s4=(Student)p1;
	Student s5=(Student)p2;
	
	if(s4.marks==s5.marks) {
		
		return 0;
	}
	
	else if(s4.marks>s5.marks) {
		
		return 1;
	}
	
	else {
		
		return -1;
	}
	}}