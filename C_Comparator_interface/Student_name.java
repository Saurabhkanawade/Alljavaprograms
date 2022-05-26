package C_Comparator_interface;

import java.util.*;

public class Student_name implements Comparator<Student>{

	public int compare(Student s1,Student s2) {
		
Student s=(Student)s1;
Student q=(Student)s2;

return s.name.compareTo(q.name);
		
	}

	}
