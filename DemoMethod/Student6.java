package DemoMethod;

public class Student6 {
	
	int roll_no;
	String name;
	
	void insert(int i,String n) {
		
		roll_no=i;
		name=n;
	}
	
	void displayImformation() {
		
	System.out.println(roll_no+" "+name);	
	}
}
	class Teststudent6{
		
	
 	public static void main(String[] args) {

Student6 s1= new Student6();
Student6 s2=new Student6();

s1.insert(101, "saurabh");
s2.insert(102, "Shankar"); 		
	
s1.displayImformation();
s2.displayImformation();
 	}
	}

