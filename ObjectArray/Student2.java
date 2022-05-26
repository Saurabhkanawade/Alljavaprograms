package ObjectArray;

public class Student2 {

	int roll;
	String name;
	
	
	Student2(int roll , String name){
		
		this.roll=roll;
		this.name=name;
	}
	
	void display() {
		
		System.out.println(roll+" | "+name);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student2 s[]=new Student2[4];
		
		s[0]=new Student2(101,"saurabh");
		s[1]=new Student2(102,"shailesh");
		s[2]=new Student2(103,"sagar");
		
		s[0].display();
		s[1].display();
		s[2].display();
		
		
	}

}
