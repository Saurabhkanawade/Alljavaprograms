package Collection_Framework;

import java.util.*;

public class Student_list {

	public static void main(String[] args) {

		Student_data s1 = new Student_data(101, "saurabh kanawade", "Smbst college  ", "sangamner");
		Student_data s2 = new Student_data(102, "Shailesh karpe  ", "Ohra college   ", "pune     ");
		Student_data s3 = new Student_data(103, "Shankar kandekar", "Agasti college ", "mumbai   ");
		Student_data s4 = new Student_data(104, "sagar bhomle    ", "Shramik college", "delhi    ");

		ArrayList <Student_data>al=new ArrayList<Student_data>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		System.out.println("The last index"+al.lastIndexOf(1));
		
		Iterator i=al.iterator();
		
		while(i.hasNext()) {
			
			Student_data st=(Student_data)i.next();
			System.out.println(st.roll+" | "+st.name+" | "+st.college+" | "+st.address);
		}
		
	}
}
