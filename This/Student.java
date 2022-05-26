package This;

public class Student {
	
	int roll;
	String name,course;
	float fee;

	Student(int roll,String name,String course){
		
		this.roll=roll;
		this.name=name;
		this.course=course;
	}
	
	Student(int roll,String name,String course,float fee){
		
		//this.fee=fee;
		this(roll,name,course);
		this.fee=fee;
		
	}
	
	void display() {
		
		System.out.println(roll+" | "+name+" | "+course+" | "+fee);
	}
	
	class Teststudent {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student(101,"Saurabh","Bsc computer science");
		Student s1=new Student(102,"Shankar","Bsc computer science",36000);
		
		s.display();
		s1.display();
		
	}

}
