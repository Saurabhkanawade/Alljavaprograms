package Democonstructor;

public class Constructor_overload {

	int id;
	String name;
	String college;
	
	public Constructor_overload(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public Constructor_overload(int id, String name,String college) {
		super();
		this.id = id;
		this.name = name;
		this.college=college;
	}
	void display() {
		
		System.out.println(id+ " "+name+" "+college);
	}
	
public static void main(String[] args) {
	
	
	Constructor_overload s=new Constructor_overload(192,"saurabh");
	Constructor_overload s1=new Constructor_overload(192,"saurabh","smbst");
	
	s.display();
	s1.display();
}
}

