package ObjectArray;

public class Student3 {
	
	int roll;
	String name;
	String city;
	
	
	
	public Student3(int r, String n, String c) {
		
		roll = r;
		name = n;
		city = c;
	}
	
	public String toString() {
	
	return (roll+" | "+name+" | "+city);
	
	}		
			
	public static void main(String[] args) {
	
		
		Student3 s1=new Student3(101,"saurabh ","sangamner");
		Student3 s2=new Student3(102,"shailesh","pune");
		
		System.out.println(s1);
		System.out.println(s2);;
	}

}
