package Democonstructor;

public class Copy3 {

	int id;
	String name;
	Copy3(int i,String n){
		
		id=i;
		name=n;
	}
	
	Copy3(Copy3 s){
		
		id=s.id;
		name=s.name;
	}
	
	void display() {
		
		System.out.println(id+ " "+ name);
	}
	
	public static void main(String[] args) {
		
		Copy3 c1=new Copy3(101,"Saurabh Kanawade");
		Copy3 c2=new Copy3(c1);
		
		c1.display();
		
		c2.display();
	}
}
